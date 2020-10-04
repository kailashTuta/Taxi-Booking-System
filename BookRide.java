import java.io.*;
import java.util.*;
import java.text.*;

class BookRide {

    public BookRide() {}

    public void bookTaxi() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ArrayList < Rider > list = new ArrayList < Rider > ();

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
                            Validate v = new Validate(mobile, email);
                            v.validateMobile(mobile);
                            System.out.println("Enter Your Pickup Point:");
                            System.out.println("Air Port\nBus Station\nRailway Station\nMovie Theatre\nRestraunt");
                            String pickup = br.readLine();
                            System.out.println("Select Your Drop Point");
                            System.out.println("Air Port\nBus Station\nRailway Station\nMovie Theatre\nRestraunt");
                            String drop = br.readLine();

                            Date date = new Date();
                            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                            String strDate = formatter.format(date);

                            Taxi t = new Mini();
                            String fare = Integer.toString(t.fare());
                            list.add(new Rider(strDate, name, email, mobile, pickup, drop, fare));
                        }
                        for (Rider itr: list) {
                            System.out.println(itr);
                        }

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
                            Validate v = new Validate(mobile, email);
                            v.validateMobile(mobile);
                            System.out.println("Enter Your Pickup Point:");
                            System.out.println("Air Port\nBus Station\nRailway Station\nMovie Theatre\nRestraunt");
                            String pickup = br.readLine();
                            System.out.println("Select Your Drop Point");
                            System.out.println("Air Port\nBus Station\nRailway Station\nMovie Theatre\nRestraunt");
                            String drop = br.readLine();

                            Date date = new Date();
                            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                            String strDate = formatter.format(date);

                            Taxi t = new Micro();
                            String fare = Integer.toString(t.fare());
                            list.add(new Rider(strDate, name, email, mobile, pickup, drop, fare));
                        }
                        for (Rider itr: list) {
                            System.out.println(itr);
                        }
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
                            Validate v = new Validate(mobile, email);
                            v.validateMobile(mobile);
                            System.out.println("Enter Your Pickup Point:");
                            System.out.println("Air Port\nBus Station\nRailway Station\nMovie Theatre\nRestraunt");
                            String pickup = br.readLine();
                            System.out.println("Select Your Drop Point");
                            System.out.println("Air Port\nBus Station\nRailway Station\nMovie Theatre\nRestraunt");
                            String drop = br.readLine();



                            Date date = new Date();
                            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                            String strDate = formatter.format(date);

                            Taxi t = new Sedan();
                            String fare = Integer.toString(t.fare());
                            list.add(new Rider(strDate, name, email, mobile, pickup, drop, fare));
                        }
                        for (Rider itr: list) {
                            System.out.println(itr);
                        }

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
                            Validate v = new Validate(mobile, email);
                            v.validateMobile(mobile);
                            System.out.println("Enter Your Pickup Point:");
                            System.out.println("Air Port\nBus Station\nRailway Station\nMovie Theatre\nRestraunt");
                            String pickup = br.readLine();
                            System.out.println("Select Your Drop Point");
                            System.out.println("Air Port\nBus Station\nRailway Station\nMovie Theatre\nRestraunt");
                            String drop = br.readLine();

                            Date date = new Date();
                            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                            String strDate = formatter.format(date);

                            Taxi t = new PrimeSedan();
                            String fare = Integer.toString(t.fare());
                            list.add(new Rider(strDate, name, email, mobile, pickup, drop, fare));
                        }
                        for (Rider itr: list) {
                            System.out.println(itr);
                        }
                    } else {
                        System.out.println("Three Passengers Only");
                    }

                }

            } else {
                System.out.println("Invalid Option");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}