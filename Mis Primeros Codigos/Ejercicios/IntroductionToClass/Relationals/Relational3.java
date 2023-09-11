public class Relational3 {
  public static void main(String[] args) 
  {
    double recommendedWaterInTake = 8;
    double daysInChallenge = 30;
    double yourWaterInTake = 235.5;
    double totalRecommendedAmount = recommendedWaterInTake*daysInChallenge; 
    boolean isChallengeCompleted = yourWaterInTake >= totalRecommendedAmount;
    System.out.println(isChallengeCompleted);
  }
}
