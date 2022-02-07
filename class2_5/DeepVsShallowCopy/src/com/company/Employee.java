import com.company.Department;

public class Employee {

    private String name;
    private int id;
    private Department dept;

    public Employee(){
        name = "sample Employee";
        id =0;
        dept = null;

    }

    public Employee(Employee employee){
     this.name=employee.name;
     this.id=employee.id;
     this.dept=



    }
    public void printEmploeeInfo(){
        System.out.println("*******");
        System.out.println("Name = " +this.name);
        System.out.println("Id = " +this.id);

    }
}
