package organization.docs;

import organization.Logger.LinkSaver;
import organization.worker.Man;
import organization.worker.Organization;

public class DocFactory {
    public LinkSaver ls = new LinkSaver();

    public IDocumentCreator getDoc(Man man, Organization org){
        IDocumentCreator doc = new Doc(man, org);
        ls.addLink(doc);
        return doc;
    }
    public IDocumentCreator getDocLK(Man man, Organization org){
        System.out.println("test");
        IDocumentCreator doc = new DocLK(man, org);
        ls.addLink(doc);
        return doc;
    }
}
