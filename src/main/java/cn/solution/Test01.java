package cn.solution;

import java.util.ArrayList;
import java.util.List;
/**
 * Stage1:
 * 打印1-100的数字，3的倍数Fizz输出，5的倍数Buzz输出，3和5的倍数FizzBuzz输出
 * @author 乐满
 *
 */
public class Test01 {
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
				if (i % 3 == 0)
					result.add("Fizz");
				else if (i % 5 == 0)
					result.add("Buzz");
				else
					result.add(i + "");
			}

		}
		return result;
	}
}
