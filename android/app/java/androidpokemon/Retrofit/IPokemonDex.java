package androidpokemon.Retrofit;

import android.database.Observable;
import androidpokemon.Model.Pokedex;
import retrofit2.http.GET;

public interface IPokemonDex {
    @GET("pokedex.json")
    Observable<Pokedex> getListPokemon();
}
