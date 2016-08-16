package com.example.chamara.myapplication;

import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttonOk);
        button.setText("Chamarat9");
        //button.setOnClickListener(onClickListener  );

    }

    @Override
    protected void onStart() {
        super.onStart();


    }

    public void some_function(View view) {
     //   Button button = (Button) findViewById(R.id.buttonOk);
     //   button.setText("Chamarar");

       TextView tv = (TextView) view.findViewById(R.id.textView);
        if (tv != null)
        tv.setText("FFFFG GGGG");
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
       // Button button = (Button) findViewById(R.id.buttonOk);

        @Override
        public void onClick(final View v) {
            switch(v.getId()){
                case R.id.buttonOk:
                    Button button = (Button) findViewById(R.id.buttonOk);
                    assert button != null;
                    button.setText("R.id.buttonOk");
                    //Toast.makeText(MainActivity.this, "GGG", Toast.LENGTH_SHORT).show();
                    break;

            }

        }
    };

    @Override
    protected void onPause() {
        super.onPause();
    }
}
