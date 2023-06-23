package addall;
import java.util.*;
public class set {
public static void main(String[] args)
	{
       List<Integer> l = new LinkedList<>();
		l.add(105);
		l.add(205);
		l.add(305);
        l.add(405); 
        l.add(505);
		l.add(605);
		l.add(705);
        l.add(805); 
        l.add(505);
		l.add(605);
		System.out.println(l);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(105);
		arr.add(205);
		arr.add(305);
        arr.add(405);
		arr.add(505);
		arr.add(605);
        arr.add(705);
        arr.add(805);
        arr.add(505); 
        arr.add(605);
		System.out.println(arr);
                    l.addAll(arr);
              System.out.println(l);
	}
}


