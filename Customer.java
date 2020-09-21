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

    public void display(){
        System.out.println("Name:"+this.name);
        System.out.println("Email Id:"+this.email);
        System.out.println("Mobile:"+this.mobile);
        System.out.println("Pickup:"+this.pickUp);
        System.out.println("Destination:"+this.destination);
    }
}