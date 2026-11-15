package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ED {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f18436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f18437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.p f18438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f18439d = true;

    public ED(Executor executor, ScheduledExecutorService scheduledExecutorService, com.google.common.util.concurrent.p pVar) {
        this.f18436a = executor;
        this.f18437b = scheduledExecutorService;
        this.f18438c = pVar;
    }

    public final void a(InterfaceC5307tx0 interfaceC5307tx0) {
        AbstractC5685wx0.r(this.f18438c, new C5844yD(this, interfaceC5307tx0), this.f18436a);
    }

    public final boolean b() {
        return this.f18439d;
    }

    final /* synthetic */ com.google.common.util.concurrent.p c(InterfaceC5307tx0 interfaceC5307tx0, com.google.common.util.concurrent.p pVar, AbstractC4711pD abstractC4711pD) {
        if (abstractC4711pD != null) {
            interfaceC5307tx0.zzb(abstractC4711pD);
        }
        return AbstractC5685wx0.i(pVar, ((Long) AbstractC5908yj.f35431a.e()).longValue(), TimeUnit.MILLISECONDS, this.f18437b);
    }

    final /* synthetic */ void d() {
        this.f18439d = false;
    }

    final /* synthetic */ void e(List list, final InterfaceC5307tx0 interfaceC5307tx0) {
        if (list == null || list.isEmpty()) {
            this.f18436a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.DD
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    interfaceC5307tx0.a(new C4619oU(3));
                }
            });
            return;
        }
        com.google.common.util.concurrent.p pVarA = AbstractC5685wx0.a(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.google.common.util.concurrent.p pVar = (com.google.common.util.concurrent.p) it.next();
            InterfaceC3294dx0 interfaceC3294dx0 = new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.AD
                @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
                public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                    interfaceC5307tx0.a((Throwable) obj);
                    return AbstractC5685wx0.a(null);
                }
            };
            Executor executor = this.f18436a;
            pVarA = AbstractC5685wx0.j(AbstractC5685wx0.h(pVarA, Throwable.class, interfaceC3294dx0, executor), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.BD
                @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
                public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                    return this.f17531a.c(interfaceC5307tx0, pVar, (AbstractC4711pD) obj);
                }
            }, executor);
        }
        AbstractC5685wx0.r(pVarA, new C5970zD(this, interfaceC5307tx0), this.f18436a);
    }

    final /* synthetic */ void f() {
        AbstractC2315Qt.f22478f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.CD
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f17822a.d();
            }
        });
    }
}
