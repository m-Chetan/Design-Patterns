package Creational.AbstractFactory;

public abstract class Computer {
    abstract String getRam();
    abstract String getCpu();
    abstract String getSsd();

    @Override
    public String toString(){
        return "RAM= "+this.getRam()+", SSD="+this.getSsd()+", CPU="+this.getCpu();
    }
}
