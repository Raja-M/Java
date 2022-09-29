import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirstClass {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		List<Integer> arrLst = new ArrayList<>();
		arrLst.add(1);
		arrLst.add(2);
		arrLst.add(5);
		arrLst.add(1);
		
		List<Integer> lnkLst = new LinkedList<>();
		lnkLst.add(10);
		
		arrLst.sort( (x,y)->  Integer.compare(x, y));
		int prev = -1;
		int curr = -1;
		int change = 0;
		for(Integer i : arrLst) {
			System.out.println(i);
			if ( i == prev) {
				change++;
			}
			prev = i;
		}
		System.out.println("Need to change : " + change);

	}

}
