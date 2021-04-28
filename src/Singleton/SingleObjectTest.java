package Singleton;

public class SingleObjectTest {

	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}

}
