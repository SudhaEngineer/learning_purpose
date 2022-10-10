import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExample3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("sudha","guru");
		names.forEach(System.out::println);
		
	}
		
	}/*	main 
}
	//blic static void main(String[] args) {  
	   /* s=()->{  
	        return "I have nothing to say.";  
	    };  
	   System.out.println(s.say()); */
		
		/*Stayable s =()->{
			return "I have nothing to say.";
		
			//System.out.println("hello world");
		};
		System.out.println("hello world");
	}  
	}  */
	/*tayable s3=name->
		{
			return "hi,"+name;
		};
		System.out.println(s3.say("world"));
		Stayable s1=name->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Sonoo"));  
          
        // You can omit function parentheses    
        Stayable s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sonoo"));  
    }  
} */
		
		  
		
		          
		        // Lambda expression without return keyword.  
		      /*Addable ad1=(a,b)->(a+b);  
		        System.out.println(ad1.add(10,20));  
		          
		        // Lambda expression with return keyword.    
		        Addable ad2=(int a,int b)->{  
		                            return (a+b);   
		                            };  for
		        System.out.println(ad2.add(100,200));
	}
		        Addable ad = (a,b);
		        {
		        	System.out.println(ad.add(6,8));
		        }
	
		    }  */
	/*ist<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("sudha");
		list.add("mounika");
		
		/*ist<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  */
	/*ist.forEach((n)->System.out.println(n));*/
	/*ist.forEach((p)->System.out.println(p));
	          }  
	} */     
		
		
		/*ublic static void main(String[] args) {  
		      
		        //Thread Example without lambda  
		        Runnable r1=new Runnable(){  
		            public void run(){  
		                System.out.println("Thread1 is running...");  
		            }  
		        };  
		        Thread t1=new Thread(r1);  
		        t1.start();  
		        //Thread Example with lambda  
		        Runnable r2=()->{  
		                System.out.println("Thread2 is running...");  
		        };  
		        Thread t2=new Thread(r2);  
		        t2.start();  
		    }  
		} */
/*interface Addable{  
    int add(int a,int b);  
}  
  
public class LambdaExpressionExample6 {  
    public static void main(String[] args) {  
          
        // Lambda expression without return keyword.  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addable ad2=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad2.add(100,200));  
    }  
}  */
	
	
	
	
		
		
		
		
		
		
		
		
		
		 

