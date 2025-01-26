package PokemonGame_feedback_v1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlyPokemon extends Pokemon implements IFlyable {

    //생성자
    public FlyPokemon(String category, int HP, int LV, int AP, int Defence, String pokemonName) {
        super(category, HP, LV, AP, Defence, pokemonName);
    }

    @Override
    public void fly(String tgCity) {
        System.out.println(tgCity + " 로 날아갑니다.");
    }

    @Override
    public void oceanCrossable(String tgCity) {
        fly(tgCity);
        System.out.println(tgCity + "에 도착했습니다!");
    }
}
