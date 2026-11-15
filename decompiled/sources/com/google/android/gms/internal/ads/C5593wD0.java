package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5593wD0 implements AD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4096kK0 f34498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3334eG0 f34499b;

    private C5593wD0(C3334eG0 c3334eG0, C4096kK0 c4096kK0) {
        this.f34499b = c3334eG0;
        this.f34498a = c4096kK0;
    }

    public static C5593wD0 a(C3334eG0 c3334eG0) {
        return new C5593wD0(c3334eG0, HD0.a(c3334eG0.d0()));
    }

    public static C5593wD0 c(C3334eG0 c3334eG0) {
        return new C5593wD0(c3334eG0, HD0.b(c3334eG0.d0()));
    }

    @Override // com.google.android.gms.internal.ads.AD0
    public final C4096kK0 b() {
        return this.f34498a;
    }

    public final C3334eG0 d() {
        return this.f34499b;
    }
}
