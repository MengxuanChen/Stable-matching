import java.util.Queue;

public class Company {
    private String name;
    private boolean match;
    private Queue rank;

    public Company(String name, boolean match, Queue rank){
        this.name=name;
        this.match=match;
        this.rank=rank;
    }

    public String getName() {
        return name;
    }

    public boolean isMatch() {
        return match;
    }

    public Queue getRank(){
        return rank;
    }

    public void setMatch(boolean match) {
        this.match = match;
    }
}
