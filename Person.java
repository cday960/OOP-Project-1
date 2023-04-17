import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person
{
    //User information
    protected String Name;
    protected String Address;
    protected String DOB;
    protected String Email;
    protected String SSN;

    //Member for scanner that will be used in methods
    Scanner scanner = new Scanner(System.in);

    //Default constructor with no inputs
    public Person()
    {
        //All fields will be given an empty string
        this.Name = "";
        this.Address = "";
        this.DOB = "";
        this.Email = "";
        this.SSN = "";
    }

    //Constructor given all member fields
    public Person(String name, String address, String dob, String email, String ssn)
    {
        //This Line to next comment makes sure the user gives proper values
        while(!name.matches("[a-zA-Z]*\s[a-zA-Z\s]*"))
        {
            System.out.println("Please Enter Name in Format {firstName} {lastName} {suffix}: ");
            name = scanner.nextLine();
        }
        while(!address.matches("[0-9]+\s[a-zA-Z1-9\s.]*\s[0-9]{5}"))
        {
            System.out.println("Please Enter Address in Format {Street Number} {Street Name} {Zip Code}: ");
            address = scanner.nextLine();
        }
        while(!dob.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"))
        {
            System.out.println("Please Enter DOB in Format ##/##/####: ");
            dob = scanner.nextLine();
        }
        while(!email.matches("[a-zA-Z1-9]*@[a-zA-Z]*[.]{1}[a-zA-Z.]*"))
        {
            System.out.println("Please Enter Email in Format {User}@{domain}.{domainSuffix}: ");
            email = scanner.nextLine();
        }
        while(!ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}"))  
        {
            System.out.println("Please Enter SSN in Format ###-##-####: ");
            ssn = scanner.nextLine();
        }
        //End of checking
        this.Name = name;
        this.Address = address;
        this.DOB = dob;
        this.Email = email;
        this.SSN = ssn;
    }

    //Name getter and setter
    public void setName(String name)
    {
        //Validating name formatting
        //valid format: {anystring sans integers}{BLANK SPACE}{anystring sans integers}
        //"This should also work for weirdos who have stuff like jr, sr, the 3rd (III) and all that" 
        while(!name.matches("[a-zA-Z]*\s[a-zA-Z\s]*"))
        {
            System.out.println("Please Enter Name in Format {firstName} {lastName} {suffix}: ");
            name = scanner.nextLine();
        }
        this.Name = name;
    }
    public String getName()
    {
        return this.Name;
    }

    //Address getter and setter
    public void setAddress(String address)
    {
        //Validating address formatting 
        //valid format: {any numerical string} {anystring} {any numerical string}
        //"This is generally pretty vauge but ensures the first section is a street number, 
        // second is name of street as well as apt number, and last is the zip code"
        while(!address.matches("[0-9]+\s[a-zA-Z1-9\s.]*\s[0-9]{5}"))
        {
            System.out.println("Please Enter Address in Format {Street Number} {Street Name} {Zip Code}: ");
            address = scanner.nextLine();
        }
        this.Address = address;
    }
    public String getAddress()
    {
        return this.Address;
    }

    //DOB getter and setter
    public void setDOB(String dob)
    {
        //Validating date of birth formatting
        //valid format: ##/##/#### 
        while(!dob.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"))
        {
            System.out.println("Please Enter DOB in Format ##/##/####: ");
            dob = scanner.nextLine();
        }
        this.DOB = dob;
    }
    public String getDOB()
    {
        return this.DOB;
    }

    //Email getter and setter
    public void setEmail(String email)
    {
        //Validating email formatting
        //valid format: {anystring}@{anystring}.{anystring}
        //"This should also allow for domains such as .co.uk just in case for whatever reason a bonger is using this"
        while(!email.matches("[a-zA-Z1-9]*@[a-zA-Z]*[.]{1}[a-zA-Z.]*"))
        {
            System.out.println("Please Enter Email in Format {User}@{domain}.{domainSuffix}: ");
            email = scanner.nextLine();
        }
        this.Email = email;
    }
    public String getEmail()
    {
        return this.Email;
    }

    //SSN getter and setter
    public void setSSN(String ssn)
    {
        //Validating SSN formatting
        //vaid format: ###-##-####
        while(!ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}"))  
        {
            System.out.println("Please Enter SSN in Format ###-##-####: ");
            ssn = scanner.nextLine();
        }
        this.SSN = ssn;
    }
    public String getSSN()
    {
        return this.SSN;
    }

    //Person getter function
    public Person getPerson()
    {
        return this;
    }

    //toString function to return person info as a string
    @Override
    public String toString()
    {
        return this.Name + ", " + this.DOB + ", " + this.Address + ", " + this.SSN + ", " + this.Email;
    }

}
