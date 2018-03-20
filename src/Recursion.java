
import java.util.ArrayList;
import java.util.List;

/**
 * This class use for run recursion method.
 * 
 * @author Noppawan Kulchol
 *
 */
public class Recursion {
	/**
	 * Remove duplicate consecutive items from a list, changing the list
	 * parameter. For example, if list = { a, b, b, b, c, b, c, c} then after
	 * calling unique the list will contain {a, b, c, b, c}. Only consecutive
	 * duplicates are removed. Objects are compared using their own equals
	 * method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates
	 *         removed.
	 */
	public static List unique(List list) {
		if (list.size() <= 1)
			return list;
		if (list.get(0) == list.get(1)) {
			list.remove(0);
			unique(list.subList(0, list.size()));
		} else {
			unique(list.subList(1, list.size()));
		}
		return list;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("a");
		list.add("c");

		System.out.println("unique method : ");
		System.out.println(unique(list));
		System.out.println();
		System.out.println("fibonacci method :");
		System.out.println(fibonacci(7));

	}

	/**
	 * show the result of fibonacci.
	 * 
	 * @param n
	 *          is number.
	 * @return fibonacci numbers.
	 */
	public static long fibonacci(int n) {
		if (n <= 0)	return 0;
		if (n != 0 && n <= 2)  return 1;
		int firstNumber = 0;
		int secondNumber = 1;
		return betterFibonacci(n, firstNumber, secondNumber);
	}

	/**
	 * helper method for fibonacci(int n) that show the fibonacci numbers.
	 * 
	 * @param count
	 *            is the number of fibonacci. If it equals zero it mean 
	 *            we have added it all numbers.
	 * @param first
	 *            is first number(0).
	 * @param second
	 *            is second number(1).
	 * @return fibonacci number.
	 */
	public static long betterFibonacci(int count, int first, int second) {
		if (count == 0)	return second;
		/** next number that get from first number + second number. */
		int third = first + second;
		return betterFibonacci(count - 1, second, third);
	}
}
