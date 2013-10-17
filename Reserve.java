package abc;


/**
 *
 * @author mayur hamirani
 */
import java.io.*;

public class Reserve {

    /**
     * @param args the command line arguments
     */
    static RailwayReservation r = new RailwayReservation(); ;
    int tno1;
    public static void main(String[] args)throws Exception {

        int ans=1;

      
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        do{
           System.out.println("********************Welcome to Railway Reservation Console*******************");
           System.out.println("\n\n 1. Add train 2. View Trains 3. Book Ticket  \n\n4. View Ticket  5. Edit Ticket 6. Exit");
           ans = Integer.parseInt(br.readLine());
           switch(ans)
           {
               case 1:
                   
                   r.addTrain();

                   break;
               case 2:
                   r.viewTrain();
                      break;
               case 3:
                   r.bookTicket();
                   break;
               case 4:
                   r.viewTicket();
                    break;
               case 5:
                   r.editTicket();
                   break;
               case 6:
                   System.exit(1);
                   break;
               default:
                   System.out.println("Enter correct choice");

           }
        }while(ans!=0);
    }

}
