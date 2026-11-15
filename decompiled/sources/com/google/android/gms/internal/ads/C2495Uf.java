package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2495Uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JY0[] f24073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24074e;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C2495Uf(String str, JY0... jy0Arr) {
        int length = jy0Arr.length;
        int i10 = 1;
        AbstractC2418Ss0.a(length > 0);
        this.f24071b = str;
        this.f24073d = jy0Arr;
        this.f24070a = length;
        int iF = A8.f(jy0Arr[0].f19929o);
        this.f24072c = iF == -1 ? A8.f(jy0Arr[0].f19928n) : iF;
        JY0 jy0 = jy0Arr[0];
        String strC = c(jy0.f19918d);
        int i11 = jy0.f19920f | 16384;
        while (true) {
            JY0[] jy0Arr2 = this.f24073d;
            if (i10 >= jy0Arr2.length) {
                return;
            }
            JY0 jy1 = jy0Arr2[i10];
            String str2 = jy1.f19918d;
            if (!strC.equals(c(str2))) {
                d("languages", jy0Arr2[0].f19918d, str2, i10);
                return;
            } else {
                if (i11 != (jy1.f19920f | 16384)) {
                    d("role flags", Integer.toBinaryString(jy0Arr2[0].f19920f), Integer.toBinaryString(this.f24073d[i10].f19920f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    private static String c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void d(String str, String str2, String str3, int i10) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i10).length() + 1);
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i10);
        sb.append(")");
        YU.f("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final JY0 a(int i10) {
        return this.f24073d[i10];
    }

    public final int b(JY0 jy0) {
        int i10 = 0;
        while (true) {
            JY0[] jy0Arr = this.f24073d;
            if (i10 >= jy0Arr.length) {
                return -1;
            }
            if (jy0 == jy0Arr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2495Uf.class == obj.getClass()) {
            C2495Uf c2495Uf = (C2495Uf) obj;
            if (this.f24071b.equals(c2495Uf.f24071b) && Arrays.equals(this.f24073d, c2495Uf.f24073d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f24074e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((this.f24071b.hashCode() + 527) * 31) + Arrays.hashCode(this.f24073d);
        this.f24074e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.f24073d);
        String str = this.f24071b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length());
        sb.append(str);
        sb.append(": ");
        sb.append(string);
        return sb.toString();
    }
}
