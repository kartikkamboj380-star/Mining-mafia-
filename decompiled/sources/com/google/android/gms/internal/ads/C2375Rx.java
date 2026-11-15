package com.google.android.gms.internal.ads;

import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2375Rx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1908Ix f22966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QR f22967b;

    C2375Rx(C1908Ix c1908Ix, QR qr) {
        this.f22966a = c1908Ix;
        this.f22967b = qr;
    }

    public final void a(final Context context, final L4.a aVar) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.tf)).booleanValue()) {
            Executor threadPoolExecutor = AbstractC2315Qt.f22473a;
            if (((Boolean) H4.B.c().d(AbstractC3892ii.vf)).booleanValue()) {
                ThreadFactoryC2323Qx threadFactoryC2323Qx = new ThreadFactoryC2323Qx(((Integer) H4.B.c().d(AbstractC3892ii.xf)).intValue(), null);
                int iIntValue = ((Integer) H4.B.c().d(AbstractC3892ii.wf)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC2323Qx);
            }
            threadPoolExecutor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Ox
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f21735a.b(context, aVar);
                }
            });
        }
    }

    final /* synthetic */ void b(Context context, L4.a aVar) {
        long jElapsedRealtime = G4.t.o().elapsedRealtime();
        G4.t.g().R(context, aVar.f3097a);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.uf)).booleanValue()) {
            long jElapsedRealtime2 = G4.t.o().elapsedRealtime() - jElapsedRealtime;
            PR prA = this.f22967b.a();
            prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
            sb.append(jElapsedRealtime2);
            prA.c("webview_startup_l", sb.toString());
            prA.d();
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Af)).booleanValue()) {
            AbstractC2315Qt.f22478f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Nx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f21402a.c();
                }
            });
        }
    }

    final /* synthetic */ void c() {
        this.f22966a.b(new C2115Mx(this, G4.t.o().elapsedRealtime()));
    }

    final /* synthetic */ QR d() {
        return this.f22967b;
    }
}
