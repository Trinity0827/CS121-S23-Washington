package Project2;

import java.util.Scanner;

public class PokemonSelection {
    private Scanner sc = new Scanner(System.in);

    public Pokemon createPokemon(){
        System.out.println("Enter Pokemon name:");
        String pokeName = sc.nextLine();
        System.out.println("Enter HP:");
        int pokeHP = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Move:");
        String pokeMove = sc.nextLine();
        System.out.println("Enter Move's Power: ");
        int pokePower = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Attack Speed:");
        int pokeSpeed = Integer.parseInt(sc.nextLine());
        return new Pokemon( pokeName, pokeHP, pokeMove, pokePower, pokeSpeed);
    }

    public void assignPokemon(){
        System.out.println("Player 1: Select a Pokemon and enter its stats");
        Pokemon poke1 = createPokemon();
        System.out.println("\nPlayer 2: Select a Pokemon and enter its stats");
        Pokemon poke2 = createPokemon();
        System.out.println("\nPlayer 1 Pokemon");
        System.out.println("----------------");
        System.out.println(poke1.displayPokemonStats());
        System.out.println("\nPlayer 2 Pokemon");
        System.out.println("----------------");
        System.out.println(poke2.displayPokemonStats());
        sc.close();
    }

}
