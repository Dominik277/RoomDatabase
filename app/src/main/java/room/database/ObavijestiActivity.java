package room.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ObavijestiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obavijesti);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Obavijesti");
    }
}