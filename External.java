public class External extends Member
{
    public External()
    {
        super();
    }

    public External(String name, String address, String dob, String email, String ssn, String userid, float fined, int max, int checked)//Constructor with everything correct
    {
        super(name, address, dob, email, ssn, userid, fined, max, checked);//Takes the constructor from the super
    }

    public External(String name, String address, String dob, String email, String ssn, String userid)//Constructor with everything correct
    {
        super(name, address, dob, email, ssn, userid);//Takes the constructor from the super
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
