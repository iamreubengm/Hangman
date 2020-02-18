package hangmanv3;

import java.io.*;
public class HangGameCode 
{
    //Declaration and Initialization
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String usrName;
    String fileName = "C:\\Hangman\\";
    static String fullFileName = "";
    String name;
    static int won, loss, Tgames;
    boolean exists = false,check;  
    static int repeat=2; //Variable to repeat game if user wishes to

    public static void main(String[] args)throws IOException, InterruptedException 
    {
	        //ask the user to log in
	        HangGameCode obj = new HangGameCode();
	        obj.input();
	        //reading from DB and updating local variables
	        if(obj.exists == true) 
	        {
	            obj.readStatsFromDB(fullFileName);
	        }   
	        //call the game
	    do {
		        HangGame.main(args);
		        //save stats to database
		        obj.writeFile();        
		        //Giving stats of the user
		        obj.stats();
		        obj.playagaincheck();
    	}while(repeat==1);
    }

    void input() throws IOException, InterruptedException
    {
        System.out.println(" *** WELCOME ***");
        System.out.println("Enter your unique Username");
        usrName = br.readLine();
        //check if User has entered his/her user name
        check = true;
        do
        {
            if(usrName.equals(""))
            {
                System.out.println("Please enter your unique Username ");
                usrName = br.readLine();
                check = false;
            }
            else
            {
                check = true;
            }
        }while(check == false);
        fullFileName = fileName+usrName+".txt";

        //check file existence
        File f1 = new File(fullFileName);
        if(f1.exists() == true) //f1.exists checks if file exists (java.io.File.exists())
        {
            System.out.println("Welcome Back "+usrName+"!");
            Thread.sleep(700);
            System.out.println("Loading Game");
            Thread.sleep(300);
            System.out.println("Loading Graphics");
            Thread.sleep(300);
            System.out.println("Loading Questions");
            Thread.sleep(300);
            System.out.println("Loading Hangman Engine");
            Thread.sleep(2750);
            System.out.println();
            System.out.println("Initializing Settings");
            Thread.sleep(300);
            System.out.println("Setting Up Environment");
            Thread.sleep(300);
            System.out.println("Starting Game");
            Thread.sleep(2000);
            System.out.println();
            exists = true;
        }
        else
        {
            System.out.println("Hello "+usrName+"!");
            Thread.sleep(700);
            System.out.println("Loading Game");
            Thread.sleep(300);
            System.out.println("Loading Graphics");
            Thread.sleep(300);
            System.out.println("Loading Questions");
            Thread.sleep(300);
            System.out.println("Loading Hangman Engine");
            Thread.sleep(2750);
            System.out.println("Initializing settings");
            Thread.sleep(300);
            System.out.println("Setting Up Environment");
            Thread.sleep(300);
            System.out.print("Starting Game");
            Thread.sleep(2500);
            System.out.println();
            
        }

    }

    //saving data to database
    public  void writeFile()throws IOException
    {
        String source = usrName;
        FileWriter f0 = new FileWriter(fileName+usrName+".txt");
        //save name
        f0.write(source);
        f0.write(" ");//space
        //save loss    
        Integer i = Integer.valueOf(loss+HangGame.l);
        Integer j = Integer.valueOf(won+HangGame.w); 
        Integer k = Integer.valueOf(Tgames+HangGame.l + HangGame.w);
        f0.write(i.toString());
        f0.write(" ");//space
        //save wins
        f0.write(j.toString());
        f0.write(" ");//space
        //save  total games
        f0.write(k.toString());
        f0.flush();
        f0.close();

    }
    //function to read and close file
    public  void readStatsFromDB(String name) throws IOException
    {
        FileReader fr = new FileReader(name);
        BufferedReader br = new BufferedReader(fr);
        String s;
        try 
        {
            if((s = br.readLine()) != null)
            {
                String[] str = s.split(" ");
                name = str[0];
                loss = Integer.parseInt(str[1]);
                won = Integer.parseInt(str[2]);
                Tgames = Integer.parseInt(str[3]);

            }
        } catch(Exception e)
        {
            e.printStackTrace(System.out);
            name = usrName;
            loss = 0;
            won = 0;
            Tgames = 0;
        } finally
        {
            fr.close();
            br.close();
        }
    }
    //print stats
    public  void stats()
    {
        //check if program has to be terminated
        if(HangGame.terminate == false)
        {
            System.out.println("USERNAME :   "+usrName);
            System.out.println("TOTAL GAMES: "+(Tgames+HangGame.l+HangGame.w));
            System.out.println("WINS :       "+(won+HangGame.w));
            System.out.println("LOSS :       "+(loss+HangGame.l));

        }
        else
        {
            System.out.println("USERNAME :   "+usrName);
            System.out.println("TOTAL GAMES: "+(Tgames+HangGame.l+HangGame.w));
            System.out.println("WINS :       "+(won+HangGame.w));
            System.out.println("LOSS :       "+(loss+HangGame.l));

        }
    } 
    
    public void playagaincheck() throws IOException
    {
    	System.out.println();
    	System.out.println("Play Again?");
    	System.out.println("Press 1 for Yes");
    	System.out.println("Press Enter for No");
    	try
    	{
    		
    		repeat=Integer.parseInt(br.readLine());
    		if (repeat==1)
    		{
    			System.out.println("Restarting Game");
    		}
 
    		else
    		{
    			System.out.println("Closing Application");
    			System.out.println("Thank You For Playing!");
    		}
    			
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println("Closing Application");
    		System.out.println("Thank You For Playing!");
    		repeat=2;
    	}
    }
}   
