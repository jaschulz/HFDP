package headfirst.designpatterns.factory.pizzafm;

import java.util.ArrayList;

public class MultiplePizzas extends Pizza {

	ArrayList<Pizza> multiplePizzas;
	
	public MultiplePizzas() { 
		name = "Multiple Pizzas";
		dough = "Dough of each individual Pizza";
		sauce = "Sauce of each individual Pizza";
		multiplePizzas = new ArrayList<Pizza>();
		multiplePizzas.add(new NYStyleCheesePizza());
		multiplePizzas.add(new NYStyleVeggiePizza());
		multiplePizzas.add(new NYStyleClamPizza());
		multiplePizzas.add(new NYStylePepperoniPizza());
 	}
 
	void prepare() {
		for(Pizza p : multiplePizzas) {
			p.prepare();
		}
	}
  
	void bake() {
		for(Pizza p : multiplePizzas) {
			p.bake();
		}
	}
 
	void cut() {
		for(Pizza p : multiplePizzas) {
			p.cut();
		}
	}
  
	void box() {
		for(Pizza p : multiplePizzas) {
			p.box();
		}
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		for(Pizza p : multiplePizzas) {
			display.append(p.toString());
		}
		return display.toString();
	}
	
	public void addPizza(Pizza p){
		multiplePizzas.add(p);
	}
}
