package s9;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import r9.AbstractC7102e;
import r9.C7105h;
import r9.P;
import r9.X;
import r9.g0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f49359a = g0.a("0123456789abcdef");

    public static final C7105h.a a(C7105h c7105h, C7105h.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(c7105h, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        C7105h.a aVarG = AbstractC7102e.g(unsafeCursor);
        if (aVarG.f48458a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarG.f48458a = c7105h;
        aVarG.f48459b = true;
        return aVarG;
    }

    public static final byte[] b() {
        return f49359a;
    }

    public static final boolean c(X segment, int i10, byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.f48411c;
        byte[] bArr = segment.f48409a;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f48414f;
                Intrinsics.c(segment);
                byte[] bArr2 = segment.f48409a;
                bArr = bArr2;
                i10 = segment.f48410b;
                i13 = segment.f48411c;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String d(C7105h c7105h, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(c7105h, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c7105h.V(j11) == 13) {
                String strO0 = c7105h.o0(j11);
                c7105h.skip(2L);
                return strO0;
            }
        }
        String strO1 = c7105h.o0(j10);
        c7105h.skip(1L);
        return strO1;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4 A[SYNTHETIC] */
    public static final int e(C7105h c7105h, P options, boolean z9) {
        int i10;
        int i11;
        X x10;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(c7105h, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        X x11 = c7105h.f48456a;
        if (x11 == null) {
            return z9 ? -2 : -1;
        }
        byte[] bArr = x11.f48409a;
        int i14 = x11.f48410b;
        int i15 = x11.f48411c;
        int[] iArrK = options.k();
        X x12 = x11;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = iArrK[i17];
            int i20 = i17 + 2;
            int i21 = iArrK[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (x12 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == iArrK[i20]) {
                        i11 = iArrK[i20 + i19];
                        if (i10 == i15) {
                            x12 = x12.f48414f;
                            Intrinsics.c(x12);
                            i10 = x12.f48410b;
                            bArr = x12.f48409a;
                            i15 = x12.f48411c;
                            if (x12 == x11) {
                                x12 = null;
                            }
                        }
                        if (i11 >= 0) {
                            return i11;
                        }
                        i17 = -i11;
                        i14 = i10;
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) == iArrK[i20]) {
                    boolean z10 = i26 == i24;
                    if (i25 == i15) {
                        Intrinsics.c(x12);
                        X x13 = x12.f48414f;
                        Intrinsics.c(x13);
                        i13 = x13.f48410b;
                        byte[] bArr2 = x13.f48409a;
                        i12 = x13.f48411c;
                        if (x13 != x11) {
                            x10 = x13;
                            bArr = bArr2;
                        } else {
                            if (!z10) {
                                break loop0;
                            }
                            bArr = bArr2;
                            x10 = null;
                        }
                    } else {
                        x10 = x12;
                        i12 = i15;
                        i13 = i25;
                    }
                    if (z10) {
                        i11 = iArrK[i26];
                        i10 = i13;
                        i15 = i12;
                        x12 = x10;
                        break;
                    }
                    i14 = i13;
                    i15 = i12;
                    x12 = x10;
                    i20 = i26;
                }
                return i16;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z9) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int f(C7105h c7105h, P p10, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return e(c7105h, p10, z9);
    }
}
