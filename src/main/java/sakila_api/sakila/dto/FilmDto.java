package sakila_api.sakila.dto;
import javax.persistence.*;

@Entity
@Table(name="film")

public class FilmDto {

    int id;
    String filmTitle;
    String filmDescription;
    int filmReleaseYear;
    int filmLanguageId;
    int filmRentalDuration;
    double filmRentalRate;
    int filmLength;
    double filmReplacementCost;
    String filmRating;
    String filmSpecialFeatures;

    public FilmDto (
            String filmTitle,
            String filmDescription,
            int filmReleaseYear,
            int filmLanguageId,
            int filmRentalDuration,
            double filmRentalRate,
            int filmLength,
            double filmReplacementCost,
            String filmRating,
            String filmSpecialFeatures
            ){
        this.filmTitle=filmTitle;
        this.filmDescription=filmDescription;
        this.filmReleaseYear=filmReleaseYear;
        this.filmLanguageId=filmLanguageId;
        this.filmRentalRate=filmRentalRate;
        this.filmRentalDuration=filmRentalDuration;
        this.filmLength=filmLength;
        this.filmReplacementCost=filmReplacementCost;
        this.filmRating=filmRating;
        this.filmSpecialFeatures=filmSpecialFeatures;

    }

    public FilmDto(){
    }

    public int getId() {return id;}

    public String getFilmTitle(){return this.filmTitle;}

    public String getFilmDescription(){return this.filmDescription;}

    public int getFilmRelease_year(){return this.filmReleaseYear;}

    public int getFilmLanguage_id(){return this.filmLanguageId;}

    public int getFilmRental_duration(){return this.filmRentalDuration;}

    public double getFilmRental_rate(){return this.filmRentalRate;}

    public int getFilmLength(){return this.filmLength;}

    public double getFilmReplacement_cost(){return this.filmReplacementCost;}

    public String getFilmRating(){return this.filmRating;}

    public String getFilmSpecial_features(){return this.filmRating;}

    public void setDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFilmLanguage_id(int filmLanguageId) {
        this.filmLanguageId = filmLanguageId;
    }

    public void setFilmLength(int filmLength) {
        this.filmLength = filmLength;
    }


    public void setFilmRating(String filmRating) {
        this.filmRating = filmRating;
    }

    public void setFilmRelease_year(int filmReleaseYear) {
        this.filmReleaseYear = filmReleaseYear;
    }

    public void setFilmRental_duration(int filmRentalDuration) {
        this.filmRentalDuration = filmRentalDuration;
    }

    public void setFilmRental_rate(double filmRentalRate) {
        this.filmRentalRate = filmRentalRate;
    }

    public void setFilmReplacement_cost(double filmReplacementCost) {
        this.filmReplacementCost = filmReplacementCost;
    }

    public void setFilmSpecial_features(String filmSpecialFeatures) {
        this.filmSpecialFeatures = filmSpecialFeatures;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

}
