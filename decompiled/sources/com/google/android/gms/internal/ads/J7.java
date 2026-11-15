package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class J7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f19762a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f19763b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19764c = 0;

    public static boolean a(J1 j10) {
        P10 p10 = new P10(8);
        int i10 = I7.a(j10, p10).f19484a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        j10.J(p10.H(), 0, 4);
        p10.G(0);
        int iB = p10.b();
        if (iB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iB);
        YU.e("WavHeaderReader", sb.toString());
        return false;
    }

    public static H7 b(J1 j10) throws C2817a9 {
        byte[] bArr;
        int i10;
        byte[] bArr2;
        P10 p10 = new P10(16);
        long j11 = d(1718449184, j10, p10).f19485b;
        AbstractC2418Ss0.i(j11 >= 16);
        j10.J(p10.H(), 0, 16);
        p10.G(0);
        int iT = p10.T();
        int iT2 = p10.T();
        int i11 = p10.i();
        int i12 = p10.i();
        int iT3 = p10.T();
        int iT4 = p10.T();
        int i13 = ((int) j11) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            j10.J(bArr, 0, i13);
            if (iT == 65534) {
                if (i13 == 24) {
                    P10 p11 = new P10(bArr);
                    p11.T();
                    int iT5 = p11.T();
                    if (iT5 != 0 && iT5 != iT4) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iT5).length() + 33 + String.valueOf(iT4).length() + 19);
                        sb.append("validBits ( ");
                        sb.append(iT5);
                        sb.append(")  != bitsPerSample( ");
                        sb.append(iT4);
                        sb.append(") are not supported");
                        throw C2817a9.c(sb.toString());
                    }
                    int i14 = p11.i();
                    if ((i14 >> 18) != 0) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + 21);
                        sb2.append("invalid channel mask ");
                        sb2.append(i14);
                        throw C2817a9.c(sb2.toString());
                    }
                    if (i14 != 0 && Integer.bitCount(i14) != iT2) {
                        int iBitCount = Integer.bitCount(i14);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iBitCount).length() + 46 + String.valueOf(i14).length());
                        sb3.append("invalid number of channels (");
                        sb3.append(iBitCount);
                        sb3.append(") in channel mask ");
                        sb3.append(i14);
                        throw C2817a9.c(sb3.toString());
                    }
                    iT = p11.T();
                    byte[] bArr3 = new byte[14];
                    p11.L(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, f19762a) && !Arrays.equals(bArr3, f19763b)) {
                        throw C2817a9.c("invalid wav format extension guid");
                    }
                } else {
                    bArr2 = bArr;
                    i10 = 65534;
                }
            }
            j10.n((int) (j10.e() - j10.zzn()));
            return new H7(i10, iT2, i11, i12, iT3, iT4, bArr2);
        }
        bArr = AbstractC4634ob0.f32118b;
        i10 = iT;
        bArr2 = bArr;
        j10.n((int) (j10.e() - j10.zzn()));
        return new H7(i10, iT2, i11, i12, iT3, iT4, bArr2);
    }

    public static Pair c(J1 j10) throws C2817a9 {
        j10.zzl();
        I7 i7D = d(1684108385, j10, new P10(8));
        j10.n(8);
        return Pair.create(Long.valueOf(j10.zzn()), Long.valueOf(i7D.f19485b));
    }

    private static I7 d(int i10, J1 j10, P10 p10) throws C2817a9 {
        I7 i7A = I7.a(j10, p10);
        while (true) {
            int i11 = i7A.f19484a;
            if (i11 == i10) {
                return i7A;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 28);
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(i11);
            YU.c("WavHeaderReader", sb.toString());
            long j11 = i7A.f19485b;
            long j12 = 8 + j11;
            if ((1 & j11) != 0) {
                j12 = 9 + j11;
            }
            if (j12 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i11);
                throw C2817a9.c(sb2.toString());
            }
            j10.n((int) j12);
            i7A = I7.a(j10, p10);
        }
    }
}
