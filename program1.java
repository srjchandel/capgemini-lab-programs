package lab5.exercise4;

public class userdefinedexception {

	public static void main(String[] args) {
		Employee em= new Employee();
		try{
			em.showName();
			System.out.println("your name= "+em.getstr1());
			
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
class EmployeeException extends Exception{
	String s;
	EmployeeException(String m){
		s=m;
	}
	public String getMessage() {
	return s;
	}	
}

class Employee{
	String First="";
	String Last="";
	String str1;

    public void showName() throws EmployeeException{
           if(First.isEmpty()&&Last.isEmpty()) {
            	throw new EmployeeException("FIRST NAME AND LAST NAME IS BLANK");
            }
            		else {
            			str1=First+Last;
            			
            		}
            	}
            	public String getstr1() {
            		return str1;
            	}
            	
            	
}
