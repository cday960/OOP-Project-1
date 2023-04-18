public class Employee extends Person
{
    float Salary;
    String employeeID;

    public Employee()
    {
        this.Name = "";
        this.Address = "";
        this.DOB = "";
        this.Email = "";
        this.SSN = "";
        this.Salary = 0;
        this.employeeID ="";
    }

    public Employee(String name, String address, String dob, String email, String ssn)
    {
        super(name, address, dob, email, ssn);
        this.Salary = 0;
        this.employeeID = "";
    }

    public Employee(String name, String address, String dob, String email, String ssn, String empID, float salary)
    {
        super(name, address, dob, email, ssn);
        this.Salary = salary;
        if(!empID.matches("[0-9]{3}"))//Checks if the constructor obtained bad data and if so fix it
        {
            while(!empID.matches("[0-9]{3}")) //Makes sure it is the right format 
            {
                System.out.println("Invalid Employee ID. Insert Employee ID in Format ###: ");
                empID = scanner.nextLine();//Scan new ID
            }
        }
        this.employeeID = empID;
    }

    public void addSalary(float payRaise)
    {
        this.Salary += payRaise;
    }
    
    public void setSalary(float newPay)
    {
        this.Salary = newPay;
    }

    public float getSalary()
    {
        return this.Salary;
    }

    public void setEmpID(String empID)
    {
        if(!empID.matches("[0-9]{3}"))//Checks if the constructor obtained bad data and if so fix it
        {
            while(!empID.matches("[0-9]{3}")) //Makes sure it is the right format 
            {
                System.out.println("Invalid Employee ID. Insert Employee ID in Format ###: ");
                empID = scanner.nextLine();//Scan new ID
            }
        }
        this.employeeID = empID;
    }

    public void setEmpID()
    {
        String empID = new String("");
        if(!empID.matches("[0-9]{3}"))//Checks if the constructor obtained bad data and if so fix it
        {
            while(!empID.matches("[0-9]{3}")) //Makes sure it is the right format 
            {
                System.out.println("Insert Employee ID in Format ###: ");
                empID = scanner.nextLine();//Scan new ID
            }
        }
        this.employeeID = empID;
    }

    public String getEmpID()
    {
        return this.employeeID;
    }

    @Override
    public String toString()//Overrides the toString to match the person output but adding in the userID at the end
    {
        float temp = this.Salary;//Following couple of lines set the Salary to two decimal points
        temp = temp * 100;
        temp = (int) temp;
        temp = temp / 100;
        return this.Name + ", " + this.DOB + ", " + this.Address + ", " + this.SSN + ", " + this.Email + ", " + this.employeeID + ", " + temp;
    }

}
