package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5320u3 extends E3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f33724e;

    public C5320u3(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f33721b = str;
        this.f33722c = str2;
        this.f33723d = i10;
        this.f33724e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326u6
    public final void a(C5072s5 c5072s5) {
        c5072s5.C(this.f33724e, this.f33723d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5320u3.class == obj.getClass()) {
            C5320u3 c5320u3 = (C5320u3) obj;
            if (this.f33723d == c5320u3.f33723d && Objects.equals(this.f33721b, c5320u3.f33721b) && Objects.equals(this.f33722c, c5320u3.f33722c) && Arrays.equals(this.f33724e, c5320u3.f33724e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f33721b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i10 = this.f33723d;
        String str2 = this.f33722c;
        return ((((((i10 + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f33724e);
    }

    @Override // com.google.android.gms.internal.ads.E3
    public final String toString() {
        String str = this.f18363a;
        int length = String.valueOf(str).length();
        String str2 = this.f33721b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f33722c;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }
}
