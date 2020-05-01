package ms0.a0;

public class Main {

	public static void main(String[] args) {

		Stack Test = new Stack();
		System.out.println("Im Stack befinden sich nach Erstellung des Stacks " + Test.size()
				+ "  Strings, was man mit der size-Methode prüfen kann.");
		System.out.println("Mit der push-Methode lassen sich Strings auf den Stack legen, wie man im folgenden sieht:");

		Test.push("Alpha");
		Test.push("Beta");
		Test.push("Gamma");
		Test.push("Delta");
		Test.push("Epsilon");
		Test.push("Zeta");
		Test.push("Eta");
		Test.push("Theta");
		Test.push("Iota");
		Test.push("Kappa");

		System.out.println("Im Stack befinden sich nach der Befüllung durch die Push-Methode nun  " + Test.size()
				+ "  Strings, was man mit der size-Methode erneut prüfen kann.");
		System.out.println("Mit der Methode peek erkennt man, dass ganz oben auf dem Stack folgender String liegt:  "
				+ Test.peek());
		System.out.println(
				"Mithilfe der Methode pop, werden die obersten Strings im Stack jeweils in der Konsole ausgegeben und dann vom Stack entfernt. Hier ein Beispiel:");
		Test.pop();
		Test.pop();
		Test.pop();
		Test.pop();
		Test.pop();
		System.out.println(
				"Nachdem man die Methode pop benutzt hat, können wir erneut prüfen wieviele Strings sich im Stack befinden. Und zwar: "
						+ Test.size());
		System.out.println("Demnach liegt jetzt, nach dem Entfernen von 5 Strings,  " + Test.peek()
				+ "   oben auf dem Stapel, was wir mithilfe der peek-Methode herausgefunden haben.");

		
	System.out.println(Test.arr.length);
	}

}
