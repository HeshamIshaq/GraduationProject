package GraduationProject;

public class Saller extends Person{

    private int slrId;

    public Saller(String name, String phone, String documentNumber, int slrId) {
        super(name, phone, documentNumber);
        this.slrId = slrId;
    }

    public int getSlrId() {
        return slrId;
    }

    public void setSlrId(int slrId) {
        this.slrId = slrId;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\nSaller\n\n{" +
                "slrId=" + slrId +
                '}';
    }
}
