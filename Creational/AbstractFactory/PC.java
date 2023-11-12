package Creational.AbstractFactory;

public class PC extends Computer{
    private String ram;
    private String ssd;
    private String cpu;

    public PC(String ram, String ssd, String cpu){
        this.ram = ram;
        this.cpu = cpu;
        this.ssd = ssd;
    }

    @Override
    public String getRam() {return this.ram;}

    @Override
    public String getCpu() {return this.cpu;}

    @Override
    public String getSsd() {return this.ssd;}
    
}
