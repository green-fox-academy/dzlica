import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumbersTest {

    RomanNumbers romanNumbers;

    @Before
    public void setUp() throws Exception {
        if (romanNumbers == null) {

        }
        romanNumbers = new RomanNumbers();

    }

    @Test
    public void convertToRomanI() throws Exception {
        assertEquals("I", romanNumbers.convertToRoman(1));
    }


    @Test
    public void convertToRomanII() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("II", romanNumbers.convertToRoman(2));
    }

    @Test
    public void convertToRomanIII() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("III", romanNumbers.convertToRoman(3));
    }

    @Test
    public void convertToRomanIV() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("IV", romanNumbers.convertToRoman(4));
    }

    @Test
    public void convertToRomanV() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("V", romanNumbers.convertToRoman(5));
    }

    @Test
    public void convertToRomanIX() throws Exception {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals("IX", romanNumbers.convertToRoman(9));
    }

}