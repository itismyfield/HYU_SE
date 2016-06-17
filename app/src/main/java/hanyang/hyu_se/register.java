package hanyang.hyu_se;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {

    Button bJoin;
    EditText etUsername, etPassword, etPassConf, etPhoneNmb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bJoin = (Button) findViewById(R.id.button3);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etPassConf = (EditText) findViewById(R.id.etPassConf);
        etPhoneNmb = (EditText) findViewById(R.id.etPhoneNmb);

        bJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                String phone_number = etPhoneNmb.getText().toString();

                User registeredData = new User(username, password, phone_number);

                Intent intent = new Intent(register.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}