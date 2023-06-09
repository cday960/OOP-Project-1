import java.util.ArrayList;

public class Technician extends Employee
{
  public Technician()
  {
      super();
  }

  public Technician(String name, String address, String dob, String email, String ssn)
  {
      super(name, address, dob, email, ssn);
  }

  public Technician(String name, String address, String dob, String email, String ssn, String empID, float salary)
  {
      super(name, address, dob, email, ssn, empID, salary);
  }

  public void addItem(String itemid, ArrayList<Item> items)
  {
    System.out.println("What type of Item : Book, DVD, Newspaper, or Journal");//Prompts what item type
    String itemType = scanner.nextLine();
    if(!itemType.equals("Book") && !itemType.equals("DVD") && !itemType.equals("Newspaper") && !itemType.equals("Journal"))//Checks if it matches any valid name
    {
      while(!itemType.equals("Book") && !itemType.equals("DVD") && !itemType.equals("Newspaper") && !itemType.equals("Journal"))//Go again until right
            {
                System.out.println("Invalid Item Type. Insert Book, DVD, Newspaper, or Journal: ");
                itemType = scanner.nextLine();
            }
    }
    if(itemType.equals("Book"))//If book
    {
      Book newBook = new Book(itemid);//make new book
      items.add(newBook);
    }
    if(itemType.equals("DVD"))//If DVD
    {
      DVD newDVD = new DVD(itemid);//make new DVD
      items.add(newDVD);
    }
    if(itemType.equals("Journal"))//If Journal
    {
      Journal newJournal = new Journal(itemid);//Make new journal
      items.add(newJournal);
    }
    if(itemType.equals("Newspaper"))//If newspaper
    {
      Newspaper newNewspaper = new Newspaper(itemid);//makes new newspaper
      items.add(newNewspaper);
    }
  }

  public void removeItem(String itemId, ArrayList<Item> arrayList)
  {
    // Checks to see if an item with itemId is in arrayList
    for(int i=0; i < arrayList.size(); i++){ 
      // If it is, the return statement ends the function before printing the error message
      if(arrayList.get(i).getItemID() == itemId){
        arrayList.remove(arrayList.get(i));
        return;
      }
    }

    System.out.println("Error: item removal failed, not present in collection");
  }

  public void newEmployee(String name, String address, String dob, String email, String ssn, ArrayList<Employee> employeeList)
  {
    System.out.println("What type of Employee : Librarian or Technician");//Decides if employee is Librarian or Emplyee
    String employeeType = scanner.nextLine();
    if(!(employeeType.equals("Librarian")) && !(employeeType.equals("Technician")))//If incorrect input
    {
            while(!(employeeType.equals("Librarian")) && !(employeeType.equals("Technician")))//Go again until right
            {
                System.out.println("Invalid Employee Type. Insert either Librarian or Technician: ");
                employeeType = scanner.nextLine();
            }
    }
    if(employeeType.equals("Librarian"))//If Librarian
    {
      Librarian newEmployee = new Librarian(name, address, dob, email, ssn);//Make new Librarian
      employeeList.add(newEmployee);
    }
    if(employeeType.equals("Technician"))//If technician
    {
      Technician newEmployee = new Technician(name,address,dob,email,ssn);//Make new technician
      employeeList.add(newEmployee);
    }
  }

  public void newEmployee(String name, String address, String dob, String email, String ssn, String empID, float salary, ArrayList<Employee> employeeList)
  {
    System.out.println("What type of Employee : Librarian or Techician");//Decides if employee is a Librarian or Technician
    String employeeType = scanner.nextLine();
    if(!(employeeType.equals("Librarian")) && !(employeeType.equals("Technician")))//Checks if it is either type
    {
            while(!(employeeType.equals("Librarian")) && !(employeeType.equals("Technician")))//If not go again
            {
                System.out.println("Invalid Employee Type. Insert either Librarian or Technician: ");
                employeeType = scanner.nextLine();
            }
    }
    if(employeeType.equals("Librarian"))//If Librarian
    {
      Librarian newEmployee = new Librarian(name, address, dob, email, ssn, empID, salary);//Make new Librarian
      employeeList.add(newEmployee);
    }
    if(employeeType.equals("Technician"))//If Technician
    {
      Technician newEmployee = new Technician(name,address,dob,email,ssn,empID,salary);//Make Technician
      employeeList.add(newEmployee);
    }
  }

  
}
