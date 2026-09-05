import java.util.*;

class PlacementShortlistingRankingEngine {

    private final String name;
    private final double cgpa;
    private final int codingScore;

    public PlacementShortlistingRankingEngine(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.0;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    public PlacementShortlistingRankingEngine(double cgpa, int codingScore, String name) {
        this.cgpa = cgpa;
        this.codingScore = codingScore;
        this.name = name;
    }

    private double getCompositeScore() {
        return (cgpa * 10) + (codingScore / 2.0);
    }

    public int compareTo(PlacementShortlistingRankingEngine other) {
        return Double.compare(other.getCompositeScore(), this.getCompositeScore());
    }

    static String shortlistAndRank(PlacementShortlistingRankingEngine[] candidates) {

        int count = 0;

        for (PlacementShortlistingRankingEngine candidate : candidates) {
            if (isEligible(candidate.cgpa) ||
                isEligible(candidate.cgpa, candidate.codingScore)) {
                count++;
            }
        }

        PlacementShortlistingRankingEngine[] shortlisted =
            new PlacementShortlistingRankingEngine[count];

        int index = 0;

        for (PlacementShortlistingRankingEngine candidate : candidates) {
            if (isEligible(candidate.cgpa) ||
                isEligible(candidate.cgpa, candidate.codingScore)) {

                shortlisted[index] = candidate;
                index++;
            }
        }

        Arrays.sort(shortlisted);

        String result = "";

        for (int i = 0; i < shortlisted.length; i++) {

            result += (i + 1) + ". "
                    + shortlisted[i].name
                    + " (" + String.format("%.1f",
                    shortlisted[i].getCompositeScore()) + ")";

            if (i < shortlisted.length - 1) {
                result += " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            
            PlacementShortlistingRankingEngine[] candidates =
                    new PlacementShortlistingRankingEngine[n];
            
            for (int i = 0; i < n; i++) {
                
                String name = sc.nextLine();
                double cgpa = sc.nextDouble();
                int codingScore = sc.nextInt();
                sc.nextLine();
                
                candidates[i] =
                        new PlacementShortlistingRankingEngine(
                                name, cgpa, codingScore
                        );
            }
            
            System.out.println(shortlistAndRank(candidates));
        }
    }
}