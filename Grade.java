import java.util.Scanner;

class Grade{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your test out of");
        double outof = sc.nextDouble();
        System.out.println("What score did you get");
        double score = sc.nextDouble();
        
        double percent = score/outof * 100; 
        if(percent > 86 && percent < 101){
            System.out.println("You got "+ percent+ " %. That's an A");
            }else if (percent < 86 && percent > 72){
                System.out.println("You got "+ percent+ " %. That's an B");
            }else if (percent < 73 && percent > 66){
                System.out.println("You got "+ percent+ " %. That's an C+");
            }else if (percent < 67 && percent > 59){
                System.out.println("You got "+ percent+ " %. That's an C");
            }else if (percent < 60 && percent > 49){
                System.out.println("You got "+ percent+ " %. That's an C-");
            }else if (percent < 50 && percent >= 0){
                System.out.println("You got "+ percent+ " %. That's an F");
            }else{
                System.out.println("Impossible value");
            }
    }
   
}