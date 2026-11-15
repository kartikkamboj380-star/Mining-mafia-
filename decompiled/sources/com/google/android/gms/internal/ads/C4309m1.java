package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4309m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f31422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f31423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f31424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f31425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f31426l;

    private C4309m1(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f31415a = list;
        this.f31416b = i10;
        this.f31417c = i11;
        this.f31418d = i12;
        this.f31419e = i13;
        this.f31420f = i14;
        this.f31421g = i15;
        this.f31422h = i16;
        this.f31423i = i17;
        this.f31424j = i18;
        this.f31425k = f10;
        this.f31426l = str;
    }

    public static C4309m1 a(P10 p10) throws C2817a9 {
        String strA;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            p10.J(4);
            int iR = (p10.R() & 3) + 1;
            if (iR == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iR2 = p10.R() & 31;
            for (int i18 = 0; i18 < iR2; i18++) {
                arrayList.add(b(p10));
            }
            int iR3 = p10.R();
            for (int i19 = 0; i19 < iR3; i19++) {
                arrayList.add(b(p10));
            }
            if (iR2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = AbstractC4034jq0.f30572a;
                C1893Ip0 c1893Ip0E = AbstractC4034jq0.e(bArr2, 5, bArr.length);
                int i20 = c1893Ip0E.f19663e;
                int i21 = c1893Ip0E.f19664f;
                int i22 = c1893Ip0E.f19666h + 8;
                int i23 = c1893Ip0E.f19667i + 8;
                int i24 = c1893Ip0E.f19668j;
                int i25 = c1893Ip0E.f19669k;
                int i26 = c1893Ip0E.f19670l;
                int i27 = c1893Ip0E.f19671m;
                float f11 = c1893Ip0E.f19665g;
                strA = GM.a(c1893Ip0E.f19659a, c1893Ip0E.f19660b, c1893Ip0E.f19661c);
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                strA = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new C4309m1(arrayList, iR, i10, i11, i12, i13, i16, i17, i14, i15, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C2817a9.b("Error parsing AVC config", e10);
        }
    }

    private static byte[] b(P10 p10) {
        int iS = p10.S();
        int iF = p10.F();
        p10.J(iS);
        return GM.f(p10.H(), iF, iS);
    }
}
