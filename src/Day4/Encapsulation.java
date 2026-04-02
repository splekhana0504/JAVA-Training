package Day4;

class employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("invalid salary");
        }
    }

    public double getSalary() {
        return salary;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        employee emp=new employee();
        emp.setName("Peter");
        emp.setSalary(50000.00);
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());

        emp.setSalary(10000);
        System.out.println("Updated salary:"+emp.getSalary());
        emp.setSalary(-10000);
    }
}