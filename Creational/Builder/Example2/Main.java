package Creational.Builder.Example2;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Chetan","Makwana")
                            .setAge(24)
                            .build();

        System.out.println(user);
    }
}
