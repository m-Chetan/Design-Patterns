package Creational.Builder.Example2;

public class User {
    private String firstName;   //required
    private String lastName;    //required
    private int age;            //optional
    private String phoneNumber; //optional

    public User(UserBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getFirstName() { return this.firstName;}
    public String getLasttName() { return this.lastName;}
    public int getAge() { return this.age;}
    public String getPhoneNumber() { return this.phoneNumber;}

    @Override
    public String toString(){
        return this.firstName +" " + this.lastName + " " +this.age;
    }

    public static class UserBuilder{
        private String firstName;   //required
        private String lastName;    //required
        private int age;            //optional
        private String phoneNumber; //optional

        public UserBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        //returning instance of UserBuilder to support method chaining
        //so this will return this then we can call other method in single line of code
        public UserBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }

    }
}
