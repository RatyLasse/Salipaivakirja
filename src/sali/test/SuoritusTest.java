package sali.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import sali.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2021.03.29 16:48:46 // Generated by ComTest
 *
 */
@SuppressWarnings("all")
public class SuoritusTest {



  // Generated by ComTest BEGIN
  /** testGetHarjoitusID73 */
  @Test
  public void testGetHarjoitusID73() {    // Suoritus: 73
    Suoritus kyykkysarja = new Suoritus(); 
    assertEquals("From: Suoritus line: 75", 0, kyykkysarja.getHarjoitusID()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testGetLiikeID86 */
  @Test
  public void testGetLiikeID86() {    // Suoritus: 86
    Suoritus kyykkysarja = new Suoritus(); 
    kyykkysarja.taytaKyykkyTiedoilla(); 
    assertEquals("From: Suoritus line: 89", 1, kyykkysarja.getLiikeID()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testGetSarjat100 */
  @Test
  public void testGetSarjat100() {    // Suoritus: 100
    Suoritus kyykkysarja = new Suoritus(); 
    kyykkysarja.taytaKyykkyTiedoilla(); 
    assertEquals("From: Suoritus line: 103", 3, kyykkysarja.getSarjat()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testGetToistot114 */
  @Test
  public void testGetToistot114() {    // Suoritus: 114
    Suoritus kyykkysarja = new Suoritus(); 
    kyykkysarja.taytaKyykkyTiedoilla(); 
    assertEquals("From: Suoritus line: 117", 5, kyykkysarja.getToistot()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testGetPainot128 */
  @Test
  public void testGetPainot128() {    // Suoritus: 128
    Suoritus kyykkysarja = new Suoritus(); 
    kyykkysarja.taytaKyykkyTiedoilla(); 
    assertEquals("From: Suoritus line: 131", 160, kyykkysarja.getPainot(), 0.000001); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testGetRasitus142 */
  @Test
  public void testGetRasitus142() {    // Suoritus: 142
    Suoritus kyykkysarja = new Suoritus(); 
    kyykkysarja.taytaKyykkyTiedoilla(); 
    assertEquals("From: Suoritus line: 145", 8, kyykkysarja.getRasitus(), 0.000001); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testToString165 */
  @Test
  public void testToString165() {    // Suoritus: 165
    Liike penkki = new Liike(); 
    penkki.parse("   2  |  penkki"); 
    assertEquals("From: Suoritus line: 168", "2|penkki", penkki.toString()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testParse211 */
  @Test
  public void testParse211() {    // Suoritus: 211
    Suoritus kyykkysarja = new Suoritus(); 
    kyykkysarja.parse("   1  |  1  | 1  | 3 | 5 | 160.0 | 8.0 | Selkä kipeä"); 
    assertEquals("From: Suoritus line: 214", 1, kyykkysarja.getTunnusNro()); 
    assertEquals("From: Suoritus line: 215", "1|1|1|3|5|160.0|8.0|Selkä kipeä", kyykkysarja.toString()); 
    kyykkysarja.rekisteroi(); 
    int n = kyykkysarja.getTunnusNro(); 
    kyykkysarja.parse(""+(n+20));  // Otetaan merkkijonosta vain liikeID
    kyykkysarja.rekisteroi();  // ja tarkistetaan että seuraavalla kertaa tulee yhtä isompi
    assertEquals("From: Suoritus line: 221", n+20+1, kyykkysarja.getTunnusNro()); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** 
   * testClone241 
   * @throws CloneNotSupportedException when error
   */
  @Test
  public void testClone241() throws CloneNotSupportedException {    // Suoritus: 241
    Suoritus suoritus = new Suoritus(); 
    suoritus.parse("   3  |  1  | 1"); 
    Suoritus kopio = suoritus.clone(); 
    assertEquals("From: Suoritus line: 246", suoritus.toString(), kopio.toString()); 
    suoritus.parse("   4  |  1   | 1"); 
    assertEquals("From: Suoritus line: 248", false, kopio.toString().equals(suoritus.toString())); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testRekisteroi316 */
  @Test
  public void testRekisteroi316() {    // Suoritus: 316
    Suoritus kyykkysarja1 = new Suoritus(); 
    assertEquals("From: Suoritus line: 318", 0, kyykkysarja1.getTunnusNro()); 
    kyykkysarja1.rekisteroi(); 
    Suoritus kyykkysarja2 = new Suoritus(); 
    kyykkysarja2.rekisteroi(); 
    int n1 = kyykkysarja1.getTunnusNro(); 
    int n2 = kyykkysarja2.getTunnusNro(); 
    assertEquals("From: Suoritus line: 324", n2-1, n1); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testAnna359 */
  @Test
  public void testAnna359() {    // Suoritus: 359
    Suoritus kyykkysarja = new Suoritus(); 
    kyykkysarja.taytaKyykkyTiedoilla(); 
    assertEquals("From: Suoritus line: 362", "@ 8.0", kyykkysarja.anna(4)); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testAseta385 */
  @Test
  public void testAseta385() {    // Suoritus: 385
    Suoritus suoritus = new Suoritus(); 
    assertEquals("From: Suoritus line: 387", null, suoritus.aseta(1,"5")); 
    assertEquals("From: Suoritus line: 388", null, suoritus.aseta(2,"3")); 
    assertEquals("From: Suoritus line: 389", "LiikeID:hen syötetty arvo ei ole kokonaisluku", suoritus.aseta(2,"asd")); 
    assertEquals("From: Suoritus line: 390", "Painoihin syötetty arvo ei ole numero", suoritus.aseta(5,"kissa")); 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testAsetaLiike467 */
  @Test
  public void testAsetaLiike467() {    // Suoritus: 467
    Suoritus kyykkysarja = new Suoritus(); 
    Liike kyykky = new Liike(); 
    kyykky.rekisteroi(); 
    kyykky.setLiikeNimi("kyykky"); 
    assertEquals("From: Suoritus line: 472", 0, kyykkysarja.getLiikeID()); 
    kyykkysarja.asetaLiike(kyykky); 
    assertEquals("From: Suoritus line: 474", kyykky.getLiikeID(), kyykkysarja.getLiikeID()); 
  } // Generated by ComTest END
}