package ch.hslu.oop.sw09;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class OwnScanner {

    private static final Logger LOG = LogManager.getLogger(OwnScanner.class);

    public static void main(String[] args) {

        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            LOG.info("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            if (input == "exit")
                    break;
            float value;
            try {
                value = Float.valueOf(input);
                LOG.info("Eingegebene Temparatur: " + input);
                Temparatur.createFromCelsius(value);
            } catch (NumberFormatException e) {
                LOG.error(e.getMessage());
            } catch (IllegalArgumentException e) {
                LOG.info(e.getMessage());
            }
        } while (!input.equals("exit"));
        LOG.info("Programm beendet.");
    }
}
