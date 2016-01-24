package me.salaikumar.csv;

/**
 * CSVFormat
 * Defines a CSV Format
 * Keep it simple.
 */
public class CSVFormat {

    private String  delimiter;
    private String  recordSeparator;
    private Boolean headerPresence;
    private Boolean quotePresence;
    private Boolean whiteSpaceIgnore;

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getRecordSeparator() {
        return recordSeparator;
    }

    public void setRecordSeparator(String recordSeparator) {
        this.recordSeparator = recordSeparator;
    }

    public boolean isHeaderPresence() {
        return headerPresence;
    }

    public void setHeaderPresence(boolean headerPresence) {
        this.headerPresence = headerPresence;
    }

    public boolean isQuotePresence() {
        return quotePresence;
    }

    public void setQuotePresence(boolean quotePresence) {
        this.quotePresence = quotePresence;
    }

    public boolean isWhiteSpaceIgnore() {
        return whiteSpaceIgnore;
    }

    public void setWhiteSpaceIgnore(boolean whiteSpaceIgnore) {
        this.whiteSpaceIgnore = whiteSpaceIgnore;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;

        if (o.getClass() != this.getClass())
            return false;

        CSVFormat givenObject = (CSVFormat) o;

        if (this.getDelimiter() == givenObject.getDelimiter() &&
                this.isHeaderPresence() == givenObject.isHeaderPresence() &&
                this.isQuotePresence() == givenObject.isQuotePresence() &&
                this.isWhiteSpaceIgnore() == givenObject.isWhiteSpaceIgnore() &&
                this.getRecordSeparator() == givenObject.getRecordSeparator())
            return true;
        return false;
    }

    @Override
    public int hashCode(){
        return  delimiter.hashCode()        +
                recordSeparator.hashCode()  ^
                headerPresence.hashCode()   ^
                quotePresence.hashCode()    ^
                whiteSpaceIgnore.hashCode();
    }

}
