package com.miningmafia.app.mining;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.miningmafia.app.R;
import com.miningmafia.app.ui.MainActivity;
import com.miningmafia.app.app.MiningMafiaApplication;

/**
 * Foreground service for visible background mining/status monitoring.
 *
 * This is a USER-VISIBLE, non-stealth service. A notification is always shown
 * while it runs, and the user can stop it. It does NOT promise 24/7 operation
 * and respects Android background execution limits / battery optimization.
 */
public class MiningMonitorService extends Service {

    public static final String FOREGROUND_CHANNEL = "mining_mafia_foreground";
    public static final int FOREGROUND_ID = 1001;

    private MiningManager miningManager;
    private boolean started = false;

    @Override
    public void onCreate() {
        super.onCreate();
        miningManager = MiningMafiaApplication.getContainer().getMiningManager();
        createNotificationChannel();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null && "com.miningmafia.app.action.STOP".equals(intent.getAction())) {
            stopSelf();
            return START_NOT_STICKY;
        }

        startForeground();
        started = true;
        return START_NOT_STICKY; // not restarted by system if killed - respects limits
    }

    private void startForeground() {
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Intent stopIntent = new Intent(this, MiningMonitorService.class);
        stopIntent.setAction("com.miningmafia.app.action.STOP");
        PendingIntent stopPending = PendingIntent.getService(
                this, 0, stopIntent, PendingIntent.FLAG_IMMUTABLE);

        Intent openIntent = new Intent(this, MainActivity.class);
        openIntent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent openPending = PendingIntent.getActivity(
                this, 0, openIntent, PendingIntent.FLAG_IMMUTABLE);

        Notification notification = new NotificationCompat.Builder(this, FOREGROUND_CHANNEL)
                .setSmallIcon(R.drawable.ic_mining)
                .setContentTitle("Mining Mafia - Background Monitoring")
                .setContentText("Mining status monitoring is running")
                .setOngoing(true)
                .setContentIntent(openPending)
                .addAction(R.drawable.ic_stop, "Stop Monitoring", stopPending)
                .build();

        startForeground(FOREGROUND_ID, notification);
    }

    private void createNotificationChannel() {
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    FOREGROUND_CHANNEL,
                    "Mining Mafia Monitoring",
                    NotificationManager.IMPORTANCE_LOW);
            channel.setDescription("Shown while background mining/status monitoring is active");
            nm.createNotificationChannel(channel);
        }
    }

    @Override
    public void onDestroy() {
        started = false;
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
