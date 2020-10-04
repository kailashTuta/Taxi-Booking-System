import java.io.*;
class ViewRide{

    public ViewRide() {

    }

    public void rideView(){
        try {

            ObjectInputStream in=new ObjectInputStream(new FileInputStream("details.txt"));  
            Rider r=(Rider)in.readObject(); 
    
            System.out.println("Date:"+r.getDate()+"\n");
            System.out.println("Name:"+r.getName());
            System.out.println("Email:"+r.getEmail());
            System.out.println("Mobile:"+r.getMobile());
            System.out.println("Pickup:"+r.getPickUp());
            System.out.println("Drop:"+r.getDestination());
            System.out.println("Fare:"+r.getFare());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}