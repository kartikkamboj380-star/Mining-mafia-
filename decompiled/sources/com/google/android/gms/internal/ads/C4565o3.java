package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4565o3 implements InterfaceC5326u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f31951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f31952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31953f;

    static {
        C5507vX0 c5507vX0 = new C5507vX0();
        c5507vX0.l0("application/id3");
        c5507vX0.m();
        C5507vX0 c5507vX1 = new C5507vX0();
        c5507vX1.l0("application/x-scte35");
        c5507vX1.m();
    }

    public C4565o3(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f31948a = str;
        this.f31949b = str2;
        this.f31950c = j10;
        this.f31951d = j11;
        this.f31952e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4565o3.class == obj.getClass()) {
            C4565o3 c4565o3 = (C4565o3) obj;
            if (this.f31950c == c4565o3.f31950c && this.f31951d == c4565o3.f31951d && Objects.equals(this.f31948a, c4565o3.f31948a) && Objects.equals(this.f31949b, c4565o3.f31949b) && Arrays.equals(this.f31952e, c4565o3.f31952e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f31953f;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((this.f31948a.hashCode() + 527) * 31) + this.f31949b.hashCode();
        long j10 = this.f31950c;
        int iHashCode2 = (((((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) this.f31951d)) * 31) + Arrays.hashCode(this.f31952e);
        this.f31953f = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        long j10 = this.f31951d;
        int length = String.valueOf(j10).length();
        long j11 = this.f31950c;
        int length2 = String.valueOf(j11).length();
        String str = this.f31948a;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.f31949b;
        StringBuilder sb = new StringBuilder(length3 + 8 + str2.length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j10);
        sb.append(", durationMs=");
        sb.append(j11);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }
}
