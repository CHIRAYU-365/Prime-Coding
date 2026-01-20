
public class lottery {
    public static void main(String[] args) {
        int n=212;

        if ( n>=300 && n<=460){
            System.out.println("You Won a Macbook!");
        }
        else if (n>=200 && n<=280){
            System.out.println("You won a Kurkure! ");
        }
        else if (n>=1100 && n<=1500){
            System.out.println("You won a cycle!");
        }
        else if (n>50 && n<=80){
            System.out.println("You won a Bike!");
        }
        else {
            System.out.println("Better Luck Next Time!");
        } 
    } 
    
}
