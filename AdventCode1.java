/*
https://adventofcode.com/
The Elves quickly load you into a spacecraft and prepare to launch.
At the first Go / No Go poll, every Elf is Go until the Fuel Counter-Upper.
They haven't determined the amount of fuel required yet.
Fuel required to launch a given module is based on its mass. Specifically, to find the fuel required for a module,
take its mass, divide by three, round down, and subtract 2.

For example:
For a mass of 12, divide by 3 and round down to get 4, then subtract 2 to get 2.
For a mass of 14, dividing by 3 and rounding down still yields 4, so the fuel required is also 2.
For a mass of 1969, the fuel required is 654.
For a mass of 100756, the fuel required is 33583.
The Fuel Counter-Upper needs to know the total fuel requirement.
To find it, individually calculate the fuel needed for the mass of each module
(your puzzle input), then add together all the fuel values.

What is the sum of the fuel requirements for all of the modules on your spacecraft?
*/
import java.util.Scanner;
public class AdventCode1{
	public static void main(String args[]){

		double modules[] = {123457, 98952, 65241, 62222, 144922, 111868, 71513, 74124, 140122,
		133046, 65283, 107447, 144864, 136738, 118458, 91049, 71486, 100320, 143765, 88677, 62034,
		139946, 81017, 128668, 126450, 56551, 136839, 64516, 91821, 139909, 52907, 78846, 102008,
		58518, 128627, 71256, 133546, 90986, 50808, 139055, 88769, 94491, 128902, 55976, 103658,
		123605, 113468, 128398, 61725, 100388, 96763, 101378, 139952, 138298, 87171, 51840,
		64828, 58250, 88273, 136781, 120097, 127291, 143752, 117291, 100023, 147239, 71296,
		100907, 127612, 122424, 62942, 95445, 74040, 118994, 81810, 146408, 98939, 71359, 112120,
		100630, 139576, 98998, 92481, 53510, 76343, 125428, 73447, 62472, 91370, 73506, 126539,
		50739, 73133, 81906, 100856, 52758, 142303, 107605, 77797, 124355};

		int n1;
		int fuel = 0;
		for (int i = 0; i < modules.length; i++){
			n1 = 0;
			n1 = (int)modules[i]/3;
			//System.out.println(n1);
			n1 = n1 - 2;
			System.out.println("Module: " + modules[i]);
			fuel = fuel + n1;
			System.out.println("Fuel: " + fuel);
		}
		System.out.println(fuel);

	}
}