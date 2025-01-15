package a0814.data;

import entity.User;
import java.util.ArrayList;
import java.util.Optional;

public class UserDB {
    private static final  UserDB userDB = new UserDB();
    public static UserDB getInstance(){
        return userDB;
    }
    private final ArrayList<User> userList = new ArrayList<>(); 

    public void insertUser(User user){
        userList.add(user); //회원 정보를 리스트에 저장
    }

    public Optional<User> getUserByUserId(String userId) {
        User findUser = null;
        for (User user : userList){
            if(user.getUserID().equals(userId)){
                findUser = user;
                break;
            }
        }
        return Optional.ofNullable(findUser);

    }



}
