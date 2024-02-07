import java.util.Iterator;

public class ArrayList{
    public static void main(String[] args) {
        ArrayList num=new ArrayList();
        //HashSet num=new HashSet();
        num.add(30);
        num.add(60);
       // for(int i=0;i<=5;i++){
          //  System.out.println("values"+((Object) num).get(i));
       // }
        Iterator y=num.iterator();
        while(y.hasNext()){
            Integer intvalue=(Integer)y.next();
        }
    }
}