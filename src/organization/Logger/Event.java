package organization.Logger;

import organization.docs.IDocumentCreator;

import java.util.Date;

/**
 * Created by gosha on 15.10.2017.
 */
public class Event implements EventListener{

    String string;
    Date time;

    Event(String str, Date time){
        string = str;
        this.time = time;
    }

    @Override
    public void update(EventListener eventListener, IDocumentCreator documentCreator) {
        System.out.println("Date: " + time.getDate() + " Time" + time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds());
        System.out.println(string + documentCreator.getDocument());
    }
}