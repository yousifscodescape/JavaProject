import java.util.Random;
import java.util.Scanner;
//Chapter 3: Leaving the Whispering Woods! (Introducing new elements and depth via methods)
public class Chapter3 {
        
    public static String advContinues (String name, int baseHP, int hpAfterBattle, String selectedPath, String proObj, String proSubj, String proPossAdj) {//This method takes in several parameters from the previous method to keep the story flowing.
                Scanner in = new Scanner(System.in);
                Random rand = new Random();
                int min = 0; //Minimum health
                int max = 100; //Maximum Health
                hpAfterBattle = rand.nextInt(max - min + 1) + min;

                System.out.println("After the battle, " + name + " felt less energized, realizing that the battle depleted " + hpAfterBattle + " out of " + baseHP + " HP." + name + " now has " + (baseHP - hpAfterBattle) + " HP left and must find a way to recover. A health flask would be useful till the adventurer can rest next. " + name + " Is beginning to finally leave the Whispering Woods, and is starting to enter the ");
                System.out.println(name + " continues on the " + selectedPath + " path, feeling the weight of the journey on " + proPossAdj + " shoulders. " + proSubj + " knows that " + proObj + " must stay strong to face whatever challenges lie ahead. However, " + proSubj + " begins to question if " + proSubj + " made the right choice by walking out the door that day. \"What if I had stayed home? What if I had chosen to not walk out my door? There is a lot at stake here. The world, is at stake. I must keep going. Whatever it takes.\" " + name + " thinks to " + proObj + "self.");
                System.out.println(name + " wakes from a nights rest, continuing " + proObj + " journey. As the adventurer walks, " + proSubj + " begins to understand, the path " + proSubj + " choose can longer be changed and must commit to it. Anticipating danger along the way regardless of path... or... maybe the shorter is slightly more dangerous.");
                System.out.println("While " + name + " kept walking, " + proSubj + " came across another choice, but this time, it was a little different. " + name + " was walking in the mountains, and suddenly, the whether was out of control. A storm had formed, " + proSubj + " knew this wasn't natural, a higher power was determined to not to let " + proSubj + " reach his destination. For evil had already reached said higher power.");
                System.out.println(" The choice in question? the adventurer asked " + proObj + " \"Should I stay on this horrible whether and be determined to reach my destination? Or shall I take the Mines of Mor?");
                //selectedPath = in.next();
                if (selectedPath.equals("stay on the path")) {//Different paths this time within the chosen path from before. This if-else block will determine which path the user chose and will print out the right message
                        System.out.println(name + " chose to stay in the storm path. The journey will be difficult. " + name + " keeps going, at the cost being extremely cold and can barely move. ");
                }
                else if (selectedPath.equals("mines of mor")) {
                        System.out.println(name + " chooses the Mines of Mora. A dark, sunless, long abandoned kingdom by it's people who had to flee their home. An ancient sleeping evil lies within those walls. " + name + " knows better than to wake it up. But there is chance still that kingdom can be crossed without disturbing the evil. ");
                }
                battles(max, min, max, hpAfterBattle, hpAfterBattle, proSubj, name, selectedPath); //Calls the method below to handle battles and dash out different attacks.
                in.close();
                return "";
        }
        public static String battles (int swordDamage, int minDamage, int maxDamage, int monsterHealth, int monsterRemainingHealth, String proSubj, String name, String selectedPath) {//This method will determine the amount of damage delt and how much health monsters will lose when attacked.
                Scanner in = new Scanner(System.in);
                Random rand = new Random();
                minDamage = 10; //Minimum damage
                maxDamage = 30; //Maximum damage
                monsterHealth = 100; //Sets the monster health to 100.

                String[] validPaths = {"stay on the path", "mines of mor"};
                        selectedPath = Chapter4.getValidatedPhrase(in, validPaths,
                "Choose your next path (\"stay on the path\" or \"mines of mor\"): ");
                if (selectedPath.equals("stay on the path")) {
                        System.out.println("As " + name + " continues on the stormy path, " + proSubj + " comes across a group of special monsters called Ice Giants blocking the way. " + name + " has to fight them to continue. The monsters have " + monsterHealth + " HP. Fire based attacks are most effective against them, such as a flaming sword or fireball spell. ");
                }
                else if (selectedPath.equals("mines of mor")) {
                        System.out.println("As " + name + " ventures into the Mines of Mor, " + proSubj + " encounters a group of Shadow Goblins lurking in the within. To proceed, " + name + " must defeat them. The monsters have " + monsterHealth + " HP. Shadow Goblins are weak to light-based attacks, like a torch or lighting the sword on fire. ");
                }
                System.out.print("Choose your attack type (fire, sword, light): ");
                String attackType = in.next().toLowerCase();

                boolean isEffective = false;

                if ((selectedPath.equals("stay on the path") && attackType.equals("fire")) ||
                        (selectedPath.equals("mines of mor") && attackType.equals("light"))) {
                        isEffective = true;
                        System.out.println("It's super effective! +10 bonus damage per hit!");
                }
                if (isEffective) {
                        swordDamage += 10;
                }
                System.out.println(name + " engages the monsters with a " + attackType + " attack!");
                System.out.println("After the battle, " + name + " comes out victorious. " + proSubj + " is ready to take a health flask and restore his health.");
                Chapter4.inventory(name, proSubj); //Calls the method below to handle inventory management.
                return "";
        }
}
