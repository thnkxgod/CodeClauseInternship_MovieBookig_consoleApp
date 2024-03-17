import java.util.Scanner;
public class TicketBooking {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        boolean exit=true;
        String[] movies = {"Iron-man","Thor","Hulk","Black-Widow","Avenger End Game","Captain America"};
        int[] Seats = {100,100,100,100,100,100};

        while (exit) {
            System.out.println();
            System.out.println("<--- MOVIE-VERSE BOOKING SYSTEM ---> ");
            int n =0;
            for (String i : movies) {
                System.out.println(++n+" - "+i);
            }
            System.out.println("-> Press '0' for EXIT \n-> Select your Favourite Movie");

            int choice =sc.nextInt();
            if (choice>0 && choice<movies.length+1) {
                System.out.println("You Selected :- "+movies[choice-1] + "\n Total Available Seat are - (100/"+Seats[choice]);
                System.out.println("Enter the number of seats");
                int bookedSeats =sc.nextInt();
                if(bookedSeats>Seats[choice]){System.out.println("Now we have only "+Seats[choice]+" seats Available.\nYou can not book "+bookedSeats+" seats..!");}
                else if (bookedSeats==0) {
                    System.out.println("You haven't selected any seats...!");

                }
                else{Seats[choice]=Seats[choice]-bookedSeats;
                    System.out.println("Booking Successful...!\n press any number to Continue...!");}
                    int next=sc.nextInt();
            }
            else if (choice==0) {
                System.out.println("Thank you For using -- MOVIE-VERSE BOOKING SYSTEM -- \nHave a Greate day!5 ");
                exit=false;
            }
            else{
                System.out.println("You selected Invaid choice...!");
            }


        }
    }
}