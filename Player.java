package gravyt;

public interface Player {
    public int makeNextMove();

    public String getPlayerName();

    public void setMark(Mark mark);

    public Mark getMark();

    public void setPlayerName(String name);
}
