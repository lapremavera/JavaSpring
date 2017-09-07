package be.vdab.JavaSpring;

public class Passenger {

    private Integer id;
    private String firstname;
    private String lastname;
    private int frequentFlyer;

    public String fullname;



    public Passenger(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.frequentFlyer = 0;
    }

    public Passenger() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getFrequentFlyer() {
        return frequentFlyer;
    }

    public void setFrequentFlyer(int frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }

    public String getFullname() {
        return getFirstname() + " " + getLastname();
    }


}

