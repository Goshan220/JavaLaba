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
//        return new Doc(man, org);
    }
    public IDocumentCreator getDocLK(Man man, Organization org){
        IDocumentCreator doc = new DocLK(man, org);
        ls.addLink(doc);
        return doc;
//        return new DocLK(man, org);
    }
}
