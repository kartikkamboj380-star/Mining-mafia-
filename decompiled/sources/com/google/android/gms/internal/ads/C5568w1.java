package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5568w1 implements InterfaceC4311m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f34449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f34450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f34451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f34452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f34453f;

    public C5568w1(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f34449b = iArr;
        this.f34450c = jArr;
        this.f34451d = jArr2;
        this.f34452e = jArr3;
        int length = iArr.length;
        this.f34448a = length;
        if (length <= 0) {
            this.f34453f = 0L;
        } else {
            int i10 = length - 1;
            this.f34453f = jArr2[i10] + jArr3[i10];
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        long[] jArr = this.f34452e;
        int I9 = AbstractC4634ob0.I(jArr, j10, true, true);
        long j11 = jArr[I9];
        long[] jArr2 = this.f34450c;
        C4437n2 c4437n2 = new C4437n2(j11, jArr2[I9]);
        if (c4437n2.f31651a >= j10 || I9 == this.f34448a - 1) {
            return new C4059k2(c4437n2, c4437n2);
        }
        int i10 = I9 + 1;
        return new C4059k2(c4437n2, new C4437n2(jArr[i10], jArr2[i10]));
    }

    public final String toString() {
        long[] jArr = this.f34451d;
        long[] jArr2 = this.f34452e;
        long[] jArr3 = this.f34450c;
        String string = Arrays.toString(this.f34449b);
        String string2 = Arrays.toString(jArr3);
        String string3 = Arrays.toString(jArr2);
        String string4 = Arrays.toString(jArr);
        int i10 = this.f34448a;
        int length = String.valueOf(i10).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i10);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        sb.append(string4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f34453f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return true;
    }
}
