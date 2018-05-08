package ch.hslu.oop.sw11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ReadTemparatureFile {

    final public static Logger LOG = LogManager.getLogger(ReadTemparatureFile.class);

    public static void main(String args[]) {
        LOG.info("Program started.");
        ReadTemparatureFile readtemp = new ReadTemparatureFile();
        readtemp.readFile("D:\\HSLU\\I.BA_OOP.F1801\\SW11\\netatmo-export-201801-201804.csv");
    }


    public void readFile(final String file) {
        try(final BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int lines = 0;
            float maxtemp = 0;
            float maxhumidity = 0;
            while ((line = br.readLine()) != null) {
                lines++;
                String splitstring[] = line.split(";");

                String id;
                LocalDateTime timestamp;
                float temparature;

                try {
                    id = getStringSegment(splitstring, 0);
                    timestamp = getDataTime(getStringSegment(splitstring, 1));
                    temparature = getFloat(getStringSegment(splitstring, 2));

                } catch (Exception e) {
                    LOG.error("Line {} caused error! Ignored!", lines);
                    continue;
                }

                if (temparature > maxtemp){
                    maxtemp = temparature;
                }

            }
            LOG.info("Anzahl Einträge: {}", lines);
            LOG.info("Max Temparatur: {}", maxtemp);
        } catch (FileNotFoundException e) {
            LOG.error("File not found");
        } catch (IOException e) {
            LOG.error("IOException");
        }
    }

    public Float getFloat(final String input) {
        try {
            return Float.parseFloat(input);
        } catch (NumberFormatException e) {
            LOG.error("String: {} is not parsable to Float.", input);
            throw e;
        }
    }

    public LocalDateTime getDataTime(final String input) {
        try {
            return LocalDateTime.parse(input,
                    DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        } catch (DateTimeParseException e) {
            LOG.error("String: {} is not parsable to LocalDateTime", input);
            throw e;
        }
    }

    public String getStringSegment(String[] splitstring, int segment) {
        try {
            return splitstring[segment];
        } catch (NullPointerException e) {
            LOG.error("Segment {} not found!", segment);
            throw e;
        }
    }
}
