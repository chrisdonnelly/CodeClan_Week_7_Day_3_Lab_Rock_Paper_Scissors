package code_clan.rockscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Button buttonRock;
    Button buttonPaper;
    Button buttonScissors;
    TextView viewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        buttonRock = (Button)findViewById(R.id.button_rock);
        buttonPaper = (Button)findViewById(R.id.button_paper);
        buttonScissors = (Button)findViewById(R.id.button_scissors);
        viewResult = (TextView)findViewById(R.id.result_view);
    }

    public void onButtonClickedRock(View Button){

        String userInput = buttonRock.getText().toString();
        RockAndScissors game = new RockAndScissors(userInput);
        String result = game.game();
        viewResult.setText(result);

    }

    public void onButtonClickedPaper(View Button){

        String userInput = buttonPaper.getText().toString();
        RockAndScissors game = new RockAndScissors(userInput);
        String result = game.game();
        viewResult.setText(result);

    }

    public void onButtonClickedScissors(View Button){

        String userInput = buttonScissors.getText().toString();
        RockAndScissors game = new RockAndScissors(userInput);
        String result = game.game();
        viewResult.setText(result);

    }
}
