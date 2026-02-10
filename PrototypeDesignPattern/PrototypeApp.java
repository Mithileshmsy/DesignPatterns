//The Prototype Pattern is a Creational pattern used
// when creating a new object from scratch is
// costly, complex, or time-consuming.
// Instead of building a new instance,
// you copy (clone) an existing one and modify it if necessary.

package PrototypeDesignPattern;

import java.util.List;

public class PrototypeApp {
    public static void main(String[] args) throws CloneNotSupportedException{
        Employees emps = new Employees();
        //time consuming method called one time only
        emps.loadData();

        //create new emps object using clone
        Employees empNew = (Employees) emps.clone();
        //update list in second object
        List<String> empList = empNew.getEmpList();
        empList.add("John");

        //print both object list
        System.out.println(emps.getEmpList());
        System.out.println(empNew.getEmpList());
    }
}
