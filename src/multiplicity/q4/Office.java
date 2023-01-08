package multiplicity.q4;


import java.util.List;

public class Office {
    private String location;
    private List<Employee> employees;

    public Office(String location) {
        this.location = location;
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
