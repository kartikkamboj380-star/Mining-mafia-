package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5698x3 extends E3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f34723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final E3[] f34724f;

    public C5698x3(String str, boolean z9, boolean z10, String[] strArr, E3[] e3Arr) {
        super("CTOC");
        this.f34720b = str;
        this.f34721c = z9;
        this.f34722d = z10;
        this.f34723e = strArr;
        this.f34724f = e3Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5698x3.class == obj.getClass()) {
            C5698x3 c5698x3 = (C5698x3) obj;
            if (this.f34721c == c5698x3.f34721c && this.f34722d == c5698x3.f34722d && Objects.equals(this.f34720b, c5698x3.f34720b) && Arrays.equals(this.f34723e, c5698x3.f34723e) && Arrays.equals(this.f34724f, c5698x3.f34724f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f34721c ? 1 : 0) + 527) * 31) + (this.f34722d ? 1 : 0)) * 31) + this.f34720b.hashCode();
    }
}
