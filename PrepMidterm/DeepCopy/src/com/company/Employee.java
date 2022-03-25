package com.company;

public class Employee {
    private String empName;
    private int empId;
    private Department dept;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Employee(String empName, int empId, Department dept){
        this.empName=empName;
        this.empId=empId;
        this.dept=dept;
    }

    //copy constructor - class as argument
    public Employee(Employee employee){
        this.empName = employee.empName;
        this.empId = employee.empId;
        this.dept = new Department("finance", 001);
    }

    public Employee(){
        empName = "temp";
        empId = 87;
        dept = null;
    }

    public void printEmp(){
        System.out.println("------------------");
        System.out.println("Employee Name = " +this.empName);
        System.out.println("Employee Id = " +this.empId);
        System.out.println("Department = " +this.dept.getDeptName());
    }
}
