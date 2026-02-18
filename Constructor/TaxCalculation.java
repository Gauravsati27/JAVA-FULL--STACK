import java.util.Scanner;
public class TaxCalculation
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the choice: ");
    int choice=sc.nextInt();
    
    switch(choice){
      case 1:
            System.out.println("Enter employee details: ");
            System.out.print("Enter the Employee Id: ");
            int employeeId = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter the Employee Name: ");
            String employeeName = sc.nextLine();
            System.out.print("Enter the Employee Basic Salary: ");
            double ebasicSalary = sc.nextDouble();
            System.out.print("Enter the House Rent Allowance Percentage: ");
            double eHRAPer = sc.nextDouble();
            System.out.print("Enter the Dearness Allowance Percentage: ");
            double eDAPer = sc.nextDouble();

            Employee e = new Employee(employeeId, employeeName, ebasicSalary, eHRAPer, eDAPer);
            double eGross = e.calculateGrossSalary();
            double eTax = TaxUtil.calculateTax(e);
            System.out.println("Gross Salary : " + eGross);
            System.out.println("Tax : " + eTax);
            break;

      case 2:
                System.out.print("Enter the Manager Id: ");
                int mid=sc.nextInt();
                System.out.print("Enter the Manager Name: ");
                String mName=sc.nextLine();
                sc.nextLine();
                System.out.print("Enter the Manager Basic Salary: ");
                double mbasicSalary=sc.nextDouble();
                System.out.print("Enter the House Rent Allowance Percentage: ");
                double mHRAPer=sc.nextDouble();
                System.out.print("Enter the  Dearness Allowance Percentage: ");
                double mDAPer=sc.nextDouble();
                System.out.print("Enter the Project Allowance : ");
                double mProjectAllowance=sc.nextDouble();

                Manager m =new Manager(mid,mName,mbasicSalary,mHRAPer,mDAPer,mProjectAllowance);
                double mGross=m.calculateGrossSalary();
                double mTax=TaxUtil.calculateTax(m);
                System.out.println("Gross Salary : "+mGross);
                System.out.println("Tax : "+mTax);
                break;

     case 3:

                System.out.print("Enter the Trainer Id: ");
                int tid=sc.nextInt();
                System.out.print("Enter the Trainer Name: ");
                String tName=sc.nextLine();
                sc.nextLine();
                System.out.print("Enter the Manager Basic Salary: ");
                double tbasicSalary=sc.nextDouble();
                System.out.print("Enter the House Rent Allowance Percentage: ");
                double tHRAPer=sc.nextDouble();
                System.out.print("Enter the  Dearness Allowance Percentage: ");
                double tDAPer=sc.nextDouble();
                System.out.print("Enter the Batch Count : ");
                int batchCount=sc.nextInt();
                System.out.print("Enter the Perk Per Batch : ");
                double perkPerBatch =sc.nextDouble();

                Trainer t =new Trainer(tid,tName,tbasicSalary,tHRAPer,tDAPer,batchCount,perkPerBatch);
                double tGross=t.calculateGrossSalary();
                double tTax=TaxUtil.calculateTax(t);
                System.out.println("Gross Salary : "+tGross);
                System.out.println("Tax : "+tTax);
                break;

      case 4:
                System.out.print("Enter the source id: ");
                int sid=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the source Name: ");
                String sName=sc.nextLine();
                System.out.print("Enter the source Basic Salary: ");
                double sbasicSalary=sc.nextDouble();
                System.out.print("Enter the House Rent Allowance Percentage: ");
                double sHRAPer=sc.nextDouble();
                System.out.print("Enter the  Dearness Allowance Percentage: ");
                double sDAPer=sc.nextDouble();
                System.out.print("Enter the Enrollment Target: ");
                int enrollmentTarget=sc.nextInt();
                System.out.print("Enter the Enrollment Reached : ");
                int enrollmentReached=sc.nextInt();
                System.out.print("Enter the Perk Per Enrollment : ");
                double perkPerEnrollment =sc.nextDouble();

                Sourcing s=new Sourcing(sid,sName,sbasicSalary,sHRAPer,sDAPer,enrollmentTarget,enrollmentReached,perkPerEnrollment);
                double sGross=s.calculateGrossSalary();
                double sTax= TaxUtil.calculateTax(s);
                System.out.println("Gross Salary : "+sGross);
                System.out.println("Tax : "+sTax);
                break;

      default:
                System.out.println("Invalid choice");
    }
      sc.close();
  }
}
class Employee{
    private int employeeId;
    private String employeeName;
    private double basicsalary;
    private double HRAPer;
    private double DAPer;

    public Employee(int employeeId, String employeeName, double basicsalary, double HRAPer, double DAPer) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicsalary = basicsalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
    }
    public double calculateGrossSalary()
    {
      return basicsalary +HRAPer +DAPer;
    }
}

class Manager {
    private int managerId;
    private String managerName;
    private double basicsalary;
    private double HRAPer;
    private double DAPer;
    private double projectAllowance;
    
    public Manager(int managerId, String managerName, double basicsalary, double HRAPer, double DAPer, double projectAllowance)
     {
        this.managerId = managerId;
        this.managerName = managerName;
        this.basicsalary = basicsalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
        this.projectAllowance = projectAllowance;
      }

      public double calculateGrossSalary()
      {
        return basicsalary +HRAPer +DAPer + projectAllowance;
      }
}

class Trainer{
    private int trainerId;
    private String trainerName; 
    private double basicsalary;
    private double HRAPer;
    private double DAPer;
    private double batchCount;
    private double perkPerBatch;

    public Trainer(int trainerId, String trainerName, double basicsalary, double HRAPer, double DAPer, double batchCount, double perkPerBatch) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.basicsalary = basicsalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
        this.batchCount = batchCount;
        this.perkPerBatch = perkPerBatch;
    }
    public double calculateGrossSalary()
    {
      return basicsalary +HRAPer +DAPer + (batchCount * perkPerBatch);
    }
}

class Sourcing
{
    private int sourcingId;
    private String sourcingName;
    private double basicsalary;
    private double HRAPer;
    private double DAPer;
    private int enrollmentTarget;
    private int enrollmentReached;
    private double perkPerEnrollment;

    public Sourcing(int sourcingId, String sourcingName, double basicsalary, double HRAPer, double DAPer, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
        this.sourcingId = sourcingId;
        this.sourcingName = sourcingName;
        this.basicsalary = basicsalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
        this.enrollmentTarget = enrollmentTarget;
        this.enrollmentReached = enrollmentReached;
        this.perkPerEnrollment = perkPerEnrollment;
    }
    public double calculateGrossSalary()
    {
      return basicsalary +HRAPer +DAPer + ((((double)enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
    }
}

class TaxUtil
{
  public static double calculateTax(Employee e )
    {
      double gross=e.calculateGrossSalary();
    return gross>50000? gross*0.20 : gross*0.05;
    }

    public static double calculateTax(Manager m )
    {
      double gross=m.calculateGrossSalary();
      return gross>50000? gross*0.20 : gross*0.05;
    }
    public static double calculateTax(Trainer t )
    {
      double gross=t.calculateGrossSalary();
      return gross>50000? gross*0.20 : gross*0.05;
    }
    public static double calculateTax(Sourcing s )
    {
      double gross=s.calculateGrossSalary();
      return gross>50000? gross*0.20 : gross*0.05;
    } 
}
