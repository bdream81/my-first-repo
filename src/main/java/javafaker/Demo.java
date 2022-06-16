package javafaker;

import com.github.javafaker.Faker;

public class Demo {
       protected static Faker faker = new Faker();
    public static void main(String[] args) {

        System.out.println(generateFakeFirstName());
        System.out.println(generateFakeLastName());
        System.out.println(generateFakeEmailAddress());
        System.out.println(generateFakeArtistName());
        System.out.println(generateFakeAnimalName());
        System.out.println(generateFakeProgramName());
    }
    public static String generateFakeFirstName(){
        return "Hello, my name is " + faker.name().firstName();

    }
    public static String generateFakeLastName(){
        return "Sure name is " + faker.name().lastName();
    }
    public static String generateFakeEmailAddress(){
        return "email: " + faker.internet().emailAddress();
    }
    public static String generateFakeArtistName(){
        return "Artist name is " + faker.artist().name();
    }
    public static String generateFakeAnimalName(){
        return "Animal name is " + faker.animal().name();
    }
    public static String generateFakeProgramName(){
        return faker.programmingLanguage().name();
    }
}
