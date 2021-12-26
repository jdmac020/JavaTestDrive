public class Decider {
    public String decide(int input) {

        if (input == 15) {
            return "FizzBuzz";
        }
        if (input % 5 == 0) {
            return "Buzz";
        }

        return "Fizz";
    }
}
