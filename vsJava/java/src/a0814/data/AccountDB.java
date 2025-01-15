package a0814.data;

import java.util.ArrayList;

import entity.Account;

public class AccountDB {
    private static final AccountDB accountDB = new AccountDB();

    public static AccountDB getInstance() {
        return accountDB;
    }
    private final ArrayList<Account> accountList = new ArrayList<>();

    public void insertAccount (Account account){
        accountList.add(account);//계좌정보를 리스트에 삽입
    }

    public void deleteAccount (Account account){
        accountList.remove(account);//계좌정보를 리스트에서 삭제
    }
    public ArrayList<Account> getAllAccount(){
        return accountList;
    }

}
