package mypack;

import java.util.Locale;  
import java.util.ResourceBundle;  
public class InternationalizationDemo {  
 public static void main(String[] args) {  
  
 System.out.println();
System.out.println("Greeting in English");
  ResourceBundle bundle = ResourceBundle.getBundle("message", Locale.US);  
  System.out.println("Message in "+Locale.US +":"+"\t"+bundle.getString("greeting"));  

  System.out.println();
System.out.println("Greeting in indonasian");
  //changing the default locale to indonasian   
  Locale.setDefault(new Locale("in", "ID"));  
  bundle = ResourceBundle.getBundle("message");  
  System.out.println("Message in "+Locale.getDefault()+":"+"\t"+bundle.getString("greeting")); 
 
 System.out.println();
System.out.println("Greeting in German");
//changing the default locale to German 
  Locale.setDefault(new Locale("de", "DE"));  
  bundle = ResourceBundle.getBundle("message");  
  System.out.println("Message in "+Locale.getDefault()+":"+"\t"+bundle.getString("greeting"));

 System.out.println();
System.out.println("Greeting in Danish");
//changing the default locale to Danish 
  Locale.setDefault(new Locale("da"));  
  bundle = ResourceBundle.getBundle("message");  
  System.out.println("Message in "+Locale.getDefault()+":"+"\t\t"+bundle.getString("greeting"));
  
 }  
}  

