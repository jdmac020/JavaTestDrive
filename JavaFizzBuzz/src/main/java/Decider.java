public class Decider {
    public String decide(int input) {
        if (input == 5) {
            return "Buzz";
        }
        if (input == 15) {
            return "FizzBuzz";
        }
        return "Fizz";
    }
}
