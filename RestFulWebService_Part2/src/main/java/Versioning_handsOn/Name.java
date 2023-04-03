package Versioning_handsOn;

public class Name {
    String Fname ;
    String Lname ;

    public void setFname(String fname) {
        Fname = fname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public Name(String fname, String lname) {
        Fname = fname;
        Lname = lname;
    }

    @Override
    public String toString() {
        return "Name{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                '}';
    }
}
