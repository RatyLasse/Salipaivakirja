package sali.test;
// Generated by ComTest BEGIN
import java.io.File;
import sali.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2021.03.23 14:20:59 // Generated by ComTest
 *
 */
@SuppressWarnings("all")
public class LiikkeetTest {



  // Generated by ComTest BEGIN
  /** 
   * testLisaa57 
   * @throws SailoException when error
   */
  @Test
  public void testLisaa57() throws SailoException {    // Liikkeet: 57
    Liikkeet liikkeet = new Liikkeet(); 
    Liike kyykky = new Liike(), penkki = new Liike(), maastaveto = new Liike(),
    dippi = new Liike(), pystypunnerrus = new Liike(), alatalja = new Liike(); 
    kyykky.setLiikeNimi("kyykky"); penkki.setLiikeNimi("penkki"); maastaveto.setLiikeNimi("maastaveto"); 
    dippi.setLiikeNimi("dippi"); pystypunnerrus.setLiikeNimi("pystypunnerrus"); alatalja.setLiikeNimi("alatalja"); 
    assertEquals("From: Liikkeet line: 64", 0, liikkeet.getLkm()); 
    liikkeet.lisaa(kyykky); assertEquals("From: Liikkeet line: 65", 1, liikkeet.getLkm()); 
    liikkeet.lisaa(penkki); assertEquals("From: Liikkeet line: 66", 2, liikkeet.getLkm()); 
    liikkeet.lisaa(maastaveto); assertEquals("From: Liikkeet line: 67", 3, liikkeet.getLkm()); 
    try {
    liikkeet.lisaa(maastaveto); 
    fail("Liikkeet: 68 Did not throw SailoException");
    } catch(SailoException _e_){ _e_.getMessage(); }
    assertEquals("From: Liikkeet line: 69", kyykky, liikkeet.anna(0)); 
    assertEquals("From: Liikkeet line: 70", penkki, liikkeet.anna(1)); 
    assertEquals("From: Liikkeet line: 71", maastaveto, liikkeet.anna(2)); 
    assertEquals("From: Liikkeet line: 72", false, liikkeet.anna(1) == kyykky); 
    assertEquals("From: Liikkeet line: 73", true, liikkeet.anna(1) == penkki); 
    try {
    assertEquals("From: Liikkeet line: 74", kyykky, liikkeet.anna(3)); 
    fail("Liikkeet: 74 Did not throw IndexOutOfBoundsException");
    } catch(IndexOutOfBoundsException _e_){ _e_.getMessage(); }
    liikkeet.lisaa(dippi); assertEquals("From: Liikkeet line: 75", 4, liikkeet.getLkm()); 
    liikkeet.lisaa(pystypunnerrus); assertEquals("From: Liikkeet line: 76", 5, liikkeet.getLkm()); 
    liikkeet.lisaa(alatalja); assertEquals("From: Liikkeet line: 77", 6, liikkeet.getLkm()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testPoista107 
   * @throws SailoException when error
   */
  @Test
  public void testPoista107() throws SailoException {    // Liikkeet: 107
    Liikkeet liikkeet = new Liikkeet(); 
    Liike kyykky = new Liike(), penkki = new Liike(), maastaveto = new Liike(); 
    kyykky.rekisteroi(); penkki.rekisteroi(); maastaveto.rekisteroi(); 
    kyykky.setLiikeNimi("kyykky"); penkki.setLiikeNimi("penkki"); maastaveto.setLiikeNimi("maastaveto"); 
    int id1 = kyykky.getLiikeID(); 
    liikkeet.lisaa(kyykky); liikkeet.lisaa(penkki); liikkeet.lisaa(maastaveto); 
    assertEquals("From: Liikkeet line: 115", 1, liikkeet.poista(id1+1)); 
    assertEquals("From: Liikkeet line: 116", null, liikkeet.annaId(id1+1)); assertEquals("From: Liikkeet line: 116", 2, liikkeet.getLkm()); 
    assertEquals("From: Liikkeet line: 117", 1, liikkeet.poista(id1)); assertEquals("From: Liikkeet line: 117", 1, liikkeet.getLkm()); 
    assertEquals("From: Liikkeet line: 118", 0, liikkeet.poista(id1+3)); assertEquals("From: Liikkeet line: 118", 1, liikkeet.getLkm()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testLueTiedostosta138 
   * @throws SailoException when error
   */
  @Test
  public void testLueTiedostosta138() throws SailoException {    // Liikkeet: 138
    Liikkeet liikkeet = new Liikkeet(); 
    Liike kyykky = new Liike(), penkki = new Liike(); 
    kyykky.rekisteroi(); 
    kyykky.setLiikeNimi("kyykky"); 
    penkki.rekisteroi(); 
    penkki.setLiikeNimi("penkki"); 
    String hakemisto = "testiliikkeet"; 
    String tiedNimi = hakemisto+"/liikkeet"; 
    File ftied = new File(tiedNimi+".dat"); 
    File dir = new File(hakemisto); 
    dir.mkdir(); 
    ftied.delete(); 
    try {
    liikkeet.lueTiedostosta(tiedNimi); 
    fail("Liikkeet: 154 Did not throw SailoException");
    } catch(SailoException _e_){ _e_.getMessage(); }
    liikkeet.lisaa(kyykky); 
    liikkeet.lisaa(penkki); 
    liikkeet.tallenna(); 
    liikkeet = new Liikkeet(); 
    liikkeet.lueTiedostosta(tiedNimi); 
    Iterator<Liike> i = liikkeet.iterator(); 
    assertEquals("From: Liikkeet line: 161", kyykky.toString(), i.next().toString()); 
    assertEquals("From: Liikkeet line: 162", penkki.toString(), i.next().toString()); 
    assertEquals("From: Liikkeet line: 163", false, i.hasNext()); 
    liikkeet.lisaa(penkki); 
    liikkeet.tallenna(); 
    assertEquals("From: Liikkeet line: 166", true, ftied.delete()); 
    File fbak = new File(tiedNimi+".bak"); 
    assertEquals("From: Liikkeet line: 168", true, fbak.delete()); 
    assertEquals("From: Liikkeet line: 169", true, dir.delete()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testAnnaId256 
   * @throws SailoException when error
   */
  @Test
  public void testAnnaId256() throws SailoException {    // Liikkeet: 256
    Liikkeet liikkeet = new Liikkeet(); 
    Liike kyykky = new Liike(), penkki = new Liike(), maastaveto = new Liike(); 
    kyykky.rekisteroi(); penkki.rekisteroi(); maastaveto.rekisteroi(); 
    kyykky.setLiikeNimi("kyykky"); penkki.setLiikeNimi("penkki"); maastaveto.setLiikeNimi("maastaveto"); 
    int id1 = kyykky.getLiikeID(); 
    liikkeet.lisaa(kyykky); liikkeet.lisaa(penkki); liikkeet.lisaa(maastaveto); 
    assertEquals("From: Liikkeet line: 264", true, liikkeet.annaId(id1  ) == kyykky); 
    assertEquals("From: Liikkeet line: 265", true, liikkeet.annaId(id1+1) == penkki); 
    assertEquals("From: Liikkeet line: 266", true, liikkeet.annaId(id1+2) == maastaveto); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testLiikkeetIterator316 
   * @throws SailoException when error
   */
  @Test
  public void testLiikkeetIterator316() throws SailoException {    // Liikkeet: 316
    Liikkeet liikkeet = new Liikkeet(); 
    Liike kyykky = new Liike(), penkki = new Liike(), maastaveto = new Liike(); 
    kyykky.rekisteroi(); penkki.rekisteroi(); maastaveto.rekisteroi(); 
    kyykky.setLiikeNimi("kyykky"); penkki.setLiikeNimi("penkki"); maastaveto.setLiikeNimi("maastaveto"); 
    liikkeet.lisaa(kyykky); liikkeet.lisaa(penkki); liikkeet.lisaa(maastaveto); 
    StringBuffer ids = new StringBuffer(30); 
    for (Liike liike:liikkeet) // Kokeillaan for-silmukan toimintaa
    ids.append(" "+liike.getLiikeID()); 
    String tulos = " " + kyykky.getLiikeID() + " " + penkki.getLiikeID() + " " + maastaveto.getLiikeID(); 
    assertEquals("From: Liikkeet line: 334", tulos, ids.toString()); 
    ids = new StringBuffer(30); 
    for (Iterator<Liike>  i=liikkeet.iterator(); i.hasNext(); ) { // ja iteraattorin toimintaa
    Liike liike = i.next(); 
    ids.append(" "+liike.getLiikeID()); 
    }
    assertEquals("From: Liikkeet line: 342", tulos, ids.toString()); 
    Iterator<Liike>  i=liikkeet.iterator(); 
    assertEquals("From: Liikkeet line: 345", true, i.next() == kyykky); 
    assertEquals("From: Liikkeet line: 346", true, i.next() == penkki); 
    assertEquals("From: Liikkeet line: 347", true, i.next() == maastaveto); 
    try {
    i.next(); 
    fail("Liikkeet: 349 Did not throw NoSuchElementException");
    } catch(NoSuchElementException _e_){ _e_.getMessage(); }
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testEtsiId419 
   * @throws SailoException when error
   */
  @Test
  public void testEtsiId419() throws SailoException {    // Liikkeet: 419
    Liikkeet liikkeet = new Liikkeet(); 
    Liike kyykky = new Liike(), penkki = new Liike(), maastaveto = new Liike(); 
    kyykky.rekisteroi(); penkki.rekisteroi(); maastaveto.rekisteroi(); 
    kyykky.setLiikeNimi("kyykky"); penkki.setLiikeNimi("penkki"); maastaveto.setLiikeNimi("maastaveto"); 
    int id1 = kyykky.getLiikeID(); 
    liikkeet.lisaa(kyykky); liikkeet.lisaa(penkki); liikkeet.lisaa(maastaveto); 
    assertEquals("From: Liikkeet line: 427", 1, liikkeet.etsiId(id1+1)); 
    assertEquals("From: Liikkeet line: 428", 2, liikkeet.etsiId(id1+2)); 
  } // Generated by ComTest END
}