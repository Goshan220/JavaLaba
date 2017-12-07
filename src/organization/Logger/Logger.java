package organization.Logger;

import organization.docs.IDocumentCreator;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

/**
 * Created by gosha on 15.10.2017.
 */
public class Logger implements EventListener, Runnable {

    private static ArrayList<IDocumentCreator> createList = new ArrayList();
    private static ArrayList<EventListener> event = new ArrayList();
    private static ArrayList<Integer> listToDel = new ArrayList();
    private static ArrayList<IDocumentCreator> updateList = new ArrayList();
    private static int keyADD = 0;
    private static int keyDEL = 0;
    private static int keyUPD = 0;

    @Override
    public void update(EventListener eventListener, IDocumentCreator doc) {
        event.add(eventListener);
        eventListener.update(eventListener, doc);
    }

    void updArray(IDocumentCreator doc, String key, int n) {
        switch (key) {
            case "ADD":
                createList.add(doc);
                keyADD++;
                break;
            case "REM":
                listToDel.add(n);
                keyDEL++;
                break;
            case "UPD":
                updateList.add(doc);
                keyUPD++;
                break;
        }
    }

    int time = 0;

    private void logger() {
        WorkFile wf = new WorkFile();
        while (true) {
            try {
                sleep(5000);
                time += 5;
                String temp = "LOGGER_TIME: " + time;
                System.out.println(temp);
                wf.fileWrite(temp, " ");
//                System.out.println(keyADD); //для отладки
//                System.out.println(keyDEL);

                if (keyADD != 0) {
                    int len = createList.size() - keyADD;
                    for (int i = len; i < createList.size(); i++) {

                        System.out.println("LOGGER_ADD: " + createList.get(i).getMan() + createList.get(i).getClass());
                    }
                }
                if (keyDEL != 0) {
                    for (int i = 0; i < listToDel.size(); i++) {
                        System.out.println("LOGGER_REMOVE: " + createList.get(listToDel.get(i).intValue()).getDocument());
                        createList.remove(listToDel.get(i).intValue());
                    }
                }
                if (keyUPD != 0) {
                    for (int i = 0; i < updateList.size(); i++) {
                        for (int j = 0; j < createList.size(); j++) {
                            if (updateList.get(i).getDocument() == createList.get(j).getDocument()) {
                                System.out.println("LOGGER_UPDATE: " + updateList.get(i).getDocument());
                                createList.set(j, updateList.get(i));
                            }
                        }
                    }
                }

                keyADD = 0;
                keyDEL = 0;
                keyUPD = 0;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        logger();
    }
}
