package Behavioral.State;

public class VendingMachine {
    private State machineState;

    public VendingMachine(){
        this.machineState = new IdleState(); 
    }

    public State getMachineState() {
        return machineState;
    }

    public void setMachineState(State machineState) {
        this.machineState = machineState;
    }

    
}
