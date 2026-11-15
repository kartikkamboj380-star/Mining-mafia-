package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class RU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f22821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f22822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f22823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4998rV f22824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2978bQ0 f22825e;

    public RU(ScheduledExecutorService scheduledExecutorService, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx1, C4998rV c4998rV, InterfaceC2978bQ0 interfaceC2978bQ0) {
        this.f22821a = scheduledExecutorService;
        this.f22822b = interfaceExecutorServiceC1805Gx0;
        this.f22823c = interfaceExecutorServiceC1805Gx1;
        this.f22824d = c4998rV;
        this.f22825e = interfaceC2978bQ0;
    }

    public final com.google.common.util.concurrent.p a(final C5420ur c5420ur) {
        com.google.common.util.concurrent.p pVarE0;
        String str = c5420ur.f33911d;
        G4.t.g();
        if (K4.F0.h(str)) {
            pVarE0 = AbstractC5685wx0.c(new FV(1));
        } else {
            pVarE0 = (((Boolean) H4.B.c().d(AbstractC3892ii.f29999v8)).booleanValue() || ((Boolean) AbstractC5530vj.f34150a.e()).booleanValue()) ? this.f22823c.e0(new Callable() { // from class: com.google.android.gms.internal.ads.OU
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f21563a.c(c5420ur);
                }
            }) : this.f22824d.c(c5420ur);
        }
        final int callingUid = Binder.getCallingUid();
        return (AbstractC4678ox0) AbstractC5685wx0.h((AbstractC4678ox0) AbstractC5685wx0.i(AbstractC4678ox0.B(pVarE0), ((Integer) H4.B.c().d(AbstractC3892ii.f29526C6)).intValue(), TimeUnit.SECONDS, this.f22821a), Throwable.class, new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.QU
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f22376a.b(c5420ur, callingUid, (Throwable) obj);
            }
        }, this.f22822b);
    }

    final /* synthetic */ com.google.common.util.concurrent.p b(final C5420ur c5420ur, int i10, Throwable th) {
        Bundle bundle;
        if (c5420ur != null && (bundle = c5420ur.f33920m) != null) {
            bundle.putBoolean("ls", true);
        }
        return AbstractC5685wx0.j(((BinderC5756xW) this.f22825e.zzb()).B6(c5420ur, i10), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.PU
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return AbstractC5685wx0.a(new GV((InputStream) obj, c5420ur));
            }
        }, this.f22822b);
    }

    final /* synthetic */ GV c(C5420ur c5420ur) {
        return (GV) this.f22824d.c(c5420ur).get(((Integer) H4.B.c().d(AbstractC3892ii.f29526C6)).intValue(), TimeUnit.SECONDS);
    }
}
