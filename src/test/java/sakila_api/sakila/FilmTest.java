package sakila_api.sakila;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {

	@Test
	public void testGetId() {
		Film newFilm = new Film();
		Assertions.assertEquals(newFilm.getFilmId(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetRelease_year() {
		Film newFilm = new Film();
		Assertions.assertEquals(newFilm.getRelease_year(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetLanguage_id() {
		Film newFilm = new Film();
		Assertions.assertEquals(newFilm.getLanguage_id(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetRental_duration() {
		Film newFilm = new Film();
		Assertions.assertEquals(newFilm.getRental_duration(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetLength() {
		Film newFilm = new Film();
		Assertions.assertEquals(newFilm.getLength(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetRental_rate() {
		Film newFilm = new Film();
		Assertions.assertEquals(newFilm.getRental_rate(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetReplacement_cost() {
		Film newFilm = new Film();
		Assertions.assertEquals(newFilm.getReplacement_cost(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetTitle() {
		Film newFilm = new Film(
				"test",
				"test",
				0,
				0,
				0,
				0,
				0,
				0,
				"test",
				"test"
				);
		Assertions.assertEquals(newFilm.getTitle(), "test", "Getter and setter dont work");
	}

	@Test
	public void testGetDescription() {
		Film newFilm = new Film(
				"test",
				"test",
				0,
				0,
				0,
				0,
				0,
				0,
				"test",
				"test"
				);
		Assertions.assertEquals(newFilm.getDescription(), "test", "Getter and setter dont work");
	}

	@Test
	public void testGetRating() {
		Film newFilm = new Film(
				"test",
				"test",
				0,
				0,
				0,
				0,
				0,
				0,
				"test",
				"test"
				);
		Assertions.assertEquals(newFilm.getRating(), "test", "Getter and setter dont work");
	}

	@Test
	public void testGetSpecial_features() {
		Film newFilm = new Film(
				"test",
				"test",
				0,
				0,
				0,
				0,
				0,
				0,
				"test",
				"test"
				);
		Assertions.assertEquals(newFilm.getSpecial_features(), "test", "Getter and setter dont work");
	}    

	@Test
	public void testSetId() {
		Film newFilm = new Film();
		newFilm.setFilmId(1);
		Assertions.assertEquals(newFilm.getFilmId(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetLanguage_id() {
		Film newFilm = new Film();
		newFilm.setLanguage_id(1);
		Assertions.assertEquals(newFilm.getLanguage_id(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetLength() {
		Film newFilm = new Film();
		newFilm.setLength(1);
		Assertions.assertEquals(newFilm.getLength(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetRelease_year() {
		Film newFilm = new Film();
		newFilm.setRelease_year(1);
		Assertions.assertEquals(newFilm.getRelease_year(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetRental_duration() {
		Film newFilm = new Film();
		newFilm.setRental_duration(1);
		Assertions.assertEquals(newFilm.getRental_duration(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetRental_rate() {
		Film newFilm = new Film();
		newFilm.setRental_rate(1);
		Assertions.assertEquals(newFilm.getRental_rate(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetReplacement_cost() {
		Film newFilm = new Film();
		newFilm.setReplacement_cost(1);
		Assertions.assertEquals(newFilm.getReplacement_cost(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetDescription() {
		Film newFilm = new Film(
				"test",
				"test",
				0,
				0,
				0,
				0,
				0,
				0,
				"test",
				"test"
				);
		newFilm.setDescription("test");
		Assertions.assertEquals(newFilm.getDescription(), "test", "Getter and setter dont work");
	}

	@Test
	public void testSetRating() {
		Film newFilm = new Film(
				"test",
				"test",
				0,
				0,
				0,
				0,
				0,
				0,
				"test",
				"test"
				);
		newFilm.setRating("test");
		Assertions.assertEquals(newFilm.getRating(), "test", "Getter and setter dont work");
	}

	@Test
	public void testSetSpecial_features() {
		Film newFilm = new Film(
				"test",
				"test",
				0,
				0,
				0,
				0,
				0,
				0,
				"test",
				"test"
				);
		newFilm.setSpecial_features("test");
		Assertions.assertEquals(newFilm.getSpecial_features(), "test", "Getter and setter dont work");
	}

	@Test
	public void testSetTitle() {
		Film newFilm = new Film(
				"test",
				"test",
				0,
				0,
				0,
				0,
				0,
				0,
				"test",
				"test"
				);
		newFilm.setTitle("test");
		Assertions.assertEquals(newFilm.getTitle(), "test", "Getter and setter dont work");
	}

}
