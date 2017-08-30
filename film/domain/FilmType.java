package com.shxt.modual.film.domain;

import java.util.List;

public class FilmType {
private String id;
private String t_name;
public List<Film> getFilms() {
	return films;
}
public void setFilms(List<Film> films) {
	this.films = films;
}
private List<Film> films;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getT_name() {
	return t_name;
}
public void setT_name(String t_name) {
	this.t_name = t_name;
}
@Override
public String toString() {
	return "FilmType [id=" + id + ", t_name=" + t_name + ", films=" + films + "]";
}


}
