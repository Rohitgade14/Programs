package Interview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientExample {
	 public static void main(String[] args) {
	     // Create a Person object
	     Person person = new Person("Alice", 30, "mypassword123");

	     // Serialization: Save the object to a file
	     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
	         oos.writeObject(person);
	         System.out.println("Serialized Person: " + person);
	     } catch (IOException e) {
	         e.printStackTrace();
	     }

	     // Deserialization: Read the object from the file
	     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
	         Person deserializedPerson = (Person) ois.readObject();
	         System.out.println("Deserialized Person: " + deserializedPerson);
	     } catch (IOException | ClassNotFoundException e) {
	         e.printStackTrace();
	     }
	 }
}