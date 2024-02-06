package lesson4;

public final class Contacts {

    private final String firstName;
    private final String lastName;

    public Contacts(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
    }


        @Override public  String toString() {
            return "firstname  " + this.firstName + " lastname " + this.lastName;
        }
    }
