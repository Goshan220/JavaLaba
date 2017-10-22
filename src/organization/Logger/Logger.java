package organization.Logger;

import organization.docs.IDocumentCreator;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

/**
 * Created by gosha on 15.10.2017.
 */
public class Logger implements EventListener, Runnable{

    private static ArrayList<IDocumentCreator> updateList = new ArrayList();
    private static ArrayList <Integer>listToDel = new ArrayList();
    private static int keyADD = 0;
    private static int keyDEL = 0;

    @Override
    public void update (EventListener eventListener, IDocumentCreator doc) {
//        eventListener.update(eventListener, doc);
    }

    void updArray(IDocumentCreator doc, String key, int n){
        switch (key){
            case "ADD":
                updateList.add(doc);
                keyADD++;
                break;
            case "REM":
//                updateList.remove(n);
                listToDel.add(n);
                keyDEL++;
                break;
        }
    }

    int time = 0;
    private void logger(){
        try {
            sleep(5000);
            time +=5;
            System.out.println("LOGGER_TIME: " + time);

//            System.out.println(keyADD); //для отладки
//            System.out.println(keyDEL);

            if (keyADD != 0) {
                int len = updateList.size() - keyADD;
                for (int i = len; i < updateList.size(); i++) {
                    System.out.println("LOGGER_ADD: " + updateList.get(i).getMan() + updateList.get(i).getClass());
                }
            }
            if (keyDEL != 0){
                for (int i = 0; i < listToDel.size(); i++){
                    System.out.println("LOGGER_REMOVE: " + updateList.get(listToDel.get(i).intValue()).getDocument());
                    updateList.remove(listToDel.get(i).intValue());
                }
            }

            keyADD = 0;
            keyDEL = 0;
            logger();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        logger();
    }
}
