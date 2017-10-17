package organization.Logger;

import organization.docs.IDocumentCreator;

/**
 * Created by gosha on 15.10.2017.
 */
public class Logger implements EventListener{

//    void getUpd(EventListener eventListener, IDocumentCreator doc){
//        eventListener.update("Добавлен: ", doc);
//    }
//
//    void getRemove (EventListener eventListener, int n, IDocumentCreator doc){
//        eventListener.update("Удалён документ с номером: "+ n + " ", doc);
//    }



    @Override
    public void update (EventListener eventListener, IDocumentCreator doc) {
//        System.out.println("LOGGER" + doc.getDocument());
        eventListener.update(eventListener, doc);
    }
}
