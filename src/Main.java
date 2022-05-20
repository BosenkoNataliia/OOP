import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        User user = new User("Dima", "Bosenko", "Customer@gmail", RoleType.CUSTOMER);
//        try {
//            user.setPhoneNumber("380631120092");
//        } catch (IOException exception) {
//            System.out.println("Error phone number");
//        }
//        Address addresS = new Address("Ukrain", "Boyarka", "Bil", 15, 1523);
//        user.setBillingAddress(addresS);
//        System.out.println(user);
////
//        User user1 = new User("Olya", "Bosenko", "olyabos@gmail.com", RoleType.MAINCUSTOMER);
//        try {
//            user1.setPhoneNumber("+380631120092");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Address address = new Address("Ukrain", "Boyarka", "Bil", 15, 1523);
//        user1.setBillingAddress(address);
//        for (Card cards : Arrays.asList(new Card(7777444488885555L, "444", 123, Card.CardType.MASTERCARD), new Card(7007444488885111L, "777", 854, Card.CardType.VIZA))) {
//            user1.setCards(cards);
//        }
//        System.out.println(user1);

        Manager manager = new Manager("Nata Bosenko", "natabos@gmail.com", RoleType.ADMIN, "test");
        try {
            manager.setPhoneNumber("+380502121111");
        } catch (IOException e) {
            e.printStackTrace();
        }
        manager.setWorkPhoneNumber("+380630000000");
        manager.setCards(new Card(7777444488885555L, "444", 123, Card.CardType.VIZA));
        manager.setCards(new Card(7007444488885111L, "777", 854, Card.CardType.MASTERCARD));
        manager.printUserInfo();

}
}


