package lab5.exercise5;

public class AgeException {

	public static void main(String[] args) {
		Person em= new Person();
		try{
			em.showAge();
			System.out.println("your age= "+em.getage());
			
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
class InvalidAgeException extends Exception{
	String s;
	InvalidAgeException(String m){
		s=m;
	}
	public String getMessage() {
	return s;
	}	
}
class Person{
	int n=18;
	int age;
    public void showAge() throws InvalidAgeException{
           if(n<=15) {
            	throw new InvalidAgeException("AGE OF A PERSON SHOULD BE ABOVE 15");
            }
            		else {
            			age=n;
            			
            		}
            	}
            	public int getage() {
            		return age;
            	}
            	
            	
}
