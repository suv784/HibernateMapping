package OneToOneBi;

public class Controller {
	public static void main(String[] args) { 
		Adhar adhar=new Adhar();
		adhar.setAid(15694561); 
		adhar.setAddr("jajpur"); 
	
		Person person=new Person(); 
		person.setId(1); 
		person.setName("suvendu"); 
		person.setAdhar(adhar); 
		adhar.setPerson(person); 
		Service.saveAdharPerson(adhar, person); 
		Service.getAdharPerson();
		Service.updatePersonAdhar(1);  
		Service.deletePersonAdhar(1);
		
		
	}  

}
