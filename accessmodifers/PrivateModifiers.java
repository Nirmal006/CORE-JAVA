package accessmodifers;
class b{ 
int a=4;

void msg(){
	System.out.println("Hello java");}  
}  
  
public class PrivateModifiers{  
 public static void main(String args[]){  
   b display=new b();  
   System.out.println(display.a);//Compile Time Error  
   display.msg();//Compile Time Error  
   }  
}  


	
