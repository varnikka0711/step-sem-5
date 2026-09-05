import java.util.*;

public class FantasyAutoDraftQ9X {
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;

    public FantasyAutoDraftQ9X(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    public int compareTo(FantasyAutoDraftQ9X other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }

    static String draftAndRank(FantasyAutoDraftQ9X[] players) {
        int count = 0;

        for (FantasyAutoDraftQ9X player : players) {
            if (isDraftable(player.matchesPlayed) ||
                isDraftable(player.matchesPlayed, player.injured)) {
                count++;
            }
        }

        FantasyAutoDraftQ9X[] draftable = new FantasyAutoDraftQ9X[count];
        int index = 0;

        for (FantasyAutoDraftQ9X player : players) {
            if (isDraftable(player.matchesPlayed) ||
                isDraftable(player.matchesPlayed, player.injured)) {
                draftable[index++] = player;
            }
        }

        Arrays.sort(draftable);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < draftable.length; i++) {
            if (i > 0) {
                result.append(" | ");
            }
            result.append(i + 1).append(". ").append(draftable[i].name);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            FantasyAutoDraftQ9X[] players = new FantasyAutoDraftQ9X[n];
            
            for (int i = 0; i < n; i++) {
                String name = sc.next();
                int matchesPlayed = sc.nextInt();
                double battingAverage = sc.nextDouble();
                boolean injured = sc.nextBoolean();
                
                players[i] = new FantasyAutoDraftQ9X(
                        name, matchesPlayed, battingAverage, injured
                );
            }
            
            System.out.println(draftAndRank(players));
        }
    }
}