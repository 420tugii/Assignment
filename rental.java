import java.time.LocalDate;

public class Rental {
    private Car car;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalCost;

    public Rental(Car car, Customer customer, LocalDate startDate, LocalDate endDate) {
        this.car = car;
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalCost = calculateCost();
    }

    private double calculateCost() {
        long rentalDays = java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);
        return rentalDays * car.getDailyRate();
    }

    public double getTotalCost() {
        return totalCost;
    }
}
