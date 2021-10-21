package players;

import core.GameState;
import utils.Types;

import java.util.Calendar;

public class MillisecondPlayer extends Player {

    public MillisecondPlayer(long seed, int id) {
        super(seed, id);
        reset(seed, id);
    }

    @Override
    public void reset(long seed, int playerID) {
        super.reset(seed, playerID);
    }

    @Override
    public Types.ACTIONS act(GameState gs) {
        int actionIdx = Calendar.getInstance().get(Calendar.MILLISECOND) % gs.nActions();
        return Types.ACTIONS.all().get(actionIdx);
    }

    @Override
    public int[] getMessage() {
        return new int[Types.MESSAGE_LENGTH];
    }

    @Override
    public Player copy() {
        return new MillisecondPlayer(seed, playerID);
    }
}
