public class sportCars extends Cars implements ISpeedLock {
    private boolean isOn = true;
    private String maximumSpeed;
    public sportCars(int year, int price, String type, String model, String rentPeriod,String maximumSpeed) {
        super(year, price, type, model, rentPeriod);
        setMaximumSpeed(maximumSpeed);
    }

    @Override
    protected String getInfo() {


        return super.getInfo()+ "\tmax speed= " + getMaximumSpeed();
    }

    public void setMaximumSpeed(String maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }
    public String getMaximumSpeed() {
        return maximumSpeed;
    }

    @Override
    public void speedLock(boolean isOn) {
        this.isOn = isOn;
        if (isOn) {
            maximumSpeed = "100km";
        }
    }
}
