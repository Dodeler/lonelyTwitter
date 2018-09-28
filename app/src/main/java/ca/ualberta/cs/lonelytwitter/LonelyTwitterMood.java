package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class LonelyTwitterMood {
    protected Date date;

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract String getMood();

}