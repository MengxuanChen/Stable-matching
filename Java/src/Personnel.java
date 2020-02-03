public class Personnel {
    private String name;
    private boolean match;
    private String [] rank;

    public Personnel(String name, boolean match, String [] rank){
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

    public String [] getRank(){
        return rank;
    }

    public void setMatch(boolean match) {
        this.match = match;
    }
}
