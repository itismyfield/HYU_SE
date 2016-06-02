package hanyang.hyu_se;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity implements View.OnClickListener{

    Button bLogin, bJoin;
    EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        bLogin = (Button) findViewById(R.id.bJoin);

        bLogin.setOnClickListener(this);
        bJoin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getID()){
            case R.id.bLogin:


                break;
            case R.id.bJoin:
                startActivity(new Intent(this, Register.class));

                break;
        }
    }
}
