package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5649wf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34609a;

    private C5649wf0(int i10, int i11, String str) {
        this.f34609a = str;
    }

    public static C5649wf0 a(P10 p10) {
        String str;
        p10.J(2);
        int iR = p10.R();
        int i10 = iR >> 1;
        int i11 = iR & 1;
        int iR2 = p10.R() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i12 = iR2 | (i11 << 5);
        String str2 = i10 < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(i12).length();
        String str3 = i12 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(length + length2 + str3.length() + length3);
        sb.append(str);
        sb.append(str2);
        sb.append(i10);
        sb.append(str3);
        sb.append(i12);
        return new C5649wf0(i10, i12, sb.toString());
    }
}
