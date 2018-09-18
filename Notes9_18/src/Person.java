import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {

    String firstName = "";
    String lastName = "";
    String address = "";
    String city = "";
    String state = "";
    String zipCode = "";
    String hmPhone = "";
    String cllPhone = "";
    LocalDate birthDate = LocalDate.now();


    public static int calcAge(LocalDate xDate){
        LocalDate xDate1 = LocalDate.now();
        return (int) xDate.until(LocalDate.now(), ChronoUnit.DAYS);
    }



    //Constructor
    public Person(){



    }

    //right-click Generate Constructor, shift-click to select all names
    public Person(String firstName, String lastName, String address, String city, String state, String zipCode, String hmPhone, String cllPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.hmPhone = hmPhone;
        this.cllPhone = cllPhone;

    }
    //smart enought to know when
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getHmPhone() {
        return hmPhone;
    }

    public void setHmPhone(String hmPhone) {
        this.hmPhone = hmPhone;
    }

    public String getCllPhone() {
        return cllPhone;
    }

    public void setCllPhone(String cllPhone) {
        this.cllPhone = cllPhone;
    }
}
