package adapter.coffeMachineSolutionTeacher_useThis.adaptee;

public class OldMachine {
	private int numberOfCapsules;
	private boolean state;

	public OldMachine(int numberOfCapsules) {
		this.numberOfCapsules = numberOfCapsules;
		this.state = true;
	}

	public int getNumberOfCapsules() {
		return numberOfCapsules;
	}
	
	public boolean isCompletelyUp() {
		return state;
	}
	
	public void stop() {
		this.state = false;
	}


}
