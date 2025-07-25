import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginGUI extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton signUpButton;



    public LoginGUI() {
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        panel.add(usernameLabel);

        usernameField = new JTextField();
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(this);
        panel.add(signUpButton);


        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUpButton) {
            SignUpGUI signUpGUI = new SignUpGUI();
            signUpGUI.setVisible(true);
        } else {
            handleLogin();
        }
    }

    private void handleLogin() {
        // Get the username and password from the text fields
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());


        // Check if the input matches the credentials
        if (!username.isEmpty() && !password.isEmpty()) {
            // For demonstration, assume successful login, replace with your logic
            Movie.BookingGUI bookingGUI = new Movie.BookingGUI();
            bookingGUI.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.setVisible(true);
        });
    }
}

class SignUpGUI extends JFrame{
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signUpButton;

    public SignUpGUI(){
        setTitle("Sign Up");
        setSize(300,200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));

        JLabel usernameLabel = new JLabel("Username");
        panel.add(usernameLabel);

        usernameField = new JTextField();
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleSignUp();
            }

        });
        panel.add(signUpButton);

        // Cancel button
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the sign-up window
            }
        });
        panel.add(cancelButton);

        add(panel);
    }
    private void handleSignUp() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());


        if (!username.isEmpty() && !password.isEmpty()) {
            JOptionPane.showMessageDialog(SignUpGUI.this, "Sign Up Successful!");
            dispose();
            new LoginGUI().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(SignUpGUI.this, "Try again", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

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
    public void setTitle(String title) {
        this.title = title;
    }

    //Getter method for day
    public String getDay() {
        return day;
    }

    //setter method for time
    public void setDay(String day) {
        this.day = day;
    }

    //Getter method for time
    public String getTime() {
        return time;
    }

    //setter method for time
    public void setTime(String time) {
        this.time = time;
    }

    //Getter method for location
    public String getLocation() {
        return location;
    }

    //Setter method for location
    public void setLocation(String location) {
        this.location = location;
    }

    //Getter method for availableSeats
    public int getAvailableSeats() {
        return availableSeats;
    }

    //Setter method for availableSeats
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    //getter method for pricePerTicket
    public double getPricePerTicket() {
        return pricePerTicket;
    }

    //Setter method for pricePerTicket
    public void setPricePerTicket(double pricePerTicket) {
        this.pricePerTicket = pricePerTicket;
    }

    public void bookTickets(int numTickets) {
        if (numTickets <= availableSeats) {
            availableSeats -= numTickets;
            double totalPrice = numTickets * pricePerTicket;
            System.out.println("Total Price: $" + totalPrice);
            System.out.println("Tickets are successfully booked!");
        } else {
            System.out.println("Sorry, not enough seats available.");
        }
    }



    static class BookingGUI extends LoginGUI {
        private JComboBox<String> movieComboBox;
        private JComboBox<String> dayComboBox;
        private JComboBox<String> timeComboBox;
        private JComboBox<String> locationComboBox;
        private JTextField seatField;
        private JButton bookButton;
        private JButton cancelButton;

        public BookingGUI() {
            setTitle("Booking");
            setSize(300, 200);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(6, 2));

            JLabel locationLabel = new JLabel("Location:");
            panel.add(locationLabel);

            String[] location = {"Cinema 1", "Cinema 2", "Cinema 3"};
            locationComboBox = new JComboBox<>(location);
            panel.add(locationComboBox);

            JLabel seatsLabel = new JLabel("Number of Seats:");
            panel.add(seatsLabel);

            seatField = new JTextField();
            panel.add(seatField);

            JLabel movieLabel = new JLabel("Movie:");
            panel.add(movieLabel);

            //movie names
            String[] movies = {"Movie 1", "Movie 2", "Movie 3"};
            movieComboBox = new JComboBox<>(movies);
            panel.add(movieComboBox);

            JLabel dayLabel = new JLabel("Day:");
            panel.add(dayLabel);

            String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            dayComboBox = new JComboBox<>(days);
            panel.add(dayComboBox);

            JLabel timeLabel = new JLabel("Time:");
            panel.add(timeLabel);

            String[] time = {"10.00 am", "11.00 am", "2.00 pm", "4.00 pm", "10.00 pm"};
            timeComboBox = new JComboBox<>(time);
            panel.add(timeComboBox);


            bookButton = new JButton("Book");
            bookButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    bookAction();
                }
            });
            panel.add(bookButton);

            cancelButton = new JButton("Cancel");
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });
            panel.add(cancelButton);


            add(panel);
        }

        private void bookAction() {

            //booking logic
            String location = (String) locationComboBox.getSelectedItem();
            int seat = Integer.parseInt(seatField.getText());
            String movie = (String) movieComboBox.getSelectedItem();
            String day = (String) dayComboBox.getSelectedItem();
            String time = (String) timeComboBox.getSelectedItem();
            double price;

            try {
                seat = Integer.parseInt(seatField.getText()); // Parse seats from the field
                if (seat <= 0) {
                    JOptionPane.showMessageDialog(BookingGUI.this, "Number of seats must be greater than 0.", "Invalid Seats", JOptionPane.ERROR_MESSAGE);
                    return; // Stop processing booking if number of seats is invalid
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(BookingGUI.this, "Please enter a valid number of seats.", "Invalid Seats", JOptionPane.ERROR_MESSAGE);
                return; // Stop processing booking if number of seats is not a valid number
            }


            // Switch statement to determine price based on number of seats
            switch (seat) {
                case 1:
                    price = 10.0; // Adjust the price based on your requirements
                    break;
                case 2:
                    price = 20.0;
                    break;
                case 3:
                    price = 30.0;
                    break;
                default:
                    price = 10.0 * seat; // price for each additional seat
                    break;
            }

            //booking details
            JOptionPane.showMessageDialog(BookingGUI.this, "Booking detail:\nLocation: " + location +
                    "\nNumber of Seats: " + seat +
                    "\nMovie: " + movie +
                    "\nDay: " + day +
                    "\nTime: " + time +
                    "\nPrice: " + price);

            JOptionPane.showMessageDialog(BookingGUI.this, "Booking Successful", "Booking confirmation", JOptionPane.INFORMATION_MESSAGE);
            dispose();

            //cancel button added after booking details displayed
            bookButton.setEnabled(false); // disable booking button
            cancelButton = new JButton("Cancel");
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });
            JPanel panel = (JPanel) getContentPane().getComponent(0); // Get the panel
            panel.add(cancelButton); // Add cancel button

        }
    }
}