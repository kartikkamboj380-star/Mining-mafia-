package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2074Mc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4762pc0 f20885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1919Jc0 f20886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4258lc0 f20887c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2438Tc0 f20889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20890f = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque f20888d = new ArrayDeque();

    public C2074Mc0(InterfaceC4762pc0 interfaceC4762pc0, C4258lc0 c4258lc0, InterfaceC1919Jc0 interfaceC1919Jc0) {
        this.f20885a = interfaceC4762pc0;
        this.f20887c = c4258lc0;
        this.f20886b = interfaceC1919Jc0;
        c4258lc0.a(new InterfaceC4132kc0() { // from class: com.google.android.gms.internal.ads.Lc0
            @Override // com.google.android.gms.internal.ads.InterfaceC4132kc0
            public final /* synthetic */ void zza() {
                this.f20558a.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized void d() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29855i7)).booleanValue() && !G4.t.l().r().zzi().i()) {
            this.f20888d.clear();
            return;
        }
        if (i()) {
            while (true) {
                ArrayDeque arrayDeque = this.f20888d;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                InterfaceC1971Kc0 interfaceC1971Kc0 = (InterfaceC1971Kc0) arrayDeque.pollFirst();
                if (interfaceC1971Kc0 == null || (interfaceC1971Kc0.zzb() != null && this.f20885a.c(interfaceC1971Kc0.zzb()))) {
                    C2438Tc0 c2438Tc0 = new C2438Tc0(this.f20885a, this.f20886b, interfaceC1971Kc0);
                    this.f20889e = c2438Tc0;
                    c2438Tc0.a(new C1815Hc0(this, interfaceC1971Kc0));
                    return;
                }
            }
        }
    }

    private final synchronized boolean i() {
        return this.f20889e == null;
    }

    public final synchronized void a(InterfaceC1971Kc0 interfaceC1971Kc0) {
        this.f20888d.add(interfaceC1971Kc0);
    }

    public final synchronized com.google.common.util.concurrent.p b(InterfaceC1971Kc0 interfaceC1971Kc0) {
        this.f20890f = 2;
        if (i()) {
            return null;
        }
        return this.f20889e.b(interfaceC1971Kc0);
    }

    final /* synthetic */ void c() {
        synchronized (this) {
            this.f20890f = 1;
            d();
        }
    }

    final /* synthetic */ ArrayDeque e() {
        return this.f20888d;
    }

    final /* synthetic */ void f(C2438Tc0 c2438Tc0) {
        this.f20889e = null;
    }

    final /* synthetic */ int g() {
        return this.f20890f;
    }
}
