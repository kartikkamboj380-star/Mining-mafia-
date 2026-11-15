package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.El0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1677El0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2978bQ0 f18556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2978bQ0 f18557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f18558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2978bQ0 f18559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.common.util.concurrent.p f18560e = null;

    C1677El0(InterfaceC2978bQ0 interfaceC2978bQ0, InterfaceC2978bQ0 interfaceC2978bQ1, ExecutorService executorService, InterfaceC2978bQ0 interfaceC2978bQ2) {
        this.f18556a = interfaceC2978bQ0;
        this.f18557b = interfaceC2978bQ1;
        this.f18558c = executorService;
        this.f18559d = interfaceC2978bQ2;
    }

    public final synchronized com.google.common.util.concurrent.p a() {
        try {
            com.google.common.util.concurrent.p pVar = this.f18560e;
            if (pVar != null) {
                return pVar;
            }
            Set set = (Set) this.f18557b.zzb();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC1573Cl0) it.next()).zza());
            }
            C5043rr0 c5043rr0 = (C5043rr0) this.f18559d.zzb();
            com.google.common.util.concurrent.p pVarK = AbstractC5685wx0.k(AbstractC5685wx0.m(arrayList), C1625Dl0.f18280a, this.f18558c);
            c5043rr0.e(2, pVarK);
            this.f18560e = pVarK;
            Iterator it2 = ((Set) this.f18556a.zzb()).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1573Cl0) it2.next()).zza();
            }
            com.google.common.util.concurrent.p pVar2 = this.f18560e;
            if (pVar2 != null) {
                return pVar2;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized com.google.common.util.concurrent.p b() {
        com.google.common.util.concurrent.p pVar;
        pVar = this.f18560e;
        if (pVar == null) {
            throw null;
        }
        return pVar;
    }
}
