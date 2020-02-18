package hangmanv3;

import java.io.*;
public class HangGame
{   
    //Declaration and initialisation
    static boolean terminate = false;
    static int w = 0, l = 0;
    String word;
    String clue;
    int option;
    PrintWriter p = new PrintWriter(System.out,true);

    //Function to clear the screen
    public void clearScreen()
    {
        
    	for(int i=1;i<100;i++)
    		 System.out.println();
    	
    }
    //Image1
    public void Hang1() 
    {
        p.println("      _______   ");
        p.println("     |       |");
        p.println("     |");
        p.println("     |");
        p.println("     |");
        p.println("     |");
        p.println("     |");
        p.println("_ _  |_____ ");
    }

    //Image02
    public void Hang2()
    {
        p.println("      _______ ");
        p.println("     |       |");
        p.println("     |      ( )");
        p.println("     |       ");
        p.println("     |");
        p.println("     |");
        p.println("     |");
        p.println("_ _  |_____ ");
    }




    //Image03
    public void Hang3()
    {
        p.println("      _______ ");
        p.println("     |       |");
        p.println("     |      ( )");
        p.println("     |       |");
        p.println("     |       |");
        p.println("     |       |");
        p.println("     |");
        p.println("_ _  |_____ ");
    }

    //Image04
    public void Hang4()
    {
        p.println("      _______ ");
        p.println("     |       |");
        p.println("     |      ( )");
        p.println("     |       |");
        p.println("     |       |");
        p.println("     |       |");
        p.println("     |      /");
        p.println("_ _  |_____ ");
    }

    //Image05
    public void Hang5()
    {
        p.println("      _______ ");
        p.println("     |       |");
        p.println("     |      ( )");
        p.println("     |       |");
        p.println("     |       |");
        p.println("     |       |");
        p.println("     |      / \\");
        p.println("__   |_____ ");
    }

    //Image06
    public void Hang6()
    {
        p.println("      _______ ");
        p.println("     |       |");
        p.println("     |      ( )");
        p.println("     |       |");
        p.println("     |      /|");
        p.println("     |       |");
        p.println("     |      / \\");
        p.println("_ _|_____ ");
    }  

    //Image07
    public void Hang7()
    {
        p.println("      _______ ");
        p.println("     |       |");
        p.println("     |      ( )");
        p.println("     |       |");
        p.println("     |      /|\\");
        p.println("     |       |");
        p.println("     |      / \\");
        p.println("_ _|_____ ");
    }

    //Function to call Sports Questions
    public void Sports()
    {
        // Randomly generates a number which is then used to select one of the different cases.
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "He is an Argentine footballer who plays for La Liga club FC Barcelona and is the captain of the Argentina national team.";
                word = "L I O N E L | M E S S I";
            }
            break;
            case 1:
            {
                clue = "First person to score 200 in ODIs";
                word = "S A C H I N | T E N D U L K A R";
            }
            break;
            case 2:
            {
                clue = "One of the most famous and successful English football teams in history.";
                word = "M A N C H E S T E R | U N I T E D";
            }
            break;
            case 3:
            {
                clue = "It is a two-player board game";
                word = "C H E S S";
            }
            break;

            case 4:
            {
                clue = "It is a team sport in which two teams of six players are separated by a net.";
                word = "V O L L E Y B A L L";
            }
            break;
            case 5:
            {
                clue = "Known as 'The wall' in Cricket";
                word = "R A H U L | D R A V I D";
            }
            break;
            case 6:
            {
                clue = "A sport played by two teams of five players on a rectangular court. The objective is to shoot a ball through a hoop. ";
                word = "B A S K E T B A L L";
            }
            break;
            case 7:
            {
                clue = "The 'Beautiful' game.";
                word = "F O O T B A L L";
            }
            break;
            case 8:
            {
                clue = "Second fastest sport in the world.";
                word = "T A B L E | T E N N I S";
            }
            break;

            case 9:
            {
                clue = "Indian Chess Grandmaster";
                word = "V I S H W A N A T A N | A N A N D";
            }
            break;
        }
    }

    //Function to call Movie Questions
    public void Movies()
    {
        // Randomly generates a number which is then used to select one of the different cases.
        option =(int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "A story of Lightning Mcqueen and his mistaken journey to Radiator Springs.";
                word = "C A R S";
            }
            break;
            case 1:
            {
                clue = "The highest rated movie (IMDB) of all time";
                word = "S H A W S H A N K | R E D E M P T I O N";
            }
            break;
            case 2:
            {
                clue = "The highest grossing hollywood movie of all time.";
                word = "A V E N G E R S | E N D G A M E";
            }
            break;
            case 3:
            {
                clue = "An American musical drama film,about a young Austrian woman studying to become a nun in Salzburg in 1938 who is sent to the villa of a retired naval officer and widower to be governess to his seven children";
                word = "S O U N D | O F | M U S I C ";
            }
            break;
            case 4:
            {
                clue = "This film stars Jason Statham as Frank Martin, a driver for hire as a mercenary transporter who will deliver anything, anywhere – no questions asked – for the right price";
                word = "T H E | T R A N S P O R T E R";
            }
            break;
            case 5:
            {
                clue = "This film tells the story of Jamal Malik, a young man from the Juhu slums of Mumbai who appears on the Indian version of 'Who Wants to Be a Millionaire?'";
                word = "S L U M D O G | M I L L I O N A R E";
            }
            break;
            case 6:
            {
                clue = "Set during the Sierra Leone Civil War in 1996–2001, the film shows a country torn apart by the struggle between government soldiers and rebel forces";
                word = "B L O O D | D I A M O N D";
            }
            break;
            case 7:
            {
                clue = "This film stars Macaulay Culkin as Kevin McCallister, an eight-year-old boy, who is mistakenly left behind when his family flies to Paris for their Christmas vacation";
                word = "H O M E | A L O N E";
            }
            break;
            case 8:
            {
                clue = "One of the most famous and highest grossing movie franchises of all time(HINT: Lots of cars in this franchisee";
                word = "T H E | F A S T | A N D | T H E | F U R I O U S";
            }
            break;
            case 9:
            {
                clue = "This movie follows a group of animals that are stranded on an island.";
                word = "M A D A G A S C A R";
            }
            break;
        }          
    }

    //Function to call Computer Questions
    public void Computers()
    {
        // Randomly generates a number which is then used to select one of the different cases.
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "What is DNS in computer terminology ?";
                word = "D O M A I N | N A M E | S Y S T E M";
            }
            break;
            case 1:
            {
                clue = "Stores a real world 2d object in the form of a digital image";
                word = "S C A N N E R";
            }
            break;
            case 2:
            {
                clue = "A 3D simulation of a real or imagined environment using computers.";
                word = "V I R T U A L | R E A L I T Y";
            }
            break;
            case 3:
            {
                clue = "It is a family of computer networking technologies for LANs";
                word = "E T H E R N E T";
            }
            break;
            case 4:
            {
                clue = "It is a computer network that uses Internet Protocol technology to share information, operational systems, or computing services within an organization";
                word = "I N T R A N E T";
            }
            break;
            case 5:
            {
                clue = "It is an IDE for Java";
                word = "E C L I P S E";
            }
            break;
            case 6:
            {
                clue = "What is ASCII in computer Terminology ";
                word = "A M E R I C A N | S T A N D A R D | C O D E | F O R | I N F O R M A T I O N | I N T E R C H A N G E";
            }
            break;
            case 7:
            {
                clue = "It is a software application that provides comprehensive facilities to computer programmers for software development";
                word = "I N T E G R A T E D | D E V E L O P M E N T | E N V I R O N M E N T";
            }
            break;
            case 8:
            {
                clue = "It is a temporary form of computer data storage";
                word = "R A N D O M | A C C E S S | M E M O R Y";
            }
            break;
            case 9:
            {
                clue = "A battery-powered memory chip in your computer that stores startup information.";
                word = "C O M P L E M E N T A R Y | M E T A L | O X I D E | S E M I C O N D U C T O R";
            }
            break;
        }

    }

    //Function to call Android Questions
    public void Android()
    {
        // Randomly generates a number which is then used to select one of the different cases.
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "The 'Father' of Android";
                word = "A N D Y | R U B I N";
            }
            break;
            case 1:
            {
                clue = "The First Android powered Smartphone ";
                word = "H T C | D R E A M";
            }
            break;
            case 2:
            {
                clue = "The Company that produces the Exynos SOC's";
                word = "S A M S U N G";
            }
            break;
            case 3:
            {
                clue = "The first Android powered Blackberry phone";
                word = "B L A C K B E R R Y | P R I V";
            }
            break;
            case 4:
            {
                clue = "An open-source operating system for smartphones and tablet computers, based on the Android mobile platform created by Steve Kondik";
                word = "C Y A N O G E N M O D";
            }
            break;
            case 5:
            {
                clue = "What is ADB in Android Terminoloy?";
                word = "A N D R O I D | D E B U G | B R I D G E";
            }
            break;
            case 6:
            {
                clue = "Creators of the Exynos Processor.";
                word = "S A M S U N G";
            }
            break;
            case 7:
            {
                clue = "The company that makes the Snapdragon SOC's";
                word = "Q U A L C O M M";
            }
            break;
            case 8:
            {
                clue = "What is OHA in Android terminology?";
                word = "O P E N | H A N D S E T | A L L I A N C E";
            }
            break;
            case 9:
            {
                clue = "Sofware skin used in Huawei phones.";
                word = "E M O T I O N | U I";
            }
            break;
        }

    }

    //Function to call Capital-related Questions
    public void Capitals()
    {
        // Randomly generates a number which is then used to select one of the different cases.
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "Capital of Austalia";
                word = "C A N B E R R A";
            }
            break;
            case 1:
            {
                clue = "Capital of Ethiopia";
                word = "A D D I S | A B A B A";
            }
            break;
            case 2:
            {
                clue = "Capital of Uzbekistan";
                word = "T A S H K E N T";
            }
            break;
            case 3:
            {
                clue = "Capital of Peru";
                word = "L I M A";
            }
            break;
            case 4:
            {
                clue = "Capital of Saudi Arabia";
                word = "R I Y A D H";
            }
            break;
            case 5:
            {
                clue = "Capital of The Philippines";
                word = "M A N I L A";
            }
            break;
            case 6:
            {
                clue = "Capital of Poland";
                word = "W A R S A W";
            }
            break;
            case 7:
            {
                clue = "Capital of Iceland";
                word = "R E Y K J A V I K";
            }
            break;
            case 8:
            {
                clue = "Capital of Malta";
                word = "V A L L E T T A";
            }
            break;
            case 9:
            {
                clue = "Capital of Cambodia";
                word = "P H N O M | P E N H";
            }
            break;
        }

    }

    //Main Method
    public static void main(String[] args)throws IOException
    {
        HangGame obj = new HangGame();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter p = new PrintWriter(System.out,true);
        p.println("Let's play HANGMAN!");
        p.println("RULES");
        p.println("Based on the clue given, choose letters to fill in the blanks.");
        p.println("Incorrect characters already entered must not be entered again .");
        p.println("If you successfully guess the word, CONGRATULATIONS, you have won the round.");
        p.println("If not, better luck next time.");
        p.println("NOTE: Words are related to the topics given below.\n\n1. Sports\n2. Movies\n3. Computer\n4. Android\n5. Capitals");
        p.println("Enter the serial number of the topic of your choice: \n");

        //take Input
        int choice = 0, c = 4;
        boolean flag = false;
        //check if user has entered a number

        do
        {
            try
            {
                choice = Integer.parseInt(br.readLine());
                if(choice >= 1 && choice <= 5)
                    flag = true;
                else
                {
                    c--;
                    p.println("Wrong choice!!!!");
                    p.println("Please enter a number from between 1 to 5");
                    p.println("you have "+c+" attempt(s) remaining");
                    flag = false;

                }

            }
            catch(Exception e)
            {
                c--;
                p.println("Wrong choice!!!!");
                p.println("Please enter a number from between 1 to 5");
                p.println("you have "+c+" attempt(s) remaining");
                flag = false;

            }
        } while(flag == false && c > 0);

        //ClearScreen
        obj.clearScreen();

        //Play game if user has entered a valid choice
        if( c > 0)
        { 
            //Call respective Functions
            System.out.println("You have choosen topic number: "+choice);
            if(choice == 1)
                obj.Sports();
            else if(choice == 2)
                obj.Movies();
            else if(choice == 3)
                obj.Computers();
            else if(choice == 4)
                obj.Android();
            else if(choice == 5)
                obj.Capitals();

            int counter = 6;
            String guessword = obj.word;
            int len = (int)(Math.round(((double)guessword.length()/2)));
            int checkguess = 0;

            StringBuffer guessit = new StringBuffer();

            // Places a blank underscore to signify the presence of a letter
            for (int i = 0;i<len;i++)
                guessit = guessit.append("_ ");

            guessit.delete((2 * len)-1,(2 * len));
            int index = guessword.indexOf("|");

            while(index >= 0) //Returns -1 when | not found
            {
                guessit.setCharAt(index, '|');
                // Start searching for next "|" after this index
                index = guessword.indexOf("|", index+1);
            }

            //Print Correct Letters entered
            p.println( "The correct letters you have entered so far \n"+guessit);

            //Print Image
            do
            {
                p.println();
                if(counter == 6)
                    obj.Hang1();
                else if(counter == 5)
                    obj.Hang2();
                else if(counter == 4)
                    obj.Hang3();
                else if(counter == 3)
                    obj.Hang4();
                else if(counter == 2)
                    obj.Hang5();
                else if(counter == 1)
                    obj.Hang6();
                p.println(obj.clue);
                p.println("Enter your guess letter");
                String guess = br.readLine();
                do{
                    if(guess.matches("^[a-zA-Z]*$") && !guess.equals(" ") && !guess.equals(""))
                    {
                    	flag = true;
                    }
                    else 
                    {
                    	System.out.println("Please enter an alphabet ");
                        guess = br.readLine()   ;
                        flag = false;
                        
                    }
                }while(flag == false);
                guess = guess.toUpperCase();

                obj.clearScreen();
                for(int i = 0;i<len;i++)
                {
                    try
                    {
                        if(guess.charAt(0) == guessword.charAt(2*i))
                        {
                            guessit.setCharAt(2*i,guess.charAt(0));
                            checkguess=1;
                        }
                    }
                    catch(Exception e) 
                    {
                        continue;
                    }
                }
                //Prints if Entered Letter is Correct
                if(checkguess == 1)
                {
                    p.println("Correct Guess. You have " + counter + " guess(es) left");
                    p.println("The correct letters you have entered so far \n"+guessit);
                }
                else
                {
                    counter--;
                    //Checks if User has Guesses left
                    if(counter == 0)
                    {
                        p.println("Wrong guess. You hanged the man :(");
                        p.println(guessit);
                        obj.Hang7();
                    }
                    //Prints if Entered Letter is Wrong
                    else
                    {
                        p.println("Wrong guess. You have " + counter + " guess(es) left");
                        p.println("The letters you have entered so far \n"+guessit);
                    }
                }
                checkguess = 0;
                //Prints if the User lost the game
                if(counter == 0)
                {
                    p.println("\nSorry, you lost the game\n\nThe correct word is " + guessword);
                    p.println("-----------------------------------");
                    l++;
                }

                String a =  guessit.toString();;
                //Prints if User won the game
                if(a.equals(guessword))
                {
                    p.println("You guessed the word!!!!!");
                    p.println("-----------------------------------");
                    w++;
                    counter=0;
                }        
            }while(counter>0);
        }
        
        //terminate program
        else
            terminate = true;
    }
    //Returns number of wins by the user
    public int getWin()
    {
        return HangGame.w;
    }
    //Returns number of loss by the user
    public int getLoss() 
    {
        return HangGame.l;
    }
}

