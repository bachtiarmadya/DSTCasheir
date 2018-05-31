package com.psst.dstkasir.goodjob.utility;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.telephony.TelephonyManager;

import com.psst.dstkasir.R;
import com.psst.dstkasir.SplashScreen;

import java.net.InetAddress;

public class IsOnline extends BroadcastReceiver {

    public static ConnectionReceiverListener connectionReceiverListener;

    public IsOnline() {
        super();
    }

    @Override
    public void onReceive(Context context, Intent arg1) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null
                && activeNetwork.isConnectedOrConnecting();

        if (connectionReceiverListener != null) {
            connectionReceiverListener.onNetworkConnectionChanged(isConnected);
        }
    }

    public static boolean isConnected(Context ctx) {
        ConnectivityManager
                cm = (ConnectivityManager) ctx.getApplicationContext()
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null
                && activeNetwork.isConnectedOrConnecting();
    }


    public interface ConnectionReceiverListener {
        void onNetworkConnectionChanged(boolean isConnected);
    }
}