/* public class Subject
{
	public static void main (String []args)
	{
		Subject k=new Subject();
		k.startreading();
	}

    public void startreading()
    {
    	Topic t=new Topic();
    	t.understand();	
    }
class Topic
{
	public void understand()
	{
		System.out.println("the tight coupling concept");
	}
}
}*/
#include(stdio.h)
void main()
{
int a,b,temp,rev;
a=0;
temp=0;
rev=0;
printf("enter a value");
scanf("%d",&a);
a=b;
while(a>0)
{
	temp=a%10;
	rev=rev*10+temp;
	a=a/10;
}
if(b==rev)
{
	printf("given number is palindrom",rev);
}
else
{
	printf("given number is not palindrom");
}
}