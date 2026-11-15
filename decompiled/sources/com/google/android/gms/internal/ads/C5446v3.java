package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5446v3 extends E3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f33978b;

    public C5446v3(String str, byte[] bArr) {
        super(str);
        this.f33978b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5446v3.class == obj.getClass()) {
            C5446v3 c5446v3 = (C5446v3) obj;
            if (this.f18363a.equals(c5446v3.f18363a) && Arrays.equals(this.f33978b, c5446v3.f33978b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18363a.hashCode() + 527) * 31) + Arrays.hashCode(this.f33978b);
    }
}
