package Project1;

import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {
    public static void main(String[] args) {
        int rounds;
        int player1Wins = 0;
        int player2Wins = 0;


        // Pokemon 1
        String poke1Name;
        int poke1HP;
        String poke1Move;
        int poke1Power;
        int poke1Speed;

        // Pokemon 2
        String poke2Name;
        int poke2HP;
        String poke2Move;
        int poke2Power;
        int poke2Speed;

        Scanner console = new Scanner(System.in);
        Random random = new Random();

        System.out.println("POKEMON BATTLE");
        System.out.println();
        System.out.println("Enter odd number of rounds:");
        rounds = Integer.parseInt(console.nextLine());


        for (int i = 0; i < rounds; i++)
        {
            System.out.println("Player 1: Select a Pokemon and enter it stats");
            System.out.println("Enter name:");
            poke1Name = console.nextLine();
            System.out.println("Enter HP:");
            poke1HP = Integer.parseInt(console.nextLine());
            System.out.println("Enter Move:");
            poke1Move = console.nextLine();
            System.out.println("Enter Move's Power:");
            poke1Power = Integer.parseInt(console.nextLine());
            System.out.println("Enter Attack Speed:");
            poke1Speed = Integer.parseInt(console.nextLine());
            System.out.println();

            // player 2 stats
            System.out.println("Player 2: Select a Pokemon and enter it stats");
            System.out.println("Enter name:");
            poke2Name = console.nextLine();
            System.out.println("Enter HP:");
            poke2HP = Integer.parseInt(console.nextLine());
            System.out.println("Enter Move:");
            poke2Move = console.nextLine();
            System.out.println("Enter Move's Power:");
            poke2Power = Integer.parseInt(console.nextLine());
            System.out.println("Enter Attack Speed:");
            poke2Speed = Integer.parseInt(console.nextLine());


            // Determine round winner
            while (poke1HP > 0 && poke2HP > 0)
            {
                if (poke1Speed > poke2Speed) {
                    poke2HP -= poke1Power;

                    if (poke2HP <= 0) {
                        System.out.println("Player 1's " + poke1Name + " wins this round");
                        player1Wins++;
                    }
                    poke1HP -= poke2Power;
                    if (poke1HP <= 0) {
                        System.out.println("Player 2's " + poke2Name + " wins this round");
                        player2Wins++;
                    }
                } else if (poke2Speed > poke1Speed)
                {
                    System.out.println("in space");
                    poke1HP -= poke2Power;
                    if (poke1HP <= 0) {
                        System.out.println("Player 2's " + poke2Name + " wins this round");
                        player2Wins++;
                    }
                    poke2HP -= poke1Power;


                    if (poke2HP <= 0) {
                        System.out.println("Player 1's " + poke1Name + " wins this round");
                        player1Wins++;
                    }
                } else {
                    int equal = random.nextInt(2);
                    if (equal == 1)
                    {
                        poke2HP -= poke1Power;
                        if (poke2HP <= 0) {
                            System.out.println("Player 1's " + poke1Name + " wins this round");
                            player1Wins++;

                        }
                        poke1HP -= poke2Power;
                        if (poke1HP <= 0) {
                            System.out.println("Player 2's " + poke2Name + " wins this round");
                            player2Wins++;

                        }
                        // }
                    } else{
                        //if(poke2Speed > poke1Speed){
                        poke1HP -= poke2Power;
                        if (poke1HP <= 0) {
                            System.out.println("Player 2's " + poke2Name + " wins this round");
                            player2Wins++;
                        }
                        poke2HP -= poke1Power;

                        if (poke2HP <= 0) {
                            System.out.println("Player 1's " + poke1Name + " wins this round");
                            player1Wins++;
                        }
                    }
                }
            }
            if(i == rounds)
            {
                System.out.println("Final Scores");
                System.out.println("----------------");
            }else
            {
                System.out.println("\nWins");
                System.out.println("----------------");
            }

            System.out.println("Player 1: " + player1Wins);
            System.out.println("Player 2: " + player2Wins);
        }

        if (player1Wins > player2Wins) {
            System.out.println("Player 1 has won the game!!");
        } else {
            System.out.println("Player 2 has won the game!!");
        }
    }
}


