package java8assignment;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Que_10_convert_arraylist {

		String name;
		int id;
		public Que_10_convert_arraylist(String name, int id) {
	
		this.name = name;
		this.id = id;

	}
		public String getName() {
		return name;
	 }
		public void setName(String name) {
		this.name = name;
	}
		public int getId() {
		return id;
	}
		public void setId(int id) {
		this.id = id;
	}
	public static void main(String[] args) {
		ArrayList<Que_10_convert_arraylist> I=new ArrayList<Que_10_convert_arraylist>();
		I.add(new Que_10_convert_arraylist("neha",1));
		I.add(new Que_10_convert_arraylist("nilesh",2));
		I.add(new Que_10_convert_arraylist("sonam",3));

		Map<Integer,String> empMap=I.stream().collect(Collectors.toMap(e->e.getId(),e->e.getName()));
		System.out.println(empMap);

		Set<String> nameSet = I.stream().map(e->e.name).collect(Collectors.toSet());

		System.out.println(nameSet);
	}

}
