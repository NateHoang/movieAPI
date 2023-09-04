package dev.natehoang.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "movies") //store the data in a collection called movies in the database of MongoDB
@Data //Takes cares of getters and setters for all of the fields
@AllArgsConstructor //Takes care of the constructor that takes all the fields as arguments
@NoArgsConstructor //Takes care of the constructor that takes no arguments
public class Movie{
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;
}