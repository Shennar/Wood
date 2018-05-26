package gravyt;

import java.util.Random;

public class PCPlayer implements Player {
    private Mark mark;
    private String playerName="PC Player";

    @Override
    public int makeNextMove() {
        Random rand = new Random();
        return rand.nextInt(7);
    }

    @Override
    public void setMark(Mark mark) {
        this.mark = mark;
    }

    @Override
    public String getPlayerName() {
        return playerName;
    }
    @Override
    public Mark getMark(){
        return mark;
    }

    @Override
    public void setPlayerName(String name){
        playerName = name;
    }
}
