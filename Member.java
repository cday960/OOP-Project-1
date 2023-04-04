public class Member extends Person
{
    String userID;

    public Member()//Default constructor
    {
        this.Name = "";
        this.Address = "";
        this.DOB = "";
        this.Email = "";
        this.SSN = "";
        this.userID = "";
    }
    
    public Member(String name, String address, String dob, String email, String ssn, String userid)//Constructor with everything correct
    {
        super(name, address, dob, email, ssn);//Takes the constructor from the super
        if(!userid.matches("[0-9]{4}"))//Checks if the constructor obtained bad data and if so fix it
        {
            while(!userid.matches("[0-9]{4}")) //Makes sure it is the right format 
            {
                System.out.println("Invalid User ID. Insert User ID in Format ####: ");
                userid = scanner.nextLine();//Scan new ID
            }
        }
        this.userID = userid;
    }

    public void setUserID(String userid)//Takes a premade userID and sets object id to it
    {
        while(!userid.matches("[0-9]{4}")) //Makes sure it is the right format 
        {
            System.out.println("Please Enter User ID in Format ####: ");
            userid = scanner.nextLine();//Scan new ID
        }
        this.userID = userid;//Sets the user ID to the new one
    }

    public void setUserID()//Sets UserID but allows user to type it in dynamically
    {
        String userid = "";//Sets userID to blank
        while(!userid.matches("[0-9]{4}"))  //Makes sure the userID is the right format
        {
            System.out.println("Please Enter User ID in Format ####: ");
            userid = scanner.nextLine();//Scan new ID
        }
        this.userID = userid;//Sets the objects id to the new one
    }

    public String getUserID()//Returns userID
    {
        return this.userID;
    }

    @Override
    public String toString()//Overrides the toString to match the person output but adding in the userID at the end
    {
        return this.Name + ", " + this.DOB + ", " + this.Address + ", " + this.SSN + ", " + this.Email + ", " + this.userID;
    }
}