package sakila_api.sakila;

import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.http.ResponseEntity;

import sakila_api.sakila.dto.ActorDto;
import sakila_api.sakila.dto.FilmDto;



@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class SakilaApplicationTest {


	@Mock private ActorRepository actorRepo;
	@Mock private FilmRepository filmRepo;
	@Mock private StoreRepository storeRepo;

	@InjectMocks private SakilaApplication sakilaApplication;

	
	@Test
	public void testGetAllActors() {
		Iterable<Actor> actors =  sakilaApplication.getAllActors();
		Assertions.assertNotNull(actors);
	}

	@Test
	public void testGetActorById() throws Exception {
		Actor actor = new Actor();
		Optional<Actor> actorOpt = Optional.of(actor); 
		Mockito.when(actorRepo.findById(Mockito.anyInt())).thenReturn(actorOpt);
		ResponseEntity<Actor> actorResponse = sakilaApplication.getActorById(1);
		Assertions.assertNotNull(actorResponse);
	}

	@Test
	public void testGetActorByIdNotFound() throws Exception {
		Mockito.when(actorRepo.findById(Mockito.anyInt())).thenReturn(Optional.empty());

		Exception ex =
				Assertions.assertThrows(
						Exception.class,
						() -> {
							sakilaApplication.getActorById(1);
						});
	}
	
	@Test
	public void testUpdateEmployeePartially() throws Exception {
		Film film = new Film();
		Actor actor = new Actor();
		
		Optional<Actor> actorOpt = Optional.of(actor); 
		Optional<Film> filmOpt = Optional.of(film); 
		
		Mockito.when(filmRepo.findById(Mockito.anyInt())).thenReturn(filmOpt);
		Mockito.when(actorRepo.findById(Mockito.anyInt())).thenReturn(actorOpt);

		ResponseEntity<Actor> actorResponse = sakilaApplication.updateEmployeePartially(1, "test");
		Assertions.assertNotNull(actorResponse);
	}
	
	@Test
	public void testUpdateEmployeePartiallyError() throws Exception {
		Optional<Film> filmOpt = Optional.empty(); 
		
		Mockito.when(filmRepo.findById(Mockito.anyInt())).thenReturn(filmOpt);

		ResponseEntity<Actor> actorResponse = sakilaApplication.updateEmployeePartially(1, "test");
		Assertions.assertNotNull(actorResponse);
	}
	
	@Test
	public void testUpdateActor() throws Exception {
		ActorDto actorDetails = new ActorDto();
		
		Actor actor = new Actor();
		
		Optional<Actor> actorOpt = Optional.of(actor); 
		
		Mockito.when(actorRepo.findById(Mockito.anyInt())).thenReturn(actorOpt);

		ResponseEntity<Actor> actorResponse = sakilaApplication.updateActor(1, actorDetails);
		Assertions.assertNotNull(actorResponse);
	}	

	@Test
	public void testUpdateActorNotFound() throws Exception {
		ActorDto actorDetails = new ActorDto();
		
		Mockito.when(actorRepo.findById(Mockito.anyInt())).thenReturn(Optional.empty());

		Exception ex =
				Assertions.assertThrows(
						Exception.class,
						() -> {
							sakilaApplication.updateActor(1, actorDetails);
						});
		Assertions.assertNotNull(ex);
		
	}	

	@Test
	public void testCreateActor() throws Exception {
		ActorDto actorDetails = new ActorDto();
		Actor actor = new Actor();
		
		Mockito.when(actorRepo.save(Mockito.any())).thenReturn(actor);

		Actor actorResponse = sakilaApplication.createActor(actorDetails);
		Assertions.assertNotNull(actorResponse);
	}	

	@Test
	public void testDeleteEmployee() throws Exception {

		Actor actor = new Actor();
		Optional<Actor> actorOpt = Optional.of(actor); 
		Mockito.when(actorRepo.findById(Mockito.anyInt())).thenReturn(actorOpt);
		
		Map<String, Boolean> actorResponse = sakilaApplication.deleteEmployee(1);
		
		Assertions.assertNotNull(actorResponse);
	}	

	@Test
	public void testDeleteEmployeeNotFound() throws Exception {

		Mockito.when(actorRepo.findById(Mockito.anyInt())).thenReturn(Optional.empty());
		
		Exception ex =
				Assertions.assertThrows(
						Exception.class,
						() -> {
							sakilaApplication.deleteEmployee(1);
						});
		Assertions.assertNotNull(ex);

	}	
	
	@Test
	public void testGetAllFilms() {
		Iterable<Film> films =  sakilaApplication.getAllFilms();
		Assertions.assertNotNull(films);
	}

	@Test
	public void testGetFilmById() throws Exception {
		Film film = new Film();
		Optional<Film> filmOpt = Optional.of(film); 
		Mockito.when(filmRepo.findById(Mockito.anyInt())).thenReturn(filmOpt);
		ResponseEntity<Film> filmResponse = sakilaApplication.getFilmById(1);
		Assertions.assertNotNull(filmResponse);
	}

	@Test
	public void testGetFilmByIdNotFound() throws Exception {
		Mockito.when(filmRepo.findById(Mockito.anyInt())).thenReturn(null);

		Exception ex =
				Assertions.assertThrows(
						Exception.class,
						() -> {
							sakilaApplication.getFilmById(1);
						});
		Assertions.assertNotNull(ex.getMessage());
	}
	
	@Test
	public void testUpdateFilmPartially() throws Exception {
		Film film = new Film();
		Optional<Film> filmOpt = Optional.of(film); 
		Mockito.when(filmRepo.findById(Mockito.anyInt())).thenReturn(filmOpt);
		ResponseEntity<Film> filmResponse = sakilaApplication.updateFilmPartially(1, "test");
		Assertions.assertNotNull(filmResponse);
	}	

	@Test
	public void testUpdateFilmPartiallyError() throws Exception {
		Optional<Film> filmOpt = Optional.empty(); 
		
		Mockito.when(filmRepo.findById(Mockito.anyInt())).thenReturn(filmOpt);

		ResponseEntity<Film> filmResponse = sakilaApplication.updateFilmPartially(1, "test");
		Assertions.assertNotNull(filmResponse);
	}

	@Test
	public void testUpdateFilm() throws Exception {
		FilmDto filmDetails = new FilmDto();
		
		Film film = new Film();
		
		Optional<Film> filmOpt = Optional.of(film); 
		
		Mockito.when(filmRepo.findById(Mockito.anyInt())).thenReturn(filmOpt);

		ResponseEntity<Film> filmResponse = sakilaApplication.updateFilm(1, filmDetails);
		Assertions.assertNotNull(filmResponse);
	}
	
	@Test
	public void testUpdateFilmNotFound() throws Exception {
		FilmDto filmDetails = new FilmDto();
		
		Mockito.when(filmRepo.findById(Mockito.anyInt())).thenReturn(Optional.empty());

		Exception ex =
				Assertions.assertThrows(
						Exception.class,
						() -> {
							sakilaApplication.updateFilm(1, filmDetails);
						});
		Assertions.assertNotNull(ex);
		
	}
	
	@Test
	public void testCreateFilm() throws Exception {
		FilmDto filmDetails = new FilmDto();
		Film film = new Film();
		
		Mockito.when(filmRepo.save(Mockito.any())).thenReturn(film);

		Film filmResponse = sakilaApplication.createFilm(filmDetails);
		Assertions.assertNotNull(filmResponse);
	}	

	@Test
	public void testDeleteFilm() throws Exception {

		Film film = new Film();
		Optional<Film> filmOpt = Optional.of(film); 
		Mockito.when(filmRepo.findById(Mockito.anyInt())).thenReturn(filmOpt);
		
		Map<String, Boolean> filmResponse = sakilaApplication.deleteFilm(1);
		
		Assertions.assertNotNull(filmResponse);
	}	

	@Test
	public void testDeleteFilmNotFound() throws Exception {

		Mockito.when(filmRepo.findById(Mockito.anyInt())).thenReturn(Optional.empty());
		
		Exception ex =
				Assertions.assertThrows(
						Exception.class,
						() -> {
							sakilaApplication.deleteFilm(1);
						});
		Assertions.assertNotNull(ex);

	}
	
	@Test
	public void testGetAllStores() {
		Iterable<Store> stores =  sakilaApplication.getAllStores();
		Assertions.assertNotNull(stores);
	}
	
}

