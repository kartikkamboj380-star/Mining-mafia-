package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2528Uv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC2528Uv0 f24128a = new C2320Qv0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC2528Uv0 f24129b = new C2320Qv0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC2528Uv0 f24130c;

    static {
        new C2424Sv0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new C2424Sv0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f24130c = new C2268Pv0("base16()", "0123456789ABCDEF");
    }

    AbstractC2528Uv0() {
    }

    public static AbstractC2528Uv0 j() {
        return f24128a;
    }

    public static AbstractC2528Uv0 k() {
        return f24129b;
    }

    public static AbstractC2528Uv0 l() {
        return f24130c;
    }

    abstract void a(Appendable appendable, byte[] bArr, int i10, int i11);

    abstract int b(byte[] bArr, CharSequence charSequence);

    abstract int c(int i10);

    abstract int d(int i10);

    abstract CharSequence e(CharSequence charSequence);

    public abstract AbstractC2528Uv0 f();

    public abstract AbstractC2528Uv0 g();

    public final String h(byte[] bArr, int i10, int i11) {
        AbstractC2418Ss0.o(0, i11, bArr.length);
        StringBuilder sb = new StringBuilder(c(i11));
        try {
            a(sb, bArr, 0, i11);
            return sb.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] i(CharSequence charSequence) {
        try {
            CharSequence charSequenceE = e(charSequence);
            int iD = d(charSequenceE.length());
            byte[] bArr = new byte[iD];
            int iB = b(bArr, charSequenceE);
            if (iB == iD) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (C2372Rv0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
