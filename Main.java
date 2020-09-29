import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList < Customer > list = new ArrayList < Customer > ();

        System.out.println("Enter Your Choice");
        System.out.println("1.Mini");
        System.out.println("2.Micro");
        System.out.println("3.Sedan");
        System.out.println("4.PrimeSedan");

        Integer choice = Integer.parseInt(br.readLine());

        if (choice <= 4) {

            if (choice == 1) {
                System.out.println("Enter no of Passengers");
                Integer n = Integer.parseInt(br.readLine());
                if (n <= 3) {
                    for (int i = 1; i <= n; i++) {
                        System.out.println("Enter Your Name:");
                        String name = br.readLine();
                        System.out.println("Enter Your Email:");
                        String email = br.readLine();
                        System.out.println("Enter Your Mobile Number:");
                        String mobile = br.readLine();
                        Validate v = new Validate(mobile,email);
                        v.validateMobile(mobile);
                        System.out.println("Enter Your Pickup Point:");
                        String pickup = br.readLine();
                        System.out.println("Enter Your Drop Point:");
                        String drop = br.readLine();

                        list.add(new Customer(name,email,mobile,pickup,drop));
                    }
                    for (Customer itr: list) {
                        System.out.println(itr);
                    }
                    Taxi t = new Mini();
                    System.out.println("Fare:" + t.fare());
                } else {
                    System.out.println("Three Passengers Only");
                }

            } else if (choice == 2) {
                System.out.println("Enter no of Passengers");
                Integer n = Integer.parseInt(br.readLine());
                if (n <= 3) {
                    for (int i = 1; i <= n; i++) {
                      System.out.println("Enter Your Name:");
                      String name = br.readLine();
                      System.out.println("Enter Your Email:");
                      String email = br.readLine();
                      System.out.println("Enter Your Mobile Number:");
                      String mobile = br.readLine();
                      System.out.println("Enter Your Pickup Point:");
                      String pickup = br.readLine();
                      System.out.println("Enter Your Drop Point:");
                      String drop = br.readLine();

                      list.add(new Customer(name,email,mobile,pickup,drop));
                    }
                    for (Customer itr: list) {
                        System.out.println(itr);
                    }
                    Taxi t = new Micro();
                    System.out.println("Fare:" + t.fare());
                } else {
                    System.out.println("Three Passengers Only");
                }
            } else if (choice == 3) {
                System.out.println("Enter no of Passengers");
                Integer n = Integer.parseInt(br.readLine());
                if (n <= 3) {
                    for (int i = 1; i <= n; i++) {
                      System.out.println("Enter Your Name:");
                      String name = br.readLine();
                      System.out.println("Enter Your Email:");
                      String email = br.readLine();
                      System.out.println("Enter Your Mobile Number:");
                      String mobile = br.readLine();
                      System.out.println("Enter Your Pickup Point:");
                      String pickup = br.readLine();
                      System.out.println("Enter Your Drop Point:");
                      String drop = br.readLine();

                      list.add(new Customer(name,email,mobile,pickup,drop));
                    }
                    for (Customer itr: list) {
                        System.out.println(itr);
                    }
                    Taxi t = new Sedan();
                    System.out.println("Fare:" + t.fare());
                } else {
                    System.out.println("Three Passengers Only");
                }

            } else if (choice == 4) {
                System.out.println("Enter no of Passengers");
                Integer n = Integer.parseInt(br.readLine());
                if (n <= 3) {
                    for (int i = 1; i <= n; i++) {
                      System.out.println("Enter Your Name:");
                      String name = br.readLine();
                      System.out.println("Enter Your Email:");
                      String email = br.readLine();
                      System.out.println("Enter Your Mobile Number:");
                      String mobile = br.readLine();
                      System.out.println("Enter Your Pickup Point:");
                      String pickup = br.readLine();
                      System.out.println("Enter Your Drop Point:");
                      String drop = br.readLine();

                      list.add(new Customer(name,email,mobile,pickup,drop));
                    }
                    for (Customer itr: list) {
                        System.out.println(itr);
                    }
                    Taxi t = new PrimeSedan();
                    System.out.println("Fare:" + t.fare());
                } else {
                    System.out.println("Three Passengers Only");
                }

            }

        } else {
            System.out.println("Invalid Option");
        }

    }
}
