package a0814.entity;

public class User {
    private String userID;
    private String passWord;
    private String userName;
    private boolean isAdmin;
    
    public User(String userID, String passWord, String userName, boolean isAdmin) {
        this.userID = userID;
        this.passWord = passWord;
        this.userName = userName;
        this.isAdmin = isAdmin;
    }
    public String getUserID() {
        return userID;
    }
    public String getPassWord() {
        return passWord;
    }
    public String getUserName() {
        return userName;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
    public void changeUserPassword(String pw){
        this.passWord = pw;
    }

}
