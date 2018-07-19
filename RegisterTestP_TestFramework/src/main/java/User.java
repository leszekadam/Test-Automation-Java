import com.github.javafaker.Faker;

/**
 * Klasa User przetrzymująca dane op użytkowniku.
 */
public class User {

    /**
     * 1. Tworzymy miejsce na Faker'a.
     * 2. Tworzymy miejsce na Generator.
     * 3. Tworzymy miejsca na dane tesktowe o różnych nazwach.
     */
    private Faker faker;
    private Generate generate;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String city;
    private String postalCode;
    private String street;
    private String houseNumber;

    /**
     * Wszystkie Gettery (meto zwracające wartoś prywatnych pól).
     */
    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     *    == KONSTRUKTOR ==
     *
     *  1. Konstruktor ma nazwę identyczną jak klasa:
     *      - Klasa:        public class User
     *      - Konstruktor:        public User()
     *
     *  2. Konstruktor wykona swoje instrukcje za każdym razem, kiedy tworzony jest nowy obiekt User,
     *     na przykład:
     *                  User user = new User(); <--- Kod w innej klasie.
     *
     *  W tym przypadku, kiedy nowy obiekt strony jest tworzony:
     *      - Tworzymy nowego Faker'a
     *      - Tworzymy nowy Generator
     *      - Przypisujemy losowe dane do zmiennych.
     */
    public User() {
        faker = new Faker();
        generate = new Generate();
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        password = faker.internet().password();
        city = faker.address().city();
        postalCode = "12-123";
        street = faker.address().streetAddress();
        houseNumber = faker.number().digit();
        email = generate.email();
        printUser();
    }

    /**
     * Wypisuje kolejne informacje o użytkowniku w konsoli.
     */
    public void printUser() {
        System.out.println("User data used in test:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Password: " + password);
        System.out.println("City: " + city);
        System.out.println("Postal Code: " + postalCode);
        System.out.println("Street: " + street);
        System.out.println("House Number: " + houseNumber);
        System.out.println("Email: " + email);
    }
}