package headfirst.designpatterns.command.remote;

public class ACOnCommand implements Command {

	private AC ac;
	
	public ACOnCommand(AC ac){
		this.ac = ac;
	}
	
	public void execute() {
		ac.on();
	}

}
