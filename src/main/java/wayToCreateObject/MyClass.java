package wayToCreateObject;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
public class MyClass implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	public MyClass() {
		System.out.println("MyClass Object is created");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (MyClass) super.clone();
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		// 1.Create an Object using new keyword
		MyClass object1 = new MyClass();
		// 2.Create an Object using reflection
		MyClass object2 = (MyClass) Class.forName("wayToCreateObject.MyClass").newInstance();
		// 3.Create an Object using clone
		MyClass myClass = new MyClass();
		MyClass object3 = (MyClass) myClass.clone();
		// 4.Create an Object using ClassLoader
		Object object4 = MyClass.class.getClassLoader().loadClass("wayToCreateObject.MyClass").newInstance();
		// 5.Use the Constructor class from the java.lang.reflect
		Class<MyClass> class1 = MyClass.class;
		Constructor<?> constructor = class1.getDeclaredConstructors()[0];
		MyClass object5 = (MyClass) constructor.newInstance();
		/*
		 * 6.Create Object using Serialization process * First write an Object in a file
		 * using Serialization and after that Create object using Deserialization
		 */
		ObjectOutputStream objectOutputStream = null;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("kkjava.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(object4); // write object to file
			objectOutputStream.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (objectOutputStream != null)
				objectOutputStream.close();
		}
		ObjectInputStream objectInputStream = null;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream("kkjava.txt"));
			MyClass object6 = (MyClass) objectInputStream.readObject();
			System.out.println(object6.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (objectInputStream != null)
				objectInputStream.close();
		}
	}
}