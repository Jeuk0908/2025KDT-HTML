package PokemonGame_feedback_v1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class SurfPokemon extends Pokemon implements ISurfable {

    public SurfPokemon(String category, int HP, int LV, int AP, int Defence, String pokemonName) {
        super(category, HP, LV, AP, Defence, pokemonName);
    }



    @Override
    public void surf(String tgCity) {
        //바다에 뛰어든 상태일때만 바다이동 가능
        System.out.println(tgCity + " 로 헤엄쳐갑니다.");
    }


    @Override
    public void oceanCrossable(String tgCity) {
        // 동일한 최종 결과를 리턴하는 여러가지 구현체를 하나로 묶어서 다룬다
        surf(tgCity);
        System.out.println(tgCity + "에 도착했습니다!");
    }
}
