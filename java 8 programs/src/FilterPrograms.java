import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FilterPrograms {
	public static void main(String[] args) {
	/*List <Map<String,String>> arraylist = new ArrayList();
	Map<String,String> mapValue = new HashMap();
	mapValue.put("sudha" , "value1");
	mapValue.put("xyz", "value2");
	arraylist.add(mapValue);
	//System.out.println(mapValue);
	mapValue = new HashMap();
	mapValue.put("sudha" , "value1");
	mapValue.put("panjab" , "value2");
	arraylist.add(mapValue);
	mapValue = new HashMap();
	mapValue.put("sudha" , "value1");
	mapValue.put("pqrs" , "value2");
	arraylist.add(mapValue);
	
	arraylist.stream().filter(x->x.containsValue("Value1")).forEach(x->System.out.println(x));*/
		
		
		/*List<Integer> list = Arrays.asList(5,7,12,25);
		boolean isAnyMatch  = list.stream().anyMatch(x->x>24);
		//boolean isNonMatch  = list.stream().NonMatch(x->x>20);
		System.out.println("is anymatch:" + isAnyMatch);
		
		boolean isNonMatch = list.stream().allMatch(x->x>100);
		System.out.println("non match:" +isNonMatch);*/
				
		
		List<String>  list  = Arrays.asList("A","B","C","D");
		//Optional<Integer> firstString =  list.stream().findFirst();
		Optional<Integer> firstString = Optional.empty();
		
}
}

	