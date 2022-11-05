package sakila_api.sakila;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import sakila_api.sakila.dto.ActorDto;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@SpringBootApplication
@RestController
@CrossOrigin
@RequestMapping("/home")

public class SakilaApplication {

	@Autowired

	private ActorRepository actorRepo;
	private FilmRepository filmRepo;
	private StoreRepository storeRepo;

	public SakilaApplication(ActorRepository exActorRepo, FilmRepository exFilmRepo, StoreRepository exStoreRepo){

		this.actorRepo = exActorRepo;
		this.filmRepo = exFilmRepo;
		this.storeRepo = exStoreRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaApplication.class, args);
	}


	/* actor table methods */

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepo.findAll();
	}

	@GetMapping("/allActors/{id}")
	public ResponseEntity<Actor> getActorById(@PathVariable(value = "id") int actorId)
			throws ResourceNotFoundException {
		Actor actor = actorRepo.findById(actorId)
				.orElseThrow(() -> new ResourceNotFoundException("Actor not found for this id :: " + actorId));
		return ResponseEntity.ok().body(actor);
	}

	@PatchMapping("/allActors/{id}/{firstName}")
	public ResponseEntity<Actor> updateEmployeePartially(@PathVariable int id, @PathVariable String firstName) {
		if (!Objects.isNull(filmRepo)) {
			Optional<Film> optFilm = filmRepo.findById(id);
			if (optFilm.isPresent()) {
				if (!Objects.isNull(actorRepo)) {
					Optional<Actor> optActor = actorRepo.findById(id);
					if (optActor.isPresent()) {
						Actor actor = optActor.get();
						actor.setActorFirstName(firstName);
						return new ResponseEntity<Actor>(actorRepo.save(actor), HttpStatus.OK);
					}
				}
			}
		}
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@PutMapping("/allActors/{id}")
	public ResponseEntity<Actor> updateActor(@PathVariable(value = "id") int actorId,
												   @RequestBody ActorDto actorDetails) throws ResourceNotFoundException {
		Actor actor = actorRepo.findById(actorId)
				.orElseThrow(() -> new ResourceNotFoundException("Actor not found for this id :: " + actorId));

		actor.setActorFirstName(actorDetails.getFirstName());
		actor.setActorLastName(actorDetails.getLastName());

		actorRepo.save(actor);
		return ResponseEntity.ok(actor);
	}

	@PostMapping("/allActors")
	public Actor createActor(@RequestBody ActorDto actorDto) {
		
		Actor actor = new Actor();
		
		actor.setActorId(actorDto.getId());
		actor.setActorFirstName(actorDto.getFirstName());
		actor.setActorLastName(actorDto.getLastName());
		
		return actorRepo.save(actor);
		
	}

	@DeleteMapping("/allActors/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") int actorId)
			throws ResourceNotFoundException {
		Actor actor = actorRepo.findById(actorId)
				.orElseThrow(() -> new ResourceNotFoundException("Actor not found for this id :: " + actorId));

		actorRepo.delete(actor);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}


	/* film table methods */
	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms() { return filmRepo.findAll();}

	@GetMapping("/allFilms/{id}")
	public ResponseEntity<Film> getFilmById(@PathVariable(value = "id") int filmId)
			throws ResourceNotFoundException {
		Film film = filmRepo.findById(filmId)
				.orElseThrow(() -> new ResourceNotFoundException("Film not found for this id :: " + filmId));
		return ResponseEntity.ok().body(film);
	}

	@PatchMapping("/allFilms/{id}/{title}")
	public ResponseEntity<Film> updateFilmPartially(@PathVariable int id, @PathVariable String title) {

		if (!Objects.isNull(filmRepo)) {
			Optional<Film> optFilm = filmRepo.findById(id);
			if (optFilm.isPresent()) {
				Film film = optFilm.get();
				film.setTitle(title);
				return new ResponseEntity<Film>(filmRepo.save(film), HttpStatus.OK);
			}
		}

		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@PutMapping("/allFilms/{id}")
	public ResponseEntity<Film> updateFilm(@PathVariable(value = "id") int filmId,
											 @RequestBody Film filmDetails) throws ResourceNotFoundException {
		Film film = filmRepo.findById(filmId)
				.orElseThrow(() -> new ResourceNotFoundException("Film not found for this id :: " + filmId));

		film.setTitle(filmDetails.getTitle());
		film.setDescription(filmDetails.getDescription());
		film.setLength(filmDetails.getLength());
		film.setRating(filmDetails.getRating());
		film.setLanguage_id(filmDetails.getLanguage_id());
		film.setSpecial_features(filmDetails.getSpecial_features());
		film.setReplacement_cost(filmDetails.getReplacement_cost());
		film.setRental_rate(filmDetails.getRental_rate());
		film.setRental_duration(filmDetails.getRental_duration());

		filmRepo.save(film);
		return ResponseEntity.ok(film);
	}

	@PostMapping("/allFilms")
	public Film createFilm(@RequestBody Film film) {
		return filmRepo.save(film);
	}

	@DeleteMapping("/allFilms/{id}")
	public Map<String, Boolean> deleteFilm(@PathVariable(value = "id") int filmId)
			throws ResourceNotFoundException {
		Film film = filmRepo.findById(filmId)
				.orElseThrow(() -> new ResourceNotFoundException("Film not found for this id :: " + filmId));

		filmRepo.delete(film);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}



	/* store table methods */
	@GetMapping("/allStores")
	public @ResponseBody
	Iterable<Store> getAllStores() {return storeRepo.findAll();}


}
