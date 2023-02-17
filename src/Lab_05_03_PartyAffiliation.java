public class Lab_05_03_PartyAffiliation {
    public static void main(String[] args) {
        //the prompt for an input//
        System.out.println("What is your political party affiliation? (D for Democrat / R for Republican / I for Independent / Other for other)");
        //input with an imaginary scanner object//
        String input = " ";
        // if else statements to parse through the input //
        if(input == "D" ){
            System.out.println("You are a Democratic Donkey");
        }
        else if (input == "R") {
            System.out.println("You are a Republican Elephant");
        }
        else if (input == "I") {
            System.out.println("You are an Independent Human");
        }
        else {
            System.out.println("You are political affiliation is stated as Other");
        }
    }
}
