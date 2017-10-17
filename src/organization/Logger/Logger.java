package organization.Logger;

/**
 * Created by gosha on 15.10.2017.
 */
public class Logger implements EventListener{


    void getUpd(EventListener eventListener){
        eventListener.update();
    }

    @Override
    public void update() {
    }
}
