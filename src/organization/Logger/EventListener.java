package organization.Logger;
import organization.docs.IDocumentCreator;

import java.util.Date;

/**
 * Created by gosha on 15.10.2017.
 */

public interface EventListener {
    void update(EventListener eventListener, IDocumentCreator documentCreator);
}
