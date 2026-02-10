package CreationalDesignPatterns.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

//1. implement cloneable interface
public class Employees implements Cloneable{

    List<String> empList;
    public Employees(){
        this.empList = new ArrayList<>();
    }

    public Employees(List<String> list){
        this.empList = list;
    }

    public List<String> getEmpList() {
        return empList;
    }

    //method which is taking time in creation
    public void loadData() {
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    //2.override clone method
    @Override
    public Employees clone() throws CloneNotSupportedException{
        ArrayList<String> temp = new ArrayList<>();
        for(String emp : empList){
            temp.add(emp);
        }
        return new Employees(temp);
    }
}
