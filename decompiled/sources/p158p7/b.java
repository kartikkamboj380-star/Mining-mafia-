package p158p7;

import android.view.View;
import p208u7.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static b a(c cVar, d dVar) {
        g.a();
        g.b(cVar, "AdSessionConfiguration is null");
        g.b(dVar, "AdSessionContext is null");
        return new l(cVar, dVar);
    }

    public abstract void b();

    public abstract void c(View view);

    public abstract void d();
}
