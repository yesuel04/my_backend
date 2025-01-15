package a0814.entity;

public class Account {
    private int accountBalance;
    private String userID;
    private String accountNum;
    private String userName;
    public int getAccountBalance() {
        return accountBalance;
    }
    public String getUserID() {
        return userID;
    }
    public String getAccountNum() {
        return accountNum;
    }
    public String getUserName() {
        return userName;
    }
    public void depositMoney(int money){ //예금시 계좌 잔액을 계산해줌
        this.accountBalance += money;
    }
    public void withdrawMoney(int money){
        this.accountBalance -= money; //출금시 계좌 잔액 계산
    }

    public Account( String userID, String userName, int countAc ) {
        this.accountBalance  = 0;
        this.userID = userID;
        this.accountNum = makeAccountNum(userID, countAc);
        this.userName = userName;
    }
    private String makeAccountNum(String userID, int countAc) {
        String acNum = "73-8-";
        String tempString = "";

        for (int i = 0; i < userID.length(); i++) {
            int temp = userID.charAt(i) % 10; //
            tempString += String.valueOf(temp);
            if(tempString.length() == 6) {
                break;
            }
        }
        Integer tempInt = Integer.valueOf(tempString);
        tempInt += (countAc * 17); // 2*17  = 34 
        acNum += tempInt;
        return acNum;
    }
    //예를 들어서 userID  JohnDoe 이고 countAc  2인경우
   // "J", "o", "h", "n", "D", "o", "e"의 ASCII 값은  74,  111, 104 ,110, 68, 111,101
   //  10 으로 나머지 4,1,4,0,8,1,1
   // countAc가 2일 때 414081 + 34 = 414115
   //73-8-414115 => 최종 계좌번호가 생성
    @Override
    public String toString() {
        return "계좌번호 : "+ accountNum + "이름 : " + userName+ "유저아이디 : " +userID+ "잔액 : " +accountBalance;
    }






}
