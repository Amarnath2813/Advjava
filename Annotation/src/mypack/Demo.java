package mypack;


public class Demo 
{
	public static void main(String args[])
	{
		Trial d=new Trial();
		MyAnnotation m1=d.getClass().getAnnotation(MyAnnotation.class);  
		System.out.println("value is: "+m1.value());
		System.out.println(m1.getClass().getName());

		Sample s=new Sample();
		
		MyAnnotation m=s.getClass().getAnnotation(MyAnnotation.class);  
		System.out.println("value is: "+m.value());
		System.out.println(m.getClass().getName());
		System.out.println(m==m1);
	}
}	


	