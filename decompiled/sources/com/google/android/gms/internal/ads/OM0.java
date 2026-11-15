package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class OM0 extends AbstractC5231tL0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f21538h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC5231tL0 f21540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC5231tL0 f21541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21543g;

    /* synthetic */ OM0(AbstractC5231tL0 abstractC5231tL0, AbstractC5231tL0 abstractC5231tL1, byte[] bArr) {
        this(abstractC5231tL0, abstractC5231tL1);
    }

    private static AbstractC5231tL0 F(AbstractC5231tL0 abstractC5231tL0, AbstractC5231tL0 abstractC5231tL1) {
        int iJ = abstractC5231tL0.j();
        int iJ2 = abstractC5231tL1.j();
        byte[] bArr = new byte[iJ + iJ2];
        abstractC5231tL0.C(bArr, 0, 0, iJ);
        abstractC5231tL1.C(bArr, 0, iJ, iJ2);
        return AbstractC5231tL0.z(bArr);
    }

    static AbstractC5231tL0 H(AbstractC5231tL0 abstractC5231tL0, AbstractC5231tL0 abstractC5231tL1) {
        if (abstractC5231tL1.j() == 0) {
            return abstractC5231tL0;
        }
        if (abstractC5231tL0.j() == 0) {
            return abstractC5231tL1;
        }
        int iJ = abstractC5231tL0.j() + abstractC5231tL1.j();
        if (iJ < 128) {
            return F(abstractC5231tL0, abstractC5231tL1);
        }
        if (abstractC5231tL0 instanceof OM0) {
            OM0 om0 = (OM0) abstractC5231tL0;
            AbstractC5231tL0 abstractC5231tL2 = om0.f21541e;
            if (abstractC5231tL2.j() + abstractC5231tL1.j() < 128) {
                return new OM0(om0.f21540d, F(abstractC5231tL2, abstractC5231tL1));
            }
            AbstractC5231tL0 abstractC5231tL3 = om0.f21540d;
            if (abstractC5231tL3.t() > abstractC5231tL2.t() && om0.f21543g > abstractC5231tL1.t()) {
                return new OM0(abstractC5231tL3, new OM0(abstractC5231tL2, abstractC5231tL1));
            }
        }
        return iJ >= I(Math.max(abstractC5231tL0.t(), abstractC5231tL1.t()) + 1) ? new OM0(abstractC5231tL0, abstractC5231tL1) : MM0.a(abstractC5231tL0, abstractC5231tL1, new ArrayDeque());
    }

    static int I(int i10) {
        int[] iArr = f21538h;
        int length = iArr.length;
        return i10 >= 47 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iArr[i10];
    }

    final /* synthetic */ AbstractC5231tL0 E() {
        return this.f21541e;
    }

    final /* synthetic */ AbstractC5231tL0 J() {
        return this.f21540d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final byte g(int i10) {
        AbstractC5231tL0.b(i10, this.f21539c);
        return i(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    final byte i(int i10) {
        int i11 = this.f21542f;
        return i10 < i11 ? this.f21540d.i(i10) : this.f21541e.i(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new LM0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final int j() {
        return this.f21539c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final AbstractC5231tL0 k(int i10, int i11) {
        int i12 = this.f21539c;
        int iD = AbstractC5231tL0.d(i10, i11, i12);
        if (iD == 0) {
            return AbstractC5231tL0.f33386b;
        }
        if (iD == i12) {
            return this;
        }
        int i13 = this.f21542f;
        if (i11 <= i13) {
            return this.f21540d.k(i10, i11);
        }
        int i14 = i11 - i13;
        if (i10 >= i13) {
            return this.f21541e.k(i10 - i13, i14);
        }
        AbstractC5231tL0 abstractC5231tL0 = this.f21540d;
        return new OM0(abstractC5231tL0.k(i10, abstractC5231tL0.j()), this.f21541e.k(0, i14));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    protected final void l(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f21542f;
        if (i13 <= i14) {
            this.f21540d.l(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f21541e.l(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f21540d.l(bArr, i10, i11, i15);
            this.f21541e.l(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    final void o(AbstractC4098kL0 abstractC4098kL0) {
        this.f21540d.o(abstractC4098kL0);
        this.f21541e.o(abstractC4098kL0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final boolean p(AbstractC5231tL0 abstractC5231tL0) {
        AbstractC4854qL0 abstractC4854qL0A;
        byte[] bArr = null;
        NM0 nm0 = new NM0(this, bArr);
        AbstractC4854qL0 abstractC4854qL0A2 = nm0.next();
        NM0 nm1 = new NM0(abstractC5231tL0, bArr);
        AbstractC4854qL0 abstractC4854qL0A3 = nm1.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iJ = abstractC4854qL0A2.j() - i10;
            int iJ2 = abstractC4854qL0A3.j() - i11;
            int iMin = Math.min(iJ, iJ2);
            if (!(i10 == 0 ? abstractC4854qL0A2.E(abstractC4854qL0A3, i11, iMin) : abstractC4854qL0A3.E(abstractC4854qL0A2, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f21539c;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iJ) {
                abstractC4854qL0A = nm0.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == iJ2) {
                abstractC4854qL0A2 = abstractC4854qL0A2;
                abstractC4854qL0A2 = abstractC4854qL0A;
                abstractC4854qL0A3 = nm1.next();
                i11 = 0;
            } else {
                abstractC4854qL0A2 = abstractC4854qL0A2;
                abstractC4854qL0A2 = abstractC4854qL0A;
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    protected final int r(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f21542f;
        if (i13 <= i14) {
            return this.f21540d.r(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f21541e.r(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f21541e.r(this.f21540d.r(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    public final AbstractC5609wL0 s() {
        ArrayList arrayList = new ArrayList();
        NM0 nm0 = new NM0(this, null);
        while (nm0.hasNext()) {
            arrayList.add(nm0.next().m());
        }
        int i10 = AbstractC5609wL0.f34528f;
        return AbstractC5609wL0.d(new C3724hM0(arrayList), CodedOutputStream.DEFAULT_BUFFER_SIZE);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    protected final int t() {
        return this.f21543g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    protected final boolean u() {
        return this.f21539c >= I(this.f21543g);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5231tL0
    /* JADX INFO: renamed from: v */
    public final InterfaceC4602oL0 iterator() {
        return new LM0(this);
    }

    private OM0(AbstractC5231tL0 abstractC5231tL0, AbstractC5231tL0 abstractC5231tL1) {
        this.f21540d = abstractC5231tL0;
        this.f21541e = abstractC5231tL1;
        int iJ = abstractC5231tL0.j();
        this.f21542f = iJ;
        this.f21539c = iJ + abstractC5231tL1.j();
        this.f21543g = Math.max(abstractC5231tL0.t(), abstractC5231tL1.t()) + 1;
    }
}
