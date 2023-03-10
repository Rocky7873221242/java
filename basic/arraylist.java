import java.util.ArrayList;
import java.util.Iterator;
public class arraylist {
    int  i;
    String s;
    arraylist(int j,String g){
        i=j;
        s=g;
    }
    public static void main(String [] arrgs){
        ArrayList<arraylist> arr=new ArrayList<arraylist>();
        arraylist n=new arraylist(7,"pramod");
        arraylist n1=new arraylist(6,"rocky") ;
        arr.add(n);
        arr.add(n1);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i).i+"   "+arr.get(i).s);
        }
        for(arraylist f:arr){
            System.out.println(f.i+" "+f.s);
        }

    }
}
