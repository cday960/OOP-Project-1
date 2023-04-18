import java.util.ArrayList;

class Main
{
  public static void main(String [] args){
    ArrayList<Item> itemList = new ArrayList<Item>();
    Item bruh1 = new Item("1");
    Item bruh2 = new Item("2");
    Item bruh3 = new Item("3");
    itemList.add(bruh1);
    itemList.add(bruh2);
    itemList.add(bruh3);

    System.out.println(itemList);

    Technician tech = new Technician("Cameron Day Br", "1234 bruh 12345", "03/01/2002", "bruh@gmail.com", "123-45-6789");

    tech.addItem("4", itemList);
    System.out.println(itemList);

    tech.removeItem("0", itemList);
    System.out.println(itemList);

    ArrayList<Employee> employeeList = new ArrayList<Employee>();
    Employee asra = new Employee("Asra Kennon Br", "123 bruh 12345", "07/02/2002", "asra@gmail.com", "123-45-6789");
    employeeList.add(asra);
    System.out.println(employeeList);

    tech.newEmployee("Georgia Schaffer Ms", "124 bruh 12345", "01/02/2002", "gorga@gmail.com", "123-45-7129", employeeList);
    System.out.println(employeeList);
  }
}
