package GraduationProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
    public static void main(String[] args) {
        Date d=new Date();
    Owner o =new Owner("AhmedSliman","777295558","010101234",1582);
        InputMngr m=new InputMngr();
        m.addCar(1,"TOYOTA","Hilux","6510050","651655","red",1000,"Doller",o);
        m.addCar(15,"morsidas","dfsghgdf","o8ertjkg dfi","e9t8re0","red",1000,"Doller",o);
        /*
        m.viewCar();
        System.out.println("==============================================");
        //m.seachCar(15);
        m.removeCar(1);
        m.editCars(15,"morsidas","ML","7867887678","7867867","white",10500,"dollar",o);
        m.viewCar();
        */
        m.seachCar(1);
        Car c = new Car(4, "toyota", "landcruiser", "oe34jk34r3434", "433535", "red", 30000, "dollar", o);
        System.out.println(c);
        System.out.println("\n======================\n");
        Saller slr=new Saller("Adel", "777295558", "49083958", 1);
        MngrSl ms=new MngrSl();
        ms.addSale(1, "mmmmm", "nnnnnn", 29000, 500, d, c, slr);
        ms.viewSale();
    }
}
