public class ArraysExercises {
    // Create a static method to add a new person to an array of people
    public static Person[] addPerson(Person[] originalArray, Person personToAdd) {
        // Create a new array with length one more than the original
        Person[] newArray = new Person[originalArray.length + 1];

        // Copy elements of original array into the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        // Add the new person at the end of the new array
        newArray[newArray.length - 1] = personToAdd;
        // Return the new array
        return newArray;
    }
    public static void main(String[] args) {
    //        int[] numbers = {1, 2, 3, 4, 5};
    //        System.out.println(numbers);

        // Create an array to hold 3 Person objects
        Person[] personArray = new Person[3];
        // Assign a new instance of the Person class to each element
        personArray[0] = new Person("Billy");
        personArray[1] = new Person("Bob");
        personArray[2] = new Person("Carl");

        // Create a new person to add to the array
        Person personToAdd = new Person("Alice");

//        for (Person person: personArray) {
//            System.out.println(person.getName());
//        }
        // Use the addPerson method to add the new person to the array, creating a new array
        Person[] newArray = addPerson(personArray, personToAdd);

        // Iterate through the array and print out the name of each person
        for (Person person: newArray) {
            System.out.println(person.getName());
        }

    }
}
