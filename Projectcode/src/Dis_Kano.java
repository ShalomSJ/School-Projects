
import java.util.Scanner;

class Movie {
    private String title;
    private String day;
    private String time;
    private String location;
    private int availableSeats;
    private double pricePerTicket;

    public Movie(String title, String day, String time, String location, int availableSeats, double pricePerTicket) {
        this.title = title;
        this.day = day;
        this.time = time;
        this.location = location;
        this.availableSeats = availableSeats;
        this.pricePerTicket = pricePerTicket;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }
    // Setter method for title
    public void setTitle (String title){
        this.title = title;
    }

    //Getter method for day
    public String getDay() {
        return day;
    }
    //setter method for time
    public void setDay (String day){
        this.day = day;
    }

    //Getter method for time
    public String getTime() {
        return time;
    }
    //setter method for time
    public void setTime(String time){
        this.time = time;
    }

    //Getter method for location
    public String getLocation() {
        return location;
    }
    //Setter method for location
    public void setLocation (String location){
        this.location = location;
    }

    //Getter method for availableSeats
    public int getAvailableSeats() {
        return availableSeats;
    }
    //Setter method for availableSeats
    public void setAvailableSeats (int availableSeats){
        this.availableSeats = availableSeats;
    }

    //getter mrthod for pricePerTicket
    public double getPricePerTicket() {
        return pricePerTicket;
    }
    //Setter method for pricePerTicket
    public void setPricePerTicket(double pricePerTicket){
        this.pricePerTicket = pricePerTicket;
    }

    public void bookTickets(int numTickets) {
        if (numTickets <= availableSeats) {
            availableSeats -= numTickets;
            double totalPrice = numTickets * pricePerTicket;
            System.out.println("Total Price: $" + totalPrice);
            System.out.println("Tickets are successfully booked!");
        }
        else {
            System.out.println("Sorry, not enough seats available.");
        }
    }
}

public class Dis_Kano{
    public static void main(String[] args) {
        // Create movie objects
        Movie movie1 = new Movie("Avengers: Endgame", "Monday", "15:00", "Main Theater", 100, 10.0);
        Movie movie2 = new Movie("The Lion King", "Tuesday", "17:30", "VIP Theater", 80, 12.0);
        Movie movie3 = new Movie("Dune: Part Two", "Wednesday", "12:00", "VIP Theater", 50, 12.0);
        Movie movie4 = new Movie("Ghostbusters: Frozen Empire","Thursday", "18:00", "Main Theater", 150, 10.0);
        Movie movie5 = new Movie("Godzilla x Kong: The New Empire", "Wednesday", "20:00", "VIP Theater", 50, 12.0);
        Movie movie6 = new Movie("Madame Web", "Friday", "16:00", "Main Theater", 100, 10.0);
        Movie movie7 = new Movie("furiosa", "Monday", "19:00", "Main Theater", 80, 10.0);
        Movie movie8 = new Movie("Kingdom of the Planet of the Apes", "Saturday", "10:00", "Main Theater", 40, 10.0);
        Movie movie9 = new Movie("The beautiful game","Saturday", "12:00", "VIP Theater", 60, 12.0 );

        // Display movie options
        System.out.println("Available Movies:");
        System.out.println("1. " + movie1.getTitle() + " - " + movie1.getDay() + " " + movie1.getTime() + " at " + movie1.getLocation() + " (" + movie1.getAvailableSeats() + " seats available)");
        System.out.println("2. " + movie2.getTitle() + " - " + movie2.getDay() + " " + movie2.getTime() + " at " + movie2.getLocation() + " (" + movie2.getAvailableSeats() + " seats available)");
        System.out.println("3. " + movie3.getTitle() + " - " + movie3.getDay() + " " + movie3.getTime() + " at " + movie3.getLocation() + "(" + movie3.getAvailableSeats() + "seat available)");
        System.out.println("4. " + movie4.getTitle() + " - " + movie4.getDay() + " " + movie4.getTime() + " at " + movie4.getLocation() + "(" + movie4.getAvailableSeats() + "seat available)");
        System.out.println("5. " + movie5.getTitle() + " - " + movie5.getDay() + " " + movie5.getTime() + " at " + movie5.getLocation() + "(" + movie5.getAvailableSeats() + "seat availble)");
        System.out.println("6. " + movie6.getTitle() + " - " + movie6.getDay() + " " + movie6.getTime() + " at " + movie6.getLocation() + "(" + movie6.getAvailableSeats() + " seat available)");
        System.out.println("7. " + movie7.getTitle() + " - " + movie7.getDay() + " " + movie7.getTime() + " at " + movie7.getLocation() + "(" + movie7.getAvailableSeats() + "seat available)");
        System.out.println("8. " + movie8.getTitle() + " - " + movie8.getDay() + " " + movie8.getTime() + " at " + movie8.getLocation() + "(" + movie8.getAvailableSeats() + "seat available)");
        System.out.println("9. " + movie9.getTitle() + " - " + movie9.getDay() + " " + movie9.getTime() + " at " + movie9.getLocation() + "(" + movie9.getAvailableSeats() + "seat available)");

        // User input for movie selection
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the movie you want to book tickets for: ");
        int movieChoice = scanner.nextInt();

        // User input for number of tickets
        System.out.print("Enter the number of tickets you want to book: ");
        int numTickets = scanner.nextInt();

        // Book tickets based on user choice
        switch (movieChoice) {
            case 1:
                movie1.bookTickets(numTickets);
                break;
            case 2:
                movie2.bookTickets(numTickets);
                break;
            case 3:
                movie3.bookTickets(numTickets);
                break;
            case 4:
                movie4.bookTickets(numTickets);
                break;
            case 5:
                movie5.bookTickets(numTickets);
                break;
            case 6:
                movie6.bookTickets(numTickets);
                break;
            case 7:
                movie7.bookTickets(numTickets);
                break;
            case 8:
                movie8.bookTickets(numTickets);
                break;
            case 9:
                movie9.bookTickets(numTickets);
                break;
            default:
                System.out.println("Invalid movie choice.");
        }

        scanner.close();
    }
}
