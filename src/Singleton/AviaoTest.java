package Singleton;

public class AviaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		agendarAssento("A1");
		agendarAssento("A1");
	}
	
	private static void agendarAssento(String assento) {
		Aviao a = Aviao.getInstance();
		System.out.println(a.bookAssento(assento));
	}
	
}
