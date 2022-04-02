import java.io.ObjectStreamException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class main_class {
    public static void main(String[] args) {
        Map obj =new HashMap ();
        obj.put("name","saba");
        obj.put("studentId",1234);
        obj.put("avg",18.76);
        Set set =obj.keySet();
        for(Object o:set){
            System.out.print(o+":");;
            System.out.println(obj.get(o));
        }
        


    }
}
