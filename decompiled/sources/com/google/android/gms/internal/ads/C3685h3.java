package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3685h3 implements I1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private L1 f28819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28822e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4187l3 f28824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private J1 f28825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C5066s2 f28826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private N4 f28827j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f28818a = new P10(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f28823f = -1;

    private final int a(J1 j10) {
        P10 p10 = this.f28818a;
        p10.z(2);
        ((C5946z1) j10).H(p10.H(), 0, 2, false);
        return p10.S();
    }

    private final int c(J1 j10) {
        P10 p10 = this.f28818a;
        p10.z(2);
        j10.J(p10.H(), 0, 2);
        return p10.S() - 2;
    }

    private final void h() {
        L1 l10 = this.f28819b;
        l10.getClass();
        l10.q();
        this.f28819b.o(new C4185l2(-9223372036854775807L, 0L));
        this.f28820c = 6;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f28820c = 0;
            this.f28827j = null;
        } else if (this.f28820c == 5) {
            N4 n10 = this.f28827j;
            n10.getClass();
            n10.d(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) throws EOFException, InterruptedIOException {
        int iC;
        if (a(j10) == 65496) {
            while (true) {
                int iA = a(j10);
                this.f28821d = iA;
                if (iA == 65498 || (iC = c(j10)) < 0) {
                    break;
                }
                if (this.f28821d != 65505) {
                    ((C5946z1) j10).c(iC, false);
                } else {
                    P10 p10 = this.f28818a;
                    p10.z(iC);
                    ((C5946z1) j10).H(p10.H(), 0, iC, false);
                    if (Objects.equals(p10.m((char) 0), "http://ns.adobe.com/xap/1.0/") && AbstractC4061k3.b(p10.m((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        this.f28819b = l10;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    @Override // com.google.android.gms.internal.ads.I1
    public final int g(J1 j10, C3933j2 c3933j2) throws C2817a9 {
        String strM;
        C3935j3 c3935j3A;
        C4187l3 c4187l3;
        long j11;
        int i10 = this.f28820c;
        long j12 = -1;
        if (i10 == 0) {
            P10 p10 = this.f28818a;
            p10.z(2);
            j10.I(p10.H(), 0, 2);
            int iS = p10.S();
            this.f28821d = iS;
            if (iS == 65498) {
                if (this.f28823f != -1) {
                    this.f28820c = 4;
                } else {
                    h();
                }
            } else if ((iS < 65488 || iS > 65497) && iS != 65281) {
                this.f28820c = 1;
            }
            return 0;
        }
        if (i10 == 1) {
            this.f28822e = c(j10);
            j10.n(2);
            this.f28820c = 2;
            return 0;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f28826i == null || j10 != this.f28825h) {
                    this.f28825h = j10;
                    this.f28826i = new C5066s2(j10, this.f28823f);
                }
                N4 n10 = this.f28827j;
                n10.getClass();
                int iG = n10.g(this.f28826i, c3933j2);
                if (iG == 1) {
                    c3933j2.f30283a += this.f28823f;
                }
                return iG;
            }
            long jZzn = j10.zzn();
            long j13 = this.f28823f;
            if (jZzn != j13) {
                c3933j2.f30283a = j13;
                return 1;
            }
            if (j10.H(this.f28818a.H(), 0, 1, true)) {
                j10.zzl();
                if (this.f28827j == null) {
                    this.f28827j = new N4(InterfaceC5576w5.f34470a, 8);
                }
                C5066s2 c5066s2 = new C5066s2(j10, this.f28823f);
                this.f28826i = c5066s2;
                if (this.f28827j.e(c5066s2)) {
                    N4 n11 = this.f28827j;
                    long j14 = this.f28823f;
                    L1 l10 = this.f28819b;
                    l10.getClass();
                    n11.f(new C5318u2(j14, l10));
                    C4187l3 c4187l4 = this.f28824g;
                    c4187l4.getClass();
                    L1 l11 = this.f28819b;
                    l11.getClass();
                    InterfaceC5570w2 interfaceC5570w2B = l11.b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 4);
                    C5507vX0 c5507vX0 = new C5507vX0();
                    c5507vX0.k0(ClipboardModule.MIMETYPE_JPEG);
                    c5507vX0.j0(new V6(-9223372036854775807L, c4187l4));
                    interfaceC5570w2B.f(c5507vX0.m());
                    this.f28820c = 5;
                } else {
                    h();
                }
            } else {
                h();
            }
            return 0;
        }
        if (this.f28821d == 65505) {
            P10 p11 = new P10(this.f28822e);
            j10.I(p11.H(), 0, this.f28822e);
            if (this.f28824g == null && "http://ns.adobe.com/xap/1.0/".equals(p11.m((char) 0)) && (strM = p11.m((char) 0)) != null) {
                long jZzo = j10.zzo();
                if (jZzo == -1 || (c3935j3A = AbstractC4061k3.a(strM)) == null) {
                    c4187l3 = null;
                } else {
                    List list = c3935j3A.f30286b;
                    if (list.size() < 2) {
                        c4187l3 = null;
                    } else {
                        int size = list.size() - 1;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        long j18 = -1;
                        while (size >= 0) {
                            C3811i3 c3811i3 = (C3811i3) list.get(size);
                            String str = c3811i3.f29240a;
                            long j19 = j12;
                            boolean z9 = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (size == 0) {
                                jZzo -= c3811i3.f29242c;
                                j11 = 0;
                            } else {
                                j11 = jZzo - c3811i3.f29241b;
                            }
                            long j20 = j11;
                            long j21 = jZzo;
                            jZzo = j20;
                            if (z9 && jZzo != j21) {
                                j18 = j21 - jZzo;
                                j17 = jZzo;
                            }
                            if (size == 0) {
                                j16 = j21;
                            }
                            if (size == 0) {
                                j15 = jZzo;
                            }
                            size--;
                            j12 = j19;
                        }
                        long j22 = j12;
                        if (j17 == j22 || j18 == j22 || j15 == j22 || j16 == j22) {
                            c4187l3 = null;
                        } else {
                            c4187l3 = new C4187l3(j15, j16, c3935j3A.f30285a, j17, j18);
                        }
                    }
                }
                this.f28824g = c4187l3;
                if (c4187l3 != null) {
                    this.f28823f = c4187l3.f20353d;
                }
            }
        } else {
            j10.n(this.f28822e);
        }
        this.f28820c = 0;
        return 0;
    }
}
