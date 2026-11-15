package K4;

import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC4397mj;

/* JADX INFO: renamed from: K4.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0786o0 extends L4.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2696b = 0;

    public static void k(String str) {
        if (m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z9 = true;
            for (String str2 : L4.p.f3140a.d(str)) {
                if (z9) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z9 = false;
            }
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return L4.p.j(2) && ((Boolean) AbstractC4397mj.f31570a.e()).booleanValue();
    }
}
