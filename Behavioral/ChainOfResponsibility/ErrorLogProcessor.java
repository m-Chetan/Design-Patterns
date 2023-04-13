package Behavioral.ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{
    
    public ErrorLogProcessor(LogProcessor next){
        super(next);
    }

    public void log(int loglevel, String msg){
        if(loglevel == ERROR){
            System.out.println(msg);
        }
        else{
            super.log(loglevel,msg);
        }
    }
}
