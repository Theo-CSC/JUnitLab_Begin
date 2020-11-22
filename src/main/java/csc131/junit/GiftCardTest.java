package csc131.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class GiftCardTest
{
	@Test
 public void getBalance()
 {
	 double balance;
	 GiftCard card;
	 int issuingStore;

	 issuingStore = 1337;
	 balance = 100.00;
	 card = new GiftCard(issuingStore, balance);
	 assertEquals("getBalance()", balance, card.getBalance(), 0.001); 
 }
 @Test
 public void getIssuingStore()
 {
 double balance;
 GiftCard card;
 int issuingStore;

 issuingStore = 1337;
 balance = 100.00;
 card = new GiftCard(issuingStore, balance);
 assertEquals("getIssuingStore()",
 issuingStore, card.getIssuingStore());
 }
 
 @Test
 public void deduct()
 {
  double balance;
  int issuingStore;
  GiftCard card1;
  GiftCard card2;

  issuingStore = 1337;
  balance = 100.00;
  card1 = new GiftCard(issuingStore, balance);
  card2 = new GiftCard(issuingStore, balance);
  assertEquals("deduct()", card1.deduct(1.0d), card2.deduct(1.0d));
 }
 
}