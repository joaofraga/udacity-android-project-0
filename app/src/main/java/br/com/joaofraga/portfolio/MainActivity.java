package br.com.joaofraga.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener myListener = new View.OnClickListener() {
            public void onClick(View v) {
                Button button = (Button) v;
                Toast.makeText(MainActivity.this, getString(R.string.to_be_implemented, button.getText()),
                        Toast.LENGTH_SHORT).show();
            }
        };

        findViewById(R.id.popular_movies).setOnClickListener(myListener);
        findViewById(R.id.stock_hawk).setOnClickListener(myListener);
        findViewById(R.id.build_it_bigger).setOnClickListener(myListener);
        findViewById(R.id.make_you_app_material).setOnClickListener(myListener);
        findViewById(R.id.go_ubiquitous).setOnClickListener(myListener);
        findViewById(R.id.capstone).setOnClickListener(myListener);
    }

}
