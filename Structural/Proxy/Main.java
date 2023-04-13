package Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        try{
            IUser user = new UserProxy();

            user.createUser("ADMIN",new User(1,"John"));

            User user1 = user.getUser(1);
            System.out.println(user1);

            user.deleteUser("USER", 1);  //Access Denied

            user.deleteUser("ADMIN", 1);

            System.out.println(user.getUser(1));   
        }
        catch(Exception e){
            System.out.println(e.getMessage());;
        }
        
    }
}
