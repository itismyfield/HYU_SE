package hanyang.hyu_se;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class group_home extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;
    Button chatroom, groupMembers;

//    String[] groupNotifs = {
//            /* insert notifications here */
//            "Notice 1",
//            "Notice 2",
//            "Notice 3"
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        chatroom = (Button) findViewById(R.id.chatroom);
        groupMembers = (Button) findViewById(R.id.groupMembers)

        chatroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setIntent(group_home.this, chatroom.class);
            }
        });

        chatroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setIntent(group_home.this, group_member.class);
            }
        });
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

//        listView = (ListView)findViewById(R.id.listView);
//        adapter = new ArrayAdapter<String>(this,R.layout.list_view_custom_layout,R.id.listView,groupNotifs);
//        listView.setAdapter(adapter);
    }

}
