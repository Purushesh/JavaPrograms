package Testing;
import java.util.*;


public class ArrayListExample {

	public static void main(String[] args) {
				ArrayList<String> list=new ArrayList<String>();
				list.add("Sanjay");
				list.add("Puru");
				list.add("Sanjay");
				list.add("Ajeet");
				
				Iterator<String> itr=list.iterator();
				
				while (itr.hasNext())
				{
					System.out.println(itr.next());
				}

	}

}
