
public class Card {
    private static int id = 0;
    private long number;
    private String expireDate;
    private int cvv;
    private CardType cardType;

    public enum CardType {
        VIZA, MASTERCARD;
    }

    public Card(long number, String expireDate, int cvv, CardType cardType) {
        id++;
        this.cvv = cvv;
        this.expireDate = expireDate;
        this.number = number;
        this.cardType = cardType;
    }

    public int getId() {
        return id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "id=" + id +
                ", number=" + number +
                ", expireDate=" + expireDate +
                ", cvv=" + cvv +
                ", cardType=" + cardType +
                '}';
    }
}

