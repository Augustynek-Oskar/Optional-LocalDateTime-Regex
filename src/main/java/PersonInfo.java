public class PersonInfo {
    private String fullName;
    private String phoneNumber;
    private String address;

    public PersonInfo(String fullName, String address) {
        this.address = address;
        this.fullName = fullName;
    }

    public PersonInfo(String fullName, String address, String phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        if (phoneNumber == null) return " {Full name :" + fullName + ", address: " + address + "}";
        else return  " {Full name: " + fullName + ", address: " + address +  ", phone number: " + phoneNumber + "}";
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

}
