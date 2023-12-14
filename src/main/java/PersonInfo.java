public class PersonInfo {
    private String fullName;
    private String phoneNumber;
    private String address;

    public PersonInfo(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }

    public PersonInfo(String fullName, String address, String phoneNumber) {
        this.fullName = fullName;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
