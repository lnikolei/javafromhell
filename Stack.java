package ms0.a0;

public class Stack {

	String arr[] = new String[10000];
	int top = -1;
	int capacity;
	int helper = 0;

	
	Stack() { // Standardkonstruktor
	}

	// Push-Methode
	public void push(String x) {
		arr[helper] = x;
		System.out.println("String  " + x + "  wurde auf den Stack gelegt");
		helper++;
		top++;
	}

	// Pop-Methode
	public void pop() {
		String begone = arr[top];
		System.out.println("String  " + begone + "  wurde vom Stack entfernt");
		arr[top] = null;
		top = top - 1;
	}

	// Peek-Methode
	public String peek() {
		return arr[top];
	}

	// Size-Methode
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			System.out.println("Es kann nicht weiter die pop-Methode benutzt werden, da der Stack leer ist.");
			return
		}
	}
	
}
