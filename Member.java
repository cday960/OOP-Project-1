public class Member extends Person
{
    String userID;
    float amountFined;
    int maxNumbOfBooks;
    int booksChecked;

    public Member()//Default constructor
    {
        this.Name = "";
        this.Address = "";
        this.DOB = "";
        this.Email = "";
        this.SSN = "";
        this.userID = "";
        this.amountFined = 0;
        this.maxNumbOfBooks = 5;
        this.booksChecked = 0;
    }
    
    public Member(String name, String address, String dob, String email, String ssn, String userid, float fined, int max, int checked)//Constructor with everything correct
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
        this.amountFined = fined;
        if(maxNumbOfBooks < 0)
        {
            maxNumbOfBooks = 0;
        }
        this.maxNumbOfBooks = max;
        if(booksChecked < 0)
        {
            booksChecked = 0;
        }
        this.booksChecked = checked;
        this.userID = userid;
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
        this.amountFined = 0f;
        this.maxNumbOfBooks = 5;
        this.booksChecked = 0;
        this.userID = userid;
    }

    public void addFined(float fine)
    {
        this.amountFined += fine;
    }

    public float getFined()
    {
        return(this.amountFined);
    }

    public void setFined(float fine)
    {
        this.amountFined = fine;
    }

    public int getMaxBook()
    {
        return(this.maxNumbOfBooks);
    }
    
    public void setMaxBook(int max)
    {
        if(max < 0)
        {
            max = 0;
        }
        this.maxNumbOfBooks = max;
    }

    public int getChecked()
    {
        return(this.booksChecked);
    }

    public void addChecked(int x)
    {
        this.booksChecked += x;
    }

    public void setChecked(int x)
    {
        if(x < 0)
        {
            x = 0;
        }
        this.booksChecked = x;
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
        float temp = this.amountFined;//Following couple of lines set the amountFined to two decimal points
        temp = temp * 100;
        temp = (int) temp;
        temp = temp / 100;
        return this.Name + ", " + this.DOB + ", " + this.Address + ", " + this.SSN + ", " + this.Email + ", " + this.userID + ", Amount Fined : " + temp + ", Max Amount of Books " + this.maxNumbOfBooks + ", Current # Books Checked out " + this.booksChecked;
    }
    
}
