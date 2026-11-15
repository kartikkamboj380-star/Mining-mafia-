package P5;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
