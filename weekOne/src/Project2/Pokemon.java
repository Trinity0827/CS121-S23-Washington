package Project2;

public class Pokemon {

//instance Variables
    private String pokeName;
    private int pokeHP;
    private String pokeMove;
    private int pokePower;
    private int pokeSpeed;


//Constructor
    public Pokemon(String pokeName, int pokeHP, String pokeMove, int pokePower, int pokeSpeed) {
        this.pokeName = pokeName;
        this.pokeHP = pokeHP;
        this.pokeMove = pokeMove;
        this.pokePower = pokePower;
        this.pokeSpeed = pokeSpeed;
    }

//Getters
    public String getPokeName() {
        return pokeName;
    }

    public int getPokeHP() {
        return pokeHP;
    }

    public String getPokeMove() {
        return pokeMove;
    }

    public int getPokePower() {
        return pokePower;
    }

    public int getPokeSpeed() {
        return pokeSpeed;
    }


//Setters
    public void setPokeName(String pokeName) {
        this.pokeName = pokeName;
    }

    public void setPokeHP(int pokeHP) {
        this.pokeHP = pokeHP;
    }

    public void setPokeMove(String pokeMove) {
        this.pokeMove = pokeMove;
    }

    public void setPokePower(int pokePower) {
        this.pokePower = pokePower;
    }

    public void setPokeSpeed(int pokeSpeed) {
        this.pokeSpeed = pokeSpeed;
    }


//Display
    public String displayPokemonStats(){
        return "Name: " + pokeName + "\nHit Points: " + pokeHP + "\nMove: " + pokeMove + "\nMove Power: " +
                pokePower + "\nAttack Speed: " + pokeSpeed;
    }

}





