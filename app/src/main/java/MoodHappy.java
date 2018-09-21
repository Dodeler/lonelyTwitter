import java.util.Date;

public class MoodHappy extends LonelyTwitterMood {
    private String mood = "I am happy!";
    public MoodHappy(Date date){
        this.date = date;
    }
    public MoodHappy(){
        this.date = new Date();
    }
    public String getMood(){
        return this.mood;
    }

}