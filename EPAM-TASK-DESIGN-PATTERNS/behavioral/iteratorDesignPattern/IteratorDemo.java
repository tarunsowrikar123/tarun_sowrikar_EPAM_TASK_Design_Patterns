import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRepository nameRepository = new NameRepository();
		for(Iterator iterator = nameRepository.getInterator();iterator.hasNext();) {
			String name = (String)iterator.next();
			System.out.println("Name :  "+name);
		}
	}

}
