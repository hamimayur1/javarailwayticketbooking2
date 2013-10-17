

package abc;

/**
 *
 * @author mayur hamirani
 */
public class Train {

     String tname,src,dest;
     int tno,tbookcount;
     static int count=0;
     public Train(int tno,String name,String src, String dest){
     this.tno=tno;
     this.tname=name;
     this.src= src;
     this.dest=dest;
     count++;
     }

}
