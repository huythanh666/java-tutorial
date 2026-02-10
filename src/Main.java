import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws InterruptedException {
      String[] question = {"1+1=?","2+2=?","5+5=?"};
      String[][] options = {{"1. 2","2. 4", "3. 7"},
                            {"1. 2","2. 4", "3. 7"},
                            {"1. 10","2. 4", "3. 7"}
      };
      Scanner scanner = new Scanner(System.in);
        int guess;
        int score = 0;
        int[] answer = {1,2,1};
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            for(String option: options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your answer: ");
            guess = scanner.nextInt();
            if(guess == answer[i]){
                score++;
                System.out.println("correct");
            }else{
                System.out.println("wrong");
            }
        }
        System.out.println("Điểm số là: " + score +"/3");
    }
}