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
    Item newItem = new Item(itemid);
    items.add(newItem);
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

  public void newEmployee(
    String name, 
    String address, 
    String dob, 
    String email, 
    String ssn, 
    ArrayList<Employee> employeeList
  ){
    Employee newEmployee = new Employee(name, address, dob, email, ssn);
    employeeList.add(newEmployee);
  }

  public void newEmployee(
    String name, 
    String address, 
    String dob, 
    String email, 
    String ssn, 
    String empID,
    float salary,
    ArrayList<Employee> employeeList
  ){
    Employee newEmployee = new Employee(name, address, dob, email, ssn, empID, salary);
    employeeList.add(newEmployee);
  }
}
