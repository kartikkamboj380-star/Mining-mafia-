package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2320Qv0 extends C2424Sv0 {
    private C2320Qv0(C2216Ov0 c2216Ov0, Character ch) {
        super(c2216Ov0, ch);
        AbstractC2418Ss0.a(c2216Ov0.f().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.C2424Sv0, com.google.android.gms.internal.ads.AbstractC2528Uv0
    final void a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        AbstractC2418Ss0.o(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & 255;
            int i15 = bArr[i12 + 1] & 255;
            int i16 = bArr[i12 + 2] & 255;
            C2216Ov0 c2216Ov0 = this.f23339d;
            int i17 = (i15 << 8) | (i14 << 16) | i16;
            appendable.append(c2216Ov0.a(i17 >>> 18));
            appendable.append(c2216Ov0.a((i17 >>> 12) & 63));
            appendable.append(c2216Ov0.a((i17 >>> 6) & 63));
            appendable.append(c2216Ov0.a(i17 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            n(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.C2424Sv0, com.google.android.gms.internal.ads.AbstractC2528Uv0
    final int b(byte[] bArr, CharSequence charSequence) throws C2372Rv0 {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        C2216Ov0 c2216Ov0 = this.f23339d;
        if (!c2216Ov0.b(length)) {
            int length2 = charSequenceE.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length2);
            throw new C2372Rv0(sb.toString());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceE.length()) {
            int i12 = i11 + 1;
            int iC = (c2216Ov0.c(charSequenceE.charAt(i10 + 1)) << 12) | (c2216Ov0.c(charSequenceE.charAt(i10)) << 18);
            bArr[i11] = (byte) (iC >>> 16);
            int i13 = i10 + 2;
            if (i13 < charSequenceE.length()) {
                int i14 = i10 + 3;
                int iC2 = iC | (c2216Ov0.c(charSequenceE.charAt(i13)) << 6);
                int i15 = i11 + 2;
                bArr[i12] = (byte) ((iC2 >>> 8) & 255);
                if (i14 < charSequenceE.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((iC2 | c2216Ov0.c(charSequenceE.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i10 = i13;
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.C2424Sv0
    final AbstractC2528Uv0 m(C2216Ov0 c2216Ov0, Character ch) {
        return new C2320Qv0(c2216Ov0, ch);
    }

    C2320Qv0(String str, String str2, Character ch) {
        this(new C2216Ov0(str, str2.toCharArray()), ch);
    }
}
