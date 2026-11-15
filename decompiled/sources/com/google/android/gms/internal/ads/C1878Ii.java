package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1878Ii extends p180s.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f19599b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f19600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private QR f19601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p180s.f f19602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p180s.c f19603f;

    private final void h(Context context) {
        String strC;
        if (this.f19603f != null || context == null || (strC = p180s.c.c(context, null)) == null || strC.equals(context.getPackageName())) {
            return;
        }
        p180s.c.a(context, strC, this);
    }

    @Override // p180s.e
    public final void a(ComponentName componentName, p180s.c cVar) {
        this.f19603f = cVar;
        cVar.g(0L);
        this.f19602e = cVar.e(new C1722Fi(this));
    }

    public final void c(Context context, QR qr) {
        if (this.f19599b.getAndSet(true)) {
            return;
        }
        this.f19600c = context;
        this.f19601d = qr;
        h(context);
    }

    public final p180s.f d() {
        if (this.f19602e == null) {
            AbstractC2315Qt.f22473a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Hi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f19367a.f();
                }
            });
        }
        return this.f19602e;
    }

    public final void e(final int i10) {
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f30029y5)).booleanValue() || this.f19601d == null) {
            return;
        }
        AbstractC2315Qt.f22473a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Gi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f19095a.g(i10);
            }
        });
    }

    final /* synthetic */ void f() {
        h(this.f19600c);
    }

    final /* synthetic */ void g(int i10) {
        QR qr = this.f19601d;
        if (qr != null) {
            PR prA = qr.a();
            prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "cct_nav");
            prA.c("cct_navs", String.valueOf(i10));
            prA.d();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f19603f = null;
        this.f19602e = null;
    }
}
