package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4190l40 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f31172a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f31173b = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Clock f31174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f31175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3191d70 f31176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f31177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final QR f31178g;

    public C4190l40(InterfaceC3191d70 interfaceC3191d70, long j10, Clock clock, Executor executor, QR qr) {
        this.f31174c = clock;
        this.f31176e = interfaceC3191d70;
        this.f31177f = j10;
        this.f31175d = executor;
        this.f31178g = qr;
    }

    final /* synthetic */ void a() {
        this.f31175d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.j40
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f30294a.b();
            }
        });
    }

    final /* synthetic */ void b() {
        this.f31172a.set(new C3814i40(this.f31176e.zza(), this.f31177f, this.f31174c));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        C3814i40 c3814i40;
        C3814i40 c3814i41;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.ld)).booleanValue()) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.kd)).booleanValue() && !((Boolean) this.f31173b.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = AbstractC2315Qt.f22476d;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.k40
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f30690a.a();
                    }
                };
                long j10 = this.f31177f;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j10, j10, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.f31172a;
                    c3814i40 = (C3814i40) atomicReference.get();
                    if (c3814i40 == null) {
                        C3814i40 c3814i42 = new C3814i40(this.f31176e.zza(), this.f31177f, this.f31174c);
                        atomicReference.set(c3814i42);
                        return c3814i42.f29252a;
                    }
                    if (!((Boolean) this.f31173b.get()).booleanValue() && c3814i40.a()) {
                        com.google.common.util.concurrent.p pVar = c3814i40.f29252a;
                        InterfaceC3191d70 interfaceC3191d70 = this.f31176e;
                        c3814i41 = new C3814i40(interfaceC3191d70.zza(), this.f31177f, this.f31174c);
                        this.f31172a.set(c3814i41);
                        if (((Boolean) H4.B.c().d(AbstractC3892ii.md)).booleanValue()) {
                            if (((Boolean) H4.B.c().d(AbstractC3892ii.nd)).booleanValue()) {
                                PR prA = this.f31178g.a();
                                prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "scs");
                                prA.c("sid", String.valueOf(interfaceC3191d70.zzb()));
                                prA.d();
                            }
                            return pVar;
                        }
                        c3814i40 = c3814i41;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.f31172a;
            c3814i40 = (C3814i40) atomicReference2.get();
            if (c3814i40 == null || c3814i40.a()) {
                InterfaceC3191d70 interfaceC3191d71 = this.f31176e;
                c3814i41 = new C3814i40(interfaceC3191d71.zza(), this.f31177f, this.f31174c);
                atomicReference2.set(c3814i41);
                c3814i40 = c3814i41;
            }
        }
        return c3814i40.f29252a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return this.f31176e.zzb();
    }
}
