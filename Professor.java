import java.util.ArrayList;

public class Professor extends Member
{
    ArrayList <Student> classList;//Holds the students


    public Professor(String name, String address, String dob, String email, String ssn, String userid, float fined, int max, int checked, Student s)//Contructor with a student 
    {
        super(name, address, dob, email, ssn, userid, fined, max, checked);
        this.classList = new ArrayList<Student>();
        if(s != null)
        {
            this.classList.add(s);
        }
    }

    public Professor(String name, String address, String dob, String email, String ssn, String userid, float fined, int max, int checked)//Contructor without a student (sets list to blank)
    {
        super(name, address, dob, email, ssn, userid, fined, max, checked);
        this.classList = new ArrayList<Student>();
    }

    public Professor(String name, String address, String dob, String email, String ssn, String userid, float fined, int max, int checked, ArrayList <Student> s)//Constructor with a student array
    {
        super(name, address, dob, email, ssn, userid, fined, max, checked);
        classList = s;
    }

    public Professor(String name, String address, String dob, String email, String ssn, String userid, Student s)
    {
        super(name, address, dob, email, ssn, userid);
        this.classList = new ArrayList<Student>();
        if(s != null)
        {
            this.classList.add(s);
        }
    }

    public Professor()//Default Constructor
    {
        super();
        this.classList = new ArrayList<Student>();
    }

    public Professor(String name, String address, String dob, String email, String ssn, String userid)
    {
        super(name, address, dob, email, ssn, userid);
        this.classList = new ArrayList<Student>();
    }

    public Professor(String name, String address, String dob, String email, String ssn, String userid, ArrayList<Student> s)
    {
        super(name, address, dob, email, ssn, userid);
        this.classList = s;
    }

    public Student getStudent(int index)//Gets the student at index
    {
        if(index >= 0 && index < this.classList.size())
        {
            return(this.classList.get(index));
        }
        else
        {
            return null;
        }
    }

    public ArrayList<Student> getStudents()//Gets the classList
    {
        return(this.classList);
    }

    public void addStudent(Student s)//Adds student to the list
    {
        classList.add(s);
    }

    public void removeStudent(int index)//removes the student at the index
    {
        if(index >= 0 && index < this.classList.size())
        {
            classList.remove(index);
        }
    }

    public void setStudents(ArrayList<Student> s)//Sets the student list to a new list
    {
        this.classList = s;
    }

    @Override
    public String toString()
    {
        float temp = this.amountFined;//Following couple of lines set the amountFined to two decimal points
        temp = temp * 100;
        temp = (int) temp;
        temp = temp / 100;
        return this.Name + ", " + this.DOB + ", " + this.Address + ", " + this.SSN + ", " + this.Email + ", " + this.userID + ", Amount Fined : " + temp + ", Max Amount of Books " + this.maxNumbOfBooks + ", Current # Books Checked out " + this.booksChecked;
    }

}
