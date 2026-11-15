package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class Y4 implements InterfaceC4940r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5053rw0 f25531b;

    public Y4(int i10, int[] iArr) {
        this.f25530a = i10;
        this.f25531b = iArr != null ? C5053rw0.b(iArr) : C5053rw0.a();
    }

    public final String toString() {
        C5053rw0 c5053rw0 = this.f25531b;
        ArrayList arrayList = new ArrayList(c5053rw0.c());
        for (int i10 = 0; i10 < c5053rw0.c(); i10++) {
            arrayList.add(AbstractC4634ob0.T(c5053rw0.d(i10)));
        }
        String strT = AbstractC4634ob0.T(this.f25530a);
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder(strT.length() + 37 + string.length() + 1);
        sb.append("UnsupportedBrands{major=");
        sb.append(strT);
        sb.append(", compatible=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
