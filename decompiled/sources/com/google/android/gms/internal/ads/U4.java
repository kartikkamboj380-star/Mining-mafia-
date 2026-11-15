package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class U4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f23905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JY0 f23906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f23908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long[] f23909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f23910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final V4[] f23911l;

    public U4(int i10, int i11, long j10, long j11, long j12, long j13, JY0 jy0, int i12, V4[] v4Arr, int i13, long[] jArr, long[] jArr2) {
        this.f23900a = i10;
        this.f23901b = i11;
        this.f23902c = j10;
        this.f23903d = j11;
        this.f23904e = j12;
        this.f23905f = j13;
        this.f23906g = jy0;
        this.f23907h = i12;
        this.f23911l = v4Arr;
        this.f23910k = i13;
        this.f23908i = jArr;
        this.f23909j = jArr2;
    }

    public final V4 a(int i10) {
        return this.f23911l[i10];
    }

    public final U4 b(JY0 jy0) {
        return new U4(this.f23900a, this.f23901b, this.f23902c, this.f23903d, this.f23904e, this.f23905f, jy0, this.f23907h, this.f23911l, this.f23910k, this.f23908i, this.f23909j);
    }
}
