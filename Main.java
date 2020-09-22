import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Customer> list = new ArrayList<Customer>();

        System.out.println("Enter Your Choice");
        System.out.println("1.Mini");
        System.out.println("2.Micro");
        System.out.println("3.Sedan");
        System.out.println("4.PrimeSedan");

        Integer choice = Integer.parseInt(br.readLine());

        System.out.println("Enter the details in CSV format:");
        String details = br.readLine();
        String[] d = details.split(",");

        list.add(new Customer(d[0],d[1],d[2],d[3],d[4]));

        if (choice == 1){
            for (Customer itr:list ){
                System.out.println(itr);
            }
            Taxi t = new Mini();
            System.out.println("Fare:"+t.fare());
        }
        else if (choice == 2){
            for (Customer itr:list ){
                System.out.println(itr);
            }
            Taxi t = new Micro();
            System.out.println("Fare:"+t.fare());
        }
        else if (choice == 3){
            for (Customer itr:list ){
                System.out.println(itr);
            }
            Taxi t = new Sedan();
            System.out.println("Fare:"+t.fare());
        }
        else if (choice == 4){
            for (Customer itr:list ){
                System.out.println(itr);
            }
            Taxi t = new PrimeSedan();
            System.out.println("Fare:"+t.fare());
        }
    }
}
