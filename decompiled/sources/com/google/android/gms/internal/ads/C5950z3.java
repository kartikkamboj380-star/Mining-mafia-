package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5950z3 extends E3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f35626e;

    public C5950z3(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f35623b = str;
        this.f35624c = str2;
        this.f35625d = str3;
        this.f35626e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5950z3.class == obj.getClass()) {
            C5950z3 c5950z3 = (C5950z3) obj;
            if (Objects.equals(this.f35623b, c5950z3.f35623b) && Objects.equals(this.f35624c, c5950z3.f35624c) && Objects.equals(this.f35625d, c5950z3.f35625d) && Arrays.equals(this.f35626e, c5950z3.f35626e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f35623b;
        return (((((((str != null ? str.hashCode() : 0) + 527) * 31) + this.f35624c.hashCode()) * 31) + this.f35625d.hashCode()) * 31) + Arrays.hashCode(this.f35626e);
    }

    @Override // com.google.android.gms.internal.ads.E3
    public final String toString() {
        String str = this.f18363a;
        int length = String.valueOf(str).length();
        String str2 = this.f35623b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f35624c;
        int length3 = length + 11 + length2 + 11 + str3.length();
        String str4 = this.f35625d;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }
}
