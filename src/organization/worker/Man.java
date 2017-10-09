package organization.worker;

/**
 * Created by student on 05.09.2017.
 */
public class Man {
    private String surname;
    private String name;
    private String patr;
    private Passport passport;

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatr() {
        return patr;
    }

    public void setPatr(String patr) {
        this.patr = patr;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Man{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patr='" + patr + '\'' +
                ", passport=" + passport +
                '}';
    }
}
