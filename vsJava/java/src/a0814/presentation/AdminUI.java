package a0814.presentation;

import static printer.Printer.*;
import application.AdminLogic;
import entity.Account;
import entity.History;
import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class AdminUI {
    Scanner scanner = new Scanner(System.in);
    AdminLogic adminLogic = AdminLogic.getInstance();
    User loginUser;
    String message = "";

    public void adminApp(User user) {
        loginUser = user;
        while (true) {
            clearCmd();
            println(BLANK + message);
            println(BLANK + BLANK_HALF + loginUser.getUserName() + ADMIN_WELCOME_SUFFIX);
            println(BLANK + HEADER_ADMIN);
            println(BLANK + ADMIN_LIST1);
            println(BLANK + ADMIN_LIST2);
            println(BLANK + ADMIN_LIST3);
            println(BLANK + ADMIN_LIST4);
            println(BLANK + ADMIN_LIST5);
            println(BLANK + ADMIN_LIST6);
            println(BLANK + ADMIN_LIST0);
            println(BLANK + FOOTER);
            print(BLANK + ENTER_TASK_NUM);
            switch (scanner.nextLine()) {
                case "1" -> changeUserPassword();
                case "2" -> deleteAccount(); //계좌삭제
                case "3" -> findAccountsByAccountNumber();
                case "4" -> findAccountsByUserId();
                case "5" -> findAllAccounts();
                case "6" -> findAllHistories();
                case "0" -> {
                    return;
                }
                 default -> message = MESSAGE_WRONG_INPUT;
              }
        }
    }

    private void findAllHistories() {
        clearCmd();
        println(BLANK + HEADER_ALL_HISTORY);
        println(BLANK + ALL_HISTORY);
        ArrayList<History> histories = adminLogic.getAllHistories();
        for (History history : histories) {
            println(BLANK + "거래 타입: " + history.getTradeType() + ", 거래시간: " + history.getTradeDate() + ", 거래 금액: " + history.getMoney()+ ", 계좌 잔고: "+history.getAccountBalance()+", 계좌번호: "+history.getAccountNum());
        }
        print(BLANK + ENTER_ANYKEY_TO_BACK);
        scanAndGetString();
        setMessage(MESSAGE_SUCCESS_LOGIC);
    }

    private void findAllAccounts() { //모든 계좌정보 출력
        clearCmd();
        println(BLANK + HEADER_ALL_ACCOUNT);
        println(BLANK + ALL_ACCOUNT);
        ArrayList<Account> accounts= adminLogic.getAllAccounts(); //모든 계좌의 리스트
        for(Account account : accounts){
            println(BLANK +"사용자명: "+ account.getUserName()+ ", 사용자ID: " + account.getUserID()+ ", 계좌번호: " + account.getAccountNum()+", 계좌 잔고: "+ account.getAccountBalance());
        }
        print(BLANK + ENTER_ANYKEY_TO_BACK);
        scanAndGetString();
        setMessage(MESSAGE_SUCCESS_LOGIC); 
    }

    private void findAccountsByUserId() {
        clearCmd();
        println(BLANK + HEADER_FIND_ACCOUNT);
        findAllUserId(); //모든 user보여줌
        print(BLANK + ENTER_USER_ID_ACCOUNT);
        String userId = scanAndGetString();

        println(BLANK + userId + IS_ACCOUNT_LIST);
        List<Account> accountList;
        try{
           accountList = adminLogic.getUserAccounts(userId); //입력한 아이디의 계좌목록
        }catch (Exception e) {
            setMessage(MESSAGE_NO_ACCOUNT);
            return;
        }
        for(int i =0; i < accountList.size(); i++){
            println(BLANK+(i+1)+ ". " +  accountList.get(i).getAccountNum());
        }
        print(BLANK + ENTER_ANYKEY_TO_BACK);
        scanAndGetString();
        setMessage(MESSAGE_SUCCESS_LOGIC);
    }


    private void findAccountsByAccountNumber() {
        clearCmd();
        println(BLANK + HEADER_FIND_USER);
        println(BLANK + ALL_ACCOUNT); 
        ArrayList<Account> accounts = adminLogic.getAllAccounts(); //모든 계좌리스트를 가져옴
        for(Account account : accounts){
            println(BLANK+USER_ACCOUNT + account.getAccountNum());
        } //모든 계좌출력
        print(BLANK + ENTER_ACCOUNT_USER_ACCOUNTNUM); //계좌번호를 입력하려는 메시지를 출력
        String accoutNumber = scanAndGetString();
        try{
            Account account = adminLogic.findAccountsByAccountNum(accoutNumber);
            //사용자가 입력한 계좌번호와 일치하는 계좌를 조회
            println(BLANK +"사용자명: "+ account.getUserName()+ ", 사용자ID: " + account.getUserID()+ ", 계좌번호: " + account.getAccountNum()+", 계좌 잔고: "+ account.getAccountBalance());
        }catch (Exception e) {
            setMessage(MESSAGE_WRONG_INPUT);
            return;
        }
        print(BLANK + ENTER_ANYKEY_TO_BACK);
        scanAndGetString();
        setMessage(MESSAGE_SUCCESS_LOGIC);
    }

    private void deleteAccount() {
        clearCmd();
        println(BLANK + HEADER_DELETE_ACCOUNT);
        findAllUserId();
        print(BLANK + ENTER_USER_ID_ACCOUNT);
        String userId= scanAndGetString();
        List<Account>  userAccounts; //선택한 아이디 계좌목록을 잠시 담아둘 변수
        try {
            userAccounts = adminLogic.getUserAccountsByID(userId);
        } catch (Exception e) {
            setMessage(MESSAGE_NO_ACCOUNT);
            return;
        }
        println(BLANK + userId + IS_ACCOUNT_LIST);
        for(int i = 0; i < userAccounts.size(); i++){
            println(BLANK + (i+1) + ". " + userAccounts.get(i).getAccountNum());
        }// 계좌목록중 계좌번호를 출력해서 보여줌
        print(BLANK + ENTER_ACCOUNT);
        int idx = scanAndGetParsedInt();
        Account account;
        try{
            account = userAccounts.get(idx-1);
        }catch(Exception e){
            setMessage(MESSAGE_WRONG_INPUT);
            return;
        }
        if(idx == -1){
            setMessage(MESSAGE_WRONG_INPUT);
            return;
        }
        print(BLANK + ENTER_Y_TO_DELETE);
        if(scanner.nextLine().equals("y")){
            adminLogic.deleteAccount(account);
            setMessage(MESSAGE_SUCCESS_LOGIC);
        }else{
            setMessage(MESSAGE_STOP_LOGIC);
        }
    }

    private void changeUserPassword() {
        clearCmd();
        println(BLANK + HEADER_CHANGE_PASSWORD);  
        findAllUserId();
        print(BLANK + ENTER_USER_ID);
        String userId= scanAndGetString();
        try{
            adminLogic.confirmId(userId); //입력한 아이디가 존재하면 데이터불러오기
        }catch(Exception e){
            setMessage(MESSAGE_WRONG_INPUT);
            return;
        }
        print(BLANK + ENTER_NEW_PW);
        String newPassword = scanAndGetString(); //새로운 패스워드입력
        adminLogic.changeUserPw(userId, newPassword); //패드워드변경
        setMessage(MESSAGE_SUCCESS_LOGIC);
    }

    private void findAllUserId() {
        println(BLANK+ ALL_USER_ID);
        List<User> accounts =  adminLogic.getAllUsers();
        for(User account : accounts){
            println(BLANK + USER_ID + account.getUserID() + USER_NAME_No_Emoji + account.getUserName());
        }
    }

    public int scanAndGetParsedInt() {
        String s = scanner.nextLine();
        int idx;
        try {
            idx = Integer.parseInt(s);
            if (idx <= 0) {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
        return idx;
    }
    private void setMessage(String s) {
        message = s;
    }
    private String scanAndGetString() {
        return scanner.nextLine();
    }
}
