package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class H3 extends E3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f19190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f19191f;

    public H3(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f19187b = i10;
        this.f19188c = i11;
        this.f19189d = i12;
        this.f19190e = iArr;
        this.f19191f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H3.class == obj.getClass()) {
            H3 h10 = (H3) obj;
            if (this.f19187b == h10.f19187b && this.f19188c == h10.f19188c && this.f19189d == h10.f19189d && Arrays.equals(this.f19190e, h10.f19190e) && Arrays.equals(this.f19191f, h10.f19191f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f19187b + 527) * 31) + this.f19188c) * 31) + this.f19189d) * 31) + Arrays.hashCode(this.f19190e)) * 31) + Arrays.hashCode(this.f19191f);
    }
}
