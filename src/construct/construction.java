package construct;

import java.util.Collections;
import java.util.Stack;

public class construction {

	static int max;
	Stack<Integer> stack = new Stack<Integer>();

	
	public void sortList(int floorSize, int floorArray[]) {
		
		max = floorSize;
		
		System.out.println("The order of construction is as follows");
		for (int i = 0; i < floorArray.length; i++) {
			System.out.println("Day " + (i + 1));
			
			if (floorArray[i] == max) {
				System.out.println(floorArray[i]);
				max--;
				
				while (!stack.isEmpty()) {
					int x = stack.peek();
					if (x == max) {
						System.out.println(stack.pop());
						max--;
						continue;
					} else {
						break;
					}

				}
			}
			
			else {
				stack.push(floorArray[i]);
				System.out.println(" ");
			}
		}
		
		if (!stack.isEmpty()) {
			Collections.sort(stack, Collections.reverseOrder());
			Object[] arr = stack.toArray();
			for (int j = 0; j < arr.length; j++)
				System.out.println(arr[j]);
		}

	}
}