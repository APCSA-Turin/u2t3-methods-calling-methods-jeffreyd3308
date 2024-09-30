public class Game {
    //instance variables
    private String gameName;
    private int players;
    private int score;

    //constructor
    public Game(String gameName, int players) {
        this.gameName = gameName;
        this.players = players;
        score = 0;
    }

    //getters
    public int getPlayers() {
        return players;
    }

    public String getGameName() {
        return gameName;
    }

    public int getScore() {
        return score;
    }

    //methods
    public void addPlayer() {
        players++;
    }

    public void increaseScore(int increase) {
        score += increase;
    }

    public double averageScorePerPlayer() {
        return (double) score / players;
    }

    public boolean isGameOver() {
        if (score > 9) {
            return true;
        } else {
            return false;
        }
    }

    //new methods
    public void disqualifyPlayer() {
        players--;
    }

    public void decreaseScore(int decrease) {
        score -= decrease;
    }
}
