package collections;

public class Employee {

    String name;
    Integer  salary;

    Integer dept;

    public Employee( String name, Integer salary, Integer dept){
        super();
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName(){
        return name;
    }
    public void setName( String name){
        this.name = name;
    }

    public Integer getDept() {
        return dept;
    }

    public void setDept(Integer dept) {
        this.dept = dept;
    }

    public Integer getSalary(){
        return salary;
    }
    public void setSalary( Integer salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dept=" + dept +
                '}';
    }
}
