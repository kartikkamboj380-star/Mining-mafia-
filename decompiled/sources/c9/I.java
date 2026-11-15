package c9;

import kotlin.jvm.internal.Intrinsics;
import r9.C7108k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I {
    public abstract void a(H h10, int i10, String str);

    public void b(H webSocket, int i10, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public abstract void c(H h10, Throwable th, D d10);

    public abstract void d(H h10, String str);

    public void e(H webSocket, C7108k bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
    }

    public abstract void f(H h10, D d10);
}
