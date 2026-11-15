package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5444v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f33975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33977d;

    public C5444v2(int i10, byte[] bArr, int i11, int i12) {
        this.f33974a = i10;
        this.f33975b = bArr;
        this.f33976c = i11;
        this.f33977d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5444v2.class == obj.getClass()) {
            C5444v2 c5444v2 = (C5444v2) obj;
            if (this.f33974a == c5444v2.f33974a && this.f33976c == c5444v2.f33976c && this.f33977d == c5444v2.f33977d && Arrays.equals(this.f33975b, c5444v2.f33975b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f33974a * 31) + Arrays.hashCode(this.f33975b)) * 31) + this.f33976c) * 31) + this.f33977d;
    }
}
