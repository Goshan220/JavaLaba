package organization.docs;

import organization.worker.Man;
import organization.worker.Organization;

/**
 * Created by Pelmenulka on 17.09.2017.
 */
public class DocLK implements IDocumentCreator {

    private Man man;
    private Organization org;

    DocLK(Man man, Organization org){
        this.man = man;
        this.org = org;
    }

    @Override
    public void editDoc(Man man, Organization org) {
        this.man = man;
        this.org = org;
    }

    public String getDocument() {
        return "Справка выдана Организацией: " + org.getName() + ", сотруднику: " +
                man.getSurname() + man.getName() + man.getPatr();
    }
}
