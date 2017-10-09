package organization.worker;

import java.util.ArrayList;

/**
 * Created by student on 05.09.2017.
 */
public class Organization {
    private String name;
    private String address;
    private Man man;
    private static Organization organization;
    private ArrayList<Man> employees = new ArrayList<>();

    private Organization() {
    }

    @Override
    public String toString() {
        return "Organization{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", employees=" + employees +
                '}';
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public static Organization getOrganization() {
        if (organization == null) organization = new Organization();
        return organization;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Man> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Man> employees) {
        this.employees = employees;
    }
}
