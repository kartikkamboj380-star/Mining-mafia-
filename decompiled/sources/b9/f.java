package b9;

import android.content.Context;
import app.notifee.core.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f11648a;

    public static void a(Context context) {
        Logger.d("context", "received application context");
        f11648a = context;
    }
}
