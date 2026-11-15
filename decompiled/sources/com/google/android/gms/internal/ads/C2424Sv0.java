package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C2424Sv0 extends AbstractC2528Uv0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final C2216Ov0 f23339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Character f23340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile AbstractC2528Uv0 f23341f;

    C2424Sv0(C2216Ov0 c2216Ov0, Character ch) {
        this.f23339d = c2216Ov0;
        boolean z9 = true;
        if (ch != null && c2216Ov0.e('=')) {
            z9 = false;
        }
        AbstractC2418Ss0.f(z9, "Padding character %s was already in alphabet", ch);
        this.f23340e = ch;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2528Uv0
    void a(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        AbstractC2418Ss0.o(0, i11, bArr.length);
        while (i12 < i11) {
            int i13 = this.f23339d.f21724f;
            n(appendable, bArr, i12, Math.min(i13, i11 - i12));
            i12 += i13;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2528Uv0
    int b(byte[] bArr, CharSequence charSequence) throws C2372Rv0 {
        int i10;
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
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceE.length()) {
            long jC = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = c2216Ov0.f21723e;
                if (i13 >= i10) {
                    break;
                }
                jC <<= c2216Ov0.f21722d;
                if (i11 + i13 < charSequenceE.length()) {
                    jC |= (long) c2216Ov0.c(charSequenceE.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = c2216Ov0.f21724f;
            int i16 = i14 * c2216Ov0.f21722d;
            int i17 = (i15 - 1) * 8;
            while (i17 >= (i15 * 8) - i16) {
                bArr[i12] = (byte) ((jC >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += i10;
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2528Uv0
    final int c(int i10) {
        C2216Ov0 c2216Ov0 = this.f23339d;
        return c2216Ov0.f21723e * AbstractC4424mw0.b(i10, c2216Ov0.f21724f, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2528Uv0
    final int d(int i10) {
        return (int) (((((long) this.f23339d.f21722d) * ((long) i10)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2528Uv0
    final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f23340e == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2424Sv0) {
            C2424Sv0 c2424Sv0 = (C2424Sv0) obj;
            if (this.f23339d.equals(c2424Sv0.f23339d) && Objects.equals(this.f23340e, c2424Sv0.f23340e)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2528Uv0
    public final AbstractC2528Uv0 f() {
        return this.f23340e == null ? this : m(this.f23339d, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2528Uv0
    public final AbstractC2528Uv0 g() {
        AbstractC2528Uv0 abstractC2528Uv0M = this.f23341f;
        if (abstractC2528Uv0M == null) {
            C2216Ov0 c2216Ov0 = this.f23339d;
            C2216Ov0 c2216Ov0D = c2216Ov0.d();
            abstractC2528Uv0M = c2216Ov0D == c2216Ov0 ? this : m(c2216Ov0D, this.f23340e);
            this.f23341f = abstractC2528Uv0M;
        }
        return abstractC2528Uv0M;
    }

    public final int hashCode() {
        Character ch = this.f23340e;
        return Objects.hashCode(ch) ^ this.f23339d.hashCode();
    }

    AbstractC2528Uv0 m(C2216Ov0 c2216Ov0, Character ch) {
        return new C2424Sv0(c2216Ov0, ch);
    }

    final void n(Appendable appendable, byte[] bArr, int i10, int i11) {
        AbstractC2418Ss0.o(i10, i10 + i11, bArr.length);
        C2216Ov0 c2216Ov0 = this.f23339d;
        int i12 = c2216Ov0.f21724f;
        int i13 = 0;
        AbstractC2418Ss0.a(i11 <= i12);
        long j10 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            j10 = (j10 | ((long) (bArr[i10 + i14] & 255))) << 8;
        }
        int i15 = (i11 + 1) * 8;
        int i16 = c2216Ov0.f21722d;
        while (i13 < i11 * 8) {
            appendable.append(c2216Ov0.a(c2216Ov0.f21721c & ((int) (j10 >>> ((i15 - i16) - i13)))));
            i13 += i16;
        }
        if (this.f23340e != null) {
            while (i13 < i12 * 8) {
                appendable.append('=');
                i13 += i16;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C2216Ov0 c2216Ov0 = this.f23339d;
        sb.append(c2216Ov0);
        if (8 % c2216Ov0.f21722d != 0) {
            Character ch = this.f23340e;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    C2424Sv0(String str, String str2, Character ch) {
        this(new C2216Ov0(str, str2.toCharArray()), ch);
    }
}
