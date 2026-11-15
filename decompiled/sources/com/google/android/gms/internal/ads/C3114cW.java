package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3114cW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f27129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f27130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2978bQ0 f27131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L4.a f27132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final XV f27133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final QR f27134g;

    C3114cW(Context context, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx1, InterfaceC2978bQ0 interfaceC2978bQ0, L4.a aVar, XV xv, QR qr) {
        this.f27128a = context;
        this.f27129b = interfaceExecutorServiceC1805Gx0;
        this.f27130c = interfaceExecutorServiceC1805Gx1;
        this.f27131d = interfaceC2978bQ0;
        this.f27132e = aVar;
        this.f27133f = xv;
        this.f27134g = qr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void c() {
        try {
            ((BinderC5756xW) this.f27131d.zzb()).M(this.f27132e.f3097a);
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Df)).booleanValue()) {
                PR prA = this.f27134g.a();
                prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "ptard");
                prA.c("ptard", "l");
                prA.d();
            }
        } catch (RemoteException | NullPointerException e10) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Ef)).booleanValue()) {
                G4.t.l().j(e10, "Preconnect Local");
            }
        }
    }

    public final void a() {
        G4.t.g();
        if (K4.F0.h(this.f27128a.getPackageName())) {
            this.f27130c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ZV
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f26202a.b();
                }
            });
            return;
        }
        YV yv = new YV(this);
        InterfaceC3365eW interfaceC3365eWZzb = this.f27133f.zzb();
        interfaceC3365eWZzb.a(yv);
        final C4117kV c4117kVZza = interfaceC3365eWZzb.zza().zza();
        InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0 = this.f27129b;
        Objects.requireNonNull(c4117kVZza);
        interfaceExecutorServiceC1805Gx0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bW
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                c4117kVZza.c();
            }
        });
    }

    final /* synthetic */ QR d() {
        return this.f27134g;
    }
}
