package r9;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Z extends C7108k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient byte[][] f48421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int[] f48422g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(byte[][] segments, int[] directory) {
        super(C7108k.f48468e.j());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f48421f = segments;
        this.f48422g = directory;
    }

    private final C7108k O() {
        return new C7108k(J());
    }

    @Override // r9.C7108k
    public C7108k G(int i10, int i11) {
        int iE = AbstractC7102e.e(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (iE > E()) {
            throw new IllegalArgumentException(("endIndex=" + iE + " > length(" + E() + ')').toString());
        }
        int i12 = iE - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iE + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iE == E()) {
            return this;
        }
        if (i10 == iE) {
            return C7108k.f48468e;
        }
        int iB = s9.e.b(this, i10);
        int iB2 = s9.e.b(this, iE - 1);
        byte[][] bArr = (byte[][]) AbstractC7024j.m(N(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i13 = iB;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(M()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = M()[N().length + i13];
                if (i13 == iB2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iB != 0 ? M()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new Z(bArr, iArr);
    }

    @Override // r9.C7108k
    public C7108k I() {
        return O().I();
    }

    @Override // r9.C7108k
    public byte[] J() {
        byte[] bArr = new byte[E()];
        int length = N().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = M()[length + i10];
            int i14 = M()[i10];
            int i15 = i14 - i11;
            AbstractC7024j.e(N()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // r9.C7108k
    public void L(C7105h buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int iB = s9.e.b(this, i10);
        while (i10 < i12) {
            int i13 = iB == 0 ? 0 : M()[iB - 1];
            int i14 = M()[iB] - i13;
            int i15 = M()[N().length + iB];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            X x10 = new X(N()[iB], i16, i16 + iMin, true, false);
            X x11 = buffer.f48456a;
            if (x11 == null) {
                x10.f48415g = x10;
                x10.f48414f = x10;
                buffer.f48456a = x10;
            } else {
                Intrinsics.c(x11);
                X x12 = x11.f48415g;
                Intrinsics.c(x12);
                x12.c(x10);
            }
            i10 += iMin;
            iB++;
        }
        buffer.n1(buffer.size() + ((long) i11));
    }

    public final int[] M() {
        return this.f48422g;
    }

    public final byte[][] N() {
        return this.f48421f;
    }

    @Override // r9.C7108k
    public String d() {
        return O().d();
    }

    @Override // r9.C7108k
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7108k) {
            C7108k c7108k = (C7108k) obj;
            if (c7108k.E() == E() && y(0, c7108k, 0, E())) {
                return true;
            }
        }
        return false;
    }

    @Override // r9.C7108k
    public C7108k g(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = N().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = M()[length + i10];
            int i13 = M()[i10];
            messageDigest.update(N()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.c(bArrDigest);
        return new C7108k(bArrDigest);
    }

    @Override // r9.C7108k
    public int hashCode() {
        int iK = k();
        if (iK != 0) {
            return iK;
        }
        int length = N().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = M()[length + i10];
            int i14 = M()[i10];
            byte[] bArr = N()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        A(i11);
        return i11;
    }

    @Override // r9.C7108k
    public int l() {
        return M()[N().length - 1];
    }

    @Override // r9.C7108k
    public String n() {
        return O().n();
    }

    @Override // r9.C7108k
    public int p(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return O().p(other, i10);
    }

    @Override // r9.C7108k
    public byte[] r() {
        return J();
    }

    @Override // r9.C7108k
    public byte s(int i10) {
        AbstractC7102e.b(M()[N().length - 1], i10, 1L);
        int iB = s9.e.b(this, i10);
        return N()[iB][(i10 - (iB == 0 ? 0 : M()[iB - 1])) + M()[N().length + iB]];
    }

    @Override // r9.C7108k
    public String toString() {
        return O().toString();
    }

    @Override // r9.C7108k
    public int u(byte[] other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return O().u(other, i10);
    }

    @Override // r9.C7108k
    public boolean y(int i10, C7108k other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > E() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = s9.e.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : M()[iB - 1];
            int i15 = M()[iB] - i14;
            int i16 = M()[N().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.z(i11, N()[iB], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // r9.C7108k
    public boolean z(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > E() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = s9.e.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : M()[iB - 1];
            int i15 = M()[iB] - i14;
            int i16 = M()[N().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!AbstractC7102e.a(N()[iB], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }
}
