package K4;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.C2205Oq;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: K4.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0768f0 {
    public static Object a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            L4.p.d("Unexpected exception.", th);
            C2205Oq.c(context).b(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
