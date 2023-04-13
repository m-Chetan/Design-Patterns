package Behavioral.ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor next){
        super(next);
    }

    public void log(int loglevel, String msg){
        if(loglevel == DEBUG){
            System.out.println(msg);
        }
        else{
            super.log(loglevel,msg);
        }
    }
}
