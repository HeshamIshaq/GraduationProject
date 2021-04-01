package GraduationProject;

abstract class Person {
    private String name;
    private String phone; //رقم الهاتف
    private String documentNumber; //رقم الوثيقة

    public Person(String name, String phone, String documentNumber) {
        this.name = name;
        this.phone = phone;
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
/*.\






    ]]]]Override

     */
    public String toString() {
        return
                "  name=\"" + name + '\"' +
                ", phone=" + phone +
                ", documentNumber=\"" + documentNumber + '\"' ;
    }
}
