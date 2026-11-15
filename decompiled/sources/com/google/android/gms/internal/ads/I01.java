package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I01 implements InterfaceC3299e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C2495Uf f19438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f19439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f19440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JY0[] f19441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19442e;

    public I01(C2495Uf c2495Uf, int[] iArr, int i10) {
        int length = iArr.length;
        AbstractC2418Ss0.i(length > 0);
        c2495Uf.getClass();
        this.f19438a = c2495Uf;
        this.f19439b = length;
        this.f19441d = new JY0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f19441d[i11] = c2495Uf.a(iArr[i11]);
        }
        Arrays.sort(this.f19441d, H01.f19172a);
        this.f19440c = new int[this.f19439b];
        for (int i12 = 0; i12 < this.f19439b; i12++) {
            this.f19440c[i12] = c2495Uf.b(this.f19441d[i12]);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927j
    public final int X(int i10) {
        for (int i11 = 0; i11 < this.f19439b; i11++) {
            if (this.f19440c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927j
    public final JY0 b(int i10) {
        return this.f19441d[i10];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3299e
    public final int c() {
        return this.f19440c[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            I01 i01 = (I01) obj;
            if (this.f19438a.equals(i01.f19438a) && Arrays.equals(this.f19440c, i01.f19440c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f19442e;
        if (i10 != 0) {
            return i10;
        }
        int iIdentityHashCode = (System.identityHashCode(this.f19438a) * 31) + Arrays.hashCode(this.f19440c);
        this.f19442e = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927j
    public final int n(int i10) {
        return this.f19440c[i10];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927j
    public final C2495Uf zza() {
        return this.f19438a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3299e
    public final JY0 zzc() {
        return this.f19441d[0];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927j
    public final int zze() {
        return this.f19440c.length;
    }
}
