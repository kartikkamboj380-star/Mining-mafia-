package K8;

import I8.AbstractC0688p0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class p {
    public static final void a(x xVar, Throwable th) {
        CancellationException cancellationExceptionA = null;
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = AbstractC0688p0.a("Channel was consumed, consumer had failed", th);
            }
        }
        xVar.c(cancellationExceptionA);
    }
}
