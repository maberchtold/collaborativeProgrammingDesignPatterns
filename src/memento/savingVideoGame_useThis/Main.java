package memento.savingVideoGame_useThis;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(0, 0, 0);
        SnapshotManager snapshotManager = new SnapshotManager();


        player.moveTo(2,2);
        player.increaseScore(50);
        System.out.println("Player moves to "+player.getX()+","+player.getY()+" Score:"+player.getScore());
        player.moveTo(3,3);
        player.increaseScore(50);
        System.out.println("Player moves to "+player.getX()+","+player.getY()+" Score:"+player.getScore());
        snapshotManager.saveGame(player.save());
        player.moveTo(4,4);
        player.increaseScore(50);
        System.out.println("Player moves to "+player.getX()+","+player.getY()+" Score:"+player.getScore());
        snapshotManager.loadGame(player);
        System.out.println("Player moves to "+player.getX()+","+player.getY()+" Score:"+player.getScore());
    }
}
