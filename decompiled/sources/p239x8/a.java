package p239x8;

import p131n0.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                c.a(autoCloseable);
                return;
            }
            try {
                c.a(autoCloseable);
            } catch (Throwable th2) {
                p129m8.a.a(th, th2);
            }
        }
    }
}
