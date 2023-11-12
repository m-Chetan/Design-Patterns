package Creational.Singleton;

class SingletonThread implements Runnable{
    @Override
    public void run(){
       SingletonDemo instance = SingletonDemo.getInstance();
       System.out.println(instance);
    }
}

public class Main{
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Thread t = new Thread(new SingletonThread());
            t.start();
        }

    }
}
