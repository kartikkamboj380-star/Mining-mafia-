package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6067zz0 extends AbstractC2482Ty0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35889b = 12;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f35890c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5941yz0 f35891d;

    /* synthetic */ C6067zz0(int i10, int i11, int i12, C5941yz0 c5941yz0, byte[] bArr) {
        this.f35888a = i10;
        this.f35891d = c5941yz0;
    }

    public static C5815xz0 b() {
        return new C5815xz0(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1495Ay0
    public final boolean a() {
        return this.f35891d != C5941yz0.f35595d;
    }

    public final int c() {
        return this.f35888a;
    }

    public final C5941yz0 d() {
        return this.f35891d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6067zz0)) {
            return false;
        }
        C6067zz0 c6067zz0 = (C6067zz0) obj;
        return c6067zz0.f35888a == this.f35888a && c6067zz0.f35891d == this.f35891d;
    }

    public final int hashCode() {
        return Objects.hash(C6067zz0.class, Integer.valueOf(this.f35888a), 12, 16, this.f35891d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f35891d);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i10 = this.f35888a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i10).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(12);
        sb.append("-byte IV, ");
        sb.append(16);
        sb.append("-byte tag, and ");
        sb.append(i10);
        sb.append("-byte key)");
        return sb.toString();
    }
}
