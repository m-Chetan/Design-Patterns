package Behavioral.ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{
    
    public InfoLogProcessor(LogProcessor next){
        super(next);
    }

    public void log(int loglevel, String msg){
        if(loglevel == INFO){
            System.out.println(msg);
        }
        else{
            super.log(loglevel,msg);
        }
    }
}
