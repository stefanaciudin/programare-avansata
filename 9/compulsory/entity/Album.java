package entity;

import jakarta.persistence.*;

/**
 * Class Album - model for an album from the database
 */

@Entity
@NamedQuery(name = "Album.findByName", query = "SELECT a FROM Album a WHERE LOWER(a.title) LIKE LOWER(:name)")
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name="release_year")
    private int releaseYear;
    @Column(name="title")
    private String title;


    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", releaseYear=" + releaseYear +
                ", title='" + title + '\'' +
                '}';
    }
}
