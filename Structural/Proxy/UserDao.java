package Structural.Proxy;

import java.util.HashMap;

public class UserDao implements IUser{
    
    HashMap<Integer,User> map = new HashMap<>();

    @Override
    public void createUser(String role, User user) {
        map.put(user.getUserId(),user);
        System.out.println("User Created");
        
    }

    @Override
    public void deleteUser(String role, int userId) {
        map.remove(userId);
        System.out.println("User Deleted");  
    }

    @Override
    public User getUser(int userId) {
        if(map.containsKey(userId)) return map.get(userId);
        return null;
    }
    
}
