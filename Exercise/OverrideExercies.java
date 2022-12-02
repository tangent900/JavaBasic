package JavaBasic.Exercise;
public class OverrideExercies {
    public static void main(String[] args) {
        Person person = new Person("jack",10);
        System.out.println(person.say());

        Student student = new Student("Tom",10,"123456",99.2);
        System.out.println(student.say());

    }

}
