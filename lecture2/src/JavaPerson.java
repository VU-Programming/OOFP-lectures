public class JavaPerson {
    private String firstName;
    String lastName;
    int birthYear;

    JavaPerson(String firstName, String lastName, int birthYear) {
        this.firstName= firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        System.out.println("Created person!");
    }

    String info () {
        return firstName + " " + lastName + "was born in " + birthYear;
    }

}
