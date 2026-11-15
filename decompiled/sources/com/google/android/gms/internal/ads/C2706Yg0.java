package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2706Yg0 extends AbstractC2708Yh0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f25682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f25683d;

    public C2706Yg0(int i10, long j10) {
        super(i10, null);
        this.f25681b = j10;
        this.f25682c = new ArrayList();
        this.f25683d = new ArrayList();
    }

    public final void b(C5779xh0 c5779xh0) {
        this.f25682c.add(c5779xh0);
    }

    public final void c(C2706Yg0 c2706Yg0) {
        this.f25683d.add(c2706Yg0);
    }

    public final C5779xh0 d(int i10) {
        List list = this.f25682c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C5779xh0 c5779xh0 = (C5779xh0) list.get(i11);
            if (c5779xh0.f25684a == i10) {
                return c5779xh0;
            }
        }
        return null;
    }

    public final C2706Yg0 e(int i10) {
        List list = this.f25683d;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2706Yg0 c2706Yg0 = (C2706Yg0) list.get(i11);
            if (c2706Yg0.f25684a == i10) {
                return c2706Yg0;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2708Yh0
    public final String toString() {
        List list = this.f25682c;
        String strA = AbstractC2708Yh0.a(this.f25684a);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.f25683d.toArray());
        int length = strA.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        sb.append(strA);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }
}
