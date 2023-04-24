import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Librarian extends Employee
{
    public Librarian()//Librarian does not have extra values so you can call the super
    {
        super();
    }

    public Librarian(String name, String address, String dob, String email, String ssn)//Librarian does not have extra values so you can call the super
    {
        super(name,address,dob,email,ssn);
    }

    public Librarian(String name, String address, String dob, String email, String ssn, String empID, float salary)//Librarian does not have extra values so you can call the super
    {
        super(name,address, dob, email, ssn, empID, salary);
    }

    public void checkOutItem(Item item, Member member)//Sets the item date to ccurrent date and the checkedOutTo to the member
    {
        item.setCheckedOutTo((member.getUserID()));
        item.DateCheckedOut = LocalDate.now();
    }

    static public long timeChecked(Item item)//Returns long for the amount of days between checked out of the book and current day
    {
        LocalDate dateChecked = item.getDateCheckedOut();
        LocalDate currentDate = LocalDate.now();
        //System.out.println(ChronoUnit.DAYS.between(dateChecked, currentDate));
        return(ChronoUnit.DAYS.between(dateChecked, currentDate));
    }

    public void BorrowItem(Item item)
    {
        item.setDate();
    }

    public void ReturnItem(Item item)
    {
        item.CheckedOutTo = null;
    }

    public void CheckOverdue(ArrayList<Member> members, ArrayList<Item> items)
    {
        for(int i = 0; i < items.size(); i++)//Goes through all the items
        {
            int timeChecked = (int) (Librarian.timeChecked((items.get(i))));//Gets the amount of time a book has been checked out
            if(timeChecked == 12)//If tweleve we need to send an email warning
            {
                boolean found = false;
                int z = 0;
                for(z = 0; z < members.size() && found == false ; z++)//Goes through until the end of the members or the user is found
                {
                    if(((members.get(z)).getUserID()).equals(((items.get(i)).getCheckedOutTo())))//Checks if the member id equals the books checked member
                    {
                        found = true;
                    }
                }
                z--;
                if(found == true)
                {
                    System.out.println("Send 12 day notice to : " + ((members.get(z)).getEmail()));//Alerts the console to send an email to the user
                }
            }
            if(timeChecked == 14)//If 14 a warning needs to be sent
            {
                boolean found = false;
                int z = 0;
                for(z = 0; z < members.size() && found == false ; z++)//Checks through all the members until end of list or found
                {
                    if(((members.get(z)).getUserID()).equals(((items.get(i)).getCheckedOutTo())))//Checks if the userID and the items userID matches
                    {
                        found = true;
                    }
                }
                z--;
                if(found == true)
                {
                    System.out.println("Send 14 day notice to : " + ((members.get(z)).getEmail()));//Alerts to send an email
                }
            }
            if(timeChecked > 14)//If it is greater than 14
            {
                int z = 0;
                for(z = 0; z < members.size(); z++)
                {
                    if(((members.get(z)).getUserID()) == ((items.get(i)).getCheckedOutTo()))
                    {
                        (members.get(z)).addFined(1f);//Add 1 dollar to fine
                    }
                }
            }

        }
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

/*
Test Main for current and later functions
    static public void main(String[] argc)
    {
        ArrayList<Member> members = new ArrayList<Member>();
        members.add(new Member("Alex Trabec", "123 Street 12345", "12/12/1212", "alec@gmail.com", "111-11-1111", "1111"));
        members.add(new Member("Steve Rogers", "123 Street 12345", "12/12/1212", "Steve@gmail.com", "111-11-1111", "1212"));
        members.add(new Member("Kevin Smith", "123 Street 12345", "12/12/1212", "kevin@gmail.com", "111-11-1111", "3333"));
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("111"));
        items.add(new Item("123"));
        items.add(new Item("134"));
        Librarian l = new Librarian();
        for(int i = 0; i < members.size(); i++)
        {
            l.checkOutItem((items.get(i)), (members.get(i)));
        }
        l.CheckOverdue(members, items);
        for(int i = 0; i < members.size(); i++)
        {
            System.out.println((members.get(i)).getFined());
        }
    }
    */
}
