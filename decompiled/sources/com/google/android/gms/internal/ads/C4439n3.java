package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4439n3 implements InterfaceC5326u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31664a;

    public C4439n3(long j10) {
        this.f31664a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4439n3.class == obj.getClass() && this.f31664a == ((C4439n3) obj).f31664a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31664a) + 527;
    }

    public final String toString() {
        long j10 = this.f31664a;
        StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 38);
        sb.append("ThumbnailMetadata: presentationTimeUs=");
        sb.append(j10);
        return sb.toString();
    }
}
