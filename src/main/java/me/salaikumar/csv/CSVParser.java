package me.salaikumar.csv;

import java.util.List;
import java.util.Map;

/**
 * CSV Parser
 * An Attempt to create a Standard CSV Parser in Java
 */
public class CSVParser {

    private final CSVFormat csvFormat;
    private List<Record> records;

    public CSVParser(CSVFormat csvFormat) {
        this.csvFormat = csvFormat;
    }

    public CSVParser parse(String fileLocation){
        return null;
    }

    public List<Record> getAllRecords(){
        return null;
    }

    public Record getRecord(){
        return null;
    }

    public Record getHeaderRecord(){
        return null;
    }

    /*
     * At Attempt to provide Querying capability on CSV files
     * Works with both Header and Non Header CSV files
     * If it works successfull, Try out CRUD on CSV
     */
    public List<Record> find(Map query ){
        return null;
    }

}
