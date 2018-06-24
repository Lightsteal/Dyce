package ga.abhijit.dyce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollMe = (Button) findViewById(R.id.Dyce_button);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);
        //We need to make sure that this stays constant in order to use it in the Event Listener.
        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("dyce", "Button Pressed!");
                Random randNumGen = new Random();

                //random from 0->5
                int rand = randNumGen.nextInt(6);
                Log.d("Random", "Boiya"+rand);
                leftDice.setImageResource(diceArray[rand]);

                rand = randNumGen.nextInt(6);
                Log.d("Random", "Boiya"+rand);
                rightDice.setImageResource(diceArray[rand]);
            }
        });






    }
}
