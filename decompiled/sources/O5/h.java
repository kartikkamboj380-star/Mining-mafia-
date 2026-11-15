package O5;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f4522a;

    static synchronized e a(Context context) {
        try {
            if (f4522a == null) {
                g gVar = new g(null);
                gVar.b(new n(P5.C.a(context)));
                f4522a = gVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4522a;
    }
}
