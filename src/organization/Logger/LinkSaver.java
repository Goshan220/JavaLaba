package organization.Logger;

import organization.docs.IDocumentCreator;
import organization.worker.Man;
import organization.worker.Organization;

import java.util.ArrayList;

/**
 * Created by gosha on 15.10.2017.
 */
public class LinkSaver {

    public LinkSaver(){
        Runnable logger = new Logger();
        Thread loggerThread = new Thread(logger);
        loggerThread.start();
    }
    private ArrayList<IDocumentCreator> list = new ArrayList();
    private Logger logger = new Logger();

    public void addLink(IDocumentCreator document){
        list.add(document);
        EventListener event = new Event("Добавлен: ");
        logger.updArray(document, "ADD", 0);
        logger.update(event, document);
    }

    public void delLink(int n){
        EventListener event = new Event("Удалён: ");
        n-=1;
        logger.updArray(list.get(n), "REM", n);
        logger.update(event, list.get(n));
        list.remove(n);
//        for (int i=0; i<list.size(); i++){
//            System.out.println( (i+1) + ": " + list.get(i).getDocument());
//        }
    }

    public void showLink(){
        for (int i=0; i<list.size(); i++){
            System.out.println( (i+1) + ": " + list.get(i).getDocument());
        }
    }

    public void editLink(int numb, Man man, Organization org){
        EventListener event = new Event("Редактирован: ");
        logger.update(event, list.get(numb));

        list.get(numb).editDoc(man, org);

    }
}