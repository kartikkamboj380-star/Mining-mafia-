package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f24166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final U1 f24167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final V6 f24168l;

    V1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, U1 u10, V6 v10) {
        this.f24157a = i10;
        this.f24158b = i11;
        this.f24159c = i12;
        this.f24160d = i13;
        this.f24161e = i14;
        this.f24162f = f(i14);
        this.f24163g = i15;
        this.f24164h = i16;
        this.f24165i = g(i16);
        this.f24166j = j10;
        this.f24167k = u10;
        this.f24168l = v10;
    }

    private static int f(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int g(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long a() {
        long j10 = this.f24166j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f24161e);
    }

    public final long b(long j10) {
        String str = AbstractC4634ob0.f32117a;
        return Math.max(0L, Math.min((j10 * ((long) this.f24161e)) / 1000000, this.f24166j - 1));
    }

    public final JY0 c(byte[] bArr, V6 v10) {
        bArr[4] = -128;
        V6 v6D = d(v10);
        C5507vX0 c5507vX0 = new C5507vX0();
        c5507vX0.l0("audio/flac");
        int i10 = this.f24160d;
        if (i10 <= 0) {
            i10 = -1;
        }
        c5507vX0.m0(i10);
        c5507vX0.e(this.f24163g);
        c5507vX0.f(this.f24161e);
        c5507vX0.g(AbstractC4634ob0.V(this.f24164h, ByteOrder.LITTLE_ENDIAN));
        c5507vX0.o0(Collections.singletonList(bArr));
        c5507vX0.j0(v6D);
        return c5507vX0.m();
    }

    public final V6 d(V6 v10) {
        V6 v11 = this.f24168l;
        return v11 == null ? v10 : v11.f(v10);
    }

    public final V1 e(U1 u10) {
        return new V1(this.f24157a, this.f24158b, this.f24159c, this.f24160d, this.f24161e, this.f24163g, this.f24164h, this.f24166j, u10, this.f24168l);
    }

    public V1(byte[] bArr, int i10) {
        C4436n10 c4436n10 = new C4436n10(bArr, bArr.length);
        c4436n10.f(i10 * 8);
        this.f24157a = c4436n10.j(16);
        this.f24158b = c4436n10.j(16);
        this.f24159c = c4436n10.j(24);
        this.f24160d = c4436n10.j(24);
        int iJ = c4436n10.j(20);
        this.f24161e = iJ;
        this.f24162f = f(iJ);
        this.f24163g = c4436n10.j(3) + 1;
        int iJ2 = c4436n10.j(5) + 1;
        this.f24164h = iJ2;
        this.f24165i = g(iJ2);
        this.f24166j = c4436n10.k(36);
        this.f24167k = null;
        this.f24168l = null;
    }
}
