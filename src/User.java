public class User {
    private String username;
    private String password;
    private String cardNumber;

    public User() {
    }

    public User(String username, String password, String cardNumber) {
        setUsername(username);
        setPassword(password);
        setCardNumber(cardNumber);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
