package M1;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static boolean a() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
