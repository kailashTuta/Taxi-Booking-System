import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        do {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\t\t\tTaxi Booking System");
            System.out.println("\n");
            System.out.println("1.Book Ride");
            System.out.println("2.View Ride");
            System.out.println("3.Cancel Ride");
            System.out.println("4.Exit");
            System.out.println("\n");
            System.out.println("Enter Your Option");
            String option = br.readLine();
            BookRide b = new BookRide();
            ViewRide v = new ViewRide();

            if (option.equals("1")) {
                b.bookTaxi();
            } else if (option.equals("2")) {
                File newFile = new File("details.txt");

                if (newFile.length() == 0) {
                    System.out.println("You Didn't have any rides to show");
                } else {
                    System.out.println("Your Ride details\n");
                    v.rideView();
                }
            } else if (option.equals("3")) {
                FileWriter fwOb = new FileWriter("details.txt", false);
                PrintWriter pwOb = new PrintWriter(fwOb, false);
                pwOb.flush();
                pwOb.close();
                fwOb.close();

                System.out.println("Ride Cancelled Successfully");

            } else if (option.equals("4")) {
                System.exit(0);
            } else {
                System.out.println("Invalid Option");
            }
        } while (true);

    }
}
