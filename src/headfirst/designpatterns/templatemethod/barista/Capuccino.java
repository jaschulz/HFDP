package headfirst.designpatterns.templatemethod.barista;

public class Capuccino extends CaffeineBeverage {

	public void brew(){
		System.out.println("Dripping coffee and chocolate through filter.");
	}
	
	public void addCondiments(){
		System.out.println("Adding cinnamon");
	}
}
