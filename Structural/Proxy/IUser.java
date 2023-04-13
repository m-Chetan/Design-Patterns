package Structural.Proxy;

public interface IUser {
    void createUser(String role, User user) throws Exception;
    void deleteUser(String role, int userId) throws Exception;
    User getUser(int userId);

}
