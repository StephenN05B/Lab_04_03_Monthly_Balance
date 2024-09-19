public class Main {
    public static void main(String[] args)
    {
        double initialBalance = 5000;
        double INTEREST_RATE = .17;
        double firstMonth = 0;
        double secondMonth = 0;
        double interestFees = 0;
        double secondFees = 0;

        interestFees = initialBalance * INTEREST_RATE;

       firstMonth = interestFees;

       secondFees = interestFees * INTEREST_RATE;

       secondMonth = interestFees + secondFees;


        System.out.println("Your amount due for the first month is " + firstMonth + "Your amount due for the second month is " + secondMonth);

    }
}