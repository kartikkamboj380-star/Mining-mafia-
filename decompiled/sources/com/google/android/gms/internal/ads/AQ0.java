package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class AQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JY0 f17317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JY0 f17318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17320e;

    public AQ0(String str, JY0 jy0, JY0 jy1, int i10, int i11) {
        boolean z9;
        if (i10 != 0) {
            z9 = false;
            if (i11 == 0) {
                i11 = 0;
                z9 = true;
            }
        } else {
            z9 = true;
        }
        AbstractC2418Ss0.a(z9);
        AbstractC2418Ss0.a(true ^ TextUtils.isEmpty(str));
        this.f17316a = str;
        this.f17317b = jy0;
        jy1.getClass();
        this.f17318c = jy1;
        this.f17319d = i10;
        this.f17320e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AQ0.class == obj.getClass()) {
            AQ0 aq0 = (AQ0) obj;
            if (this.f17319d == aq0.f17319d && this.f17320e == aq0.f17320e && this.f17316a.equals(aq0.f17316a) && this.f17317b.equals(aq0.f17317b) && this.f17318c.equals(aq0.f17318c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f17319d + 527) * 31) + this.f17320e) * 31) + this.f17316a.hashCode()) * 31) + this.f17317b.hashCode()) * 31) + this.f17318c.hashCode();
    }
}
