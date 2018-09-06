package edu.ap.spring.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Joke {
    @Id
    private
    String joke;

    public Joke() {

    }

    public Joke(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}
