
public class StackOfIntegers {
	private int top=0;
	private int[] stack;
	
	// 构造方法
	public StackOfIntegers() {
		stack=new int[1000];
	}
	public StackOfIntegers(int size) {
		stack=new int[size];
	}
	// 出栈
	public int pop() {
		return stack[--top];
	}
	// 入栈
	public void push(int number) {
		stack[top++]=number;
	}
	// 获得栈中的元素个数
	public int getSize() {
		return top;
	}
	// 判断栈是否空
	public boolean empty() {
		if(top==0)
			return true;
		else
			return false;
	}
	// 获得栈顶元素，但不删除
	public int peek() {
		return stack[top-1];
	}
}
