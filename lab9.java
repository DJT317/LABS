public class Main {
    public static void main(String[] args) {
        
        // Q1. Print each character's name from the array.
        String[] characters = {"Harry", "Hermione", "Ron", "Draco", "Luna"};
        for (String character : characters) {
            System.out.println(character);
        }
        
        // Q2. Use string interpolation to print a welcome message.
        String firstName = "Harry";
        String house = "Gryffindor";
        System.out.println("Welcome, " + firstName + " of " + house + "!");
        
        // Q3. Convert and print characterName in both lowercase and uppercase.
        String characterName = "Hermione";
        System.out.println(characterName.toLowerCase());
        System.out.println(characterName.toUpperCase());
        
        // Q4. Trim the leading and trailing spaces from spell and print.
        String spell = " Expelliarmus ";
        System.out.println(spell.trim());
        
        // Q5. Extract and print the word 'swear' using substring().
        String quote = "I solemnly swear that I am up to no good";
        System.out.println(quote.substring(12, 17));  // Extracts 'swear'
        
        // Q6. Use concat() to combine firstName and lastName.
        String lastName = "Weasley";
        System.out.println(firstName.concat(" ").concat(lastName));
        
        // Q7. Replace 'good' with 'bad' in the sentence.
        String sentence = "Draco is a good wizard";
        System.out.println(sentence.replace("good", "bad"));
        
        // Q8. Add 'Slytherin' to the houses array using add() and remove it with remove().
        java.util.List<String> houses = new java.util.ArrayList<>();
        houses.add("Gryffindor");
        houses.add("Hufflepuff");
        houses.add("Ravenclaw");
        houses.add("Slytherin");  // Add 'Slytherin'
        houses.remove(houses.size() - 1);  // Remove the last element
        System.out.println(houses);
        
        // Q9. Add 'Accio' to the beginning of spells using add(0, "Accio") and remove the first element.
        java.util.List<String> spells = new java.util.ArrayList<>();
        spells.add("Alohomora");
        spells.add("Lumos");
        spells.add("Nox");
        spells.add(0, "Accio");  // Add 'Accio' at the beginning
        spells.remove(0);  // Remove the first element
        System.out.println(spells);
        
        // Q10. Create a new array from the second and third elements using subList().
        java.util.List<String> professors = new java.util.ArrayList<>();
        professors.add("Dumbledore");
        professors.add("McGonagall");
        professors.add("Snape");
        professors.add("Hagrid");
        java.util.List<String> newProfessors = professors.subList(1, 3);  // Second and third elements
        System.out.println(newProfessors);
        
        // Q11. Remove 2 elements starting from index 1 using removeRange().
        java.util.List<String> students = new java.util.ArrayList<>();
        students.add("Neville");
        students.add("Seamus");
        students.add("Dean");
        students.add("Parvati");
        students.subList(1, 3).clear();  // Remove 2 elements starting from index 1
        System.out.println(students);
        
        // Q12. Trim, convert to lowercase, and concatenate phrase with ' - Harry'.
        String phrase = " Mischief Managed ";
        String result = phrase.trim().toLowerCase() + " - Harry";
        System.out.println(result);
        
        // Q13. Add 'Luna' and 'Draco' to the wizards array using add().
        java.util.List<String> wizards = new java.util.ArrayList<>();
        wizards.add("Harry");
        wizards.add("Hermione");
        wizards.add("Ron");
        wizards.add("Luna");
        wizards.add("Draco");
        System.out.println(wizards);
        
        // Q14. Use substring() to extract 'Hogwarts' and concat() it with ' Castle'.
        String message = "Welcome to Hogwarts School of Witchcraft and Wizardry";
        String extracted = message.substring(11, 19);  // Extracts 'Hogwarts'
        String finalMessage = extracted.concat(" Castle");
        System.out.println(finalMessage);  // "Hogwarts Castle"
    }
}
