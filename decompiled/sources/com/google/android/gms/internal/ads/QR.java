package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class QR {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WR f22364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f22365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f22366c;

    public QR(WR wr, Executor executor) {
        this.f22364a = wr;
        this.f22366c = wr.j();
        this.f22365b = executor;
    }

    public final PR a() {
        PR pr = new PR(this);
        pr.l();
        return pr;
    }

    public final void b() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.cd)).booleanValue()) {
            PR prA = a();
            prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "pecr");
            prA.d();
        }
    }

    final /* synthetic */ WR c() {
        return this.f22364a;
    }

    final /* synthetic */ Executor d() {
        return this.f22365b;
    }

    final /* synthetic */ Map e() {
        return this.f22366c;
    }
}
