package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6033zi0 implements InterfaceC5326u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35832b;

    public C6033zi0(float f10, float f11) {
        boolean z9 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z9 = true;
        }
        AbstractC2418Ss0.b(z9, "Invalid latitude or longitude");
        this.f35831a = f10;
        this.f35832b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6033zi0.class == obj.getClass()) {
            C6033zi0 c6033zi0 = (C6033zi0) obj;
            if (this.f35831a == c6033zi0.f35831a && this.f35832b == c6033zi0.f35832b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.f35831a) + 527) * 31) + Float.hashCode(this.f35832b);
    }

    public final String toString() {
        float f10 = this.f35831a;
        int length = String.valueOf(f10).length();
        float f11 = this.f35832b;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f11).length());
        sb.append("xyz: latitude=");
        sb.append(f10);
        sb.append(", longitude=");
        sb.append(f11);
        return sb.toString();
    }
}
