package multiplicity.q1;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name) {
        this.employees = new ArrayList<>();
        this.name = name;
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }

    public void removeEmployee(Employee emp){
        employees.remove(emp);
    }

    public int getNoOfEmployees(){
        return employees.size();
    }
}
