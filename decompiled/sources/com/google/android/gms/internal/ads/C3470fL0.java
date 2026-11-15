package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3470fL0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C3470fL0 f28262h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f28266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28269g;

    static {
        C1909Ix0 c1909Ix0 = new C1909Ix0();
        c1909Ix0.a(1);
        c1909Ix0.b(2);
        c1909Ix0.c(3);
        f28262h = c1909Ix0.g();
        C1909Ix0 c1909Ix1 = new C1909Ix0();
        c1909Ix1.a(1);
        c1909Ix1.b(1);
        c1909Ix1.c(2);
        c1909Ix1.g();
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ C3470fL0(int i10, int i11, int i12, byte[] bArr, int i13, int i14, byte[] bArr2) {
        this.f28263a = i10;
        this.f28264b = i11;
        this.f28265c = i12;
        this.f28266d = bArr;
        this.f28267e = i13;
        this.f28268f = i14;
    }

    public static boolean a(C3470fL0 c3470fL0) {
        if (c3470fL0 == null) {
            return true;
        }
        int i10 = c3470fL0.f28263a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = c3470fL0.f28264b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = c3470fL0.f28265c;
        if ((i12 != -1 && i12 != 3) || c3470fL0.f28266d != null) {
            return false;
        }
        int i13 = c3470fL0.f28268f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = c3470fL0.f28267e;
        return i14 == -1 || i14 == 8;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String h(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 22);
        sb.append("Undefined color space ");
        sb.append(i10);
        return sb.toString();
    }

    private static String i(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 25);
        sb.append("Undefined color transfer ");
        sb.append(i10);
        return sb.toString();
    }

    private static String j(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 22);
        sb.append("Undefined color range ");
        sb.append(i10);
        return sb.toString();
    }

    public final C1909Ix0 d() {
        return new C1909Ix0(this, null);
    }

    public final boolean e() {
        return (this.f28267e == -1 || this.f28268f == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3470fL0.class == obj.getClass()) {
            C3470fL0 c3470fL0 = (C3470fL0) obj;
            if (this.f28263a == c3470fL0.f28263a && this.f28264b == c3470fL0.f28264b && this.f28265c == c3470fL0.f28265c && Arrays.equals(this.f28266d, c3470fL0.f28266d) && this.f28267e == c3470fL0.f28267e && this.f28268f == c3470fL0.f28268f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.f28263a == -1 || this.f28264b == -1 || this.f28265c == -1) ? false : true;
    }

    public final String g() {
        String str;
        String string;
        if (f()) {
            Object[] objArr = {h(this.f28263a), j(this.f28264b), i(this.f28265c)};
            String str2 = AbstractC4634ob0.f32117a;
            str = String.format(Locale.US, "%s/%s/%s", objArr);
        } else {
            str = "NA/NA/NA";
        }
        if (e()) {
            int i10 = this.f28267e;
            int i11 = this.f28268f;
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
            sb.append(i10);
            sb.append("/");
            sb.append(i11);
            string = sb.toString();
        } else {
            string = "NA/NA";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + string.length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(string);
        return sb2.toString();
    }

    public final int hashCode() {
        int i10 = this.f28269g;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((this.f28263a + 527) * 31) + this.f28264b) * 31) + this.f28265c) * 31) + Arrays.hashCode(this.f28266d)) * 31) + this.f28267e) * 31) + this.f28268f;
        this.f28269g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string;
        int i10 = this.f28267e;
        int i11 = this.f28265c;
        int i12 = this.f28264b;
        String strH = h(this.f28263a);
        String strJ = j(i12);
        String strI = i(i11);
        String string2 = "NA";
        if (i10 != -1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 8);
            sb.append(i10);
            sb.append("bit Luma");
            string = sb.toString();
        } else {
            string = "NA";
        }
        int i13 = this.f28268f;
        if (i13 != -1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 10);
            sb2.append(i13);
            sb2.append("bit Chroma");
            string2 = sb2.toString();
        }
        boolean z9 = this.f28266d != null;
        StringBuilder sb3 = new StringBuilder(strH.length() + 12 + strJ.length() + 2 + strI.length() + 2 + String.valueOf(z9).length() + 2 + string.length() + 2 + string2.length() + 1);
        sb3.append("ColorInfo(");
        sb3.append(strH);
        sb3.append(", ");
        sb3.append(strJ);
        sb3.append(", ");
        sb3.append(strI);
        sb3.append(", ");
        sb3.append(z9);
        sb3.append(", ");
        sb3.append(string);
        sb3.append(", ");
        sb3.append(string2);
        sb3.append(")");
        return sb3.toString();
    }
}
