import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Item 
{
    protected String ItemID;        //Member stores the Item ID
    protected String CheckedOutTo;  //Member stores the MemberID of the member it is checked out to
    protected LocalDate DateCheckedOut;//Member stores date item was checked out
    //protected String DateToReturn;  //Member stores the date item is expected to be returned

    //Member for scanner that will be used in methods
    Scanner scanner = new Scanner(System.in);

    //Default constructor for Item Class
    public Item()
    {
        this.ItemID = "";
        this.CheckedOutTo = "";
        this.DateCheckedOut = LocalDate.now();
        //this.DateCheckedOut = "";
    }

    public Item(String itemid)
    {
        this.ItemID = itemid;
        CheckedOutTo = "";
        this.DateCheckedOut = LocalDate.now();
    }
    //Constructor given all member fields
    public Item(String itemid, String checkedoutto)
    {
        if(!checkedoutto.matches("[0-9]{4}"))//Checks if the constructor obtained bad data and if so fix it
        {
            while(!checkedoutto.matches("[0-9]{4}")) //Makes sure it is the right format 
            {
                System.out.println("Invalid Member ID. Insert Member ID in Format ####: ");
                checkedoutto = scanner.nextLine();//Scan new ID
            }
        }
        this.ItemID = itemid;
        this.CheckedOutTo = checkedoutto;
        this.DateCheckedOut = LocalDate.now();
        //Logic to get return date
    }

    //Item ID setter and getter
    public void setItemID(String id)
    {
        //Verify format
        this.ItemID = id;
    }
    public String getItemID()
    {
        return this.ItemID;
    }
    //CheckedOutTo setter and getter
    public void setCheckedOutTo(String checkoutto)
    {
        //verify format
        if(!checkoutto.matches("[0-9]{4}"))
        {
            while(!checkoutto.matches("[0-9]{4}")) //Makes sure it is the right format 
            {
                System.out.println("Invalid Member ID. Insert Member ID in Format ####: ");
                checkoutto = scanner.nextLine();//Scan new ID
            }
        }
        this.CheckedOutTo = checkoutto;
    }
    public String getCheckedOutTo()
    {
        return this.CheckedOutTo;
    }
    //DateCheckedOut setter and getter
    public void setDates()
    {
        //verify format
        //do logic to get return date
        //String datetoreturn = "";
        this.DateCheckedOut = LocalDate.now();
        //this.DateToReturn = datetoreturn;
    }
    public LocalDate getDateCheckedOut()
    {
        return this.DateCheckedOut;
    }
    //DateToReturn getter
    //public String getDateToReturn()
    //{
    //    return this.DateToReturn;
    //}

    @Override
    public String toString()//Overrides the toString
    {
        return this.ItemID + ", " + this.CheckedOutTo + ", " + this.DateCheckedOut.toString() ;
    }

}
