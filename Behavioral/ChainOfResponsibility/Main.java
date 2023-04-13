package Behavioral.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(logProcessor.ERROR,"Error");
        logProcessor.log(logProcessor.DEBUG,"Debug");
    }
}
