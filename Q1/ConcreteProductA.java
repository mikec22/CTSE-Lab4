public class ConcreteProductA extends Product {
	public String getName(){
		return this.getClass().getSimpleName();
	}
}