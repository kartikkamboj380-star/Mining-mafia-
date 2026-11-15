package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ty0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5309ty0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final InterfaceC5057ry0 f33518h = C5183sy0.f33278a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC4050jy0 f33519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4428my0 f33520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f33522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f33523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC5057ry0 f33524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f33525g;

    /* synthetic */ C5309ty0(AbstractC4050jy0 abstractC4050jy0, int i10, int i11, boolean z9, boolean z10, InterfaceC5057ry0 interfaceC5057ry0, byte[] bArr) {
        this.f33519a = abstractC4050jy0;
        this.f33525g = i10;
        int i12 = i10 - 2;
        this.f33520b = i12 != 1 ? i12 != 3 ? C4428my0.f31626c : C4428my0.f31627d : C4428my0.f31625b;
        this.f33521c = i11;
        this.f33522d = z9;
        this.f33523e = z10;
        this.f33524f = interfaceC5057ry0;
    }

    public final AbstractC4050jy0 a() {
        this.f33524f.a(this);
        return this.f33519a;
    }

    public final C4428my0 b() {
        return this.f33520b;
    }

    public final int c() {
        return this.f33521c;
    }

    public final boolean d() {
        return this.f33522d;
    }

    final /* synthetic */ AbstractC4050jy0 f() {
        return this.f33519a;
    }

    final /* synthetic */ int g() {
        return this.f33521c;
    }

    final /* synthetic */ boolean h() {
        return this.f33522d;
    }

    final /* synthetic */ boolean i() {
        return this.f33523e;
    }

    final /* synthetic */ int j() {
        return this.f33525g;
    }
}
