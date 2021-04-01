package GraduationProject;
import java.util.Date;

public class Sale{
    private int saleId;
    private String fWitness; //اسم الشاهد الاول
    private String sWitness; //اسم الشاهد الثاني
    private int amountPaid; //المبلغ المدفوع
    private int commission; //عمولة المعرض
    private Date dateSale; //تاريخ البيع
    private Car carAndOnr;
    private Saller car_seller;

    public Sale(int saleId, String fWitness, String sWitness, int amountPaid,
                int commission, Date dateSale, Car carAndOnr, Saller car_seller) {
        this.saleId = saleId;
        this.fWitness = fWitness;
        this.sWitness = sWitness;
        this.amountPaid = amountPaid;
        this.commission = commission;
        this.dateSale = dateSale;
        this.carAndOnr = carAndOnr;
        this.car_seller = car_seller;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public String getfWitness() {
        return fWitness;
    }

    public void setfWitness(String fWitness) {
        this.fWitness = fWitness;
    }

    public String getsWitness() {
        return sWitness;
    }

    public void setsWitness(String sWitness) {
        this.sWitness = sWitness;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public Date getDateSale() {
        return dateSale;
    }

    public void setDateSale(Date dateSale) {
        this.dateSale = dateSale;
    }

    public Car getCarAndOnr() {
        return carAndOnr;
    }

    public void setCarAndOnr(Car carAndOnr) {
        this.carAndOnr = carAndOnr;
    }

    public Saller getCar_seller() {
        return car_seller;
    }

    public void setCar_seller(Saller car_seller) {
        this.car_seller = car_seller;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleId=" + saleId +
                ", fWitness='" + fWitness + '\'' +
                ", sWitness='" + sWitness + '\'' +
                ", amountPaid=" + amountPaid +
                ", commission=" + commission +
                ", dateSale=" + dateSale +
                ", carAndOnr=" + carAndOnr +
                ", car_seller=" + car_seller +
                '}';
    }
}
