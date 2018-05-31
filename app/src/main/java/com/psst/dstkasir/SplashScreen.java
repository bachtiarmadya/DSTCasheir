package com.psst.dstkasir;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.psst.dstkasir.goodjob.task.TaskLogin;
import com.psst.dstkasir.goodjob.utility.IsOnline;
import com.psst.dstkasir.goodjob.utility.MyApp;


public class SplashScreen extends AppCompatActivity implements IsOnline.ConnectionReceiverListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        checkConnection();


    }

    @Override
    public void onNetworkConnectionChanged(boolean isConnected) {
        if (!isConnected) {
            //show a No Internet Alert or Dialog

        } else {

            // dismiss the dialog or refresh the activity
        }
    }
    private void checkConnection() {
        boolean isConnected = IsOnline.isConnected(this);
        if (!isConnected) {
            //show a No Internet Alert or Dialog
            AlertDialog.Builder checkBuilder = new AlertDialog.Builder(SplashScreen.this);
            checkBuilder.setIcon(R.drawable.warning);
            checkBuilder.setTitle("Connection!");
            checkBuilder.setMessage("No Internet Connection!");

            checkBuilder.setPositiveButton("retry", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            });
            checkBuilder.setNegativeButton("exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            AlertDialog alert = checkBuilder.create();
            alert.show();
        }
        else {
            Thread thread = new Thread() {
                public void run() {
                    try {
                        sleep(4500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        startActivity(new Intent(SplashScreen.this, TaskLogin.class));
                        finish();
                    }
                }
            };
            thread.start();
        }
    }
}



