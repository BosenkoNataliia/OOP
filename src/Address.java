public class Address {
    private static int id = 0;
    private String country;
    private String city;
    private String street;
    private int building;
    private int room;
    private int zipCode;

    public Address(String country, String city, String street, int building, int zipCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.zipCode = zipCode;
        id++;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipСode) {
        this.zipCode = zipСode;
    }

    public void printUserInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                ", room=" + room +
                ", zipCode=" + zipCode +
                '}';
    }
}
