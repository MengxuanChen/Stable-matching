import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Student {
    private String name;
    private boolean match;
    private List<String> rank;

    public Student(String name, boolean match, List<String> rank){
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

    public List<String> getRank(){
        return rank;
    }

    public void setMatch(boolean match) {
        this.match = match;
    }
}
