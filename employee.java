
public class employee {
    // Instance variables
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    // Default Constructor
    public employee() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    // Parameterized Constructor
    public employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Getter and Setter Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to get full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using Default Constructor
        employee emp1 = new employee();
        System.out.println("Default Constructor:");
        System.out.println("ID: " + emp1.getId() + ", Full Name: " + emp1.getFullName() + ", Address: " + emp1.getAddress());

        // Using Parameterized Constructor
        employee emp2 = new employee(1, "John", "Doe", "123 Main St");
        System.out.println("\nParameterized Constructor:");
        System.out.println("ID: " + emp2.getId() + ", Full Name: " + emp2.getFullName() + ", Address: " + emp2.getAddress());
    }
}
