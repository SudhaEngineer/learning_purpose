import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicateelements {
	public static void main(String[] args) {
	List<String> nam = Arrays.asList("sudha","chinnu","bujji");
	/*List<String>  uniquelist = new ArrayList<>();
	
	{
		
  	for(String name : nam)
	{
		if(!uniquelist.contains(name))
		{
			uniquelist.add(name);
		}
		System.out.println("unique list"+uniquelist);
		}
}
}
}*/
		List<String>  uniquevalues1 = nam.stream().distinct().collect(Collectors.toList());
		System.out.println(uniquevalues1);
	}
 }


	
	
	


