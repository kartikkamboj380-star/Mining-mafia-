package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class N4 implements I1 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f21021B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private C4187l3 f21022A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5576w5 f21023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P10 f21025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P10 f21026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P10 f21027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P10 f21028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f21029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final S4 f21030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f21031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AbstractC5931yu0 f21032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f21035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private P10 f21037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f21038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f21039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f21040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f21041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f21042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f21043u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f21044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private L1 f21045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private M4[] f21046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long[][] f21047y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f21048z;

    static {
        int i10 = J4.f19742a;
    }

    public N4() {
        this(InterfaceC5576w5.f34470a, 16);
    }

    static /* synthetic */ long a(X4 x10, long j10, long j11) {
        int iJ = j(x10, j10);
        return iJ == -1 ? j11 : Math.min(x10.f25131c[iJ], j11);
    }

    private final void h() {
        this.f21033k = 0;
        this.f21036n = 0;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:79:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e1  */
    private final void i(long j10) {
        V6 v6C;
        long j11;
        List list;
        M4 m10;
        InterfaceC5570w2 interfaceC5570w2;
        long j12;
        int i10;
        long j13;
        V6 v10;
        List list2;
        V6 v11;
        V6 v12;
        V6 v13;
        ArrayList arrayList;
        while (true) {
            ArrayDeque arrayDeque = this.f21029g;
            if (arrayDeque.isEmpty() || ((C2706Yg0) arrayDeque.peek()).f25681b != j10) {
                break;
            }
            C2706Yg0 c2706Yg0 = (C2706Yg0) arrayDeque.pop();
            if (c2706Yg0.f25684a == 1836019574) {
                C2706Yg0 c2706Yg0E = c2706Yg0.e(1835365473);
                new ArrayList();
                V6 v6E = c2706Yg0E != null ? AbstractC5826y4.e(c2706Yg0E) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z9 = this.f21048z == 1;
                C2929b2 c2929b2 = new C2929b2();
                C5779xh0 c5779xh0D = c2706Yg0.d(1969517665);
                if (c5779xh0D != null) {
                    v6C = AbstractC5826y4.c(c5779xh0D);
                    c2929b2.a(v6C);
                } else {
                    v6C = null;
                }
                C5779xh0 c5779xh0D2 = c2706Yg0.d(1836476516);
                c5779xh0D2.getClass();
                ArrayList arrayList3 = arrayList2;
                V6 v14 = new V6(-9223372036854775807L, AbstractC5826y4.d(c5779xh0D2.f34987b));
                int i11 = this.f21024b;
                V6 v15 = v6C;
                V6 v16 = v14;
                List listB = AbstractC5826y4.b(c2706Yg0, c2929b2, -9223372036854775807L, null, 1 == (i11 & 1), z9, K4.f20054a, false);
                String strA = I4.a(listB);
                long j14 = -9223372036854775807L;
                long j15 = -9223372036854775807L;
                int i12 = 0;
                int i13 = 0;
                int size = -1;
                while (true) {
                    j11 = 0;
                    if (i12 >= listB.size()) {
                        break;
                    }
                    X4 x10 = (X4) listB.get(i12);
                    int length = x10.f25130b;
                    if (length == 0) {
                        list = listB;
                        arrayList = arrayList3;
                        j13 = j15;
                        v12 = v15;
                        v13 = v16;
                    } else {
                        U4 u10 = x10.f25129a;
                        L1 l10 = this.f21045w;
                        int i14 = i13 + 1;
                        int i15 = u10.f23901b;
                        M4 m11 = new M4(u10, x10, l10.b(i13, i15));
                        List list3 = listB;
                        long j16 = u10.f23904e;
                        if (j16 == j15) {
                            j16 = x10.f25137i;
                        }
                        InterfaceC5570w2 interfaceC5570w3 = m11.f20745c;
                        interfaceC5570w3.g(j16);
                        long jMax = Math.max(j14, j16);
                        JY0 jy0 = u10.f23906g;
                        list = list3;
                        String str = jy0.f19929o;
                        int i16 = "audio/true-hd".equals(str) ? x10.f25133e * 16 : x10.f25133e + 30;
                        C5507vX0 c5507vX0A = jy0.a();
                        c5507vX0A.m0(i16);
                        if (i15 == 2) {
                            int i17 = jy0.f19920f;
                            if ((i11 & 8) != 0) {
                                i17 |= size == -1 ? 1 : 2;
                            }
                            c5507vX0A.f0(i17);
                            i15 = 2;
                        }
                        if (A8.b(str)) {
                            boolean z10 = x10.f25138j;
                            if (!z10) {
                                length = x10.f25136h.length;
                            }
                            int iMin = Math.min(length, 20);
                            AbstractC2418Ss0.i(j16 != j15);
                            m10 = m11;
                            interfaceC5570w2 = interfaceC5570w3;
                            long jMin = Math.min(j16, 10000000L);
                            int i18 = 0;
                            int i19 = -1;
                            for (int i20 = 0; i20 < iMin; i20++) {
                                int i21 = z10 ? i20 : x10.f25136h[i20];
                                long j17 = x10.f25134f[i21];
                                if (j17 > jMin) {
                                    break;
                                }
                                if (j17 >= 0 && (i10 = x10.f25132d[i21]) > i18) {
                                    i18 = i10;
                                    i19 = i21;
                                }
                            }
                            if (i19 != -1) {
                                j12 = x10.f25134f[i19];
                            }
                            if (j12 != j15) {
                                j13 = j15;
                                v10 = new V6(j13, new C4439n3(j12));
                            } else {
                                j13 = j15;
                                v10 = null;
                            }
                            H4.b(i15, c2929b2, c5507vX0A);
                            V6 v17 = jy0.f19926l;
                            list2 = this.f21031i;
                            if (list2.isEmpty()) {
                                v11 = null;
                            } else {
                                v11 = new V6(list2);
                            }
                            v12 = v15;
                            v13 = v16;
                            H4.a(i15, v6E, c5507vX0A, v17, v11, v12, v13, v10);
                            c5507vX0A.k0(strA);
                            if (Objects.equals(str, "audio/mpeg")) {
                                m10.f20748f = c5507vX0A.m();
                            } else {
                                interfaceC5570w2.f(c5507vX0A.m());
                            }
                            if (i15 == 2 && size == -1) {
                                size = arrayList3.size();
                            }
                            arrayList = arrayList3;
                            arrayList.add(m10);
                            i13 = i14;
                            j14 = jMax;
                        } else {
                            m10 = m11;
                            interfaceC5570w2 = interfaceC5570w3;
                        }
                        j12 = j15;
                        if (j12 != j15) {
                            j13 = j15;
                            v10 = new V6(j13, new C4439n3(j12));
                        } else {
                            j13 = j15;
                            v10 = null;
                        }
                        H4.b(i15, c2929b2, c5507vX0A);
                        V6 v18 = jy0.f19926l;
                        list2 = this.f21031i;
                        if (list2.isEmpty()) {
                            v11 = null;
                        } else {
                            v11 = new V6(list2);
                        }
                        v12 = v15;
                        v13 = v16;
                        H4.a(i15, v6E, c5507vX0A, v18, v11, v12, v13, v10);
                        c5507vX0A.k0(strA);
                        if (Objects.equals(str, "audio/mpeg")) {
                            m10.f20748f = c5507vX0A.m();
                        } else {
                            interfaceC5570w2.f(c5507vX0A.m());
                        }
                        if (i15 == 2) {
                            size = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(m10);
                        i13 = i14;
                        j14 = jMax;
                    }
                    arrayList3 = arrayList;
                    v15 = v12;
                    j15 = j13;
                    v16 = v13;
                    arrayDeque = arrayDeque;
                    i12++;
                    listB = list;
                }
                ArrayDeque arrayDeque2 = arrayDeque;
                int i22 = -1;
                M4[] m4Arr = (M4[]) arrayList3.toArray(new M4[0]);
                this.f21046x = m4Arr;
                int length2 = m4Arr.length;
                long[][] jArr = new long[length2][];
                int[] iArr = new int[length2];
                long[] jArr2 = new long[length2];
                boolean[] zArr = new boolean[length2];
                for (int i23 = 0; i23 < m4Arr.length; i23++) {
                    jArr[i23] = new long[m4Arr[i23].f20744b.f25130b];
                    jArr2[i23] = m4Arr[i23].f20744b.f25134f[0];
                }
                int i24 = 0;
                while (i24 < m4Arr.length) {
                    long j18 = Long.MAX_VALUE;
                    int i25 = i22;
                    for (int i26 = 0; i26 < m4Arr.length; i26++) {
                        if (!zArr[i26]) {
                            long j19 = jArr2[i26];
                            if (j19 <= j18) {
                                i25 = i26;
                                j18 = j19;
                            }
                        }
                    }
                    int i27 = iArr[i25];
                    long[] jArr3 = jArr[i25];
                    jArr3[i27] = j11;
                    X4 x11 = m4Arr[i25].f20744b;
                    M4[] m4Arr2 = m4Arr;
                    j11 += (long) x11.f25132d[i27];
                    int i28 = i27 + 1;
                    iArr[i25] = i28;
                    if (i28 < jArr3.length) {
                        jArr2[i25] = x11.f25134f[i28];
                    } else {
                        zArr[i25] = true;
                        i24++;
                    }
                    m4Arr = m4Arr2;
                    i22 = -1;
                }
                this.f21047y = jArr;
                this.f21045w.q();
                this.f21045w.o(new L4(j14, this.f21046x, size));
                arrayDeque2.clear();
                this.f21033k = 2;
            } else if (!arrayDeque.isEmpty()) {
                ((C2706Yg0) arrayDeque.peek()).c(c2706Yg0);
            }
        }
        if (this.f21033k != 2) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(X4 x10, long j10) {
        int iA = x10.a(j10);
        return iA == -1 ? x10.b(j10) : iA;
    }

    private static int k(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        this.f21029g.clear();
        this.f21036n = 0;
        this.f21038p = -1;
        this.f21039q = 0;
        this.f21040r = 0;
        this.f21041s = 0;
        this.f21042t = false;
        if (j10 == 0) {
            if (this.f21033k != 3) {
                h();
                return;
            } else {
                this.f21030h.a();
                this.f21031i.clear();
                return;
            }
        }
        for (M4 m10 : this.f21046x) {
            X4 x10 = m10.f20744b;
            int iA = x10.a(j11);
            if (iA == -1) {
                iA = x10.b(j11);
            }
            m10.f20747e = iA;
            C5696x2 c5696x2 = m10.f20746d;
            if (c5696x2 != null) {
                c5696x2.a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) {
        InterfaceC4940r2 interfaceC4940r2B = T4.b(j10, (this.f21024b & 2) != 0);
        this.f21032j = interfaceC4940r2B != null ? AbstractC5931yu0.m(interfaceC4940r2B) : AbstractC5931yu0.l();
        return interfaceC4940r2B == null;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        if ((this.f21024b & 16) == 0) {
            l10 = new C5954z5(l10, this.f21023a);
        }
        this.f21045w = l10;
    }

    /* JADX WARN: Code duplicated, block: B:317:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.I1
    public final int g(J1 j10, C3933j2 c3933j2) throws C2817a9 {
        long j11;
        long j12;
        InterfaceC5570w2 interfaceC5570w2;
        int i10;
        int i11;
        int iC;
        boolean z9;
        boolean z10;
        while (true) {
            int i12 = this.f21033k;
            long j13 = 0;
            if (i12 == 0) {
                if (this.f21036n == 0) {
                    P10 p10 = this.f21028f;
                    if (!j10.K(p10.H(), 0, 8, true)) {
                        if (this.f21048z != 2 || (this.f21024b & 2) == 0) {
                            return -1;
                        }
                        InterfaceC5570w2 interfaceC5570w2B = this.f21045w.b(0, 4);
                        C4187l3 c4187l3 = this.f21022A;
                        V6 v10 = c4187l3 == null ? null : new V6(-9223372036854775807L, c4187l3);
                        C5507vX0 c5507vX0 = new C5507vX0();
                        c5507vX0.j0(v10);
                        interfaceC5570w2B.f(c5507vX0.m());
                        this.f21045w.q();
                        this.f21045w.o(new C4185l2(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.f21036n = 8;
                    p10.G(0);
                    this.f21035m = p10.Y();
                    this.f21034l = p10.b();
                }
                long j14 = this.f21035m;
                if (j14 == 1) {
                    P10 p11 = this.f21028f;
                    j10.I(p11.H(), 8, 8);
                    this.f21036n += 8;
                    this.f21035m = p11.j();
                } else if (j14 == 0) {
                    long jZzo = j10.zzo();
                    if (jZzo == -1) {
                        C2706Yg0 c2706Yg0 = (C2706Yg0) this.f21029g.peek();
                        jZzo = c2706Yg0 != null ? c2706Yg0.f25681b : -1L;
                    }
                    if (jZzo != -1) {
                        this.f21035m = (jZzo - j10.zzn()) + ((long) this.f21036n);
                    }
                }
                long j15 = this.f21035m;
                int i13 = this.f21036n;
                long j16 = i13;
                if (j15 < j16) {
                    if (this.f21034l != 1718773093 || i13 != 8) {
                        throw C2817a9.c("Atom size less than header length (unsupported).");
                    }
                    this.f21035m = j16;
                    i13 = 8;
                }
                int i14 = this.f21034l;
                if (i14 == 1836019574 || i14 == 1953653099 || i14 == 1835297121 || i14 == 1835626086 || i14 == 1937007212 || i14 == 1701082227 || i14 == 1835365473 || i14 == 1635284069) {
                    long jZzn = j10.zzn();
                    long j17 = this.f21035m;
                    long j18 = jZzn + j17;
                    long j19 = this.f21036n;
                    if (j17 != j19 && this.f21034l == 1835365473) {
                        P10 p12 = this.f21027e;
                        p12.z(8);
                        j10.J(p12.H(), 0, 8);
                        AbstractC5826y4.f(p12);
                        j10.n(p12.F());
                        j10.zzl();
                    }
                    long j20 = j18 - j19;
                    this.f21029g.push(new C2706Yg0(this.f21034l, j20));
                    if (this.f21035m == this.f21036n) {
                        i(j20);
                    } else {
                        h();
                    }
                } else if (i14 == 1835296868 || i14 == 1836476516 || i14 == 1751411826 || i14 == 1937011556 || i14 == 1937011827 || i14 == 1937011571 || i14 == 1668576371 || i14 == 1701606260 || i14 == 1937011555 || i14 == 1937011578 || i14 == 1937013298 || i14 == 1937007471 || i14 == 1668232756 || i14 == 1953196132 || i14 == 1718909296 || i14 == 1969517665 || i14 == 1801812339 || i14 == 1768715124) {
                    AbstractC2418Ss0.i(i13 == 8);
                    AbstractC2418Ss0.i(this.f21035m <= 2147483647L);
                    P10 p13 = new P10((int) this.f21035m);
                    System.arraycopy(this.f21028f.H(), 0, p13.H(), 0, 8);
                    this.f21037o = p13;
                    this.f21033k = 1;
                } else {
                    long jZzn2 = j10.zzn();
                    long j21 = this.f21036n;
                    long j22 = jZzn2 - j21;
                    if (this.f21034l == 1836086884) {
                        this.f21022A = new C4187l3(0L, j22, -9223372036854775807L, j22 + j21, this.f21035m - j21);
                    }
                    this.f21037o = null;
                    this.f21033k = 1;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        this.f21030h.b(j10, c3933j2, this.f21031i);
                        if (c3933j2.f30283a == 0) {
                            h();
                        }
                        return 1;
                    }
                    long jZzn3 = j10.zzn();
                    int i15 = this.f21038p;
                    if (i15 == -1) {
                        int i16 = -1;
                        int i17 = -1;
                        boolean z11 = true;
                        boolean z12 = true;
                        long j23 = Long.MAX_VALUE;
                        long j24 = Long.MAX_VALUE;
                        long j25 = Long.MAX_VALUE;
                        int i18 = 0;
                        j12 = 262144;
                        while (true) {
                            M4[] m4Arr = this.f21046x;
                            if (i18 >= m4Arr.length) {
                                break;
                            }
                            M4 m10 = m4Arr[i18];
                            int i19 = m10.f20747e;
                            X4 x10 = m10.f20744b;
                            long j26 = j13;
                            if (i19 != x10.f25130b) {
                                long j27 = x10.f25131c[i19];
                                long[][] jArr = this.f21047y;
                                jArr.getClass();
                                long j28 = jArr[i18][i19];
                                long j29 = j27 - jZzn3;
                                boolean z13 = j29 < j26 || j29 >= 262144;
                                if (z13) {
                                    z9 = z12;
                                } else {
                                    if (z12) {
                                        z12 = z13;
                                        i17 = i18;
                                        j24 = j28;
                                        j25 = j29;
                                    } else {
                                        z9 = false;
                                    }
                                    if (j28 < j23) {
                                        z11 = z13;
                                        i16 = i18;
                                        j23 = j28;
                                    }
                                }
                                if (z13 != z9 || j29 >= j25) {
                                    z12 = z9;
                                } else {
                                    z12 = z13;
                                    i17 = i18;
                                    j24 = j28;
                                    j25 = j29;
                                }
                                if (j28 < j23) {
                                    z11 = z13;
                                    i16 = i18;
                                    j23 = j28;
                                }
                            }
                            i18++;
                            j13 = j26;
                        }
                        j11 = j13;
                        i15 = (j23 == Long.MAX_VALUE || !z11 || j24 < j23 + 10485760) ? i17 : i16;
                        this.f21038p = i15;
                        if (i15 == -1) {
                            return -1;
                        }
                    } else {
                        j11 = 0;
                        j12 = 262144;
                    }
                    M4 m11 = this.f21046x[i15];
                    InterfaceC5570w2 interfaceC5570w3 = m11.f20745c;
                    int i20 = m11.f20747e;
                    X4 x11 = m11.f20744b;
                    long j30 = x11.f25131c[i20] + this.f21044v;
                    int[] iArr = x11.f25132d;
                    int i21 = iArr[i20];
                    C5696x2 c5696x2 = m11.f20746d;
                    InterfaceC5570w2 interfaceC5570w4 = interfaceC5570w3;
                    int i22 = 0;
                    long j31 = (j30 - jZzn3) + ((long) this.f21039q);
                    if (j31 < j11 || j31 >= j12) {
                        c3933j2.f30283a = j30;
                        return 1;
                    }
                    U4 u10 = m11.f20743a;
                    if (u10.f23907h == 1) {
                        j31 += 8;
                        i21 -= 8;
                    }
                    int i23 = i21;
                    j10.n((int) j31);
                    JY0 jy0 = u10.f23906g;
                    String str = jy0.f19929o;
                    if (!Objects.equals(str, MimeTypes.VIDEO_H264)) {
                        Objects.equals(str, MimeTypes.VIDEO_H265);
                    }
                    this.f21042t = true;
                    int i24 = u10.f23910k;
                    if (i24 == 0) {
                        interfaceC5570w2 = interfaceC5570w4;
                        if ("audio/ac4".equals(str)) {
                            if (this.f21040r == 0) {
                                P10 p14 = this.f21027e;
                                AbstractC4183l1.c(i23, p14);
                                interfaceC5570w2.b(p14, 7);
                                this.f21040r += 7;
                            }
                            i23 += 7;
                        } else if (m11.f20748f != null && Objects.equals(str, "audio/mpeg")) {
                            JY0 jy0M = m11.f20748f;
                            P10 p15 = this.f21027e;
                            p15.z(4);
                            j10.J(p15.H(), 0, 4);
                            j10.zzl();
                            C3431f2 c3431f2 = new C3431f2();
                            if (c3431f2.a(p15.b()) && !Objects.equals(jy0M.f19929o, c3431f2.f28131b)) {
                                C5507vX0 c5507vX0A = jy0M.a();
                                String str2 = c3431f2.f28131b;
                                str2.getClass();
                                c5507vX0A.l0(str2);
                                jy0M = c5507vX0A.m();
                            }
                            interfaceC5570w2.f(jy0M);
                            m11.f20748f = null;
                        } else if (c5696x2 != null) {
                            c5696x2.b(j10);
                        }
                        while (true) {
                            int i25 = this.f21040r;
                            if (i25 >= i23) {
                                break;
                            }
                            int iD = interfaceC5570w2.d(j10, i23 - i25, false);
                            this.f21039q += iD;
                            this.f21040r += iD;
                            this.f21041s -= iD;
                        }
                    } else {
                        P10 p16 = this.f21026d;
                        byte[] bArrH = p16.H();
                        bArrH[0] = 0;
                        bArrH[1] = 0;
                        bArrH[2] = 0;
                        int i26 = 4 - i24;
                        i23 += i26;
                        while (this.f21040r < i23) {
                            int i27 = this.f21041s;
                            if (i27 == 0) {
                                if (this.f21042t || AbstractC4034jq0.c(jy0) + i24 > iArr[i20] - this.f21039q) {
                                    i11 = i24;
                                    iC = i22;
                                } else {
                                    iC = AbstractC4034jq0.c(jy0);
                                    i11 = i24 + iC;
                                }
                                j10.I(bArrH, i26, i11);
                                this.f21039q += i11;
                                int i28 = i22;
                                p16.G(i28);
                                int iB = p16.b();
                                if (iB < 0) {
                                    throw C2817a9.b("Invalid NAL length", null);
                                }
                                this.f21041s = iB - iC;
                                P10 p17 = this.f21025c;
                                p17.G(i28);
                                i10 = i24;
                                InterfaceC5570w2 interfaceC5570w5 = interfaceC5570w4;
                                interfaceC5570w5.b(p17, 4);
                                this.f21040r += 4;
                                if (iC > 0) {
                                    interfaceC5570w5.b(p16, iC);
                                    this.f21040r += iC;
                                    if (AbstractC4034jq0.d(bArrH, 4, iC, jy0)) {
                                        this.f21042t = true;
                                        interfaceC5570w4 = interfaceC5570w5;
                                        i24 = i10;
                                    }
                                    i22 = 0;
                                }
                                interfaceC5570w4 = interfaceC5570w5;
                            } else {
                                i10 = i24;
                                int iD2 = interfaceC5570w4.d(j10, i27, i22);
                                this.f21039q += iD2;
                                this.f21040r += iD2;
                                this.f21041s -= iD2;
                            }
                            i24 = i10;
                            i22 = 0;
                        }
                        interfaceC5570w2 = interfaceC5570w4;
                    }
                    int i29 = i23;
                    long j32 = x11.f25134f[i20];
                    int i30 = x11.f25135g[i20];
                    if (!this.f21042t) {
                        i30 |= 67108864;
                    }
                    int i31 = i30;
                    if (c5696x2 != null) {
                        InterfaceC5570w2 interfaceC5570w6 = interfaceC5570w2;
                        c5696x2.c(interfaceC5570w6, j32, i31, i29, 0, null);
                        if (i20 + 1 == x11.f25130b) {
                            c5696x2.d(interfaceC5570w6, null);
                        }
                    } else {
                        interfaceC5570w2.c(j32, i31, i29, 0, null);
                    }
                    m11.f20747e++;
                    this.f21038p = -1;
                    this.f21039q = 0;
                    this.f21040r = 0;
                    this.f21041s = 0;
                    this.f21042t = false;
                    return 0;
                }
                long j33 = this.f21035m - ((long) this.f21036n);
                long jZzn4 = j10.zzn() + j33;
                P10 p18 = this.f21037o;
                if (p18 != null) {
                    j10.I(p18.H(), this.f21036n, (int) j33);
                    if (this.f21034l == 1718909296) {
                        this.f21043u = true;
                        p18.G(8);
                        int iK = k(p18.b());
                        if (iK == 0) {
                            p18.J(4);
                            do {
                                if (p18.C() <= 0) {
                                    iK = 0;
                                    break;
                                }
                                iK = k(p18.b());
                            } while (iK == 0);
                        }
                        this.f21048z = iK;
                    } else {
                        ArrayDeque arrayDeque = this.f21029g;
                        if (!arrayDeque.isEmpty()) {
                            ((C2706Yg0) arrayDeque.peek()).b(new C5779xh0(this.f21034l, p18));
                        }
                    }
                } else {
                    if (!this.f21043u && this.f21034l == 1835295092) {
                        this.f21048z = 1;
                    }
                    if (j33 < 262144) {
                        j10.n((int) j33);
                    } else {
                        c3933j2.f30283a = j10.zzn() + j33;
                        z10 = true;
                    }
                    i(jZzn4);
                    if (z10 && this.f21033k != 2) {
                        return 1;
                    }
                }
                z10 = false;
                i(jZzn4);
                if (z10) {
                    continue;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final /* synthetic */ List zzb() {
        return this.f21032j;
    }

    public N4(InterfaceC5576w5 interfaceC5576w5, int i10) {
        this.f21023a = interfaceC5576w5;
        this.f21024b = i10;
        this.f21032j = AbstractC5931yu0.l();
        this.f21033k = (i10 & 4) != 0 ? 3 : 0;
        this.f21030h = new S4();
        this.f21031i = new ArrayList();
        this.f21028f = new P10(16);
        this.f21029g = new ArrayDeque();
        this.f21025c = new P10(AbstractC4034jq0.f30572a);
        this.f21026d = new P10(6);
        this.f21027e = new P10();
        this.f21038p = -1;
        this.f21045w = L1.f20331u;
        this.f21046x = new M4[0];
    }
}
