import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class Journal extends Item 
{
    public Journal() //Default Constructor
    {
        this.ItemID = "";
        this.CheckedOutTo = "";
        this.DateCheckedOut = LocalDate.now();
        //this.DateToReturn = "";
    }

    public Journal(String itemId) //Constructor given just item ID
    {
        while(!itemId.matches("[0-9]{4}-[0-9X]{4}")) //Validates the formatting of ISSN 
        {
            System.out.println("Invalid Item ID: Enter ISSN with format ####-#### (the last number can be 'X' to represent 10)"); //
            itemId = scanner.nextLine(); //Scan new ID
        }
        this.ItemID = itemId;
        this.CheckedOutTo = "";
        this.DateCheckedOut = LocalDate.now();
    }

    public Journal (String itemId, String checkedOutTo) //Constructor given all member fields
    {
        while(!itemId.matches("[0-9]{4}-[0-9X]{4}")) //Validates the formatting of ISSN 
        {
            System.out.println("Invalid Item ID: Enter ISSN with format ####-#### (the last number can be 'X' to represent 10)"); //
            itemId = scanner.nextLine(); //Scan new ID
        }
        this.ItemID = itemId;
        this.CheckedOutTo = checkedOutTo;
        this.DateCheckedOut = LocalDate.now();
    }

    @Override
    public void setItemID(String itemId) //Setter with premade ID
    {
        while(!itemId.matches("[0-9]{4}-[0-9X]{4}")) //Validates the formatting of ISSN 
        {
            System.out.println("Invalid Item ID: Enter ISSN with format ####-#### (the last number can be 'X' to represent 10)"); //
            itemId = scanner.nextLine(); //Scan new ID
        }
        this.ItemID = itemId;
    }

    public void setItemID() //Dynamic Item ID setter
    {
        String itemId = ""; //Initializes itemID to an empty string

        while(!itemId.matches("[0-9]{4}-[0-9X]{4}")) //Validates the formatting of ISSN 
        {
            System.out.println("Invalid Item ID: Enter ISSN with format ####-#### (the last number can be 'X' to represent 10)"); //
            itemId = scanner.nextLine(); //Scan new ID
        } 
        this.ItemID = itemId;
        
    }

    public String toString()//Overrides the toString
    {
        return super.toString();
    }
}
