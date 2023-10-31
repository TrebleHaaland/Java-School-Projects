package SemesterTwoLab5;
/**
 * Represents a salesperson with various attributes such as name, age, location, role, and department without the use of polymorphism.
 *
 * @author Emmanuel Alabi.
 * @version  1.3
 * @since 11
 *
 */
class SalesPerson {
    private String name;
    private int age;
    private String location;
    private String role;
    private String department;

    /**
     * Constructs a SalesPerson object with the given attributes.
     *
     * @param name       the name of the salesperson
     * @param age        the age of the salesperson
     * @param location   the location of the salesperson
     * @param role       the role of the salesperson
     * @param department the department of the salesperson
     */
    public SalesPerson(String name, int age, String location, String role, String department) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.department = department;
    }

    /**
     * Returns a string representation of the SalesPerson object.
     *
     * @return a string representation of the SalesPerson object
     */
    
    public String toString() {
        return role + " [name=" + name + ", age=" + age + ", [super=" +"location : "+ location +"]" +", [super=" +"Department : "+ department +"]"+"]";
    }
}


  //Driver class to test the SalesPerson class.

public class SalesPersonDriver {
    /**
     * Entry point of the program.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        SalesPerson salesPerson1 = new SalesPerson("John", 30, "", "Sales Agent","");
        SalesPerson salesPerson2 = new SalesPerson("Alice", 28, "", "Sales Agent","");
        SalesPerson salesPerson3 = new SalesPerson("Mark", 35, "New York", "Sales Supervisor","");
        SalesPerson salesPerson4 = new SalesPerson("Sarah", 40, "London", "Sales Chief", "Marketing");

        System.out.println(salesPerson1);
        System.out.println(salesPerson2);
        System.out.println(salesPerson3);
        System.out.println(salesPerson4);
    }
}
