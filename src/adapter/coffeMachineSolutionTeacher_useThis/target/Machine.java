package adapter.coffeMachineSolutionTeacher_useThis.target;


import adapter.coffeMachineSolutionTeacher_useThis.Engineer;

public interface Machine {
	int getNumberOfCapsules();
	boolean isCompletelyUp();
	void stop();
	Engineer getEngineer();
}
