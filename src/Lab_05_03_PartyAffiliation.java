public class Lab_05_03_PartyAffiliation {
    public static void main(String[] args) {
        System.out.println("What is your political party affiliation? (D for Democrat / R for Republican / I for Independent / Other for other)");
        String input = "Googoo gaa gaa";
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
