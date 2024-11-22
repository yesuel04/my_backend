package a1122.gettersetter;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000);
        System.out.printf("잔액 : %d", acc.getBalance());
    }
}

class Account{
    private int balance;

    // getter 게터 메소드
    public int getBalance(){
        return balance;
    }
    
    //setter 세터 메소드
    public void setBalance(int b){
        balance = b;
    }
}