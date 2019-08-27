package _02_VariablesAndDataTypes;

public class _17_GreaterThanEqualTo {
    public static void main(String[] args) {
        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;
        double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
        System.out.println(totalRecommendedAmount);
        boolean isChallengeComplete = (yourWaterIntake >= totalRecommendedAmount);
        System.out.println(isChallengeComplete);
    }
}
