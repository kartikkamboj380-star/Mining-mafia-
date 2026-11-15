package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class I3 extends E3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f19473c;

    public I3(String str, byte[] bArr) {
        super("PRIV");
        this.f19472b = str;
        this.f19473c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I3.class == obj.getClass()) {
            I3 i10 = (I3) obj;
            if (Objects.equals(this.f19472b, i10.f19472b) && Arrays.equals(this.f19473c, i10.f19473c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f19472b.hashCode() + 527) * 31) + Arrays.hashCode(this.f19473c);
    }

    @Override // com.google.android.gms.internal.ads.E3
    public final String toString() {
        String str = this.f18363a;
        int length = String.valueOf(str).length();
        String str2 = this.f19472b;
        StringBuilder sb = new StringBuilder(length + 8 + str2.length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }
}
