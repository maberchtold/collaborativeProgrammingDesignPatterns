package adapter.coffeMachineSolutionTeacher_useThis;

import adapter.coffeMachineSolutionTeacher_useThis.target.Machine;

public class CapselMachine implements Machine {
	private int numberOfCapsules;
	private boolean state;
	private Engineer responsibleEngineer;

	public CapselMachine(int numberOfCapsules, Engineer responsibleEngineer) {
		this.numberOfCapsules = numberOfCapsules;
		this.responsibleEngineer = responsibleEngineer;
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

	@Override
	public Engineer getEngineer() {
		return responsibleEngineer;
	}
}
