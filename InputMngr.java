package GraduationProject;

import java.util.ArrayList;


public class InputMngr {

    private ArrayList<Car> Cars;

    public InputMngr() {
        Cars = new ArrayList<>();
    }

    public void addCar(int carId, String carName, String carModel, String engineNumber, String yearMade,
                       String car_color, int carPrice, String currency, Owner car_owner){
        for (Car c :Cars ) {
            if (c.getCarId()==carId)
                return;
        }
            Car ca = new Car(carId,carName,carModel,engineNumber,yearMade,car_color,carPrice,currency,car_owner);
            Cars.add(ca);

        }

    public void viewCar(){
        for (Car v: Cars) {
          System.out.println(v);
        }
    }

    public  void seachCar(int carId)
    {
        for (Car c:Cars ) {
            if (c.getCarId()==carId) System.out.println(c.toString());
        }

    }

   public void removeCar(int oId)
    {
        for (int i = 0; i < Cars.size(); i++) {
            if(Cars.get(i).getCarId()==oId)
            {Cars.remove(i);}
        }
    }

    public void editCars(int carId, String carName, String carModel, String engineNumber, String yearMade,
                         String car_color, int carPrice, String currency, Owner car_owner)
    {
        for (int i = 0; i < Cars.size(); i++) {
            if(Cars.get(i).getCarId()==carId) {
                Cars.get(i).setCarName(carName);
                Cars.get(i).setCarModel(carModel);
                Cars.get(i).setEngineNumber(engineNumber);
                Cars.get(i).setYearMade(yearMade);
                Cars.get(i).setCar_color(car_color);
                Cars.get(i).setCarPrice(carPrice);
                Cars.get(i).setCurrency(currency);
                Cars.get(i).setCar_owner(car_owner);
            }
        }
    }

}
