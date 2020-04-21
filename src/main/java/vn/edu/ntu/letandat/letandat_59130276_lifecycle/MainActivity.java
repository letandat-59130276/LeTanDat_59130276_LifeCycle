package vn.edu.ntu.letandat.letandat_59130276_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life Cycle", "onCreate called!");
        Toast.makeText(getApplicationContext(), "on Create", Toast.LENGTH_SHORT).show();
        txtTG = findViewById(R.id.txtTG);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle", "onStart called!");
        SimpleDateFormat spDF = new SimpleDateFormat("HH:mm:ss");
        String strDate = spDF.format(new Date());
        Toast.makeText(getApplicationContext(), "on Start", Toast.LENGTH_SHORT).show();
        txtTG.setText(strDate);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life Cycle", "onResume called!");
        Toast.makeText(getApplicationContext(), "on Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle", "onStop called!");
        Toast.makeText(getApplicationContext(), "on Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle", "onRestart called!");
        Toast.makeText(getApplicationContext(), "on Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle", "onDestroy called!");
        Toast.makeText(getApplicationContext(), "on Destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle", "onPause called!");
        Toast.makeText(getApplicationContext(), "on Pause", Toast.LENGTH_SHORT).show();
    }
}