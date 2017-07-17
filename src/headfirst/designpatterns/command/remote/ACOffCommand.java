package headfirst.designpatterns.command.remote;

public class ACOffCommand implements Command {

	private AC ac;
	
	public void execute(){
		ac.off();
	}
	
	public ACOffCommand(AC ac){
		this.ac = ac;
	}
}
