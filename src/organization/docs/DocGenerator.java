package organization.docs;

import organization.worker.Man;
import organization.worker.Organization;

/**
 * Created by Pelmenulka on 17.09.2017.
 * Edited by Pelmenulka and pelmailnik on 19.09.20017.
 */
public class DocGenerator {
    IDocumentCreator dc;

    public void setDocGen(IDocumentCreator dc) {
        this.dc = dc;
    }

    public String getDocument(Man man, Organization organization){
        return dc.getDocument();
    }

}
