package GraduationProject;

public class Car {

    private int carId;  // رقم صفيحة السيارة
    private String carName;  // manufacturer’s name اسم الشركة المصنعة
    private String carModel;  // نوع السيارة
    private String engineNumber;  // رقم المحرك
    private String yearMade;  // سنة صنع السيارة
    private String car_color;  // لون السيارة
    private int carPrice; //المبلغ المطلوب
    private String currency; //نوع العملة
    private Owner car_owner;

    public Car(int carId, String carName, String carModel, String engineNumber, String yearMade,
               String car_color, int carPrice, String currency, Owner car_owner) {
        this.carId = carId;
        this.carName = carName;
        this.carModel = carModel;
        this.engineNumber = engineNumber;
        this.yearMade = yearMade;
        this.car_color = car_color;
        this.carPrice = carPrice;
        this.currency = currency;
        this.car_owner = car_owner;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getYearMade() {
        return yearMade;
    }

    public void setYearMade(String yearMade) {
        this.yearMade = yearMade;
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Owner getCar_owner() {
        return car_owner;
    }

    public void setCar_owner(Owner car_owner) {
        this.car_owner = car_owner;
    }

    @Override
    public String toString() {
        return
                "  carId=" + carId  +
                ", carName=\"" + carName + '\"' +
                ", carModel=\"" + carModel + '\"' +
                ", engineNumber=\"" + engineNumber + '\"' +
                ", yearMade=\"" + yearMade + '\"' +
                ", car_color=\"" + car_color + '\"' +
                ", carPrice=" + carPrice +
                ", currency=\"" + currency + '\"' +
                ", car_owner={" + car_owner +
                "}";
    }
}
