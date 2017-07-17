package headfirst.designpatterns.command.remote;

public class AC {

	String location = "";

	public AC(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " AC is on");
	}

	public void off() {
		System.out.println(location + " AC is off");
	}
}
