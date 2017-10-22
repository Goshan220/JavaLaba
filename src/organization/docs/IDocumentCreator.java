package organization.docs;

import organization.worker.Man;
import organization.worker.Organization;

/**
 * Created by student on 05.09.2017.
 */
public interface IDocumentCreator {
    String getMan();
    String getDocument();
    void editDoc(Man man, Organization org);
}
