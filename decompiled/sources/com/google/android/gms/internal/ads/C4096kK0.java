package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4096kK0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f30759a;

    private C4096kK0(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f30759a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static C4096kK0 a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static C4096kK0 b(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i11 > length) {
            i11 = length;
        }
        return new C4096kK0(bArr, 0, i11);
    }

    public final byte[] c() {
        byte[] bArr = this.f30759a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final int d() {
        return this.f30759a.length;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4096kK0) {
            return Arrays.equals(((C4096kK0) obj).f30759a, this.f30759a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f30759a);
    }

    public final String toString() {
        byte[] bArr = this.f30759a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            sb.append("0123456789abcdef".charAt((b10 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b10 & 15));
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 7);
        sb2.append("Bytes(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
