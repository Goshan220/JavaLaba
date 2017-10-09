package organization.docs;

import organization.worker.Man;
import organization.worker.Organization;

public class DocFactory {
    public IDocumentCreator getDoc(Man man, Organization org){
        return new Doc(man, org);
    }
    public IDocumentCreator getDocLK(Man man, Organization org){
        return new DocLK(man, org);
    }
}
