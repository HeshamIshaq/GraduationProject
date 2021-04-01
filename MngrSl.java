package GraduationProject;

import java.util.ArrayList;
import java.util.Date;

public class MngrSl {
    private ArrayList<Sale> sales;

    public MngrSl() {
        sales = new ArrayList<>();
    }

    public void addSale(int saleId, String fWitness, String sWitness, int amountPaid,
                        int commission, Date dateSale, Car carAndOnr, Saller car_seller){
        for (Sale se :sales ) {
            if (se.getSaleId()==saleId)
                return;
        }
        Sale s = new Sale(saleId, fWitness, sWitness, amountPaid, commission, dateSale, carAndOnr, car_seller);
        sales.add(s);
    }

    public void viewSale(){
        for (Sale v: sales) {
            System.out.println(v);
        }
    }
}
