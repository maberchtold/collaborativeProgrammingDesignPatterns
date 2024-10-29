package adapter.coffeMachineSolutionTeacher_useThis;

import adapter.coffeMachineSolutionTeacher_useThis.adaptee.OldMachine;
import adapter.coffeMachineSolutionTeacher_useThis.adapter.Adapter;
import adapter.coffeMachineSolutionTeacher_useThis.target.Machine;
import java.util.ArrayList;
import java.util.List;

public class Nespresso {

	public static void main(String[] args) {

		List<Machine> myMachines = new ArrayList<Machine>();

		Engineer jean = new Engineer("Jean");
		Engineer maria = new Engineer("Maria");

		CapselMachine m1 = new CapselMachine(30, jean);
		CapselMachine m2 = new CapselMachine(20, jean);
		CapselMachine m3 = new CapselMachine(40, maria);
		Machine m4 = new Adapter(new OldMachine(80));

		myMachines.add(m1);
		myMachines.add(m2);
		myMachines.add(m3);
		myMachines.add(m4);

		for (Machine m : myMachines){
			System.out.println("Machine " + m.hashCode()
					+ " is currently processing " + m.getNumberOfCapsules()
					+ " capsules, supervised by engineer " + m.getEngineer());
			m.stop();
		}
	}
}
