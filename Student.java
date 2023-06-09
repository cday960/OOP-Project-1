public class Student extends Member
{
    Professor currentProfessor;

    public Student(String name, String address, String dob, String email, String ssn, String userid, float fined, int max, int checked, Professor p)
    {
        super(name, address, dob, email, ssn, userid, fined, max, checked);
        this.currentProfessor = p;
    }

    public Student(String name, String address, String dob, String email, String ssn, String userid, Professor p)
    {
        super(name, address, dob, email, ssn, userid);
        this.currentProfessor = p;
    }
    
    public Student()
    {
        super();
        currentProfessor = null;
    }

    public Professor getProfessor()
    {
        return this.currentProfessor;
    }
    public void setProfessor(Professor p)
    {
        this.currentProfessor = p;
    }

    @Override
    public String toString()
    {
        float temp = this.amountFined;//Following couple of lines set the amountFined to two decimal points
        temp = temp * 100;
        temp = (int) temp;
        temp = temp / 100;
        return this.Name + ", " + this.DOB + ", " + this.Address + ", " + this.SSN + ", " + this.Email + ", " + this.userID + ", Amount Fined : " + temp + ", Max Amount of Books " + this.maxNumbOfBooks + ", Current # Books Checked out " + this.booksChecked + ", Teacher: " + this.currentProfessor.getName();
    }


}
