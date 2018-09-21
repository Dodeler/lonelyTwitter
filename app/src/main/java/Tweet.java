import java.util.Date;

public abstract class Tweet {
    protected String message;
    protected Date date;
    protected LonelyTwitterMood mood;

    public void setMessage(String message) throws ExceptionMessageTooLong{
        if (this.message.length() > 140){
            throw new ExceptionMessageTooLong();
        }
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }

    public abstract Boolean isImportant();


}
