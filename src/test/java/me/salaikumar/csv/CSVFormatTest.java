package me.salaikumar.csv;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CSVFormatTest {

    @Test
    public void shouldTestCSVFormatInstance(){
        CSVFormat salaiFormat = new CSVFormat();

        salaiFormat.setDelimiter(";");
        assertThat(salaiFormat.getDelimiter(), is(";"));

        salaiFormat.setHeaderPresence(true);
        assertThat(salaiFormat.isHeaderPresence(),is(true));

        salaiFormat.setQuotePresence(false);
        assertThat(salaiFormat.isQuotePresence(),is(false));

        salaiFormat.setWhiteSpaceIgnore(false);
        assertThat(salaiFormat.isWhiteSpaceIgnore(),is(false));

        salaiFormat.setRecordSeparator("EX");
        assertThat(salaiFormat.getRecordSeparator(),is("EX"));

    }


    @Test
    public void shouldTestEqualsandHashCode(){
        CSVFormat salaiFormat = new CSVFormat();
        salaiFormat.setDelimiter(";");
        salaiFormat.setHeaderPresence(true);
        salaiFormat.setQuotePresence(false);
        salaiFormat.setWhiteSpaceIgnore(false);
        salaiFormat.setRecordSeparator("EX");
        CSVFormat sFormat = new CSVFormat();
        sFormat.setDelimiter(";");
        sFormat.setHeaderPresence(true);
        sFormat.setQuotePresence(false);
        sFormat.setWhiteSpaceIgnore(false);
        sFormat.setRecordSeparator("XE");
        assertThat(salaiFormat.equals(sFormat), is(false));
        assertTrue(salaiFormat.hashCode() != sFormat.hashCode());
    }
}