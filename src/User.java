import java.io.IOException;
import java.util.ArrayList;

public class User {
    private static int id = 0;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String phoneNumber;
    private Address billingAddress;
    private Address deliveryAddress;
    private ArrayList<Card> cards = new ArrayList();
    private Role role;
    private Manager manager;
    // Branch_1
    // Branch_2
    public User(String fullName, String email, RoleType roleType) {
        this.fullName = fullName;
        String [] splitOfFullName = fullName.split(" ");
        firstName = splitOfFullName[0];
        lastName = splitOfFullName[1];
        this.role = new Role(roleType);
        this.email = email;
        id++;
    }

    public User(String firstName, String lastName, String email, RoleType roleType) {
        this.firstName = firstName;
        this.role = new Role(roleType);
        this.lastName = lastName;
        this.email = email;
        fullName = firstName.concat(" " + lastName);
        id++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws IOException {
            if (phoneNumber.startsWith("+")) {
                this.phoneNumber = phoneNumber;
            } else {
                throw new IOException("Error phone number without +");
            }
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards (Card cards) {

        this.cards.add(cards);
  //      this.cards.forEach(System.out::println); /* обход всех элементов. */

    }
public void cardNumber (Card cards){
        setCards();
}
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;

    }
    public void setRole(Role role) {
        this.role = role;

    }
    public void printUserInfo() {
        System.out.println("User{" +
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", role=" + role +
                '}');
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", cards=" + cards +
                ", role=" + role +
                ", manager='" + manager + '\'' +
                '}';
    }


}
