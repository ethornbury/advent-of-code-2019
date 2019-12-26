/*
On the way to your gravity assist around the Moon, your ship computer beeps angrily about a
"1202 program alarm". On the radio, an Elf is already explaining how to handle the situation:
"Don't worry, that's perfectly norma--" The ship computer bursts into flames.

You notify the Elves that the computer's magic smoke seems to have escaped.
"That computer ran Intcode programs like the gravity assist program it was working on;
surely there are enough spare parts up there to build a new Intcode computer!"

An Intcode program is a list of integers separated by commas (like 1,0,0,3,99).
To run one, start by looking at the first integer (called position 0).
Here, you will find an opcode - either 1, 2, or 99. The opcode indicates what to do; for example,
99 means that the program is finished and should immediately halt.
Encountering an unknown opcode means something went wrong.

Opcode 1 adds together numbers read from two positions and stores the result in a third position.
The three integers immediately after the opcode tell you these three positions -
the first two indicate the positions from which you should read the input values,
and the third indicates the position at which the output should be stored.

For example, if your Intcode computer encounters 1,10,20,30,
it should read the values at positions 10 and 20, add those values,
and then overwrite the value at position 30 with their sum.

Opcode 2 works exactly like opcode 1, except it multiplies the two inputs instead of adding them.
Again, the three integers after the opcode indicate where the inputs and outputs are, not their values.

Once you're done processing an opcode, move to the next one by stepping forward 4 positions.

For example, suppose you have the following program:

1,9,10,3,2,3,11,0,99,30,40,50
---
Once you have a working computer, the first step is to restore the gravity assist program
(your puzzle input) to the "1202 program alarm" state it had just before the last computer caught fire.
To do this, before running the program, replace position 1 with the value 12 and replace position 2 with the value 2.
What value is left at position after the program halts?

sample: 1,1,1,4,99,5,6,0,99 becomes 30,1,1,4,2,5,6,0,99
sample: 2,4,4,5,99,0 becomes 2,4,4,5,99,9801
*/
public class AdventCode2{
	public static void main(String args[]){
		//int input[] = {2,4,4,5,99,0};
		//int input[] = {1,1,1,4,99,5,6,0,99}; //test data to produce: 30,1,1,4,2,5,6,0,99
		int input[] = {1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,9,1,19,1,9,19,23,1,23,5,27,2,27,10,31,1,6,31,35,1,6,35,39,2,9,39,43,1,6,43,47,1,47,5,51,1,51,13,55,1,55,13,59,1,59,5,63,2,63,6,67,1,5,67,71,1,71,13,75,1,10,75,79,2,79,6,83,2,9,83,87,1,5,87,91,1,91,5,95,2,9,95,99,1,6,99,103,1,9,103,107,2,9,107,111,1,111,6,115,2,9,115,119,1,119,6,123,1,123,9,127,2,127,13,131,1,131,9,135,1,10,135,139,2,139,10,143,1,143,5,147,2,147,6,151,1,151,5,155,1,2,155,159,1,6,159,0,99,2,0,14,0};
		int t1,t2, t3, res;

		/*
		//testing lines
		System.out.println("Array" );
		for(int i = 0; i < input.length; i++){
			System.out.println(input[i]);
		}
		*/
		input[1] = 12;
		input[2] = 2;

		System.out.println("length of input[]: "+ input.length);
		for(int i = 0; i < input.length; i+=4){ //cycle over array
			System.out.println("input[" +i+ "]: " +input[i]); //check index and content

			if(input[i] == 1){
				//+
				t1 = input[i+1];
				System.out.println("t1 "+t1);
				t2 = input[i+2];
				System.out.println("t2 "+t2);
				t3 = input[i+3];
				System.out.println("t3 "+t3);
				res = input[t1] + input[t2];
				System.out.println("res "+res);
				input[t3] = res;
				System.out.println("input[t3] "+ input[t3]);

			}else if(input[i] == 2){
				//*
				t1 = input[i+1];
				System.out.println("t1 "+t1);
				t2 = input[i+2];
				System.out.println("t2 "+t2);
				t3 = input[i+3];
				System.out.println("t3 "+t3);
				res = input[t1] * input[t2];
				System.out.println("res "+res);
				input[t3] = res;

			}else if(input[i] == 99){
				//end now
				break;
			}
		}
		System.out.println("Answer for input[0]: " + input[0]);

		/*
		//view testing data output
		for(int i = 0; i < input.length; i++){
			System.out.println(input[i]);
		}
		*/


	}
}