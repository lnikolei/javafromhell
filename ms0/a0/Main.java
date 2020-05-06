package ms0.a0;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack(); // Hier wird ein Stack erstellt.
		System.out.println("Zunächst prüfen wir, ob sich etwas auf dem Stack befindet:");
		System.out.println(stack.peek());
		System.out.println("Da der Stack leer ist, packen wir ein paar Strings auf den Stack.");

		stack.push("Alpha");
		stack.push("Beta");
		stack.push("Gamma");

		System.out.println(
				"Wir können mit der peek-Methode nun prüfen, was sich an oberster Stelle des Stacks befindet:");
		System.out.println(stack.peek());
		System.out.println("Als nächstes entfernen wir die Strings vom Stack mit der pop-Methode.");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(
				"Der Stack sollte nun leer sein, was passiert aber, wenn man nochmal versucht etwas zu entfernen?");
		System.out.println(stack.pop());
		System.out.println("Man erhält null, da es keinen String mehr auf dem Stack gibt.");
		System.out.println(
				"Man kann hier außerdem prüfen, was passiert wenn man die peek-Methode auf einen leeren Stack anwendet:");
		System.out.println(stack.peek());
		System.out.println(
				"Der letzte Befehl der noch vorgestellt werden muss, ist die size-Methode. Im Moment hat der Stack die folgende Größe:");
		System.out.println(stack.size());
		System.out.println("Was gibt die size-Methode aber aus, wenn drei Strings auf dem Stack sind?");

		stack.push("Delta");
		stack.push("Epsilon");
		stack.push("Zeta");

		System.out.println(stack.size());

	}

}
