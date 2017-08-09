package code_clan.rockscissors;

import java.util.Random;

/**
 * Created by R.Murzakov on 09/08/2017.
 */

public class RockAndScissors {
    String userInput;

    public RockAndScissors(String userInput){
        this.userInput = userInput;
    }

    public String game(){
        String userInput = this.userInput;
        String[] choice = {"Rock", "Scissors", "Paper"};
        Random answer = new Random();
        int index = answer.nextInt(choice.length);
        String androidInput = choice[index];
        if (userInput == "Rock"){

            if (androidInput.equals("Rock")){
                return "Draw";
            }
            else if(androidInput.equals("Paper")){
                return "Android wins by playing Paper";
            }
            else {
                return "Player wins by playing Rock";
            }
        }
        else if(userInput.equals("Scissors")){
            if (androidInput.equals("Rock")){
                return "Android wins by plaing Rock";
            }
            else if (androidInput.equals("Paper")){
                return "Player wins by playing Scissors";
            }
            else {
                return "Draw";
            }
        }
        else{
            if (androidInput.equals("Rock")){
                return "Player wins by playing Paper";
            }
            else if (androidInput.equals("Paper")){
                return "Draw";
            }
            else {
                return "Android wins by plaing Scissors";
            }
        }

    }

    public String getUserInput() {
        return this.userInput;
    }
}
