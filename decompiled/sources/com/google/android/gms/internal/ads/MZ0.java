package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class MZ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20865b;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public MZ0(String str, String str2) {
        this.f20864a = AbstractC4634ob0.D(str);
        this.f20865b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MZ0.class == obj.getClass()) {
            MZ0 mz0 = (MZ0) obj;
            if (Objects.equals(this.f20864a, mz0.f20864a) && Objects.equals(this.f20865b, mz0.f20865b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f20865b.hashCode() * 31;
        String str = this.f20864a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
