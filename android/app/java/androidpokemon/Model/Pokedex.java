package androidpokemon.Model;

public class Pokedex {
    public List<Pokemon> pokemon;

    public Pokedex() {
    }

    public Pokedex(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public List<Pokemon> pokemon() {
        return pokemon;
    }

    public void setpokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

}
