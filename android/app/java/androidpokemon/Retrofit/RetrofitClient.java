package androidpokemon.Retrofit;

import retrofit2.Retrofit;

public class RetrofitClient {
    private static Retrofit instace;

    public static Retrofit getInstace() {
        if(instace == null)
            instace = new androidpokemon.Retrofit.Builder()
                    .baseUrl("https://raw.githubusercontent.com/Biuni/PokemonGO-Pokedex/master/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        return instace;
    }
}