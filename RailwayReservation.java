



/**
 *
 * @author mayur hamirani
 */
package abc;
import java.io.*;


public class RailwayReservation implements IReservation{
BufferedReader br;
Train t[];
Ticket tic[];
int i=0;
int count;
  public RailwayReservation(){

      t= new Train[50];
      tic=new Ticket[200];
   }

public  void addTrain()throws Exception{

        try{
                   br= new BufferedReader(new InputStreamReader(System.in));
                   System.out.println("Enter Train no:");
                   int tno= Integer.parseInt(br.readLine());
                   System.out.println("Enter Train Name:");
                   String name= br.readLine();
                   System.out.println(" Train Source:");
                   String src= br.readLine();
                   System.out.println(" Train dest:");
                   String dest= br.readLine();
                   
        t[i] = new Train(tno,name,src,dest);
        i++;
        System.out.println("Train Successfully added");
        } catch(Exception e){System.out.println(e);}

        }
public void viewTrain() throws Exception{

    String ans="s";
    br= new BufferedReader(new InputStreamReader(System.in));
     System.out.println("View trains by source(s)/destination(d)?");
     ans=br.readLine();
     if(ans.equals("s"))
     {
            System.out.println("Enter Train Source:");
            String src= br.readLine();
            count=0;
            System.out.println(" Train no     Train Name      Remaining tickets ");
            while(count!=i )
            {
                    if(src.equals(t[count].src))
                    {
                     System.out.println(  t[count].tno+"\t "+t[count].tname+"\t "+(200-t[count].tbookcount));
                    }
            count++;
            }
     }   //if
      else{
            System.out.println("Enter Train dest:");
            String dest= br.readLine();
            count=0;
            System.out.println(" Train no      Train Name      Remaining tickets ");
            while(count!=i )
            {
                    if( dest.equals(t[count].dest))
                    {
                     System.out.println(  t[count].tno+"\t "+t[count].tname+"\t "+(200-t[count].tbookcount));
                    }
            count++;
            }
         
         } // else
    
}
public void bookTicket()throws Exception
{
            int no=0;
            count=0;
            int counttrains=0;
            int indext[] = new int[20];

            System.out.println(" Enter Train Source:");
            String src= br.readLine();
            System.out.println("Enter Train dest:");
            String dest= br.readLine();
            System.out.println(" Enter no of passengers :");
            int nooftic =Integer.parseInt( br.readLine());

            System.out.println("Train no       Train name      no of tickets available");
            while(count!=i )
            {
            if(src.equals(t[count].src)&& dest.equals(t[count].dest))
            {
                if((t[count].tbookcount+nooftic)<200)
                {
                    System.out.println(t[count].tno+"\t"+ t[count].tname + "\t"+(200-t[count].tbookcount));
                    indext[counttrains]=count;
                    counttrains++;
                }
            }
            count++;
            }  // to check wheter there are trains or not

             if(counttrains==0){
                System.out.println("Sorry there are no trains for these route");
                return;
                }
             else{
                   System.out.println("Enter tno to book ticket:");
                   br= new BufferedReader(new InputStreamReader(System.in));
                   no= Integer.parseInt(br.readLine());
                   for(int ino=0;ino<counttrains;ino++)
                   {
                       if (t[indext[ino]].tno == no){
                       t[indext[ino]].tbookcount+=nooftic; // update train obj
                       tic[Ticket.tickno] = new Ticket(t[indext[ino]],nooftic);
                       }
                 }

            }
}
public void viewTicket(){

System.out.println("Ticket no    Train no   Train name        Source      Destination      Noofpassenger       price");
for(int i=0;i<Ticket.tickno;i++)
{
 System.out.println(i+"     "+ tic[i].tb.tno+"     "+tic[i].tb.tname+"     "+tic[i].tb.src+"     "+tic[i].tb.dest+"    "+tic[i].nooftic+"   "+tic[i].price(tic[i].nooftic));
}
}

public void editTicket()throws Exception{
            System.out.println(" Enter tic no :");
            int ticno =Integer.parseInt( br.readLine());
            System.out.println(" Enter no of passengers :");
            int nooftic =Integer.parseInt( br.readLine());


            tic[ticno].nooftic=nooftic;
            System.out.println("Ticket no    Train no   Train name        Source      Destination      Noofpassenger       price");
            System.out.println(ticno+"     "+ tic[ticno].tb.tno+"     "+tic[ticno].tb.tname+"     "+tic[ticno].tb.src+"     "+tic[ticno].tb.dest+"    "+tic[ticno].nooftic+"   "+tic[ticno].price(tic[ticno].nooftic));}
}
