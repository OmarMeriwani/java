// Write your Checker class here
class Checker implements Comparator<Player>
{
    public int compare(Player a, Player b)
    {
        //System.out.println(a.score + " , " + b.score);
        return b.score - a.score;
        //return 1;
    }
}