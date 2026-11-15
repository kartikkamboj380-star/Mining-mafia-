package p208u7;

import android.text.TextUtils;
import android.util.Log;
import p148o7.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static void a(String str) {
        if (!b.f47699a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    public static void b(String str, Exception exc) {
        if ((!b.f47699a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
