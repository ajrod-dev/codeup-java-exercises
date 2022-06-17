import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person[] people = new Person[3];
        Arrays.fill(people, new Person("Sam"));
        people[1] = new Person("John");
        people[2] = new Person("Bill");

        for(Person person : people){
            person.sayHello();
        }

        Person[] newArr = addPerson(people, new Person("Suzie"));
        for(Person person : newArr){
            person.sayHello();
        }
    }

    public static Person[] addPerson(Person[] arr, Person person){
        Person[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = person;
        return newArr;
    }
}
