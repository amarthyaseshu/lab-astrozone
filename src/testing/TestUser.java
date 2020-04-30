//package testing;
//
//
//import static org.junit.Assert.*;
//import org.junit.Test;
//
//import model.User;
//
//public class TestUser {
//	User astro = new User("Clara","female",null, "03-11-1997");
//	@Test
//	public void testGetNameMethod() {
//		astro.setName("Clara");
//		astro.setGender("Female");
//		astro.setDob("03-11-1997");// Did you modify here?? no sir
//		assertEquals("Clara", astro.getName());
//		assertEquals("Female",astro.getGender());
//		assertEquals("03-11-1997",astro.getDob());
//		try {
//			astro.setName(null);
//			astro.setGender(null);
//			astro.setDob(null);
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
//
