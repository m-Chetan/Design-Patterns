package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> empList;

    public Employees(){
        this.empList = new ArrayList<>();
    }

    public Employees(List<String> empList){
        this.empList = empList;
    }

    public List<String> geList() {
        return this.empList;
    }

    void loadData(){
        empList.add("Chetan");
        empList.add("Sohan");
        empList.add("Jason");
        empList.add("Harshal");
    }

    @Override
    public Object clone(){
        List<String> temp = new ArrayList<>(empList);
        return new Employees(temp);
    }
    
}
