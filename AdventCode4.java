/*
You arrive at the Venus fuel depot only to discover it's protected by a password.
The Elves had written the password on a sticky note, but someone threw it out.

However, they do remember a few key facts about the password:

It is a six-digit number.
The value is within the range given in your puzzle input.
Two adjacent digits are the same (like 22 in 122345).
Going from left to right, the digits never decrease; they only ever increase or stay the same (like 111123 or 135679).
Other than the range rule, the following are true:

111111 meets these criteria (double 11, never decreases).
223450 does not meet these criteria (decreasing pair of digits 50).
123789 does not meet these criteria (no double).
How many different passwords within the range given in your puzzle input meet these criteria?

Your puzzle input is 168630-718098.
*/
public class AdventCode4{
	public static void main(String args[]){
		int count=0;
		int value = 168630;
		String strNum;
		int digit;

		for(int i = 168630; i < 168635; i++){
			strNum = "" + i;
			// cycle over number and check the criteria
			for(int j = 0; j < 6; j++){
				digit = (int)strNum.charAt(j);

				if(digit >= (int)strNum.charAt(j)){
					digit = (int)strNum.charAt(j);
					count++;
					System.out.println(count);
				}

			}

		}
		System.out.println(count);

	}
}