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

    

}