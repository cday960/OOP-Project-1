import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Item 
{
    protected String ItemID;        //Member stores the Item ID
    protected String CheckedOutTo;  //Member stores the MemberID of the member it is checked out to
    protected String DateCheckedOut;//Member stores date item was checked out
    protected String DateToReturn;  //Member stores the date item is expected to be returned

    //Member for scanner that will be used in methods
    Scanner scanner = new Scanner(System.in);

    //Default constructor for Item Class
    public Item()
    {
        this.ItemID = "";
        this.CheckedOutTo = "";
        this.DateCheckedOut = "";
        this.DateCheckedOut = "";
    }
    //Constructor given all member fields
    public Item(String itemid, String checkedoutto, String datecheckedout)
    {
        this.ItemID = itemid;
        this.CheckedOutTo = checkedoutto;
        this.DateCheckedOut = datecheckedout;
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
        this.CheckedOutTo = checkoutto;
    }
    public String getCheckedOutTo()
    {
        return this.CheckedOutTo;
    }
    //DateCheckedOut setter and getter
    public void setDates(String datecheckedout)
    {
        //verify format
        //do logic to get return date
        String datetoreturn = "";
        this.DateCheckedOut = datecheckedout;
        this.DateToReturn = datetoreturn;
    }
    public String getDateCheckedOut()
    {
        return this.DateCheckedOut;
    }
    //DateToReturn getter
    public String getDateToReturn()
    {
        return this.DateToReturn;
    }
}
