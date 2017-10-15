package organization.Logger;

/**
 * Created by gosha on 15.10.2017.
 */
public class Event implements EventListener{

    String string;

    Event(String str){
        string = str;
    }

    @Override
    public void update() {
        System.out.println("Event say: "+ string);
    }
}
