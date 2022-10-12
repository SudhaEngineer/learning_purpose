import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Biconsumer {
	public static void main(String[] args) {
		/*BiConsumer<Integer,Integer>  con1 = (a,b)-> System.out.println("Add:"+(a+b));
		con1.accept(10,20);
	BiConsumer<List<Integer>,List<Interger>> con2 = (l1,l2)->
	{
		if(l1.size()==l2.size())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	
	}
	}
	}
}*/
		/*@Test
		public void suceess(){
		   List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom");
		   List<String> result = names.stream()
		     .filter(name -> name.startsWith("A")).collect(Collectors.toList());
		     //.collect(Collectors.toList());
		   
			  assertEquals(2, result.size());
		   assertThat(result, contains("Adam","Alexander"));
		}
	}
}*/

//@Test
//public void whenFilterListWithCombinedPredicatesUsingAnd_thenSuccess(){
    Predicate<String> predicate1 =  str -> str.startsWith("A");
    Predicate<String> predicate2 =  str -> str.length() < 5;
  for(String name : names)
  {
    List<String> result = names.stream()
      .filter(predicate1.and(predicate2))
      .collect(Collectors.toList());
        
    assertEquals(1, result.size());
   // assertThat(result, contains("Adam"));
  
	
	
	
	

	private static void assertEquals(int i, int size) {
		// TODO Auto-generated method stub
		
	}
	}
	

	
	




	
	

	
	
