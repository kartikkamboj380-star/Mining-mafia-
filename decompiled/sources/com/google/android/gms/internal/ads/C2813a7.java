package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2813a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f26429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26430e;

    public C2813a7(int i10, int i11) {
        this.f26426a = i10;
        byte[] bArr = new byte[131];
        this.f26429d = bArr;
        bArr[2] = 1;
    }

    public final void a() {
        this.f26427b = false;
        this.f26428c = false;
    }

    public final boolean b() {
        return this.f26428c;
    }

    public final void c(int i10) {
        AbstractC2418Ss0.i(!this.f26427b);
        boolean z9 = i10 == this.f26426a;
        this.f26427b = z9;
        if (z9) {
            this.f26430e = 3;
            this.f26428c = false;
        }
    }

    public final void d(byte[] bArr, int i10, int i11) {
        if (this.f26427b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f26429d;
            int length = bArr2.length;
            int i13 = this.f26430e + i12;
            if (length < i13) {
                this.f26429d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f26429d, this.f26430e, i12);
            this.f26430e += i12;
        }
    }

    public final boolean e(int i10) {
        if (!this.f26427b) {
            return false;
        }
        this.f26430e -= i10;
        this.f26427b = false;
        this.f26428c = true;
        return true;
    }
}
