package PokemonGame_feedback_v1;


import java.util.*;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Trainer implements ITrainer {
    //포획 포켓몬 리스트
    public static List<Pokemon> capturedPokemonList = new ArrayList<>();
    public static Map<String, Pokemon> capturedPokemonName = new HashMap<>();
    Scanner inputReader = new Scanner(System.in);

    //쳉육관 관장 boolean
    private boolean GymBoss;
    //현재 위치
    private String currentLocation;
    //이름 String
    private String name;
    //성별


    //생성자
    public Trainer(boolean gymBoss,  String currentLocation, String name) {
        GymBoss = gymBoss;
        this.currentLocation = currentLocation;
        this.name = name;
    }

    @Override
    public void hunt(Pokemon wildPokemon) {
        //포켓몬 사냥은 그냥 야생에서 만난 포켓몬 잡는것.
        System.out.println("야생의 '" + wildPokemon + "' 이 나타났다!" );
        //TODO : 배틀 명령어 입력 1.공격하기 2.도망가기
        System.out.println("무엇을 하시겠습니까? : 1.공격하기 / 2.도망가기");
        int battleOrCaptured = inputReader.nextInt();
        switch (battleOrCaptured) {
            case 1:
                //TODO : battle 이기면 capture 진행
                if (battle(wildPokemon)) {
                    Pokemon capturedPokemon = capture(wildPokemon);
                    if (capturedPokemon != null) {
                        capturedPokemonList.add(capturedPokemon);
                        capturedPokemonName.put(capturedPokemon.getPokemonName(), capturedPokemon);
                    }
                }else{
                    System.out.println("포획에 실패했습니다.");
                    return;
                }
                break;
            case 2:
                //도망가기
                break;
        }
    }

    @Override
    public Pokemon capture(Pokemon wildPokemon) {
        //확률적 포획성공 (가중치 적용)
        if (((double) wildPokemon.getLV() / 100) > Math.random()) {
            System.out.println("'" + wildPokemon.getPokemonName() + "' 포획에 실패했습니다.");
            return null;
        } else {
            System.out.println("'" + wildPokemon.getPokemonName() + "' 포획에 성공!!");
            return wildPokemon;
        }
    }

    @Override
    public boolean battle(Pokemon wildPokemon) {
        //포켓몬 getter, setter 호출
        List<Pokemon> myLineUp = this.getCapturedPokemonList();
        //보유한 포켓몬 순서대로 공격
        for (Pokemon pokemon : myLineUp) {
            while ((pokemon.getHP()) != 0 && (wildPokemon.getHP() != 0)){ //드모르간 법칙으로 대체 가능
                pokemon.attack(wildPokemon);
                wildPokemon.attack(pokemon);
            }
        }
        if (wildPokemon.getHP() == 0) {
            System.out.println("트레이너 승리!");
            return true;
        } else {
            System.out.println("트레이너 패배,,,");
            return false;
        }
    }

    @Override
    public void battle(Trainer enemyTrainer) {
        //
    }

    @Override
    public Map<String, Pokemon> searchDex(PokeDex.PokeCategory category) {
        return PokeDex.searchPokemon(category);
    }

    @Override
    public Pokemon searchDex(String pokemonName) {
        return PokeDex.searchPokemon(pokemonName);
    }

    public void crossable(String tgCity) {
        for (Pokemon myPokemon : capturedPokemonList) {
            //날 수 있는 포켓몬이면 이동가능
            if (myPokemon instanceof IOceanCrossable) { //날거나 수영 가능한 타입이면
                ((IOceanCrossable) myPokemon).oceanCrossable(tgCity); //이동 가능
                this.setCurrentLocation(tgCity);
            }
        }
    }
}
