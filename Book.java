import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class Book extends Item
{
    public Book() //Default Constructor
    {
        this.ItemID = "";
        this.CheckedOutTo = "";
        this.DateCheckedOut = LocalDate.now();
        //this.DateToReturn = "";
    }

    public Book(String itemId) //Constructor given just item ID
    {
        while(!itemId.matches("[0-9]{3}-[0-9]{2}-[0-9]{5}-[0-9]{2}-[0-9X]{1}")) //Validates the formatting of ISSN 
        {
            System.out.println("Invalid Item ID: Enter ISBN with format ###-##-#####-##-# (the last number can be 'X' to represent 10)"); 
            itemId = scanner.nextLine(); //Scan new ID
        }
        this.ItemID = itemId;
        this.CheckedOutTo = "";
        this.DateCheckedOut = LocalDate.now();
    }


    public Book (String itemId, String checkedOutTo) //Constructor given all member fields
    {
        
        while(!itemId.matches("[0-9]{3}-[0-9]{2}-[0-9]{5}-[0-9]{2}-[0-9X]{1}")) //Validates the formatting of ISSN 
        {
            System.out.println("Invalid Item ID: Enter ISBN with format ###-##-#####-##-# (the last number can be 'X' to represent 10)"); 
            itemId = scanner.nextLine(); //Scan new ID
        }
        this.ItemID = itemId;
        this.CheckedOutTo = checkedOutTo;
        this.DateCheckedOut = LocalDate.now();
    }

    @Override
    public void setItemID(String itemId) //Setter with premade ID
    {
        while(!itemId.matches("[0-9]{3}-[0-9]{2}-[0-9]{5}-[0-9]{2}-[0-9X]{1}")) //Validates the formatting of ISSN 
        {
            System.out.println("Invalid Item ID: Enter ISBN with format ###-##-#####-##-# (the last number can be 'X' to represent 10)"); 
            itemId = scanner.nextLine(); //Scan new ID
        }
        this.ItemID = itemId;
    }

    public void setItemID() //Dynamic Item ID setter
    {
        String itemId = ""; //Initializes itemID to an empty string

        while(!itemId.matches("[0-9]{3}-[0-9]{2}-[0-9]{5}-[0-9]{2}-[0-9X]{1}")) //Validates the formatting of ISSN 
        {
            System.out.println("Invalid Item ID: Enter ISBN with format ###-##-#####-##-# (the last number can be 'X' to represent 10)"); 
            itemId = scanner.nextLine(); //Scan new ID
        }
        this.ItemID = itemId;      
    }


    public String toString()//Overrides the toString
    {
        return super.toString();
    }
}
