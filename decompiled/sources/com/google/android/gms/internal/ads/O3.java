package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class O3 implements InterfaceC5326u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21444b;

    public O3(float f10, int i10) {
        this.f21443a = f10;
        this.f21444b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O3.class == obj.getClass()) {
            O3 o10 = (O3) obj;
            if (this.f21443a == o10.f21443a && this.f21444b == o10.f21444b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.f21443a) + 527) * 31) + this.f21444b;
    }

    public final String toString() {
        float f10 = this.f21443a;
        int length = String.valueOf(f10).length();
        int i10 = this.f21444b;
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(i10).length());
        sb.append("smta: captureFrameRate=");
        sb.append(f10);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i10);
        return sb.toString();
    }
}
