package software.ulpgc.katas;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Person person = new Person("Lucia", LocalDate.of(2005, 3, 2));
        System.out.println(person.age());
    }
}
