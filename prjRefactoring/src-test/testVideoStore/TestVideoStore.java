package testVideoStore;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import videoStore.Customer;
import videoStore.Movie;
import videoStore.Rental;

public class TestVideoStore {
	
	Customer c1;

	@Before
	public void setUp() throws Exception {
		c1 = new Customer("Ricardo");

		c1.addRental(new Rental(new Movie("Star Wars",Movie.REGULAR),3));
		c1.addRental(new Rental(new Movie("Toy Story",Movie.CHILDRENS),5));
		
		System.out.println(c1.statement());
	}

	@Test
	public void testVideoStore() {
		String resultStmt="Rental Record for Ricardo\n"+
				"\t"+"Star Wars"+"\t"+"3.5\n"+
				"\t"+"Toy Story"+"\t"+"4.5\n"+
				"Amount owed is 8.0\n"+
				"Your earned 2 frequent renter points";
		Assert.assertTrue(c1.statement().equals(resultStmt));
	}

}
