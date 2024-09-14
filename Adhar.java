package Project;

public class Adhar {
    private String adharnumber;
    private String name;
    private String fathername;
    private String address;

    public Adhar(String address, String adharnumber, String fathername, String name) {
        this.address = address;
        this.adharnumber = adharnumber;
        this.fathername = fathername;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdharnumber() {
        return adharnumber;
    }

    public void setAdharnumber(String adharnumber) {
        this.adharnumber = adharnumber;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Adhar{" +
                "address='" + address + '\'' +
                ", adharnumber='" + adharnumber + '\'' +
                ", name='" + name + '\'' +
                ", fathername='" + fathername + '\'' +
                '}';
    }
}


