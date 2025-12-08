import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); {
                int torchCount;

                // --- Collect basic character info ---
                System.out.print("Enter your character's name: ");
                String name = in.nextLine();

                System.out.print("Choose a pronoun subject (he/she/they): ");
                String proSubj = in.next().toLowerCase();         // e.g., he / she / they

                System.out.print("Choose a pronoun object (him/her/them): ");
                String proObj = in.next().toLowerCase();          // e.g., him / her / them

                System.out.print("Choose a possessive adjective (his/her/their): ");
                String proPossAdj = in.next().toLowerCase();      // e.g., his / her / their

                System.out.print("Enter your character's age: ");
                int age = in.nextInt();

                // An example integer you can reference later (feel free to rename/use differently)
                int gold = 12;

                // --- Prologue paragraph (≥ 5 sentences using ≥ 5 variables) ---
                System.out.println();
                System.out.println("~ ~ ~ Adventure Prologue ~ ~ ~");
                System.out.println(name + " set out at dawn, " + proPossAdj + " pack light and hopes high.");
                System.out.println("At only " + age + " years old, " + proSubj + " already carries stories that most would never dare to tell.");
                System.out.println("In the pouch at " + proPossAdj + " side clinked " + gold + " gold coins— "
                        + "not much, but enough for bread and a bed in a quiet inn.");
                System.out.println("A weathered sign pointed toward the Whispering Woods, and " + proSubj
                        + " felt a shiver that had nothing to do with the cold.");
                System.out.println("Whatever waited beyond the treeline would test " + proObj + ", but " + name
                        + " walked on without looking back.");

                // (You will add TWO more paragraphs below for your submission.)
                // TIP: Use more variables to store place names, items, stats, etc.

                //Prologue continues
                System.out.println(name + " took the first steps in the Whispering Woods, never been more sure in " + proPossAdj + " life. " + name + " wondered, is this fate? Or is this destiny?");
                System.out.print("As " + name + " kept walking, " + proSubj + " came across a few paths, only two of them viable. " + name + " must now make a choice. Take the shorter but more dangerous path, or take the longer but less dangerous path. ");

                int shorterPath = 7; //Sets the shorter path to 7 months. Meant to supply a sense of choice and consequence.
                double longerPath = 1.4; //Sets the longer path to 1.4 years. Meant to supply a sense of choice and consequence.
                
                System.out.println(name + " must make a choice. Shorter path will take " + shorterPath + " months, but the Longer path will take " + longerPath + " years. " + name + " wonders shorter path, or the longer path?'");
                String selectedPath = in.next().toLowerCase(); //To take the shorter path, or to take the longer path? Gives the user a choice to make.

                System.out.println(name + " has made their choice, the " + selectedPath + " path is the path to be taken. The journey begins!");

                //Chapter 1: Looping!
                //This block of if-elses will determine which path the user chose and will print out the corresponding story message.
                System.out.println(name + " ventures deeper into the journey, " + proSubj + " comes across another decision to make, to continue on the " + selectedPath + " path, or to cross over to the path?");
                selectedPath = in.next().toLowerCase();

                System.out.println("As " + name + " continues on the path " + proSubj + " chose, after some time in the woods, " + proSubj + " comes across a small little village with an inn not far from the path, " + proSubj+ " notices that " + proSubj+ " been walking for longer than intended, forgot to setup camp but notices the village in the distance, a short walk as the sun sets, " + proSubj + " wonders if staying at the inn would good for the night or if maybe " + proSubj + " should keep going.");
                System.out.println("Choose Shorter to stay at the inn, or Longer to keep going:");
                if (selectedPath.equals("shorter")) {//Lets the user decide to stay at the inn or keep going. The if-else block here will display the corresponding story message based on the user's choice.
                        System.out.println(name + " decides to stay at the inn for the night, " + proSubj + " and continue the journey the next day.");
                }
                else if (selectedPath.equals("longer")) {//Lets the user decide to stay at the inn or keep going.
                        System.out.println(name + " chooses to keep going, " + proSubj + " doesn't want to waste any time and wants to get to the destination as soon as possible, as the path is long and arduous.");
                }
                while (selectedPath.equals("longer")) {//If the user chooses to keep going(longer path), this loop will continue and the code will move on to the for loop below.
                        System.out.println(name + " wakes up the next day, feeling refreshed and ready to continue the journey. " + proSubj + " packs up " + proPossAdj + " things and heads out of the inn, continuing on the path.");
                        break;
                }

                System.out.println("after some time in the whispering Woods, " + name + " notices the sun is setting for the day, " + proSubj + " needs to setup camp for the night and place some torches around to the keep the camp lit and rest for the night.");
                System.out.println("Choose number of torches to place:");
                torchCount = in.nextInt();
                for (int i = 1; i <= torchCount; ++i) {//Take input from user and places that number of torches around the camp then continues. Meant to give the user some story interaction. Rather than just a simple choice.
                        System.out.println(name + " places torch " + i + " to light up the camp.");
                }
                System.out.println("Torches have been placed. " + name + " can now rest for the night and continue the journey the next day.");

                //Chapter 2: Arrays and Switch Statements!
                //This block of code sets up an array to store the number of monsters on each path and will be used later in the code to determine the number of monsters the user will face based on the path chosen.
                int[] monstersPerPath = {4, 6, 10}; //0 = shorter path with more monsters, 1 = longer path with less monsters but stronger and larger.
                int monstersOnPath = 0;
                int moreMonsters = 0; //Sets the number of additional monsters on the path to 15. Meant to give the user a sense of danger and more interaction.

                if (selectedPath.equals("shorter")) {
                        monstersOnPath = monstersPerPath[0]; //If the user chose the shorter path, this will set the number of monsters on the path to 4.
                        moreMonsters = monstersPerPath[2]; //Sets the number of additional monsters on the path to 10.
                }
                else if (selectedPath.equals("longer")) {
                        monstersOnPath = monstersPerPath[1]; //If the user chose the longer path, this will set the number of monsters on the path to 6.
                }

                System.out.println(name + " continues the journey, " + proSubj + " notices the road is getting rougher and more exhausting. " + proSubj + " knows that there are " + monstersOnPath + " monsters on this path, " + "and " + moreMonsters + " more monsters expected later. " + proSubj + " must make a choice: continue on the " + selectedPath + " path, or cross over?");
                if (selectedPath.equals("shorter")) {//If the user chose the shorter path, this will execute.
                        System.out.println("There are many monsters on this path, " + name + " must make a choice to either go in sword drawn, or try to sneak past them. Sadly for the young adventurer, " + proSubj + " has to make a choice for that is his only option. Time is of the essence, and " + name + " cannot delay.");
                }
                else if (selectedPath.equals("longer")) {//If the user chose the longer path, this will execute.
                        System.out.println("If " + name + " chooses the road to less monsters by continuing on the longer path, " + proSubj+ " can see that there are " + monstersPerPath[0] + " 4 monsters on this path, lesser, however stronger and larger, but the will slow the journey down. " + proSubj + " will have to hurry. This means less stops for meals, rest, and sleep. This will be a choice for " + name + " to make, but " + proSubj + " must make it.");
                }
                System.out.println("Will " + name + " choose to FIGHT or SNEAK past the monsters?");
                String combatChoice = in.next().toLowerCase();

                //Prompt the user for their choice of combat style.
                switch (combatChoice) {
                        case "fight" -> System.out.println(name + " draws " + proPossAdj + " weapon and prepares for a direct confrontation.");
                        case "sneak" -> System.out.println(name + " keeps to the shadows, moving quietly and carefully around the threat. However that would be so easy, the monsters have a more heightened sense of smell and hearing.");
                        default -> System.out.println(name + " hesitates, uncertain of what lies ahead.");
                }
                if (combatChoice.equals("fight")) {//If the user chooses to fight, this loop block will trigger. Giving the user loot.
                        System.out.println("\nAfter the battle, " + name + " stands victorious but weary, " + name + " starts looting the dead monsters for any useful items or gold.");
                        
                        int rewardsCollected = 0;
                        for (int i = 1; i <= monstersOnPath; ++i) {
                                int goldFound = 5 + (int)(Math.random() * 16); //Random gold found between 5 and 20.
                                rewardsCollected += goldFound;
                                System.out.println("Monster " + i + " defeated! " + name + " found " + goldFound + " gold.");
                        }
                        gold += rewardsCollected;
                        System.out.println(name + " collected a total of " + rewardsCollected + " gold. " + proSubj + " now has " + gold + " gold in total. " + name + " moves forward."); //Add the total of gold collected to the user's total gold.
                        Chapter3.advContinues(name, 100, 30, selectedPath, proObj, proSubj, proPossAdj); //Calls the method below to continue the story.
                }
        }
    }
}