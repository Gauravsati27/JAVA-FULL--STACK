import java.util.Scanner;
public class Cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String playerName = sc.next();
        int totalRuns = sc.nextInt();
        int totalBalls = sc.nextInt();
        int totalInnings = sc.nextInt();
        int timesOut = sc.nextInt();

        Player p=new Player();
        p.setPlayerName(playerName);
        p.setTotalRuns(totalRuns);
        p.setTotalBalls(totalBalls);
        p.setTotalInnings(totalInnings);
        p.setPlayerGetOut(timesOut);

        System.out.println(p.toString());
        sc.close();
    }
}
class Player{
    private String playerName;
    private int totalRuns;
    private int totalBalls;
    private  int totalInnings;
    private int playerGetOut;

    public Player(){}

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getTotalBalls() {
        return totalBalls;
    }

    public void setTotalBalls(int totalBalls) {
        this.totalBalls = totalBalls;
    }

    public int getTotalInnings() {
        return totalInnings;
    }

    public void setTotalInnings(int totalInnings) {
        this.totalInnings = totalInnings;
    }

    public int getPlayerGetOut() {
        return playerGetOut;
    }

    public void setPlayerGetOut(int playerGetOut) {
        this.playerGetOut = playerGetOut;
    }

    public String getBattingAvg(){
        if(playerGetOut == 0) return "Infinity";
        return String.format("%.1f", (double) totalRuns / playerGetOut);
    }
    public String getStrikeRate() {
        if (totalBalls == 0) return "0";
        return String.format("%.2f", (double) totalRuns / totalBalls * 100);
    }
    public String getPerformance() {
        double sr = totalBalls == 0 ? 0 : (double) totalRuns / totalBalls * 100;
        if (sr >= 150) return "Explosive";
        else if (sr >= 100) return "Good";
        else return "Needs Improvement";
    }
    public String toString() {
        return "Player Performance Summary:\n" +
                "Player Name : " + playerName + "\n" +
                "Total Runs : " + totalRuns + "\n" +
                "Balls Faced : " + totalBalls + "\n" +
                "Innings : " + totalInnings + "\n" +
                "Times Out : " + playerGetOut + "\n" +
                "Batting Avg : " + getBattingAvg() + "\n" +
                "Strike Rate : " + getStrikeRate() + "\n" +
                "Performance : " + getPerformance();
    }
}