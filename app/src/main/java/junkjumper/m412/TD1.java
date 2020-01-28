package junkjumper.m412;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TD1 extends AppCompatActivity {

    private TextView mTextMessage;
    private int count = 0;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_td1);
        Button p = (Button)findViewById(R.id.plus);
        Button m = (Button)findViewById(R.id.moins);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView displayBoop = (TextView)findViewById(R.id.boop);
                String total = displayBoop.getText().toString();
                count++;
                if(count < 0) {
                    count = 0;
                }
                displayBoop.setText(""+count);

            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView displayBoop = (TextView)findViewById(R.id.boop);
                String total = displayBoop.getText().toString();
                count--;
                if(count < 0) {
                    count = 0;
                }
                displayBoop.setText(""+count);
            }
        });




    }



}

/*
public class ex3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3);
    }

    protected void plusUn(View v){
        TextView e = (TextView) findViewById(R.id.textView);
        String texte=e.getText().toString();
        int compteur= Integer.parseInt(texte);
        compteur = compteur + 1;
        String texteF= ""+compteur;
        e.setText(texteF);
    }

    protected void moinsUn(View v){
        TextView e = (TextView) findViewById(R.id.textView);
        String texte=e.getText().toString();
        int compteur= Integer.parseInt(texte);
        compteur = compteur - 1;
        String texteF= ""+compteur;
        e.setText(texteF);
    }
}*/
