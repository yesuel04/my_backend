package a0814.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class History {
    private String tradeDate;
    private String accountNum;
    private TradeType tradeType;
    private int money;
    private String bankName;
    private int accountBalance;
    public String getTradeDate() {
        return tradeDate;
    }
    public String getAccountNum() {
        return accountNum;
    }
    public TradeType getTradeType() {
        return tradeType;
    }
    public int getMoney() {
        return money;
    }
    public String getBankName() {
        return bankName;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public History(String accountNum, int accountBalance, TradeType tradeType, int money, String bankName ) {
        this.tradeDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.accountNum = accountNum;
        this.tradeType = tradeType;
        this.money = money;
        this.bankName = bankName;
        this.accountBalance = accountBalance;
    }
    


}
