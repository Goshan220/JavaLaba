package organization.Logger;

import organization.docs.IDocumentCreator;

/**
 * Created by gosha on 15.10.2017.
 */
public class Event implements EventListener{

    String string;

    Event(String str){
        string = str;
    }

    @Override
    public void update(EventListener eventListener, IDocumentCreator documentCreator) {
        System.out.println(string + documentCreator.getDocument());
    }
}