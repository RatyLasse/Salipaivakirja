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
 * @version 2021.03.23 14:25:52 // Generated by ComTest
 *
 */
@SuppressWarnings("all")
public class SuorituksetTest {



  // Generated by ComTest BEGIN
  /** testLisaa54 */
  @Test
  public void testLisaa54() {    // Suoritukset: 54
    Suoritukset suoritukset = new Suoritukset(); 
    Suoritus kyykkysarja1 = new Suoritus(), kyykkysarja2 = new Suoritus(); 
    assertEquals("From: Suoritukset line: 57", 0, suoritukset.getLkm()); 
    suoritukset.lisaa(kyykkysarja1); assertEquals("From: Suoritukset line: 58", 1, suoritukset.getLkm()); 
    suoritukset.lisaa(kyykkysarja2); assertEquals("From: Suoritukset line: 59", 2, suoritukset.getLkm()); 
    suoritukset.lisaa(kyykkysarja1); assertEquals("From: Suoritukset line: 60", 3, suoritukset.getLkm()); 
    assertEquals("From: Suoritukset line: 61", kyykkysarja1, suoritukset.anna(0)); 
    assertEquals("From: Suoritukset line: 62", kyykkysarja2, suoritukset.anna(1)); 
    assertEquals("From: Suoritukset line: 63", kyykkysarja1, suoritukset.anna(2)); 
    assertEquals("From: Suoritukset line: 64", false, suoritukset.anna(1) == kyykkysarja1); 
    assertEquals("From: Suoritukset line: 65", true, suoritukset.anna(1) == kyykkysarja2); 
    try {
    assertEquals("From: Suoritukset line: 66", kyykkysarja1, suoritukset.anna(3)); 
    fail("Suoritukset: 66 Did not throw IndexOutOfBoundsException");
    } catch(IndexOutOfBoundsException _e_){ _e_.getMessage(); }
    suoritukset.lisaa(kyykkysarja1); assertEquals("From: Suoritukset line: 67", 4, suoritukset.getLkm()); 
    suoritukset.lisaa(kyykkysarja1); assertEquals("From: Suoritukset line: 68", 5, suoritukset.getLkm()); 
    suoritukset.lisaa(kyykkysarja1); assertEquals("From: Suoritukset line: 69", 6, suoritukset.getLkm()); 
    suoritukset.lisaa(kyykkysarja1); assertEquals("From: Suoritukset line: 70", 7, suoritukset.getLkm()); 
    suoritukset.lisaa(kyykkysarja1); assertEquals("From: Suoritukset line: 71", 8, suoritukset.getLkm()); 
    suoritukset.lisaa(kyykkysarja1); assertEquals("From: Suoritukset line: 72", 9, suoritukset.getLkm());  // Tässä luodaan kasvatettu taulukko, jotta kaikki mahtuu
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testLueTiedostosta95 
   * @throws SailoException when error
   */
  @Test
  public void testLueTiedostosta95() throws SailoException {    // Suoritukset: 95
    Suoritukset suoritteet = new Suoritukset(); 
    Suoritus kyykky21 = new Suoritus(2); kyykky21.taytaKyykkyTiedoilla(2); 
    Suoritus kyykky11 = new Suoritus(1); kyykky11.taytaKyykkyTiedoilla(1); 
    Suoritus kyykky22 = new Suoritus(2); kyykky22.taytaKyykkyTiedoilla(2); 
    Suoritus kyykky12 = new Suoritus(1); kyykky12.taytaKyykkyTiedoilla(1); 
    Suoritus kyykky23 = new Suoritus(2); kyykky23.taytaKyykkyTiedoilla(2); 
    String tiedNimi = "testisuoritukset"; 
    File ftied = new File(tiedNimi+".dat"); 
    ftied.delete(); 
    try {
    suoritteet.lueTiedostosta(tiedNimi); 
    fail("Suoritukset: 107 Did not throw SailoException");
    } catch(SailoException _e_){ _e_.getMessage(); }
    suoritteet.lisaa(kyykky21); 
    suoritteet.lisaa(kyykky11); 
    suoritteet.lisaa(kyykky22); 
    suoritteet.lisaa(kyykky12); 
    suoritteet.lisaa(kyykky23); 
    suoritteet.tallenna(); 
    suoritteet = new Suoritukset(); 
    suoritteet.lueTiedostosta(tiedNimi); 
    Iterator<Suoritus> i = suoritteet.iterator(); 
    assertEquals("From: Suoritukset line: 117", kyykky21.toString(), i.next().toString()); 
    assertEquals("From: Suoritukset line: 118", kyykky11.toString(), i.next().toString()); 
    assertEquals("From: Suoritukset line: 119", kyykky22.toString(), i.next().toString()); 
    assertEquals("From: Suoritukset line: 120", kyykky12.toString(), i.next().toString()); 
    assertEquals("From: Suoritukset line: 121", kyykky23.toString(), i.next().toString()); 
    assertEquals("From: Suoritukset line: 122", false, i.hasNext()); 
    suoritteet.lisaa(kyykky23); 
    suoritteet.tallenna(); 
    assertEquals("From: Suoritukset line: 125", true, ftied.delete()); 
    File fbak = new File(tiedNimi+".bak"); 
    assertEquals("From: Suoritukset line: 127", true, fbak.delete()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testSuorituksetIterator248 
   * @throws SailoException when error
   */
  @Test
  public void testSuorituksetIterator248() throws SailoException {    // Suoritukset: 248
    Suoritukset suoritukset = new Suoritukset(); 
    Suoritus kyykkysarja1 = new Suoritus(), kyykkysarja2 = new Suoritus(), kyykkysarja3 = new Suoritus(); 
    kyykkysarja1.rekisteroi(); kyykkysarja2.rekisteroi(); kyykkysarja3.rekisteroi(); 
    suoritukset.lisaa(kyykkysarja1); suoritukset.lisaa(kyykkysarja2); suoritukset.lisaa(kyykkysarja3); 
    StringBuffer ids = new StringBuffer(30); 
    for (Suoritus suoritus:suoritukset) // Kokeillaan for-silmukan toimintaa
    ids.append(" "+suoritus.getTunnusNro()); 
    String tulos = " " + kyykkysarja1.getTunnusNro() + " " + kyykkysarja2.getTunnusNro() + " " + kyykkysarja3.getTunnusNro(); 
    assertEquals("From: Suoritukset line: 265", tulos, ids.toString()); 
    ids = new StringBuffer(30); 
    for (Iterator<Suoritus>  i=suoritukset.iterator(); i.hasNext(); ) { // ja iteraattorin toimintaa
    Suoritus suoritus = i.next(); 
    ids.append(" "+suoritus.getTunnusNro()); 
    }
    assertEquals("From: Suoritukset line: 273", tulos, ids.toString()); 
    Iterator<Suoritus>  i=suoritukset.iterator(); 
    assertEquals("From: Suoritukset line: 276", true, i.next() == kyykkysarja1); 
    assertEquals("From: Suoritukset line: 277", true, i.next() == kyykkysarja2); 
    assertEquals("From: Suoritukset line: 278", true, i.next() == kyykkysarja3); 
    try {
    i.next(); 
    fail("Suoritukset: 280 Did not throw NoSuchElementException");
    } catch(NoSuchElementException _e_){ _e_.getMessage(); }
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testIterator323 */
  @Test
  public void testIterator323() {    // Suoritukset: 323
    Suoritukset suoritteet = new Suoritukset(); 
    Suoritus kyykky21 = new Suoritus(2); suoritteet.lisaa(kyykky21); 
    Suoritus kyykky11 = new Suoritus(1); suoritteet.lisaa(kyykky11); 
    Suoritus kyykky22 = new Suoritus(2); suoritteet.lisaa(kyykky22); 
    Suoritus kyykky12 = new Suoritus(1); suoritteet.lisaa(kyykky12); 
    Suoritus kyykky23 = new Suoritus(2); suoritteet.lisaa(kyykky23); 
    Iterator<Suoritus> i2=suoritteet.iterator(); 
    assertEquals("From: Suoritukset line: 335", kyykky21, i2.next()); 
    assertEquals("From: Suoritukset line: 336", kyykky11, i2.next()); 
    assertEquals("From: Suoritukset line: 337", kyykky22, i2.next()); 
    assertEquals("From: Suoritukset line: 338", kyykky12, i2.next()); 
    assertEquals("From: Suoritukset line: 339", kyykky23, i2.next()); 
    try {
    assertEquals("From: Suoritukset line: 340", kyykky12, i2.next()); 
    fail("Suoritukset: 340 Did not throw NoSuchElementException");
    } catch(NoSuchElementException _e_){ _e_.getMessage(); }
    int n = 0; 
    int hnrot[] = { 2,1,2,1,2} ; 
    for ( Suoritus suo:suoritteet ) {
    assertEquals("From: Suoritukset line: 346", hnrot[n], suo.getHarjoitusID()); n++; 
    }
    assertEquals("From: Suoritukset line: 349", 5, n); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testAnnaSuoritukset364 */
  @Test
  public void testAnnaSuoritukset364() {    // Suoritukset: 364
    Suoritukset suoritteet = new Suoritukset(); 
    Suoritus kyykky21 = new Suoritus(2); suoritteet.lisaa(kyykky21); 
    Suoritus kyykky11 = new Suoritus(1); suoritteet.lisaa(kyykky11); 
    Suoritus kyykky22 = new Suoritus(2); suoritteet.lisaa(kyykky22); 
    Suoritus kyykky12 = new Suoritus(1); suoritteet.lisaa(kyykky12); 
    Suoritus kyykky23 = new Suoritus(2); suoritteet.lisaa(kyykky23); 
    Suoritus kyykky51 = new Suoritus(5); suoritteet.lisaa(kyykky51); 
    List<Suoritus> loytyneet; 
    loytyneet = suoritteet.annaSuoritukset(3); 
    assertEquals("From: Suoritukset line: 377", 0, loytyneet.size()); 
    loytyneet = suoritteet.annaSuoritukset(1); 
    assertEquals("From: Suoritukset line: 379", 2, loytyneet.size()); 
    assertEquals("From: Suoritukset line: 380", true, loytyneet.get(0) == kyykky11); 
    assertEquals("From: Suoritukset line: 381", true, loytyneet.get(1) == kyykky12); 
    loytyneet = suoritteet.annaSuoritukset(5); 
    assertEquals("From: Suoritukset line: 383", 1, loytyneet.size()); 
    assertEquals("From: Suoritukset line: 384", true, loytyneet.get(0) == kyykky51); 
  } // Generated by ComTest END
}