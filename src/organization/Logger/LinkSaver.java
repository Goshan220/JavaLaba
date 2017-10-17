package organization.Logger;

import organization.docs.IDocumentCreator;
import organization.worker.Man;
import organization.worker.Organization;

import java.util.ArrayList;

/**
 * Created by gosha on 15.10.2017.
 */
public class LinkSaver {

    private ArrayList<IDocumentCreator> list = new ArrayList();
    private Logger logger = new Logger();

    public void addLink(IDocumentCreator document){
        list.add(document);
        EventListener event = new Event("Добавлен ");
        logger.update(event, document);
    }

    public void delLink(int n){
        IDocumentCreator document = list.get(n);
        EventListener event = new Event("Удалён ");
        logger.update(event, document);
        n-=1;
        list.remove(n);
        for (int i=0; i<list.size(); i++){
            System.out.println( (i+1) + ": " + list.get(i).getDocument());
        }
    }

    public void showLink(){
        for (int i=0; i<list.size(); i++){
            System.out.println( (i+1) + ": " + list.get(i).getDocument());
        }
    }

    public void editLink(int numb, Man man, Organization org){

        list.get(numb).editDoc(man, org);

    }
}