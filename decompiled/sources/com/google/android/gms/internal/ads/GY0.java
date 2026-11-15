package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class GY0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19070c;

    public GY0(String str, boolean z9, boolean z10) {
        this.f19068a = str;
        this.f19069b = z9;
        this.f19070c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == GY0.class) {
            GY0 gy0 = (GY0) obj;
            if (TextUtils.equals(this.f19068a, gy0.f19068a) && this.f19069b == gy0.f19069b && this.f19070c == gy0.f19070c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f19068a.hashCode() + 31) * 31) + (true != this.f19069b ? 1237 : 1231)) * 31) + (true != this.f19070c ? 1237 : 1231);
    }
}
