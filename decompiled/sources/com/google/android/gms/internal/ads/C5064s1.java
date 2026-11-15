package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5064s1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C5064s1 f33065d = new C5064s1(-3, -9223372036854775807L, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33068c;

    private C5064s1(int i10, long j10, long j11) {
        this.f33066a = i10;
        this.f33067b = j10;
        this.f33068c = j11;
    }

    public static C5064s1 a(long j10, long j11) {
        return new C5064s1(-1, j10, j11);
    }

    public static C5064s1 b(long j10, long j11) {
        return new C5064s1(-2, j10, j11);
    }

    public static C5064s1 c(long j10) {
        return new C5064s1(0, -9223372036854775807L, j10);
    }

    final /* synthetic */ int d() {
        return this.f33066a;
    }

    final /* synthetic */ long e() {
        return this.f33067b;
    }

    final /* synthetic */ long f() {
        return this.f33068c;
    }
}
