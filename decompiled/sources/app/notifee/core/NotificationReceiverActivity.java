package app.notifee.core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b9.p;

/* JADX INFO: loaded from: classes.dex */
public class NotificationReceiverActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.a(this, getIntent());
        finish();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        p.a(this, intent);
        finish();
    }
}
