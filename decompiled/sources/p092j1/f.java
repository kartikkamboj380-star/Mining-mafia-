package p092j1;

import C.b;
import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final d a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) b.i(applicationContext, ConnectivityManager.class);
        if (connectivityManager == null || !p102k1.f.b(applicationContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return d.f45418b;
        }
        try {
            return new e(connectivityManager);
        } catch (Exception unused) {
            return d.f45418b;
        }
    }
}
