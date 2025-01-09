class Bowler {
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;
    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }
    public Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }
    public void computeBowlingAverage() {
        if (isValidInput()) {
            if (wickets > 0) {
                double bowlingAverage = (double) runsConceded / wickets;
                System.out.println("Name: " + name);
                System.out.println("bowling_avg=" + bowlingAverage);
            } else {
                System.out.println("Name: " + name);
                System.out.println("bowling_avg=Infinity (wickets = 0)");
            }
        }
    }
    public void showStatistics() {
        if (isValidInput()) {
            System.out.println("Name=" + name);
            System.out.println("wickets=" + wickets);
            System.out.println("matches=" + matches);
            System.out.println("balls_bowled=" + ballsBowled);
            System.out.println("runs_conceded=" + runsConceded);
        }
    }
    public void computeStrikeRate() {
        if (isValidInput()) {
            if (ballsBowled > 0) {
                double strikeRate = (double) runsConceded / ballsBowled;
                System.out.println("Name: " + name);
                System.out.println("Strike_rate=" + strikeRate);
            } else {
                System.out.println("Name: " + name);
                System.out.println("Strike_rate=Infinity (balls_bowled = 0)");
            }
        }
    }
    private boolean isValidInput() {
        if (wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0) {
            System.out.println("Error");
            return false;
        }
        if (matches == 0 && (runsConceded > 0 || ballsBowled > 0)) {
            System.out.println("Error");
            return false;
        }
        return true;
    }
}

public class ps003 {
    public static void main(String[] args) {

        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);
        bowler.showStatistics();

        bowler.computeBowlingAverage();
        bowler.computeStrikeRate();
    }
}

