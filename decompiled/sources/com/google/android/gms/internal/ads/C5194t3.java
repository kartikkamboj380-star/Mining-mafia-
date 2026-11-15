package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5194t3 implements InterfaceC5326u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f33310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f33311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33312f;

    public C5194t3(int i10, String str, String str2, String str3, boolean z9, int i11) {
        boolean z10 = true;
        if (i11 != -1 && i11 <= 0) {
            z10 = false;
        }
        AbstractC2418Ss0.a(z10);
        this.f33307a = i10;
        this.f33308b = str;
        this.f33309c = str2;
        this.f33310d = str3;
        this.f33311e = z9;
        this.f33312f = i11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326u6
    public final void a(C5072s5 c5072s5) {
        String str = this.f33309c;
        if (str != null) {
            c5072s5.R(str);
        }
        String str2 = this.f33308b;
        if (str2 != null) {
            c5072s5.Q(str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5194t3.class == obj.getClass()) {
            C5194t3 c5194t3 = (C5194t3) obj;
            if (this.f33307a == c5194t3.f33307a && Objects.equals(this.f33308b, c5194t3.f33308b) && Objects.equals(this.f33309c, c5194t3.f33309c) && Objects.equals(this.f33310d, c5194t3.f33310d) && this.f33311e == c5194t3.f33311e && this.f33312f == c5194t3.f33312f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f33308b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i10 = this.f33307a;
        String str2 = this.f33309c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i11 = ((i10 + 527) * 31) + iHashCode;
        String str3 = this.f33310d;
        return (((((((i11 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f33311e ? 1 : 0)) * 31) + this.f33312f;
    }

    public final String toString() {
        String str = this.f33309c;
        int length = String.valueOf(str).length();
        String str2 = this.f33308b;
        int length2 = String.valueOf(str2).length();
        int i10 = this.f33307a;
        int length3 = String.valueOf(i10).length();
        int i11 = this.f33312f;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i11).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i10);
        sb.append(", metadataInterval=");
        sb.append(i11);
        return sb.toString();
    }
}
