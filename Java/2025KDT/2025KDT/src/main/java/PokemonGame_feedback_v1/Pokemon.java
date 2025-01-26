package PokemonGame_feedback_v1;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static PokemonGame_feedback_v1.PokeDex.PokemonByName;
import static PokemonGame_feedback_v1.PokeDex.evolvedDict;
import static PokemonGame_feedback_v1.Trainer.capturedPokemonList;


@Getter
@Setter
public class Pokemon implements IPokemon {
    private Map<String, Pokemon> pokemonList = new HashMap<>(PokemonByName);
    //속성
    private String category;
    //체력 int
    private int HP;
    //레벨
    private int LV;
    //공격력 (레벨에 따라 영향)
    private int AP;
    //방어력
    private int DP;
    //포켓몬 종류 이름
    private String pokemonName;  // 피카츄 -> 라이츄
    //유저가 붙이는 별칭 (필요시)
    private String customName;  // 전기돌이

    public int setCategory(String category) {
        this.category = category;
        return 0;
    }


    //생성자
    public Pokemon(String category, int HP, int LV, int AP, int Defence, String pokemonName) {
        this.category = category;
        this.HP = HP;
        this.LV = LV;
        this.AP = AP;
        this.DP = Defence;
        this.pokemonName = pokemonName;
    }

    @Override
    public void attack(Pokemon tgPokemon) {
        // 적 방어력 고려한 데미지 계산
        // (AP / 적Defence) * AP = 데미지(소수점 제외)
        tgPokemon.setHP((this.getHP()/ tgPokemon.getDP()) * this.getAP());
    }

    @Override
    public void flee(Pokemon enemyPokemon) {
        //결과출력
        //TODO : 적 레벨에 다른 도망 성공 확률 변화 (확률로 구현 예정)
        int enemyLv = enemyPokemon.getLV();
        int myPokemonLv = this.getLV();
        if (enemyLv > myPokemonLv) {
            System.out.println("도망치는데 실패했습니다.");
            attack(enemyPokemon);
        } else {
            System.out.println("도망치는데 성공했습니다!");
        }
    }

    @Override
    public EvolvedPokemon evolve(String pokemonName) {
        //TODO : 진화 조건 명시, 구현 (진화조건은 뭘로??)

        // TODO : PokeDex 에 진화형 모두 미리 등재 후,
        //        포켓몬별 진화 순서도 Dex 에서 검색 가능하도록 미리 추가
        //TODO : 진화되었으니 새 객체 생성 후 리턴, 보유리스트에서 삭제, Dex 에 업데이트
        //기존의 보유리스트에서 제거
        Pokemon pokemon = pokemonList.get(pokemonName);
        capturedPokemonList.remove(pokemon);
        //포켓몬 이름에 맞는 진화 객체 get()
        List<EvolvedPokemon> evolveList = evolvedDict.get(pokemonName);
        //이름 비교해서 다음 인덱스에 해당하는 포켓몬 가져오기
        if (pokemonName.equals(evolveList.get(0).getPokemonName())) {
            capturedPokemonList.add(evolveList.get(1));
            System.out.println(pokemonName + " 이/가 " + evolveList.get(1).getPokemonName() + "로 진화했습니다!!");
        } else {
            capturedPokemonList.add(evolveList.get(0));
            System.out.println(pokemonName + " 이/가 " + evolveList.get(0).getPokemonName() + "로 진화했습니다!!");
        }
        //보유리스트에 추가

        //진화 텍스트 출력






//        //체력 증가
//        int newHP = this.getHP() + 5;
//        //레벨변겅 this.setters()
//        int newLV = this.getLV() + 1;
//        //공격력 증가 this.setters()
//        int newAP = this.getAP() + 3;
//        //방어력 증가 this.setters()(0.3배수)
//        int newDefence = (int) Math.round(this.getDP() * 1.3);
//        String newPokemonName = pokemonName + " LV." + newLV;
        //이름만 들어간 리스트에서 이름만 가져오기 되나?
//        EvolvedPokemon  = new EvolvedPokemon(
//                this.getCategory(),
//                newHP,
//                newLV,
//                newAP,
//                newDefence,
//                newPokemonName

//        );
    }

}
