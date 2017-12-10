package organization.Logger;

import java.io.*;

/**
 * Created by gosha on 07.12.2017.
 */
public class WorkFile{

    public void fileWrite(String DocLK, String Doc){
        synchronized (this) {
            try {
                FileWriter file = new FileWriter("file.txt", true);
                file.write(DocLK + Doc + '\n');
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void getFile() {
        synchronized (this) {
            try {
                    FileReader reader = new FileReader("file.txt");
                    int c;
                    System.out.print("THREAD: ");
                    while ((c = reader.read()) != -1) {

                        System.out.print((char) c);
                    }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
