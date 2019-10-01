import java.util.Scanner;

class Password{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        System.out.println("What is the password");
        
        String key = sc.next();
        if(key.equals("dragon")){
            correct =  true;
        }
        
        if(correct){
            System.out.println("Correct! my secret is: i am Batman");
        }else{
            System.out.println("Wrong");
        }
        
    }
}
