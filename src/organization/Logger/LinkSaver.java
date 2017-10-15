package organization.Logger;

import organization.docs.IDocumentCreator;

import java.util.ArrayList;

/**
 * Created by gosha on 15.10.2017.
 */
public class LinkSaver {

    private ArrayList<IDocumentCreator> list = new ArrayList();
    private Logger logger = new Logger();

    public void addLink(IDocumentCreator document){
        list.add(document);
        EventListener event = new Event(document.getDocument());
        logger.getUpd(event);
    }

    public void delLink(int n){
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

    public void editLink(){

    } //TODO сделать редактирование объектов находящихся в списке
}
