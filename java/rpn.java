public class rpn {
	public static void main (String[] args) throws IOException {
		System.out.println("rpn.");
		
		String[] tokens = new String[] {"2", "1", "+", "3", "*" };
		System.out.println(rpn(tokens));
	}
	
	private static int rpn(String[] tokens){
		int result = 0;
		String op = "+-*/";
		
		Stack<String> stack = new Stack<String>();
		
		for (String t: tokens) {
			if (!op.contains(t))
				stack.push(t);
			else{
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				int index = op.indexOf(t);
				switch(index){
					case 0:
						stack.push(String.valueOf(a+b));
						break;
					case 1:
						stack.push(String.valueOf(b-a));
						break;
					case 2:
						stack.push(String.valueOf(a*b));
						break;
					case 3:
						stack.push(String.valueOf(b/a));
				}
			result = Integer.valueOf(stack.pop());

			return result;
			}
				
		}
		
	}	
	
}