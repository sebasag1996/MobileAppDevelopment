package mx.itesm.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView myTextView;
    Intent currentIntent;
    String myIntentVar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        currentIntent = getIntent();

        myIntentVar = currentIntent.getStringExtra("stringToSend");
        int myIntExtra = currentIntent.getIntExtra("myInteger",0);

        myTextView = findViewById(R.id.textView);
        myTextView.setText(myIntentVar);


    }
    //Method for the previous button
    /*public void onClick(View view) {
        Intent myIntent;
        myIntent = new Intent(this, MainActivity.class);
    }*/

}
