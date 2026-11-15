package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class CD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f17823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4096kK0 f17824b;

    /* synthetic */ CD0(Class cls, C4096kK0 c4096kK0, byte[] bArr) {
        this.f17823a = cls;
        this.f17824b = c4096kK0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CD0)) {
            return false;
        }
        CD0 cd0 = (CD0) obj;
        return cd0.f17823a.equals(this.f17823a) && cd0.f17824b.equals(this.f17824b);
    }

    public final int hashCode() {
        return Objects.hash(this.f17823a, this.f17824b);
    }

    public final String toString() {
        C4096kK0 c4096kK0 = this.f17824b;
        String simpleName = this.f17823a.getSimpleName();
        String strValueOf = String.valueOf(c4096kK0);
        StringBuilder sb = new StringBuilder(simpleName.length() + 21 + strValueOf.length());
        sb.append(simpleName);
        sb.append(", object identifier: ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
