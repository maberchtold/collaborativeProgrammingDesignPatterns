package adapter.coffeMachineSolutionTeacher_useThis.adapter;


import adapter.coffeMachineSolutionTeacher_useThis.Engineer;
import adapter.coffeMachineSolutionTeacher_useThis.adaptee.OldMachine;
import adapter.coffeMachineSolutionTeacher_useThis.target.Machine;

public class Adapter implements Machine {
	
	private OldMachine oldMachine;

	public Adapter(OldMachine oldMachine) {
		this.oldMachine = oldMachine;
	}

	public int getNumberOfCapsules() {
		return oldMachine.getNumberOfCapsules();
	}

	@Override
	public Engineer getEngineer() {
		return null;
	}

	public boolean isCompletelyUp() {
		return oldMachine.isCompletelyUp();
	}

	public void stop() {
		oldMachine.stop();
	}
}
