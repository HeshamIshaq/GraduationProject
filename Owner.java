package GraduationProject;

public class Owner extends Person{

    private int onrId; //رقم تعرفة المالك

    public Owner(String name, String phone, String documentNumber, int onrId) {
        super(name, phone, documentNumber);
        this.onrId = onrId;
    }

    public int getOnrId() {
        return onrId;
    }

    public void setOnrId(int onrId) {
        this.onrId = onrId;
    }

    @Override
    public String toString() {
        return super.toString()+"," +
                "onrId=" + onrId  ;
    }
}

