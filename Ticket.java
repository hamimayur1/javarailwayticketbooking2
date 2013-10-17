

package abc;

/**
 *
 * @author mayur hamirani
 */
public class Ticket {
    static int tickno=1;
    int price;
     Train tb;
     int nooftic;
    public  Ticket(Train t,int nooftic){
                 tickno++;
                 this.price = 200*nooftic;
                 this.tb = t;
                 this.nooftic=nooftic;
                 System.out.println("Train no:"+ t.tno+"\nTrain name"+ t.tname+"\n Source"+ t.src);
                 System.out.println("Destination: "+t.dest+"No of passengers:"+nooftic+"Total price:"+price(this.nooftic));
            }

    public final int price(int nooftic){
    return (200*nooftic);
    }
 }
