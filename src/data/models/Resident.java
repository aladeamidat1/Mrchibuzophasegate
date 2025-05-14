package data.models;

public class Resident {
    private String FullName;
    private int id;
    private String email;
    private String phone;
    private String address;

    public Resident(String FullName, String email, String phone, String address, int id){
        this.FullName = FullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.id = id;
    }

    public int getId(){
        return id;
    }


    public String getFullName(){
        return FullName;
    }

    public void setFullName(String FullName){
        this.FullName = FullName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getAddress(){
        return address;
    }


    public void setAddress(String address){
        this.address = address;
    }
}
