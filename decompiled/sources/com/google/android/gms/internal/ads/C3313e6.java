package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3313e6 implements InterfaceC5828y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f27682a = new P10();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f27687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f27688g;

    public C3313e6(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f27684c = 0;
            this.f27685d = -1;
            this.f27686e = "sans-serif";
            this.f27683b = false;
            this.f27687f = 0.85f;
            this.f27688g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f27684c = bArr[24];
        this.f27685d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f27686e = true == "Serif".equals(AbstractC4634ob0.F(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f27688g = i10;
        boolean z9 = (bArr[0] & 32) != 0;
        this.f27683b = z9;
        if (z9) {
            this.f27687f = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.95f));
        } else {
            this.f27687f = 0.85f;
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z9 = true;
            if (i16 != 0) {
                if (i17 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                    z9 = false;
                }
            } else if (i17 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            } else {
                z9 = false;
            }
            if ((i10 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            } else {
                if (i16 != 0 || z9) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC5828y5
    public final void a(byte[] bArr, int i10, int i11, C5702x5 c5702x5, InterfaceC3977jO interfaceC3977jO) {
        String strK;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        P10 p10 = this.f27682a;
        p10.A(bArr, i10 + i11);
        p10.G(i10);
        int i17 = 1;
        int i18 = 0;
        int i19 = 2;
        AbstractC2418Ss0.a(p10.C() >= 2);
        int iS = p10.S();
        if (iS == 0) {
            strK = "";
        } else {
            int iF = p10.F();
            Charset charsetR = p10.r();
            int iF2 = p10.F() - iF;
            if (charsetR == null) {
                charsetR = StandardCharsets.UTF_8;
            }
            strK = p10.k(iS - iF2, charsetR);
        }
        if (strK.isEmpty()) {
            interfaceC3977jO.zza(new C4695p5(AbstractC5931yu0.l(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strK);
        int i20 = this.f27684c;
        b(spannableStringBuilder, i20, 0, 0, spannableStringBuilder.length(), 16711680);
        int i21 = i20;
        int i22 = this.f27685d;
        c(spannableStringBuilder, i22, -1, 0, spannableStringBuilder.length(), 16711680);
        int i23 = i22;
        String str = this.f27686e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.f27687f;
        while (p10.C() >= 8) {
            int iF3 = p10.F();
            int iB = p10.b();
            int iB2 = p10.b();
            if (iB2 == 1937013100) {
                AbstractC2418Ss0.a(p10.C() >= i19 ? i17 : i18);
                int iS2 = p10.S();
                int i24 = i18;
                while (i24 < iS2) {
                    AbstractC2418Ss0.a(p10.C() >= 12 ? i17 : i18);
                    int iS3 = p10.S();
                    int iS4 = p10.S();
                    p10.J(i19);
                    int i25 = iS2;
                    int iR = p10.R();
                    p10.J(i17);
                    int iB3 = p10.b();
                    int i26 = i19;
                    if (iS4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        StringBuilder sb = new StringBuilder(String.valueOf(iS4).length() + 44 + String.valueOf(length2).length() + 2);
                        sb.append("Truncating styl end (");
                        sb.append(iS4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        YU.c("Tx3gParser", sb.toString());
                        iS4 = spannableStringBuilder.length();
                    }
                    if (iS3 >= iS4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iS3).length() + 36 + String.valueOf(iS4).length() + 2);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(iS3);
                        sb2.append(") >= end (");
                        sb2.append(iS4);
                        sb2.append(").");
                        YU.c("Tx3gParser", sb2.toString());
                        i15 = i21;
                        i16 = i23;
                    } else {
                        int i27 = i21;
                        b(spannableStringBuilder, iR, i27, iS3, iS4, 0);
                        i15 = i27;
                        i16 = i23;
                        c(spannableStringBuilder, iB3, i16, iS3, iS4, 0);
                    }
                    i19 = i26;
                    iS2 = i25;
                    i21 = i15;
                    i23 = i16;
                    i17 = 1;
                    i24++;
                    i18 = 0;
                }
                i12 = i21;
                i13 = i23;
                i14 = i19;
            } else {
                i12 = i21;
                int i28 = i19;
                i13 = i23;
                if (iB2 == 1952608120 && this.f27683b) {
                    i14 = i28;
                    AbstractC2418Ss0.a(p10.C() >= i14);
                    float fS = p10.S();
                    int i29 = this.f27688g;
                    String str2 = AbstractC4634ob0.f32117a;
                    fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(fS / i29, 0.95f));
                } else {
                    i14 = i28;
                }
            }
            p10.G(iF3 + iB);
            i21 = i12;
            i19 = i14;
            i23 = i13;
            i17 = 1;
            i18 = 0;
        }
        C3955jD c3955jD = new C3955jD();
        c3955jD.a(spannableStringBuilder);
        c3955jD.f(fMax, 0);
        c3955jD.g(0);
        interfaceC3977jO.zza(new C4695p5(AbstractC5931yu0.m(c3955jD.r()), -9223372036854775807L, -9223372036854775807L));
    }
}
