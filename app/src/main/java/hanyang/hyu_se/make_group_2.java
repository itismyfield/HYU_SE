package hanyang.hyu_se;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class make_group_2 extends AppCompatActivity {

    Button bMakeGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_group_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        bMakeGroup = (Button) findViewById(R.id.bMakeGroup);

        bMakeGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // User registeredData = new User(username, password, phone_number);

                Intent intent = new Intent(make_group_2.this, group_home.class);
                startActivity(intent);
            }
        });

//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
