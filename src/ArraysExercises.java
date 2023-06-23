public class ArraysExercises {
    public static void main(String[] args) {
    //        int[] numbers = {1, 2, 3, 4, 5};
    //        System.out.println(numbers);

        Person[] personArray = new Person[3];
        personArray[0] = new Person("Billy");
        personArray[1] = new Person("Bob");
        personArray[2] = new Person("Carl");

        for (Person person: personArray) {
            System.out.println(person.getName());
        }
    }
}
