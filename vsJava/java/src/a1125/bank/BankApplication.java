package a1125.bank;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    // 모든 계좌 정보 저장 - 하나의 배열에 저장하므로 새로운 배열을 만들 필요가 없으므로 static을 쓴다.
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean run = true;
        while(run){
            System.out.println("-----------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택 > ");

            int selectNo = Integer.parseInt(scanner.nextLine());
            if(selectNo==1){
                createAccount();
            }else if(selectNo==2){
                accountList();
            }else if(selectNo==3){
                deposit();
            }else if(selectNo==4){
                withdraw();
            }else if(selectNo==5){
                run = false;
            }

        }
    }
    private static void createAccount(){
        System.out.println("==========================");
        System.out.println(" 계좌 생성 ");
        System.out.println("==========================");
        System.out.print(" 계좌 번호 > ");
        String ano = scanner.nextLine();

        System.out.print(" 계좌주 > ");
        String owner = scanner.nextLine();

        System.out.print(" 초기 입금액 > ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account newAccount = new Account(ano, owner, balance);
        for(int i=0; i < accountArray.length; i++){//0부터 100까지 순회하면서
          if(accountArray[i] == null){//비어있는 방이있으면
             accountArray[i] = newAccount;
             System.out.println("==========================");
             System.out.println("결과 : 계좌가 생성되었습니다.");
             break;
          }
        }
    }

    private static void accountList(){
        System.out.println("==========================");
        System.out.println(" 계좌 목록 ");
        System.out.println("==========================");
        for(int i=0; i<accountArray.length; i++){
            Account account = accountArray[i];
            if(account != null){
                System.out.print(account.getAno());
                System.out.print("        ");
                System.out.print(account.getOwner());
                System.out.print("        ");
                System.out.print(account.getBalance());
                System.out.println();
            }
        }
    }

    private static void deposit(){
        System.out.println("==========================");
        System.out.println(" 예금 ");
        System.out.println("==========================");
        System.out.print(" 계좌번호 > ");
        String ano = scanner.nextLine();
        System.out.print(" 예금액 > ");
        int money = Integer.parseInt(scanner.nextLine());
        Account account = findAccount(ano);

        if(account == null){
            System.out.println(" 결과 : 계좌가 없습니다. ");
            return;
        }
        account.setBalance(account.getBalance() + money);
        // 현재 계좌 잔액을 getter로 불러와서 예금액(money)를 더한 후
        // setBalance로 더한 금액을 넣기.
    }

    private static Account findAccount(String ano){
        Account account = null;
        for(int i=0; i<accountArray.length; i++){
            if(accountArray[i] != null){
                String dbAno = accountArray[i].getAno();
                if(dbAno.equals(ano)){
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }


    private static void withdraw(){
        System.out.println("==========================");
        System.out.println(" 출금 ");
        System.out.println("==========================");
        System.out.print(" 계좌번호 > ");
        String ano = scanner.nextLine();
        System.out.print(" 출금액 > ");
        int money = Integer.parseInt(scanner.nextLine());
        Account account = findAccount(ano);

        if(account == null){
            System.out.println(" 결과 : 계좌가 없습니다. ");
            return;
        }
        account.setBalance(account.getBalance() - money);

    }

}
