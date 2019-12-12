/*
Fuel itself requires fuel just like a module -
take its mass, divide by three, round down, and subtract 2.
However, that fuel also requires fuel, and that fuel requires fuel, and so on.
Any mass that would require negative fuel should instead be treated as if it requires zero fuel;
the remaining mass, if any, is instead handled by wishing really hard,
which has no mass and is outside the scope of this calculation.

So, for each module mass, calculate its fuel and add it to the total.
Then, treat the fuel amount you just calculated as the input mass and repeat the process,
continuing until a fuel requirement is zero or negative.

For example:
A module of mass 14 requires 2 fuel.
This fuel requires no further fuel (2 divided by 3 and rounded down is 0,
which would call for a negative fuel), so the total fuel required is still just 2.
At first, a module of mass 1969 requires 654 fuel.
Then, this fuel requires 216 more fuel (654 / 3 - 2). 216
then requires 70 more fuel, which requires 21 fuel, which requires 5 fuel,
which requires no further fuel.
So, the total fuel required for a module of mass 1969 is 654 + 216 + 70 + 21 + 5 = 966.
The fuel required by a module of mass 100756 and its fuel is:
33583 + 11192 + 3728 + 1240 + 411 + 135 + 43 + 12 + 2 = 50346.

What is the sum of the fuel requirements for all of the modules on your spacecraft
when also taking into account the mass of the added fuel?
(Calculate the fuel requirements for each module separately, then add them all up at the end.)

*/
import java.util.Scanner;
public class AdventCode1part2{
	public static void main(String args[]){

		int modules[] = {123457, 98952, 65241, 62222, 144922, 111868, 71513, 74124, 140122,
		133046, 65283, 107447, 144864, 136738, 118458, 91049, 71486, 100320, 143765, 88677, 62034,
		139946, 81017, 128668, 126450, 56551, 136839, 64516, 91821, 139909, 52907, 78846, 102008,
		58518, 128627, 71256, 133546, 90986, 50808, 139055, 88769, 94491, 128902, 55976, 103658,
		123605, 113468, 128398, 61725, 100388, 96763, 101378, 139952, 138298, 87171, 51840,
		64828, 58250, 88273, 136781, 120097, 127291, 143752, 117291, 100023, 147239, 71296,
		100907, 127612, 122424, 62942, 95445, 74040, 118994, 81810, 146408, 98939, 71359, 112120,
		100630, 139576, 98998, 92481, 53510, 76343, 125428, 73447, 62472, 91370, 73506, 126539,
		50739, 73133, 81906, 100856, 52758, 142303, 107605, 77797, 124355};


		int fuel = 0;
		//int temp = 0;
		for (int i = 0; i < modules.length; i++){
			int tempFuel = modules[i]/3 - 2;
			fuel = fuel + tempFuel;
			while(tempFuel > 0){
				tempFuel = tempFuel/3 - 2;
				if(tempFuel < 0)
					tempFuel = 0;

				fuel = fuel + tempFuel;
				System.out.println("Temp Fuel: " + tempFuel);

			}
			System.out.println("Module " +modules[i]+ ", fuel at index " +i+ " = " +fuel);
		}
		System.out.println("Fuel: " +fuel);
	}
}