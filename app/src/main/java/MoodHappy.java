import java.util.Date;

public class MoodHappy extends LonelyTwitterMood {
    private String mood = "I am happy!";
    public MoodHappy(Date date){
        this.date = date;
    }
    public MoodHappy(){
        this.date = Date.Date();
    }
    public String getMood(){
        return this.mood;
    }

}