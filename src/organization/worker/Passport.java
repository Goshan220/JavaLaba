package organization.worker;

/**
 * Created by student on 05.09.2017.
 */
public class Passport {
    private int serial;
    private int num;
    private String place;
    private String date;

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "serial=" + serial +
                ", num=" + num +
                ", place='" + place + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
