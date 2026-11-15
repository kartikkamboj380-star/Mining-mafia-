package K3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements h {
    @Override // K3.h
    public final void b(Object obj, j responder) {
        Intrinsics.checkNotNullParameter(responder, "responder");
        responder.b("Request is not supported");
        Z1.a.m(c.class.getSimpleName(), "Request is not supported");
    }
}
