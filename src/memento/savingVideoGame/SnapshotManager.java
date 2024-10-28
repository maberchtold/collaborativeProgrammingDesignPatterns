package memento.savingVideoGame;

import java.util.Stack;

public class SnapshotManager {
    private Stack<Player.Snapshot> snapshots = new Stack<>();

    public void saveGame(Player.Snapshot snapshot){
        snapshots.push(snapshot);
    }

    public void loadGame(Player player){
        player.restore(snapshots.pop());
    }
}
