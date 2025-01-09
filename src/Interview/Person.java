package Interview;

import java.io.*;


class Person implements Serializable {
           private static final long serialVersionUID = 1L; // Recommended for versioning

          private String name;
           private int age;
            transient private String password; // Marked transient to exclude from serialization

       public Person(String name, int age, String password) {
     this.name = name;
     this.age = age;
     this.password = password;
    }

 @Override
 public String toString() {
     return "Person{name='" + name + "', age=" + age + ", password='" + password + "'}";
 }
}


