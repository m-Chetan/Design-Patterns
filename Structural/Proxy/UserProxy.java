package Structural.Proxy;

public class UserProxy implements IUser{

    IUser userDaoObj = new UserDao();

    @Override
    public void createUser(String role, User user) throws Exception {
        if(role == "ADMIN"){
            userDaoObj.createUser(role, user);
        }
        else throw new Exception("Access Denied!");
        
    }

    @Override
    public void deleteUser(String role, int userId) throws Exception{
        if(role == "ADMIN"){
            userDaoObj.deleteUser(role, userId);
        }
        else throw new Exception("Access Denied!");
        
    }

    @Override
    public User getUser(int getUserId) {
        return userDaoObj.getUser(getUserId);
    }
    
}
