public class businessCars extends Cars {
    private String comfortableClass;
    public businessCars(int year, int price, String type, String model, String rentPeriod,String comfortableClass) {
        super(year, price, type, model, rentPeriod);
        setComfortableClass(comfortableClass);
    }
    public void setComfortableClass(String comfortableClass) {
        this.comfortableClass = comfortableClass;
    }

    public String getComfortableClass() {
        return comfortableClass;
    }
    @Override
    protected String getInfo() {
        System.out.println(getComfortableClass());
        return super.getInfo() ;
    }
}
