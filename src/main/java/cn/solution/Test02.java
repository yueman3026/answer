package cn.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Stage2: 
 * 如果数字可被3整除或者其中包含3，则数字为Fizz 
 * 如果数字可被5整除或者其中包含5，则数字为Buzz
 * 如果FizzBu​​zz可以被3或5整除，或者如果它有3或5，则为FizzBu​​zz
 * 
 * @author 乐满
 *
 */
public class Test02 {

	public static void main(String[] args) {
		List<String> fizzBuzz = fizzBuzz(100);
		for (String result : fizzBuzz) {
			System.out.println(result);
		}
	}

	public static List<String> fizzBuzz(int n) {

		List<String> result = new ArrayList<>(n);

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result.add("FizzBuzz");
			} else {
				if ((i % 3 == 0) || (i % 10 == 3) || (i / 10 % 10 == 3))
					result.add("Fizz");
				else if ((i % 5 == 0) || (i / 10 % 10 == 5))
					result.add("Buzz");
				else
					result.add(i + "");
			}

		}
		return result;
	}
}
