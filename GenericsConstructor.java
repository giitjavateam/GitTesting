package test;

public class EmployeeRecord {
	String data;
	String data1;
    
	public <T,T1> EmployeeRecord(T data,T data1) {
       this.data = data.toString();
       this.data1 = data1.toString();
    }
    
    void display() 
    { 
    	System.out.println("Details :"+this.data+" "+this.data1);
    	
    } 

	public static void main(String[] args) {
		  EmployeeRecord emp1 = new EmployeeRecord(101,"Preeti23");
	      emp1.display();
	      EmployeeRecord emp2 = new EmployeeRecord("Ravi",101.06);
	      emp2.display();

	}

}