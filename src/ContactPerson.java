public class ContactPerson {

    private String fname;
    private String lname;
    private String address;
    private String city;
    private String state;
    private long phonenumber;
    private long zip;
//    constructor
    public ContactPerson(String fname,String lname,String address,String city,String state, long zip, long phonenumber){
        this.fname=fname;
        this.lname=lname;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phonenumber=phonenumber;
    }
// getters
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public long getZip() {
        return zip;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public String toString(){
        return "name: "+fname+ " "+lname+", Address: "+address+",  City: "+city+",  State: "+state+",  Pin Code: "+zip+",  Phone Number: "+phonenumber+"|";
    }




}
