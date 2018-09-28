package ca.ualberta.cs.lonelytwitter;

public class TweetImportant extends Tweet {
    @Override
    public Boolean isImportant(){
        return true;
    }
    public String toString(){
        return this.date.toString()+" | "+this.message;
    }
}
