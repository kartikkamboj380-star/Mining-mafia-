package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5202t7 implements I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f33324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P10 f33325c = new P10(new byte[9400], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f33326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC5580w7 f33327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC5576w5 f33328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray f33329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f33330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f33331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C4699p7 f33332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C4573o7 f33333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private L1 f33334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f33336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f33337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f33338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f33339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f33340r;

    static {
        int i10 = AbstractC5076s7.f33110a;
    }

    public C5202t7(int i10, int i11, InterfaceC5576w5 interfaceC5576w5, L90 l90, InterfaceC5580w7 interfaceC5580w7, int i12) {
        this.f33327e = interfaceC5580w7;
        this.f33323a = i11;
        this.f33328f = interfaceC5576w5;
        this.f33324b = Collections.singletonList(l90);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f33330h = sparseBooleanArray;
        this.f33331i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f33329g = sparseArray;
        this.f33326d = new SparseIntArray();
        this.f33332j = new C4699p7(112800);
        this.f33334l = L1.f20331u;
        this.f33340r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = interfaceC5580w7.zza();
        int size = sparseArrayZza.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f33329g.put(sparseArrayZza.keyAt(i13), (InterfaceC5832y7) sparseArrayZza.valueAt(i13));
        }
        this.f33329g.put(0, new C4069k7(new C4825q7(this)));
    }

    final /* synthetic */ List a() {
        return this.f33324b;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
    }

    final /* synthetic */ InterfaceC5580w7 c() {
        return this.f33327e;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        C4573o7 c4573o7;
        List list = this.f33324b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            L90 l90 = (L90) list.get(i10);
            if (l90.c() != -9223372036854775807L) {
                long jA = l90.a();
                if (jA != -9223372036854775807L && jA != 0 && jA != j11) {
                    l90.d(j11);
                }
            } else {
                l90.d(j11);
            }
        }
        if (j11 != 0 && (c4573o7 = this.f33333k) != null) {
            c4573o7.b(j11);
        }
        this.f33325c.z(0);
        this.f33326d.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f33329g;
            if (i11 >= sparseArray.size()) {
                this.f33339q = 0;
                return;
            } else {
                ((InterfaceC5832y7) sparseArray.valueAt(i11)).zzb();
                i11++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) throws EOFException, InterruptedIOException {
        byte[] bArrH = this.f33325c.H();
        C5946z1 c5946z1 = (C5946z1) j10;
        c5946z1.H(bArrH, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    c5946z1.G(i10, false);
                    return true;
                }
                if (bArrH[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        if (this.f33323a == 0) {
            l10 = new C5954z5(l10, this.f33328f);
        }
        this.f33334l = l10;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x019c  */
    @Override // com.google.android.gms.internal.ads.I1
    public final int g(J1 j10, C3933j2 c3933j2) {
        long j11;
        long jZzo = j10.zzo();
        long j12 = -1;
        if (this.f33336n) {
            if (jZzo != -1) {
                C4699p7 c4699p7 = this.f33332j;
                if (!c4699p7.a()) {
                    return c4699p7.b(j10, c3933j2, this.f33340r);
                }
            }
            if (this.f33337o) {
                j11 = 0;
            } else {
                this.f33337o = true;
                C4699p7 c4699p8 = this.f33332j;
                if (c4699p8.c() != -9223372036854775807L) {
                    j11 = 0;
                    C4573o7 c4573o7 = new C4573o7(c4699p8.d(), c4699p8.c(), jZzo, this.f33340r, 112800);
                    this.f33333k = c4573o7;
                    this.f33334l.o(c4573o7.a());
                } else {
                    j11 = 0;
                    this.f33334l.o(new C4185l2(c4699p8.c(), 0L));
                }
            }
            if (this.f33338p) {
                this.f33338p = false;
                d(j11, j11);
                if (j10.zzn() != j11) {
                    c3933j2.f30283a = j11;
                    return 1;
                }
            }
            C4573o7 c4573o8 = this.f33333k;
            if (c4573o8 != null && c4573o8.c()) {
                return c4573o8.d(j10, c3933j2);
            }
        } else {
            j12 = -1;
        }
        P10 p10 = this.f33325c;
        byte[] bArrH = p10.H();
        if (9400 - p10.F() < 188) {
            int iC = p10.C();
            if (iC > 0) {
                System.arraycopy(bArrH, p10.F(), bArrH, 0, iC);
            }
            p10.A(bArrH, iC);
        }
        while (p10.C() < 188) {
            int iD = p10.D();
            int iF = j10.F(bArrH, iD, 9400 - iD);
            if (iF == -1) {
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = this.f33329g;
                    if (i10 >= sparseArray.size()) {
                        return -1;
                    }
                    InterfaceC5832y7 interfaceC5832y7 = (InterfaceC5832y7) sparseArray.valueAt(i10);
                    if (interfaceC5832y7 instanceof C3064c7) {
                        C3064c7 c3064c7 = (C3064c7) interfaceC5832y7;
                        if (c3064c7.c(false)) {
                            c3064c7.b(new P10(), 1);
                        }
                    }
                    i10++;
                }
            } else {
                p10.E(iD + iF);
            }
        }
        int iF2 = p10.F();
        int iD2 = p10.D();
        int iA = AbstractC5958z7.a(p10.H(), iF2, iD2);
        p10.G(iA);
        int i11 = iA + 188;
        if (i11 > iD2) {
            this.f33339q += iA - iF2;
        } else {
            this.f33339q = 0;
        }
        int iD3 = p10.D();
        if (i11 > iD3) {
            return 0;
        }
        int iB = p10.b();
        if ((8388608 & iB) != 0) {
            p10.G(i11);
            return 0;
        }
        int i12 = (4194304 & iB) != 0 ? 1 : 0;
        int i13 = iB & 32;
        int i14 = (iB >> 8) & 8191;
        InterfaceC5832y7 interfaceC5832y8 = (iB & 16) != 0 ? (InterfaceC5832y7) this.f33329g.get(i14) : null;
        if (interfaceC5832y8 == null) {
            p10.G(i11);
            return 0;
        }
        int i15 = iB & 15;
        SparseIntArray sparseIntArray = this.f33326d;
        int i16 = sparseIntArray.get(i14, i15 - 1);
        sparseIntArray.put(i14, i15);
        if (i16 == i15) {
            p10.G(i11);
            return 0;
        }
        if (i15 != ((i16 + 1) & 15)) {
            interfaceC5832y8.zzb();
        }
        if (i13 != 0) {
            int iR = p10.R();
            i12 |= (p10.R() & 64) != 0 ? 2 : 0;
            p10.J(iR - 1);
        }
        boolean z9 = this.f33336n;
        if (z9 || !this.f33331i.get(i14, false)) {
            p10.E(i11);
            interfaceC5832y8.b(p10, i12);
            p10.E(iD3);
            if (!z9) {
                if (this.f33336n && jZzo != j12) {
                    this.f33338p = true;
                }
            }
        } else if (this.f33336n) {
            this.f33338p = true;
        }
        p10.G(i11);
        return 0;
    }

    final /* synthetic */ SparseArray h() {
        return this.f33329g;
    }

    final /* synthetic */ SparseBooleanArray i() {
        return this.f33330h;
    }

    final /* synthetic */ SparseBooleanArray j() {
        return this.f33331i;
    }

    final /* synthetic */ L1 k() {
        return this.f33334l;
    }

    final /* synthetic */ int l() {
        return this.f33335m;
    }

    final /* synthetic */ void m(int i10) {
        this.f33335m = i10;
    }

    final /* synthetic */ void n(boolean z9) {
        this.f33336n = true;
    }

    final /* synthetic */ void o(int i10) {
        this.f33340r = i10;
    }
}
