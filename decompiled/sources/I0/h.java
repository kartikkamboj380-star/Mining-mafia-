package I0;

import J0.A;
import J0.AbstractC0708a;
import J0.B;
import J0.C;
import J0.l;
import J0.z;
import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    private static z a(WebSettings webSettings) {
        try {
            return C.c().c(webSettings);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e10;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e10);
            return new A();
        }
    }

    public static void b(WebSettings webSettings, int i10) {
        AbstractC0708a.h hVar = B.f1845T;
        if (hVar.b()) {
            l.a(webSettings, i10);
        } else {
            if (!hVar.c()) {
                throw B.a();
            }
            a(webSettings).a(i10);
        }
    }

    public static void c(WebSettings webSettings, int i10) {
        if (!B.f1846U.c()) {
            throw B.a();
        }
        a(webSettings).b(i10);
    }

    public static void d(WebSettings webSettings, boolean z9) {
        if (!B.f1891t0.c()) {
            throw B.a();
        }
        a(webSettings).c(z9);
    }
}
