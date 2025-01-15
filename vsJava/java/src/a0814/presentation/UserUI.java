package a0814.presentation;

import static printer.Printer.*;

import application.UserLogic;
import entity.Account;
import entity.History;
import entity.User;

import java.util.List;
import java.util.Scanner;
import java.util.Scanner;

public class UserUI {
       Scanner scanner = new Scanner(System.in);
    UserLogic userLogic = UserLogic.getInstance();
    User loginUser;
    String message;

    public void userApp(User user) {
        loginUser = user;
        message = "";
        while (true) {
            clearCmd();
            println(BLANK + message);
            println(BLANK + BLANK_HALF + loginUser.getUserName() + HEADER_USER_WELCOME);
            println(BLANK + HEADER_USER);
            println(BLANK + USER_LIST1);
            println(BLANK + USER_LIST2);
            println(BLANK + USER_LIST3);
            println(BLANK + USER_LIST4);
            println(BLANK + USER_LIST5);
            println(BLANK + USER_LIST0);
            println(BLANK + FOOTER);
            print(BLANK + ENTER_TASK_NUM);
            switch (scanAndGetString()) {
                  case "1" -> depositMoney(); //예금
                  case "2" -> withdrawMoney(); //출금
                  case "3" -> showAccountInfo(); //정보조회
                  case "4" -> showHistories(); //거래내역보기
                  case "5" -> makeAccount();//계좌만들기
                  case "0" -> {
                    return;
                }
                 default -> setMessage(MESSAGE_WRONG_INPUT);
            }

        }
    } 
    private void makeAccount() {
        clearCmd();
        println(BLANK + HEADER_MAKE_ACCOUNT);
        println(BLANK + ACCOUNT_LIST);
        List<Account> accountList = userLogic.getMyAccounts(loginUser);
        for (int i = 0; i < accountList.size(); i++) { //계좌리스트를 화면 출력
            System.out.println(BLANK + (i + 1) + ". " + accountList.get(i).getAccountNum());
        }
        println(BLANK + FOOTER);
        if(userLogic.getMyAccounts(loginUser).size() == 5){ //계좌의 갯수가 5개면 더이상 계좌생성금지
            setMessage(MESSAGE_NO_MORE_ACCOUNT);
            return;
        }
        print(BLANK + ENTER_Y_TO_MAKE_ACCOUNT); //y를 누른면 계좌생성
        if(scanAndGetString().equals("y")){
            userLogic.makeAccount(loginUser); //계좌생성
            setMessage(MESSAGE_SUCCESS_LOGIC);
            return;
        }
        setMessage(MESSAGE_STOP_LOGIC);

    }
    private void showHistories() {
        clearCmd();
        Account account = showAccountsAndScanIdxAndGetAccount();
        // 사용자의 계좌목록을 보여주고 , 사용자가 선택한 계좌를 가져온다.
        if(account == null){
            setMessage(MESSAGE_WRONG_INPUT);
            return;
        }
        clearCmd();
        println(BLANK+ HISTORY_LIST);
        List<History> HistoryList= userLogic.getAccountHistory(account.getAccountNum());
        // 선택한 계좌번호에 해당하는 거래내역 리스트를 반환
        for(int i = 0; i< HistoryList.size(); i++){
            History history= HistoryList.get(i);
            System.out.println(BLANK+ (i+1) + ". 거래타입: " + history.getTradeType() + 
             ", 거래시간: " + history.getTradeDate() +
             ", 거래 금액" + history.getMoney() +
             ", 계좌 잔고: " + history.getAccountBalance() +
             ", 은행명: " + history.getBankName());          
        } 
        println(BLANK + FOOTER);
        print(BLANK + ENTER_ANYKEY_TO_BACK);
        scanAndGetString();
        setMessage(MESSAGE_SUCCESS_LOGIC);

    }

    private void showAccountInfo() {//계좌조회
        clearCmd();
        println(BLANK + HEADER_SHOW_ACCOUNT_INFO);
        println(BLANK + USER_ID + loginUser.getUserID()); //현재 로그인된 id
        println(BLANK + USER_NAME + loginUser.getUserName()); // 로그인된 name
        println(BLANK + ACCOUNT_LIST);
        List<Account> accountList = userLogic.getMyAccounts(loginUser); //로그인된 계좌목록
        for(int i = 0; i < accountList.size(); i++){
            println(BLANK + (i+1) + ". "+ accountList.get(0).getAccountNum() 
            + BALANCE + accountList.get(i).getAccountBalance()); 
        }
        println(BLANK + FOOTER);
        print(BLANK + ENTER_ANYKEY_TO_BACK); //아무키나 누르면 되돌아감
        scanAndGetString();
        setMessage(MESSAGE_SUCCESS_LOGIC);
    }

    private void withdrawMoney() {
        clearCmd();
        println(BLANK + HEADER_WITHDRAW);
        Account account = showAccountsAndScanIdxAndGetAccount(); //계좌선택
        if(account == null){
          setMessage(MESSAGE_WRONG_INPUT);
          return;
        }
        println(BLANK + ACCOUNT_BLANCE + account.getAccountBalance());//잔액조회를 한후
        print(BLANK + ENTER_MONEY);
        int money = scanAndGetParsedInt(); //출금할 금액입력
        if(money == -1){
            setMessage(MESSAGE_WRONG_INPUT);
            return;
          }
        if(userLogic.validateWithdrawAndDoLogic(account, money)){
            setMessage(MESSAGE_SUCCESS_LOGIC);
        }else{
            setMessage(MESSAGE_WRONG_INPUT);
        }  

    }

    private void depositMoney() {
      clearCmd();
      println(BLANK + HEADER_DEPOSIT);
      Account account = showAccountsAndScanIdxAndGetAccount();
      if(account == null){
        setMessage(MESSAGE_WRONG_INPUT);
        return;
      }
      System.out.print(BLANK + ENTER_MONEY);
      int money = scanAndGetParsedInt();
      if(money == -1){
        setMessage(MESSAGE_WRONG_INPUT);
        return;
      }
      userLogic.depositMoney(money, account);
      setMessage(MESSAGE_SUCCESS_LOGIC);
    }

    private Account showAccountsAndScanIdxAndGetAccount() {
        System.out.println(BLANK + ACCOUNT_LIST);
        List<Account> accounts= userLogic.getMyAccounts(loginUser);  //계좌목록 리스트
        for(int i=0; i < accounts.size();i++){
            System.out.println(BLANK+ (i+1) + ". " + accounts.get(i).getAccountNum());
        } //for문을 순회하면 계좌목록을 출력
        System.out.println(BLANK + FOOTER);
        System.out.print(BLANK + ENTER_ACCOUNT); //처리할 계좌번호의 순번을 입력하세요
        int idx = scanAndGetParsedInt();
        if(idx == -1){
            setMessage(MESSAGE_WRONG_INPUT);
            return null;
        }
        Account account;
        try{
            account = accounts.get(idx - 1);
        }catch(Exception e){
            setMessage(MESSAGE_WRONG_INPUT);
            return null;       
        }
        return account;
    }
    
    private void setMessage(String s) {
        message = s;
    }

    private int scanAndGetParsedInt() {
        String s= scanner.nextLine();
        int idx;
        try{
            idx = Integer.parseInt(s);
        }catch(Exception e){
            return -1;
        }
        return idx;
    }

    private String scanAndGetString() {
        return scanner.nextLine();
    }
  

    
}


