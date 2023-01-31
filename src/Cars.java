public class Cars {
    private int year;
    private int price;
    private String type;
    private String model;
    private String rentPeriod; // ??? Why string???

    public Cars() {
    }

    public Cars(int year, int price, String type, String model, String rentPeriod) {
        setYear(year);
        setPrice(price);
        setType(type);
        setModel(model);
        setRentPeriod(rentPeriod);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setRentPeriod(String rentPeriod) {
        this.rentPeriod = rentPeriod;
    } // ???

    public String getRentPeriod() {
        return rentPeriod;
    } // ???

    protected String getInfo() {
        String info =  this.model + "\t" + this.type + "\t" + this.year;
        return info;
    }

    public void example(){
        System.out.println("example");
    }
}
