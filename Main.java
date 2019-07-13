import java.util.Scanner;
import java.util.Random;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;
import java.io.*;
// for pictures go to https://www.asciiart.eu/
// convert @ https://www.text-image.com/convert/ascii.html
// cache map https://vignette.wikia.nocookie.net/cswikia/images/0/01/De_cache-overview.jpg/revision/latest?cb=20140507213116

class Main{
	public static int Time = 6;
	public static boolean killed1 = false;
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";


  public static void main(String[] args) {
	  System.out.println("Welcome to the game, press y to play");
	 
	  boolean cache = false;
	  boolean T = false;
	  boolean CT = false;
	  boolean picked = false;
	  int width = 150;
	  int length = 150;
	  boolean picked1 = false;
	  int age;
	  boolean GarageT = false;
	  boolean SqueakyT = false;
	  int CTcount = 5;
	  Random rand = new Random();
	  int n = rand.nextInt(10);
	  int n1 = rand.nextInt(4);
	  boolean BombPlanted = false;
	  int BombTime = 0;
	  boolean JihadTime = false;
	  boolean Won = false;
	  Scanner sc = new Scanner(System.in);
	  
	  String y = sc.nextLine().toLowerCase();
	
	while(!y.equals("y")){
		System.out.println("Follow the directions");
		System.out.println("press y to play and follow directions this time");
		y = sc.nextLine().toLowerCase();
	}
	while(true){
		System.out.println("What is your age?");
		try{
			age = Integer.parseInt(sc.nextLine());
			break;
		}
		catch (Exception e){
			System.out.println("Follow the directions");
			System.out.println("Try again");

		}
	}
	if(age > 10){
	System.out.println("From now on if you make a typo you will lose, you've been warned!");
	try {Thread.sleep(3000);} catch(InterruptedException e){}
	System.out.println("Would you like to be a terrorist [a] or a Counter terrorist [b]");
		
		String side = sc.nextLine();
		
		if(side.equals("a")){
			T = true;
			picked = true;
		}
		else if(side.equals("b")){
			System.out.println("The budget is too low you're a terrorist");
			try {Thread.sleep(1000);} catch(InterruptedException e){}
			T = true;
			picked = true;
			}
		else{
			System.out.println("Game Over");
			System.exit(0);
		}
	}
	else{
		System.out.println("Sorry you are too young to play the game!");
	}
		if(picked == true || picked1 == true){
		System.out.println("Would you like to go to Dust 2 [a] or to Cache[b]");
		String a1 = sc.nextLine();
		
	if(a1.equals("a")){
		System.out.println("Filthy casual, Went to Cache");
		cache = true;
	}
	else if(a1.equals("b")){
		System.out.println("Went to Cache");
		cache = true;
	// insert cache map here
		}
	
	else{
		System.out.println("Game Over");
		System.exit(0);

	}
}
	try {Thread.sleep(2000);} catch(InterruptedException e){}

	if(cache == true){
	
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	Random r = new Random();
	Timer timer = new Timer();
	timer.schedule(new AddScore(), 0, 1000);
	String a =  alphabet.charAt(r.nextInt(alphabet.length())) + "";
	
	System.out.println("You enountered a counter terrorist click "+ a +" to fire!, btw you have 5 seconds");

	String a2 = sc.nextLine();
	
	if(a2.equals(a)){
		System.out.println("You got him");
		killed1 = true;
		CTcount -= 1;
	}
	else { 
	System.out.println("Intercom(Don't do that again)");
	}	
	if(killed1 = true && T == true){
		System.out.println("That was just a warmup the real game will start now!");
		try {Thread.sleep(1000);} catch(InterruptedException e){}
		System.out.println("BTW you have 5 minutes to either plant the bomb or kill all of the CTs");
		try {Thread.sleep(1000);} catch(InterruptedException e){}
		System.out.println("Would you like to go to Garage[a] or Squeaky[b] ");
		
				String choice1T = sc.nextLine().toLowerCase();

	if(choice1T.equals("a")){
		System.out.println("Went to garage");
		GarageT = true;
		
			}
	else if(choice1T.equals("b")){
		System.out.println("Went to Squeaky");
		SqueakyT = true;
	}
	else{
	System.out.println("Game Over");
	System.exit(0);

	}
	String b =  alphabet.charAt(r.nextInt(alphabet.length())) + "";
	String a5 = "";

	if(n > 4){
	killed1 = false;
	Time = 6;
	timer.schedule(new AddScore(), 0, 1000);
	
	System.out.println("You enountered a counter terrorist click "+ b +" to fire!, btw you have 5 seconds");
	
	String a3 = sc.nextLine();

	if(a3.equals(b)){
		killed1 = true;
		System.out.println("You got him, B site seems clear but you will have to look for yourself,");
	}	

	else{
	System.out.println("Game Over");
	System.exit(0);
		}
	}
	
	System.out.println("There's no one here would you like to enter A site[a] or go back[b]");
	
	String a4 = sc.nextLine();

	if(a4.equals("b")){
	System.out.println("Would you like to go to Garage[a] or Squeaky[b] ");
	}
	if(a4.equals("a")){
	String c =  alphabet.charAt(r.nextInt(alphabet.length())) + "";

	if(n1 <= 5){
		System.out.println("B site seems clear, would you like to plant the bomb[a] or retreat to Squeaky[b]");	
	}
	else{
	System.out.println("You enountered a counter terrorist click "+ c +" to fire!, btw you have 5 seconds");
	}
	a5 = sc.nextLine();
	if(a5.equals("a")){
	System.out.println("The bomb has been planted, The CTs have 30 seconds to defuse it!");
	BombPlanted = true;
	killed1 = false;
	Time = 31;

	timer.schedule(new AddScore(), 0, 1000);

	Random rand2 = new Random();
	
	while (Time > 0 && CTcount > 1){
	try {Thread.sleep(1000);} catch(InterruptedException e){}
	int o = rand2.nextInt(5);
	String d =  alphabet.charAt(r.nextInt(alphabet.length())) + "";

	if(o == 4){
	BombTime = Time;
	JihadTime = true;
	System.out.println("You enountered a counter terrorist click "+ d +" to fire!, btw you have 5 seconds");
	Time = 6;
	
	String a6 = sc.nextLine();

	if(a6.equals(d)){
		CTcount -= 1;
		System.out.println("You got him, there are still " + CTcount + " CTs left");
		Time = BombTime;
		}

	else if(!a6.equals(d)){
		System.out.println("Game Over");
		System.exit(0);
		}

	if(CTcount < 1){
		System.out.println("All of the Counter Terrorists are Dead you Win!");
		System.exit(0);	
			}
		}	
	}
	
	if(a5.equals("b")){
		System.out.println("You are in Squeaky ");
							}
						}
					}					
				}
			}	
		}
static class AddScore extends TimerTask {
    public void run() {
		if(Main.Time > 1 && Main.killed1 == false){
		Main.Time -= 1;
		System.out.println(Integer.toString(Main.Time));
	}

		else if(Main.killed1 == false && Main.Time == 0){
		System.out.println("Game Over");
		System.exit(0);
				}
		//else if(Main.Killed1 = false && Main.Time == 0 && Main.JihadTime == true){
		//System.out.println("You Win");
		//System.exit(0);
		//	}
		}
	}
}
