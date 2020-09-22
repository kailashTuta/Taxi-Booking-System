class Customer implements Passenger{
    private String name,email,mobile,pickUp,destination;


    public Customer() {
    }

    public Customer(String name, String email, String mobile, String pickUp, String destination) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.pickUp = pickUp;
        this.destination = destination;
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

    public void display(){}


    @Override
    public String toString() {
        return "\n"+"Name:"+getName()+"\n"+"Email:"+getEmail()+"\n"+"Mobile:"+getMobile()+"\n"+"Pickup:"+getPickUp()+"\n"+"Drop:"+getDestination();
    }

}
