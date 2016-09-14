package com.example.nhan.pokemonquizzapp1.models;

/**
 * Created by Nhan on 9/14/2016.
 */
public class Pokemon {
    private String pokemonName;
    private String tags;
    private String pokemonImage;
    private String pokemonColor;

    public Pokemon(String pokemonName, String tags, String pokemonImage, String pokemonColor) {
        this.pokemonName = pokemonName;
        this.tags = tags;
        this.pokemonImage = pokemonImage;
        this.pokemonColor = pokemonColor;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPokemonImage() {
        return pokemonImage;
    }

    public void setPokemonImage(String pokemonImage) {
        this.pokemonImage = pokemonImage;
    }

    public String getPokemonColor() {
        return pokemonColor;
    }

    public void setPokemonColor(String pokemonColor) {
        this.pokemonColor = pokemonColor;
    }
}
