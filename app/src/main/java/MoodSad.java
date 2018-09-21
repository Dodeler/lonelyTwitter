import java.util.Date;

public class MoodSad extends LonelyTwitterMood {
    private String mood = "I am sad!";
    public MoodSad(Date date){
        this.date = date;
    }
    public MoodSad(){
        this.date = new Date();
    }
    public String getMood(){
        return this.mood;
    }

}