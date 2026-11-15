package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5777xg0 implements InterfaceC5326u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34986a;

    public C5777xg0(int i10) {
        this.f34986a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5777xg0) && this.f34986a == ((C5777xg0) obj).f34986a;
    }

    public final int hashCode() {
        return this.f34986a;
    }

    public final String toString() {
        int i10 = this.f34986a;
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 19);
        sb.append("Mp4AlternateGroup: ");
        sb.append(i10);
        return sb.toString();
    }
}
