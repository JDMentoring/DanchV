package ua.smartprog.bankProject.other;

import org.apache.log4j.Logger;
import ua.smartprog.bankProject.domain.Account;

import java.io.*;

public class Serializator {

    private static final Logger log = Logger.getLogger(Account.class);

    public static Object getData(String filename) throws IOException {
        FileInputStream fileOut = null;
        ObjectInputStream objOut = null;
        Object temp = new Object();

        try {
            fileOut = new FileInputStream(filename + ".ser");
            objOut = new ObjectInputStream(fileOut);
            temp = objOut.readObject();
            log.info("Deserialized!!");

            log.info("Finish all streams!!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!");
            log.error("File not found!!!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Object not found!!!");
            log.error("Object not found!!!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            fileOut.close();
            objOut.close();
        }
        return temp;
    }


    public static void saveData(String filename, Object accObject) throws IOException {
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        try {
            fileOut = new FileOutputStream(filename + ".ser");
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(accObject);
            log.info("Serialized!!");

            log.info("Finish all streams!!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!");
            log.error("File not found!!!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Object not found!!!");
            log.error("Object not found!!!");
            e.printStackTrace();
        } finally {
            fileOut.close();
            objOut.close();
        }
    }
}
