package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class CallableC5364uP implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G4.a f33799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f33800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QR f33801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5884yX f33802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f33803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5138sc f33804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L4.a f33805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C3636gf0 f33806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final KX f33807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1605Db0 f33808j;

    public CallableC5364uP(Context context, Executor executor, C5138sc c5138sc, L4.a aVar, G4.a aVar2, C2633Ww c2633Ww, C5884yX c5884yX, C3636gf0 c3636gf0, QR qr, KX kx, C1605Db0 c1605Db0) {
        this.f33800b = context;
        this.f33803e = executor;
        this.f33804f = c5138sc;
        this.f33805g = aVar;
        this.f33799a = aVar2;
        this.f33802d = c5884yX;
        this.f33806h = c3636gf0;
        this.f33801c = qr;
        this.f33807i = kx;
        this.f33808j = c1605Db0;
    }

    final /* synthetic */ G4.a a() {
        return this.f33799a;
    }

    final /* synthetic */ Context b() {
        return this.f33800b;
    }

    final /* synthetic */ QR c() {
        return this.f33801c;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C5616wP c5616wP = new C5616wP(this);
        c5616wP.a();
        return c5616wP;
    }

    final /* synthetic */ C5884yX d() {
        return this.f33802d;
    }

    final /* synthetic */ Executor e() {
        return this.f33803e;
    }

    final /* synthetic */ C5138sc f() {
        return this.f33804f;
    }

    final /* synthetic */ L4.a g() {
        return this.f33805g;
    }

    final /* synthetic */ C3636gf0 h() {
        return this.f33806h;
    }

    final /* synthetic */ KX i() {
        return this.f33807i;
    }

    final /* synthetic */ C1605Db0 j() {
        return this.f33808j;
    }
}
