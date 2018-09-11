package homework02;

import java.util.Scanner;

public class chooseYourOwn {

	//This code creates a choice your own adventure game
	
	public static void main(String[] args) {
	
		//Creates a scanner to accept user input
		Scanner key = new Scanner(System.in);
		
		//First option of the game, user chooses object
		System.out.println("Welcome to the Crimson Isles! Try your best not to die, well not "
				+ "too fast at least. You can choose one of the three object on the table in "
				+ "front of you to help. Enter \"sword\", \"staff\", or \"book\".");

		String object = key.nextLine();
		
		//One of three starting if statements- will lead to five different endings
		if(object.equalsIgnoreCase("sword"))
		{
			System.out.println("You have chosen the sword. You're well on your way to becoming "
					+ "cannon fodder for the nobles. Would you like to take a class or practice "
					+ "directly on some evil goblins. Enter \"class\" or \"goblin\".");
			
			String fodder = key.nextLine();
				
			//Secondary if statement- leading directly to two ending
				if(fodder.equalsIgnoreCase("class"))
				{
					System.out.println("You have decided to take the class on swordsmanship "
							+ " you are taught how to swing a sword by Lord Drismas. You now "
							+ "owe him 5 gold coins. You can either serve him for life or gamble "
							+ "in the tavern in hopes of gaining the money. Enter \"serve\" or \"gamble\".");
					
					String lord = key.nextLine();
					
					//Tertiary if statement- ending 1
						if(lord.equalsIgnoreCase("serve"))
						{
							System.out.println("You have decided to serve Lord Drismas. After "
									+ " serving for many years you retire and raise a family on "
									+ " land given by the Lord. You die happy and surrounded by family.");
							
							System.exit(0);
						}
						
						//Tertiary if statement- ending 2
						else if(lord.equalsIgnoreCase("gamble"))
						{
							System.out.println("You have decided to gamble to repay the "
									+ "fee for the swordsmanship class. You go to the local "
									+ "tavern to gamble. After a few hours you are arrested for "
									+ "cheating. You are then executed for breaking the law.");
							
							System.exit(0);
						}
						
						//Else statement in case user enters a non-asked for word
						else
						{
							System.out.println("That is not an option.");
							System.exit(0);
						}
				}
				
				//Secondary if statement- leads to one ending
				else if(fodder.equalsIgnoreCase("goblin"))
				{
					System.out.println("With absolutely no experiences you have decided to hunt "
							+ "goblins. You see a group of calvary heading towards the goblin camp, "
							+ "you can either try to get them to help you or you can go to a different "
							+ "goblin camp. Enter \"help\" or \"leave\".");
					
					String calvary = key.nextLine();
					
					//Tertiary if statement- ending 3
					if(calvary.equalsIgnoreCase("help"))
					{
						System.out.println("You stand in the middle of the road waiting "
								+ "for the calvary to come. They refuse to stop at your "
								+ "call and continue forward. They trampel you and you "
								+ "die an unjust death.");
						System.exit(0);
					}
					
					//Tertiary if statement- leads to two endings
					else if(calvary.equalsIgnoreCase("leave"))
					{
						System.out.println("You decided to head away from the calvary. "
								+ "While leaving you see an old man playing dice on the "
								+ "side of the road. You try to walk by but he forces you "
								+ "to play. He says if you roll a certain number he will "
								+ "reward you. Enter the number you roll on a six sided die.");
						
						int roll = key.nextInt();
						
						//Quarternary if statement- ending 4
						if(roll == 5)
						{
							System.out.print("The old man is stunned and stares at the "
									+ " die with amazment. He then looks you up and down "
									+ "and begrudingly reaches into his dirty rucksack. "
									+ "He pulls out a wornout sword which he hands to you "
									+ "along with these words, \"this is an ubeatable sword "
									+ " which will bring you great glory\". Although you do "
									+ " not believe the old man. You decided to use the sword "
									+ "and with it you become invicible. Through this mythical "
									+ "sword you are able to establish an empire which lasts for eons.");
							System.exit(0);
						}
						
						//Quarternary if statement- ending 5
						else
						{
							System.out.println("The old man laughs at you and forces "
									+ "you to leave. You head to the golbin camp and "
									+ "begin to fight. After 2 hours of non stop fighting "
									+ "the sword grows too heavy for you to hold and you "
									+ "are overrun by golbins.");
							System.exit(0);
						}
					}
					
					//Else statement in case user enters a non-asked for word
					else
					{
						System.out.println("That is not an option.");
						System.exit(0);;
					}
				}
				
				//Else statement in case user enters a non-asked for word
				else
				{
					System.out.println("That is not an option.");
					System.exit(0);
				}
		}
		
		//Second of three primary if statement- leads to 5 different endings
		else if(object.equalsIgnoreCase("staff"))
		{
			System.out.println("You have chosen the staff. You're well on your "
					+ "way to becoming a great mage. The only problem is you "
					+ "don't know any spells. Luckily an old mage lives in the "
					+ "nearby village has a spellbook for sale. You either can "
					+ "buy the book or try to steal it. Enter \"buy\" "
					+ "or \"steal\".");
			
			String spell = key.nextLine();
				
			//Secondary if statement
				if(spell.equalsIgnoreCase("buy"))
				{
					System.out.println("You have chosen the honest method "
							+ "and beesech the mage to sell you the spellbook. "
							+ "After begging, he decides to give you the book "
							+ "for free. Now you aren't sure whether or not the "
							+ "book is real. You can either test it on a chicken "
							+ "or the mage. Enter \"chicken\" or \"mage\".");
					
					String test = key.nextLine();
					
					//Tertiary if statement- leads to one ending
						if(test.equalsIgnoreCase("chicken"))
						{
							System.out.println("You decide to test your new spell "
									+ "out at a chicken walking by. A cone of ice "
									+ "flies out of your staff and freezes the chicken. "
									+ "The spell worked! But now you are being surrounded "
									+ "by angry villagers. You can either fight back or "
									+ "run. Enter \"fight\" or \"run\".");
							
							String chicken = key.nextLine();
							
							//Quartenary if statement- ending 6
								if(chicken.equalsIgnoreCase("fight"))
								{
									System.out.println("You have decided to fight the "
											+ "villagers. After casting your spell once "
											+ "more you fell weak and fall unconscious. "
											+ "upon waking up your hands and feet are bound "
											+ "and you are about to be executed.");
									System.exit(0);
								}
								
								//Quartenary if statement- leads to two endings
								else if(chicken.equalsIgnoreCase("run"))
								{
									System.out.println("You have decided to run from "
											+ "the villagers. You escape the village and "
											+ "see an old man on the side of the road, holding "
											+ "a die. He makes you stop and roll the die. Enter "
											+ "the number you roll on a 12-sided die.");
									int roll = key.nextInt();
									
									//Quintenary if statement - ending 7
										if(roll > 10 && roll >= 12)
										{
											System.out.println("The old man is stunned and stares at the "
													+ "die with amazment. He then looks you up and down "  
													+ "and begrudingly reaches into his dirty rucksack. "  
													+ "He pulls out a wornout staff which he hands to you "  
													+ "along with these words, \"this is a legendary staff "  
													+ " which will bring you great glory\". Although you do "  
													+ " not believe the old man. You decided to use the staff " 
													+ "and with it you become invicible. Through this mythical "  
													+ "staff you are able to establish an empire which lasts for eons.");
											System.exit(0);
										}
										
										//Quintenary if statement - ending 8
										else
										{
											System.out.println("The old man laughs at you and forces "
													+ "you to leave. As you leave you look down the road "
													+ "and see the villagers blocking the way. They attack "
													+ "and overcome you with sheer numbers.");
											System.exit(0);
										}
								}
								
								//Else statement in case user enters a non-asked for word
								else
								{
									System.out.println("That is not an option.");
									System.exit(0);
								}
						}
						
						//Tertiary if statement - ending 9
						else if(test.equalsIgnoreCase("mage"))
						{
							System.out.println("You have decided to test your new spell"
									+ "out on the mage. You chant the spell and cast an "
									+ "ice cone. This infurates the mage and he casts a powerful "
									+ "fireball at you. The fireball swiftly incenreates you.");
							System.exit(0);
						}
						
						//Else statement in case user enters a non-asked for word
						else
						{
							System.out.println("That is not an option.");
							System.exit(0);
						}
				}
					
				//Secondary if statement- ending 10
				else if(spell.equalsIgnoreCase("steal"))
				{
					System.out.println("You have decided to steal the spellbook. "
							+ "You sneak into the village and locate the mage's house "
							+ "after finding the spellbook you start to sneak out of "
							+ "village when a dog begins to bark. Scared by the sound "
							+ "you start to hurry. As you take your last step out of the "
							+ "town, an old man blocks your way. Its the mage. He chants "
							+ "a spell but nothing seems to happen. He then opens his mouth "
							+ " and says \"For trying to steal my book, you shall forever "
							+ "be my slave.\"");
					System.exit(0);
				}
				
				//Else statement in case user enters a non-asked for word
				else
				{
					System.out.println("That is not an option.");
					System.exit(0);
				}
		}
		
		//Third of three primary if statements- leads to 3 different endings
		else if(object.equalsIgnoreCase("book"))
		{
			System.out.println("You have chosen the book. You open the "
					+ "book and see you have joined the presithood. You "
					+ "can either go to the nearest monastery or become "
					+ "a rogue preist. Enter \"monastery\" or \"rogue\".");
			String priest = key.nextLine();
			
			//Secondary if statement- ending 11
				if(priest.equalsIgnoreCase("monastery"))
				{
					System.out.println("You have decided to join the "
							+ "nearest monestary. You join the monastery "
							+ "and live out the rest of your days in seclusion "
							+ "although you are happy, you always regret not seeing "
							+ "the world.");
					System.exit(0);
				}
				
				//Secondary if statement- leads to two endings
				else if(priest.equalsIgnoreCase("rogue"))
				{
					System.out.println("You have decided to become a "
							+ "rogue priest wonder the lands. As you "
							+ "walk down the road, you see an old man "
							+ "by the side of the road. You offer to help "
							+ "him but he refuses and forces you to roll his "
							+ "dice. Enter the value you roll with the six-sided die.");
					int old = key.nextInt();
					
					System.out.println("Enter the value you roll with the twelve-sided die.");
					int man = key.nextInt();
					
					//Tertiary if statement- ending 12
					int sum = old + man;
						if(sum <= 6 && old == 1)
						{
							System.out.println("The old man is stunned and stares at the "  
									+ "dice with amazment. He then looks you up and down "  
									+ "and begrudingly reaches into his dirty rucksack,  "  
									+ "and shakes his head. He then locks eyes with you and "  
									+ "says, \"To another I would give an unbeatable sword or "  
									+ "a legendary staff, but not to you. You I can only give "
									+ "this. You shall be my succesor.\" He hands over his "
									+ "rucksack, and his body breaks down into dust. As if "
									+ "compelled by some great force, you adopt his position "
									+ "and become the old man. You shall wait for years until "
									+ "you finally find your successor and can pass off this "
									+ "heavy mantel.");
							System.exit(0);
						}
						
						//Tertiary if statement- ending 13
						else
						{
							System.out.println("The old man laughs at you and "
									+ "forces you to leave. As you walk away from "
									+ "him, you hear people crying for help. "
									+ "You head towards them only to find an "
									+ "empty clearing. As you walk into the "
									+ "middle of the clearing, bandits step out "
									+ "the forest. The attack you, steal all of your "
									+ "belongings and leave you for the wolves.");
							System.exit(0);
						}
				}
				
				//Else statement in case user enters a non-asked for word
				else
				{
					System.out.println("That is not an option.");
					System.exit(0);
				}		
		}
		
		//Else statement in case user enters a non-asked for word
		else
		{
			System.out.println("That is not an option.");
			System.exit(0);
		}
		
		//Closes the scanner
		key.close();
	}

}