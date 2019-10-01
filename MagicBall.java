import java.util.Scanner;

class MagicBall{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Magic 8 Ball");
        System.out.println("----------------------------------------");
        System.out.println("Please ask a YES or NO question.");
        
        String a = sc.next();
        
        int b = (int)(Math.random()*20 + 1);
        
        if(b == 1) System.out.println("It is certain");
        if(b == 2) System.out.println("It is decidedly so.");
        if(b == 3) System.out.println("Without a doubt.");
        if(b == 4) System.out.println("Yes - definitely.");
        if(b == 5) System.out.println("You may rely on it.");
        if(b == 6) System.out.println("As I see it, yes.");
        if(b == 7) System.out.println("Most likely.");
        if(b == 8) System.out.println("Outlook good.");
        if(b == 9) System.out.println("Yes.");
        if(b == 10) System.out.println("Signs point to yes.");
        if(b == 11) System.out.println("Reply hazy, try again.");
        if(b == 12) System.out.println("Ask again later.");
        if(b == 13) System.out.println("Better not tell you now.");
        if(b == 14) System.out.println("Cannot predict now.");
        if(b == 15) System.out.println("Concentrate and ask again.");
        if(b == 16) System.out.println("Don't count on it.");
        if(b == 17) System.out.println("My reply is no.");
        if(b == 18) System.out.println("My sources say no.");
        if(b == 19) System.out.println("Outlook not so good.");
        if(b == 20) System.out.println("Very doubtful.");
        
    }
}