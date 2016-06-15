package hanyang.hyu_se;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class group_chat extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;

    String[] groupNotifs = {
            /* insert chatrooms here */
            "Chatroom 1",
            "Chatroom 2",
            "Chatroom 3"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_chat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        listView = (ListView)findViewById(R.id.listView3);
        adapter = new ArrayAdapter<String>(this,R.layout.list_view_custom_layout,R.id.listView3,groupNotifs);
        listView.setAdapter(adapter);
    }

}
