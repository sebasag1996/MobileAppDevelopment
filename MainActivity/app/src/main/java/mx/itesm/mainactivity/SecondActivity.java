package mx.itesm.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    //Method for the previous button
    public void previous(View view) {
        Intent myIntent;
        myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }

}
