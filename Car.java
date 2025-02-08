public class Car {
    private String carId;
    private String make;
    private String model;
    private int year;
    private double dailyRate;
    private boolean isAvailable;

    public Car(String carId, String make, String model, int year, double dailyRate) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
        this.isAvailable = true;
    }

    public void rent() throws Exception {
        if (!isAvailable) {
            throw new Exception("Car is not available for rent.");
        }
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}