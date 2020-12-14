import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMath extends TestCase {

//@before
//@test
//@after
Math m;
    @Before
    public void setUp() {
        System.out.println("Debut");
         m=new Math(2,3);
    }

    @After
    public void tearDown() {
        System.out.println("fin");
    }

  /*  public void testSomme() {
        System.out.println("Test Somme");

*//*
        assertEquals("Erreur", 5f, m.somme());
*//*
        assertFalse("testok",(m.somme()==7|| m.somme()==8));
    }*/

  /*  @Test
    public void testDiv() {
        System.out.println("Test Div");
        Math m=new Math(2,3);
        assertEquals("Erreur div val= 2/3", 5f, m.div());
    }*/

  @Test
    public void testRemplirTab(){
        m.remplirTab(new int[]{5,3,1,2,5});
        assertEquals("taille =5 !",5,m.tab.length);
    }
    @Test
    public void testAffiche(){
        try{
            m.affiche();
        }catch (IndexOutOfBoundsException e){
            fail("erreur indice inc");
        }
        catch (NullPointerException e){
            fail("erreur indice inc");
        }
    }

}
