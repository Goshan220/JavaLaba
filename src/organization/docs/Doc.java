package organization.docs;

import organization.worker.Man;
import organization.worker.Organization;

/**
 * Created by student on 05.09.2017.
 */
public class Doc implements IDocumentCreator {

    private Man man;
    private Organization org;

    Doc(Man man, Organization org){
        this.man = man;
        this.org = org;
    }

    public String getDocument() {
        return "Этот DOC файл подготовлен Организацией: " + org.getName() + ", сотрудником: " +
                man.getSurname() + man.getName() + man.getPatr();
    }
}
