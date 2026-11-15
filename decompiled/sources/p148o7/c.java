package p148o7;

import android.content.Context;
import p178r7.b;
import p178r7.f;
import p178r7.h;
import p208u7.a;
import p208u7.e;
import p208u7.g;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47700a;

    private void d(Context context) {
        g.b(context, "Application Context cannot be null");
    }

    String a() {
        return "1.4.9-Unity3d";
    }

    void b(Context context) {
        d(context);
        if (e()) {
            return;
        }
        c(true);
        h.d().b(context);
        b.k().a(context);
        a.b(context);
        p208u7.c.d(context);
        e.c(context);
        f.c().b(context);
        p178r7.a.a().b(context);
    }

    void c(boolean z9) {
        this.f47700a = z9;
    }

    boolean e() {
        return this.f47700a;
    }
}
