import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import kartin.pojo.Cart;
import kartin.pojo.Orders;
import kartin.pojo.Product;
import kartin.pojo.User;
import kartin.pojo.Address;
import kartin.util.HibernateUtil;

public class KartInTest {

	@Test
	public void testCase1() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Product p1=new Product();
		p1.setProductId("WW123");
		p1.setProductName("Wristwatch");
		p1.setProductDescription("a watch");
		p1.setProductBrand("Timex");
		p1.setProductPrice(10000);
		p1.setProductImage1(" ");
		p1.setProductImage2(" ");
		p1.setProductImage3(" ");
		p1.setProductBrand(" ");
		
		session.save(p1);
		tx.commit();
	}
	
	@Test
	public void testCase2() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Orders o1=new Orders();
		o1.setOrderId("OWW124");
		o1.setUserId("U2");
		o1.setTStamp(new Date());
		o1.setPaymentMode("COD");
		
		session.save(o1);
		tx.commit();
	}
	
	@Test
	public void testCase3() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Cart c1=new Cart();
		c1.setCartId("C1");
		c1.setProductId("WW123");
		c1.setProductQty(1);
		c1.setUserId("U1");
		
		session.save(c1);
		tx.commit();
	}
	
	@Test
	public void testCase4() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		User u1=new User();
		u1.setUserId("U1");
		u1.setUserName("ABC");
		u1.setPassword("user123");
		u1.setContact(90909090);
		u1.setAddressId("AID1");
		u1.setUserEmail("abc@gmail.com");
		
		session.save(u1);
		tx.commit();
	}
	
	@Test
	public void testCase5() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Address a1=new Address();
		a1.setAddressId("AID1");
		a1.setUserId("U1");
		a1.setHouseNumber("101");
		a1.setBuilding("blah");
		a1.setLocality("mumbai");
		a1.setState("maharashtra");
		a1.setZipcode(404040);
		
		session.save(a1);
		tx.commit();
	}
}
