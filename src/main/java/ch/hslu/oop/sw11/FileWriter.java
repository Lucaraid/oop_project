package ch.hslu.oop.sw11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class FileWriter {

    private final static Logger LOG = LogManager.getLogger(FileWriter.class);

    public static void main(String args[]) {
        writeInt("test.txt", 2);
        writeString("test2.txt", "Hallo");
        LOG.info("readInt Output: " + readInt("test.txt"));
    }

    public static void writeInt(final String file, final int input) {
        try (DataOutputStream dis = new DataOutputStream(new FileOutputStream(file))){
            dis.writeInt(input);
            dis.flush();
        } catch (FileNotFoundException e) {
            LOG.error("File not found");
        } catch (IOException e) {
            LOG.error("IOException");
        }
        LOG.info("File written in: " + file);
    }

    public static void writeString(final String file, final String input) {
        try (DataOutputStream dis = new DataOutputStream(new FileOutputStream(file))){
            dis.writeBytes(input);
        } catch (FileNotFoundException e) {
            LOG.error("File not found");
        } catch (IOException e) {
            LOG.error("IOException");
        }
        LOG.info("File written in: " + file);
    }

    public static int readInt(final String file) {
        int result;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            return result = dis.readInt();
        } catch (FileNotFoundException e) {
            LOG.error("File not found");
        } catch (IOException e) {
            LOG.error("IOException");
        }
        return Integer.MAX_VALUE;
    }
}
