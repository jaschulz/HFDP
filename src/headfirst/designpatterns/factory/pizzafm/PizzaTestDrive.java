package headfirst.designpatterns.factory.pizzafm;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();

		Pizza multipleNY = nyStore.orderPizza("Multiple");
		System.out.println("Ethan ordered a " + multipleNY.getName() + "\n");
	}
}
