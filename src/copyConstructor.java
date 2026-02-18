import java.util.Scanner;
public class copyConstructor {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     LastProduct l1=new LastProduct(111,"camera",30000);
     System.out.println("first Object Data :" +l1);
     LastProduct l2=new LastProduct(l1);
     System.out.println("second Object Data :" +l2);

     /*Employee e1=new Employee(111,"scott");
     System.out.println(e1);
     Manager m1 = new Manager(e1);
     System.out.println(m1);*/


    }
}
/*class Employee{ //Deep copy//
    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }


    public String toString() {
        return String.format("Employee [employeeId=%d, employeeName='%s']",employeeId,employeeName);
    }

   public int getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
}
class Manager{
    private int managerId;
    private String managerName;
    public Manager(Employee emp) {
        this.managerId = emp.getEmployeeId();
        this.managerName = emp.getEmployeeName();
    }

    @Override
    public String toString() {
        return String.format("Manager [managerId=%d, managerName='%s']",managerId,managerName);
    }
}*/
class LastProduct{
    private int id;
    private String name;
    private double price;
    public LastProduct(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public LastProduct(LastProduct prod){
        this.id = prod.id;
        this.name= prod.name;
        this.price= prod.price;
    }

    @Override
    public String toString() {
        return String.format("Product[id: %d, name: %s, price: %.2f]", id, name, price);
    }
}

