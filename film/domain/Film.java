package com.shxt.modual.film.domain;

public class Film {
private String id;
private String film_name;
private Integer show_time;
private String film_type_id;
private FilmType filmtype;
public FilmType getFilmtype() {
	return filmtype;
}
public void setFilmtype(FilmType filmtype) {
	this.filmtype = filmtype;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFilm_name() {
	return film_name;
}
public void setFilm_name(String film_name) {
	this.film_name = film_name;
}

public Integer getShow_time() {
	return show_time;
}
public void setShow_time(Integer show_time) {
	this.show_time = show_time;
}
public String getFilm_type_id() {
	return film_type_id;
}
public void setFilm_type_id(String film_type_id) {
	this.film_type_id = film_type_id;
}
@Override
public String toString() {
	return "Film [id=" + id + ", film_name=" + film_name + ", show_time=" + show_time + ", film_type_id=" + film_type_id
			+ "]";
}


}
