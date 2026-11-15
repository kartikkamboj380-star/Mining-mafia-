package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class KZ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f20227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5088sD f20228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2799a00 f20229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3133cf0 f20230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2376Rx0 f20231f = C2376Rx0.B();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f20232g = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LZ f20233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C5011rb0 f20234i;

    KZ(Executor executor, ScheduledExecutorService scheduledExecutorService, InterfaceC5088sD interfaceC5088sD, C2799a00 c2799a00, C3133cf0 c3133cf0) {
        this.f20226a = executor;
        this.f20227b = scheduledExecutorService;
        this.f20228c = interfaceC5088sD;
        this.f20229d = c2799a00;
        this.f20230e = c3133cf0;
    }

    private final synchronized com.google.common.util.concurrent.p d(C3502fb0 c3502fb0) {
        Iterator it = c3502fb0.f28395a.iterator();
        while (it.hasNext()) {
            InterfaceC4375mY interfaceC4375mYA = this.f20228c.a(c3502fb0.f28397b, (String) it.next());
            if (interfaceC4375mYA != null && interfaceC4375mYA.a(this.f20234i, c3502fb0)) {
                return AbstractC5685wx0.i(interfaceC4375mYA.b(this.f20234i, c3502fb0), c3502fb0.f28386R, TimeUnit.MILLISECONDS, this.f20227b);
            }
        }
        return AbstractC5685wx0.c(new C4619oU(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void b(C3502fb0 c3502fb0) {
        com.google.common.util.concurrent.p pVarD = d(c3502fb0);
        this.f20229d.e(this.f20234i, c3502fb0, pVarD, this.f20230e);
        AbstractC5685wx0.r(pVarD, new JZ(this, c3502fb0), this.f20226a);
    }

    public final synchronized com.google.common.util.concurrent.p a(C5011rb0 c5011rb0) {
        try {
            if (!this.f20232g.getAndSet(true)) {
                List list = c5011rb0.f32991b.f32671a;
                if (list.isEmpty()) {
                    this.f20231f.l(new C3301e00(3, C3679h00.a(c5011rb0)));
                } else {
                    this.f20234i = c5011rb0;
                    C2799a00 c2799a00 = this.f20229d;
                    this.f20233h = new LZ(c5011rb0, c2799a00, this.f20231f);
                    c2799a00.c(list);
                    C3502fb0 c3502fb0A = this.f20233h.a();
                    while (c3502fb0A != null) {
                        b(c3502fb0A);
                        c3502fb0A = this.f20233h.a();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f20231f;
    }

    final /* synthetic */ LZ c() {
        return this.f20233h;
    }
}
