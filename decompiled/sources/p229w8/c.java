package p229w8;

import java.io.Closeable;
import p129m8.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                a.a(th, th2);
            }
        }
    }
}
