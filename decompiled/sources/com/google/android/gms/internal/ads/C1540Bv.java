package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1540Bv extends K4.B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final InterfaceC2265Pu f17738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AbstractC1956Jv f17739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f17740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f17741f;

    C1540Bv(InterfaceC2265Pu interfaceC2265Pu, AbstractC1956Jv abstractC1956Jv, String str, String[] strArr) {
        this.f17738c = interfaceC2265Pu;
        this.f17739d = abstractC1956Jv;
        this.f17740e = str;
        this.f17741f = strArr;
        G4.t.b().d(this);
    }

    @Override // K4.B
    public final void a() {
        try {
            this.f17739d.f(this.f17740e, this.f17741f);
        } finally {
            K4.F0.f2598l.post(new RunnableC6058zv(this));
        }
    }

    @Override // K4.B
    public final com.google.common.util.concurrent.p b() {
        return (((Boolean) H4.B.c().d(AbstractC3892ii.f29522C2)).booleanValue() && (this.f17739d instanceof C2475Tv)) ? AbstractC2315Qt.f22478f.e0(new Callable() { // from class: com.google.android.gms.internal.ads.Av
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f17432a.e();
            }
        }) : super.b();
    }

    public final String d() {
        return this.f17740e;
    }

    final /* synthetic */ Boolean e() {
        return Boolean.valueOf(this.f17739d.g(this.f17740e, this.f17741f, this));
    }
}
