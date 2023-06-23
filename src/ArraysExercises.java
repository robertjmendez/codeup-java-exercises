public class ArraysExercises {

    public static Person[] addPerson(Person[] originalArray, Person personToAdd) {
        Person[] newArray = new Person[originalArray.length + 1];

        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        newArray[newArray.length - 1] = personToAdd;

        return newArray;
    }
    public static void main(String[] args) {
    //        int[] numbers = {1, 2, 3, 4, 5};
    //        System.out.println(numbers);

        Person[] personArray = new Person[3];
        personArray[0] = new Person("Billy");
        personArray[1] = new Person("Bob");
        personArray[2] = new Person("Carl");

        Person personToAdd = new Person("Alice");

//        for (Person person: personArray) {
//            System.out.println(person.getName());
//        }

        Person[] newArray = addPerson(personArray, personToAdd);

        for (Person person: newArray) {
            System.out.println(person.getName());
        }

    }
}
