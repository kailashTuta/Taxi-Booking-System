import java.io.*;
class Rider implements Serializable{
    private String name,email,mobile,pickUp,destination,date,fare;

    public Rider() {
    }

    public Rider(String date, String name, String email, String mobile, String pickUp, String destination, String fare ) {
        this.date = date;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.pickUp = pickUp;
        this.destination = destination;
        this.fare = fare;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPickUp() {
        return this.pickUp;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFare() {
        return this.fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "\n"+"Date:"+getDate()+"\n"+"Name:"+getName()+"\n"+"Email:"+
        getEmail()+"\n"+"Mobile:"+getMobile()+"\n"+"Pickup:"+getPickUp()+"\n"+
        "Drop:"+getDestination()+"\n"+"Fare:"+getFare();
    }

}
