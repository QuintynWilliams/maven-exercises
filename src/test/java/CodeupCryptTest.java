
import org.junit.Test;
import static org.junit.Assert.*;


public class CodeupCryptTest {

    @Test
    public void testIfVersionIsSet() {
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.2;
        assertEquals(1.2, CodeupCrypt.version, 0);
    }

//  a or A	4
//  e or E	3
//  i or I	1
//  o or O	0
//  u or U	9

    @Test
    public void testHashPassword() {
//                         OutPut  v                            Input v
        assertEquals("390943", CodeupCrypt.hashPassword("Euouae"));
        assertEquals("v0w3l", CodeupCrypt.hashPassword("vOwEl"));
        assertEquals("4D0M9S", CodeupCrypt.hashPassword("aDoMuS"));
        assertEquals("39l0gy", CodeupCrypt.hashPassword("EUlogy"));
        assertEquals("43r14l", CodeupCrypt.hashPassword("AerIal"));
    }

    @Test
    public void testNullHashPasswordReturn () {
        assertTrue("check password", CodeupCrypt.checkPassword("maTrIces", "m4Tr1c3s"));
        assertFalse("check password", CodeupCrypt.checkPassword("maTrIces", "maTrIces"));
    }

}
