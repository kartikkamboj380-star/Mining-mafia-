package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3930j01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4683p f30269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f30270b = new P10(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3806i01 f30271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3806i01 f30272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3806i01 f30273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f30274f;

    public C3930j01(InterfaceC4683p interfaceC4683p) {
        this.f30269a = interfaceC4683p;
        C3806i01 c3806i01 = new C3806i01(0L, 65536);
        this.f30271c = c3806i01;
        this.f30272d = c3806i01;
        this.f30273e = c3806i01;
    }

    private final int i(int i10) {
        C3806i01 c3806i01 = this.f30273e;
        if (c3806i01.f29226c == null) {
            C4431n c4431nZza = this.f30269a.zza();
            C3806i01 c3806i02 = new C3806i01(this.f30273e.f29225b, 65536);
            c3806i01.f29226c = c4431nZza;
            c3806i01.f29227d = c3806i02;
        }
        return Math.min(i10, (int) (this.f30273e.f29225b - this.f30274f));
    }

    private final void j(int i10) {
        long j10 = this.f30274f + ((long) i10);
        this.f30274f = j10;
        C3806i01 c3806i01 = this.f30273e;
        if (j10 == c3806i01.f29225b) {
            this.f30273e = c3806i01.f29227d;
        }
    }

    private static C3806i01 k(C3806i01 c3806i01, C5741xO0 c5741xO0, C4056k01 c4056k01, P10 p10) {
        C3806i01 c3806i01M;
        if (c5741xO0.k()) {
            long j10 = c4056k01.f30666b;
            int iS = 1;
            p10.z(1);
            C3806i01 c3806i01M2 = m(c3806i01, j10, p10.H(), 1);
            long j11 = j10 + 1;
            byte b10 = p10.H()[0];
            int i10 = b10 & 128;
            int i11 = b10 & 127;
            VM0 vm0 = c5741xO0.f34802c;
            byte[] bArr = vm0.f24247a;
            if (bArr == null) {
                vm0.f24247a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z9 = i10 != 0;
            c3806i01M = m(c3806i01M2, j11, vm0.f24247a, i11);
            long j12 = j11 + ((long) i11);
            if (z9) {
                p10.z(2);
                c3806i01M = m(c3806i01M, j12, p10.H(), 2);
                j12 += 2;
                iS = p10.S();
            }
            int i12 = iS;
            int[] iArr = vm0.f24250d;
            if (iArr == null || iArr.length < i12) {
                iArr = new int[i12];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = vm0.f24251e;
            if (iArr3 == null || iArr3.length < i12) {
                iArr3 = new int[i12];
            }
            int[] iArr4 = iArr3;
            if (z9) {
                int i13 = i12 * 6;
                p10.z(i13);
                c3806i01M = m(c3806i01M, j12, p10.H(), i13);
                j12 += (long) i13;
                p10.G(0);
                for (int i14 = 0; i14 < i12; i14++) {
                    iArr2[i14] = p10.S();
                    iArr4[i14] = p10.h();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = c4056k01.f30665a - ((int) (j12 - c4056k01.f30666b));
            }
            C5444v2 c5444v2 = c4056k01.f30667c;
            String str = AbstractC4634ob0.f32117a;
            vm0.a(i12, iArr2, iArr4, c5444v2.f33975b, vm0.f24247a, c5444v2.f33974a, c5444v2.f33976c, c5444v2.f33977d);
            long j13 = c4056k01.f30666b;
            int i15 = (int) (j12 - j13);
            c4056k01.f30666b = j13 + ((long) i15);
            c4056k01.f30665a -= i15;
        } else {
            c3806i01M = c3806i01;
        }
        if (!c5741xO0.e()) {
            c5741xO0.j(c4056k01.f30665a);
            return l(c3806i01M, c4056k01.f30666b, c5741xO0.f34803d, c4056k01.f30665a);
        }
        p10.z(4);
        C3806i01 c3806i01M3 = m(c3806i01M, c4056k01.f30666b, p10.H(), 4);
        int iH = p10.h();
        c4056k01.f30666b += 4;
        c4056k01.f30665a -= 4;
        c5741xO0.j(iH);
        C3806i01 c3806i01L = l(c3806i01M3, c4056k01.f30666b, c5741xO0.f34803d, iH);
        c4056k01.f30666b += (long) iH;
        int i16 = c4056k01.f30665a - iH;
        c4056k01.f30665a = i16;
        ByteBuffer byteBuffer = c5741xO0.f34806g;
        if (byteBuffer == null || byteBuffer.capacity() < i16) {
            c5741xO0.f34806g = ByteBuffer.allocate(i16);
        } else {
            c5741xO0.f34806g.clear();
        }
        return l(c3806i01L, c4056k01.f30666b, c5741xO0.f34806g, c4056k01.f30665a);
    }

    private static C3806i01 l(C3806i01 c3806i01, long j10, ByteBuffer byteBuffer, int i10) {
        C3806i01 c3806i01N = n(c3806i01, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (c3806i01N.f29225b - j10));
            byteBuffer.put(c3806i01N.f29226c.f31637a, c3806i01N.b(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == c3806i01N.f29225b) {
                c3806i01N = c3806i01N.f29227d;
            }
        }
        return c3806i01N;
    }

    private static C3806i01 m(C3806i01 c3806i01, long j10, byte[] bArr, int i10) {
        C3806i01 c3806i01N = n(c3806i01, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (c3806i01N.f29225b - j10));
            System.arraycopy(c3806i01N.f29226c.f31637a, c3806i01N.b(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == c3806i01N.f29225b) {
                c3806i01N = c3806i01N.f29227d;
            }
        }
        return c3806i01N;
    }

    private static C3806i01 n(C3806i01 c3806i01, long j10) {
        while (j10 >= c3806i01.f29225b) {
            c3806i01 = c3806i01.f29227d;
        }
        return c3806i01;
    }

    public final void a() {
        C3806i01 c3806i01 = this.f30271c;
        if (c3806i01.f29226c != null) {
            this.f30269a.b(c3806i01);
            c3806i01.c();
        }
        this.f30271c.a(0L, 65536);
        C3806i01 c3806i02 = this.f30271c;
        this.f30272d = c3806i02;
        this.f30273e = c3806i02;
        this.f30274f = 0L;
        this.f30269a.zzd();
    }

    public final void b() {
        this.f30272d = this.f30271c;
    }

    public final void c(C5741xO0 c5741xO0, C4056k01 c4056k01) {
        this.f30272d = k(this.f30272d, c5741xO0, c4056k01, this.f30270b);
    }

    public final void d(C5741xO0 c5741xO0, C4056k01 c4056k01) {
        k(this.f30272d, c5741xO0, c4056k01, this.f30270b);
    }

    public final void e(long j10) {
        C3806i01 c3806i01;
        if (j10 != -1) {
            while (true) {
                c3806i01 = this.f30271c;
                if (j10 < c3806i01.f29225b) {
                    break;
                }
                this.f30269a.a(c3806i01.f29226c);
                this.f30271c = this.f30271c.c();
            }
            if (this.f30272d.f29224a < c3806i01.f29224a) {
                this.f30272d = c3806i01;
            }
        }
    }

    public final long f() {
        return this.f30274f;
    }

    public final int g(PQ0 pq0, int i10, boolean z9) throws EOFException {
        int i11 = i(i10);
        C3806i01 c3806i01 = this.f30273e;
        int iF = pq0.F(c3806i01.f29226c.f31637a, c3806i01.b(this.f30274f), i11);
        if (iF != -1) {
            j(iF);
            return iF;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }

    public final void h(P10 p10, int i10) {
        while (i10 > 0) {
            int i11 = i(i10);
            C3806i01 c3806i01 = this.f30273e;
            p10.L(c3806i01.f29226c.f31637a, c3806i01.b(this.f30274f), i11);
            i10 -= i11;
            j(i11);
        }
    }
}
