package sakila_api.sakila.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmDtoTest {

	@Test
	public void testGetFilmId() {
		FilmDto newFilm = new FilmDto();
		Assertions.assertEquals(newFilm.getId(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetFilmRelease_year() {
		FilmDto newFilm = new FilmDto();
		Assertions.assertEquals(newFilm.getFilmRelease_year(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetFilmLanguage_id() {
		FilmDto newFilm = new FilmDto();
		Assertions.assertEquals(newFilm.getFilmLanguage_id(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetFilmRental_duration() {
		FilmDto newFilm = new FilmDto();
		Assertions.assertEquals(newFilm.getFilmRental_duration(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetFilmLength() {
		FilmDto newFilm = new FilmDto();
		Assertions.assertEquals(newFilm.getFilmLength(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetFilmRental_rate() {
		FilmDto newFilm = new FilmDto();
		Assertions.assertEquals(newFilm.getFilmRental_rate(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetFilmReplacement_cost() {
		FilmDto newFilm = new FilmDto();
		Assertions.assertEquals(newFilm.getFilmReplacement_cost(), 0, "Getter and setter dont work");

	}

	@Test
	public void testGetFilmTitle() {
		FilmDto newFilm = new FilmDto(
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
		Assertions.assertEquals(newFilm.getFilmTitle(), "test", "Getter and setter dont work");
	}

	@Test
	public void testGetFilmDescription() {
		FilmDto newFilm = new FilmDto(
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
		Assertions.assertEquals(newFilm.getFilmDescription(), "test", "Getter and setter dont work");
	}

	@Test
	public void testGetFilmRating() {
		FilmDto newFilm = new FilmDto(
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
		Assertions.assertEquals(newFilm.getFilmRating(), "test", "Getter and setter dont work");
	}

	@Test
	public void testGetFilmSpecial_features() {
		FilmDto newFilm = new FilmDto(
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
		Assertions.assertEquals(newFilm.getFilmSpecial_features(), "test", "Getter and setter dont work");
	}    

	@Test
	public void testSetFilmId() {
		FilmDto newFilm = new FilmDto();
		newFilm.setId(1);
		Assertions.assertEquals(newFilm.getId(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetFilmLanguage_id() {
		FilmDto newFilm = new FilmDto();
		newFilm.setFilmLanguage_id(1);
		Assertions.assertEquals(newFilm.getFilmLanguage_id(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetFilmLength() {
		FilmDto newFilm = new FilmDto();
		newFilm.setFilmLength(1);
		Assertions.assertEquals(newFilm.getFilmLength(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetFilmRelease_year() {
		FilmDto newFilm = new FilmDto();
		newFilm.setFilmRelease_year(1);
		Assertions.assertEquals(newFilm.getFilmRelease_year(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetFilmRental_duration() {
		FilmDto newFilm = new FilmDto();
		newFilm.setFilmRental_duration(1);
		Assertions.assertEquals(newFilm.getFilmRental_duration(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetFilmRental_rate() {
		FilmDto newFilm = new FilmDto();
		newFilm.setFilmRental_rate(1);
		Assertions.assertEquals(newFilm.getFilmRental_rate(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetFilmReplacement_cost() {
		FilmDto newFilm = new FilmDto();
		newFilm.setFilmReplacement_cost(1);
		Assertions.assertEquals(newFilm.getFilmReplacement_cost(), 1, "Getter and setter dont work");

	}

	@Test
	public void testSetDescription() {
		FilmDto newFilm = new FilmDto(
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
		Assertions.assertEquals(newFilm.getFilmDescription(), "test", "Getter and setter dont work");
	}

	@Test
	public void testSetFilmRating() {
		FilmDto newFilm = new FilmDto(
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
		newFilm.setFilmRating("test");
		Assertions.assertEquals(newFilm.getFilmRating(), "test", "Getter and setter dont work");
	}

	@Test
	public void testSetFilmSpecial_features() {
		FilmDto newFilm = new FilmDto(
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
		newFilm.setFilmSpecial_features("test");
		Assertions.assertEquals(newFilm.getFilmSpecial_features(), "test", "Getter and setter dont work");
	}

	@Test
	public void testSetFilmTitle() {
		FilmDto newFilm = new FilmDto(
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
		newFilm.setFilmTitle("test");
		Assertions.assertEquals(newFilm.getFilmTitle(), "test", "Getter and setter dont work");
	}

}
