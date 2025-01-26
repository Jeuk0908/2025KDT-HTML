package PokemonGame_feedback_v1;

import lombok.Getter;
@Getter
class EvolvedPokemon extends Pokemon {
    public EvolvedPokemon(String category, int HP, int LV, int AP, int Defence, String pokemonName) {
        super(category, HP, LV, AP, Defence, pokemonName);
    }
}
