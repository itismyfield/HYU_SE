package hanyang.hyu_se;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MakeGroup extends AppCompatActivity {

    Button bNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_group);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        bNext = (Button) findViewById(R.id.bNext);

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // User registeredData = new User(username, password, phone_number);

                Intent intent = new Intent(MakeGroup.this, make_group_2.class);
                startActivity(intent);
            }
        });

    }

}
