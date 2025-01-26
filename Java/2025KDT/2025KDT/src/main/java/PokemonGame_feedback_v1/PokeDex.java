package PokemonGame_feedback_v1;

import java.util.*;

public class PokeDex {

    //퐄켓몬별 진화 리스트
    public static Map<String, List<EvolvedPokemon>> evolvedDict = new HashMap<>();
    public static List<EvolvedPokemon> evolvedSquirtle = new ArrayList<>();
    //포켓몬 리스트
    public static Map<String, Pokemon> PokemonByName = new HashMap<>();
    //속성별 포켓몬 리스트
    public static Map<PokeCategory, Map<String, Pokemon>> PokemonByCategory = new HashMap<>();
    //포켓몬 속성
    public enum PokeCategory{WATER, FIRE, EARTH, ELECTRIC, BUG, NORMAL, LEGENDARY, MYSTIC, AIR }


    static {
        for (PokeCategory Category : PokeCategory.values()) {
            PokemonByCategory.put(Category, new HashMap<>());
        }
        //Dex 더미데이터 생성
        Pokemon Squirtle = new Pokemon("WATER", 100,1, 20,20, "꼬부기");
        Pokemon Charmander = new Pokemon("FIRE", 100,1, 20,20, "파이리");
        Pokemon p3 = new Pokemon("EARTH", 100,1, 20, 20, "p3");
        MysticPokemon p4 = new MysticPokemon("EARTH", 300,1, 60, 70, "p4");
        MysticPokemon p5 = new MysticPokemon("FIRE", 300,1, 70, 60, "p5");
        FlyPokemon p6 = new FlyPokemon("AIR", 100, 1, 20, 20, "p6");

        //진화포켓몬 Dex에 추가
        EvolvedPokemon Ernie_boogie = new EvolvedPokemon("WATER", 150, 6, 25, 20, "어니부기");
        EvolvedPokemon Blastoise = new EvolvedPokemon("WATER", 200, 9, 30, 50, "거북왕");
        evolvedSquirtle.add(0,Ernie_boogie);
        evolvedSquirtle.add(1,Blastoise);
        evolvedDict.put("꼬부기", evolvedSquirtle);
        EvolvedPokemon Lizard = new EvolvedPokemon("FIRE", 150, 6, 25, 20, "리자드");
        EvolvedPokemon Charizard = new EvolvedPokemon("FIRE", 200, 9, 30, 50, "리자몽");
        evolvedSquirtle.add(0,Lizard);
        evolvedSquirtle.add(1,Charizard);
        evolvedDict.put("파이리", evolvedSquirtle);



        //포켓몬 더미데이터 리스트화
        PokemonByName.put("꼬부기", Squirtle);
        PokemonByCategory.get(PokeCategory.WATER).put(Squirtle.getPokemonName(), Squirtle);
        PokemonByName.put("파이리", Charmander);
        PokemonByCategory.get(PokeCategory.FIRE).put(Charmander.getPokemonName(), Charmander);
        PokemonByName.put("p3", p3);
        PokemonByCategory.get(PokeCategory.EARTH).put(p3.getPokemonName(), p3);
        PokemonByName.put("p4", p4);
        PokemonByCategory.get(PokeCategory.EARTH).put(p4.getPokemonName(), p4);
        PokemonByName.put("p5", p5);
        PokemonByCategory.get(PokeCategory.FIRE).put(p5.getPokemonName(), p5);
        PokemonByName.put("p6", p6);
        PokemonByCategory.get(PokeCategory.AIR).put(p6.getPokemonName(), p6);

        //Map<Strig, list<전설>> 에다가 이름, 진화포켓몬 객체 리스트 넣고
        //진화 메소드에서, 진화할 포켓몬 이름 get해서 인풋으로.
        //메소드에서는 인풋에 맞는 다음 포켓몬을 인덱스로 불러와서 교체.
        

    }

    //포켓몬 이름 검색
    public static Pokemon searchPokemon(String name) {
        return PokemonByName.get(name);
    }

    //속성별 포켓몬 리스트 출력
    public static Map<String, Pokemon> searchPokemon(PokeCategory category) {
        return PokemonByCategory.get(category);
    }



}
