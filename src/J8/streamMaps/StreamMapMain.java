package J8.streamMaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
 
public class StreamMapMain {
 
	public static void main(String args[])
	{
		List<Student> listOfStudents = createListOfStudents();
		
		// Using map function to convert Stream<Student> to Stream<String>
		List<String> listOfStudentNames=listOfStudents.stream()
										.map(s -> s.getName()) 
										.collect(Collectors.toList());
		listOfStudentNames.forEach(System.out::println);
		System.out.println("*****age superior to 20*****");  
		// age superior to 20
		List<Student> listOfAgeSup20 =listOfStudents.stream().filter(s->s.getAge()>20).collect(Collectors.toList());
		listOfAgeSup20.forEach(data->{
			System.out.println(data);
		});
		System.out.println("*****count students who have age > 20*****");  
		// count students who have age > 20
		System.out.println(listOfStudents.stream().filter(s->s.getAge()>20).count());
		System.out.println("*****Find StudentByName*****");  
		// Find StudentByName
		Optional<Student> e1 = listOfStudents.stream()
                .filter(e->e.getName().equalsIgnoreCase("Amine")).findAny();

	      if(e1.isPresent())
	          System.out.println(e1.get().toString());
	       System.out.println("*****Tri students by age*****");
	     // Tri students by age
		     
	      listOfStudents.sort((e,e2)->e.getAge()-e2.getAge());
	      listOfStudents.forEach(System.out::println);
	      System.out.println("*****Join all Students names*****"); 
	     // Join all Students names
	      List<String> stdNames = listOfStudents.stream().map(s->s.getName()).collect(Collectors.toList());
	      String allNamesJoin = String.join(",", stdNames);
	      System.out.println(allNamesJoin);
	}
	
///////////////////////////////////////////
	
	public static List<Student> createListOfStudents()
	{
		List<Student> listOfStudents=new ArrayList<>();
		Student s1= new Student("Anchit",20);
		Student s2= new Student("Peter",19);
		Student s3= new Student("Martin",22);
		Student s4= new Student("Amine",21);
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		listOfStudents.add(s4);
		return listOfStudents;
	}
}
 