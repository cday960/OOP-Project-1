import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

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

    public Librarian(String name, String address, String dob, String email, String ssn, String empID, float s)//Librarian does not have extra values so you can call the super
    {
        super(name,address, dob, email, ssn, empID, s);
    }

    public void checkOutItem(Item item, Member member)//Sets the item date to ccurrent date and the checkedOutTo to the member
    {
        item.setCheckedOutTo((member.getUserID()));
        item.DateCheckedOut = LocalDate.now();
    }

    public long timeChecked(Item item)//Returns long for the amount of days between checked out of the book and current day
    {
        LocalDate dateChecked = item.getDateCheckedOut();
        LocalDate currentDate = LocalDate.now();
        return(ChronoUnit.DAYS.between(dateChecked, currentDate));
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