package _02_VariablesAndDataTypes;

public class _21_Magic {
    public static void main(String[] args) {
        int myNumber = 54;
        // We will refer to this variable as
        // original number
        int stepOne = myNumber * myNumber;   // mN^2
        int stepTwo = stepOne + myNumber;    // mN*(mN+1)
        int stepThree = stepTwo / myNumber;  // mN+1
        int stepFour = stepThree + 17;       // mN+18
        int stepFive = stepFour - myNumber;  // 18
        int stepSix = stepFive / 6;          // 3
        System.out.println(stepSix);
    }
}
