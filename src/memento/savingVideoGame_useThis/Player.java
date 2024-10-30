package memento.savingVideoGame_useThis;

public class Player {
    private int x;
    private int y;
    private int score;

    public Player(int x, int y, int score) {
        this.x = x;
        this.y = y;
        this.score = score;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void increaseScore(int score) {
        this.score += score;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getScore() {
        return score;
    }

    public Snapshot save(){
        return new Snapshot(this);
    }

    public void restore(Snapshot snapshot){
        this.x = snapshot.getX();
        this.y = snapshot.getY();
        this.score = snapshot.getScore();
    }

    public static class Snapshot{
        private final int x;
        private final int y;
        private final int score;

        private Snapshot(Player player) {
            this.x = player.x;
            this.y = player.y;
            this.score = player.score;
        }

        private int getX() {
            return x;
        }

        private int getY() {
            return y;
        }

        private int getScore() {
            return score;
        }
    }
}
