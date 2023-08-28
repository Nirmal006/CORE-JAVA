
public class ConstructorEx {

	//public static void main(String[] args) {
		public class Employee{
			 private int eid;
			 private String ename;
		
			Employee(int eid, String ename){
			   this.eid=eid;
			    this.ename=ename;
			}
			 
			//public Employee() {
				// TODO Auto-generated constructor stub
			}

			public static void main(String a[]){
			   Employee eob = new Employee();
			  Employee eob1 = new Employee(1111,"Swetha");
			  
			   System.out.println(eob.eid);  //0
			   System.out.println(eob.ename); //null
			    System.out.println(eob1.eid);  //1111
			   System.out.println(eob1.ename); //Swetha
			    }
			}
		// TODO Auto-generated method stub

	}

}
