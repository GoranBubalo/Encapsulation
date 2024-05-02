
public class Main {

	public static void main(String[] args) {
		// Encapsulation = attributes of a class will be hidden or private
		//				   Can be accessed only through methods ( getters & setters ) 
		//				   Should make attributes private for security 
		
		
		//Instantiating a class
		Car car = new Car("Tesla ","truck",2021);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		car.setMake("laborgini");
		System.out.println();
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
	}

}
