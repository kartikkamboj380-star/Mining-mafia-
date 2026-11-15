package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class HV0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HV0 f19304d = new GV0().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19307c;

    /* synthetic */ HV0(GV0 gv0, byte[] bArr) {
        this.f19305a = gv0.e();
        this.f19306b = gv0.f();
        this.f19307c = gv0.g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && HV0.class == obj.getClass()) {
            HV0 hv0 = (HV0) obj;
            if (this.f19305a == hv0.f19305a && this.f19306b == hv0.f19306b && this.f19307c == hv0.f19307c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z9 = this.f19305a;
        boolean z10 = this.f19306b;
        return ((z9 ? 1 : 0) << 2) + (z10 ? 1 : 0) + (z10 ? 1 : 0) + (this.f19307c ? 1 : 0);
    }
}
