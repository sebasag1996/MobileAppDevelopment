package mx.itesm.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnNewAct;
    EditText myName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewAct = findViewById(R.id.button);
        myName = findViewById(R.id.editText);

        btnNewAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);

                String nameToSend = myName.getText().toString();
                myIntent.putExtra("stringToSend",nameToSend);
                myIntent.putExtra("myInteger",0);

                startActivity(myIntent);
            }
        });
    }

    /*
    //Methods for the buttons
    public void Next(View view) {
        Intent myIntent = new Intent(this, SecondActivity.class);
        startActivity(myIntent);
    }*/
}
