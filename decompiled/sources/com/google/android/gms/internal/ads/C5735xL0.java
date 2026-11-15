package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5735xL0 implements KM0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC5609wL0 f34793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34796d = 0;

    private C5735xL0(AbstractC5609wL0 abstractC5609wL0) {
        AbstractC3346eM0.a(abstractC5609wL0, "input");
        this.f34793a = abstractC5609wL0;
        abstractC5609wL0.f34532d = this;
    }

    private final void F(int i10) throws C3472fM0 {
        if ((this.f34794b & 7) != i10) {
            throw new C3472fM0("Protocol message tag had invalid wire type.");
        }
    }

    private final void G(Object obj, PM0 pm0, HL0 hl0) throws C3598gM0 {
        AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
        int iY = abstractC5609wL0.y();
        abstractC5609wL0.f();
        int iE = abstractC5609wL0.E(iY);
        abstractC5609wL0.f34529a++;
        pm0.h(obj, this, hl0);
        abstractC5609wL0.l(0);
        abstractC5609wL0.f34529a--;
        abstractC5609wL0.a(iE);
    }

    private final Object H(PM0 pm0, HL0 hl0) throws C3598gM0 {
        Object objZza = pm0.zza();
        G(objZza, pm0, hl0);
        pm0.b(objZza);
        return objZza;
    }

    private final void I(Object obj, PM0 pm0, HL0 hl0) {
        int i10 = this.f34795c;
        this.f34795c = ((this.f34794b >>> 3) << 3) | 4;
        try {
            pm0.h(obj, this, hl0);
            if (this.f34794b != this.f34795c) {
                throw new C3598gM0("Failed to parse the message.");
            }
            this.f34795c = i10;
        } catch (Throwable th) {
            this.f34795c = i10;
            throw th;
        }
    }

    private final Object J(EnumC4480nN0 enumC4480nN0, Class cls, HL0 hl0) throws C3472fM0 {
        EnumC4480nN0 enumC4480nN1 = EnumC4480nN0.f31790c;
        switch (enumC4480nN0.ordinal()) {
            case 0:
                return Double.valueOf(zze());
            case 1:
                return Float.valueOf(b());
            case 2:
                return Long.valueOf(c());
            case 3:
                return Long.valueOf(zzg());
            case 4:
                return Integer.valueOf(zzi());
            case 5:
                return Long.valueOf(d());
            case 6:
                return Integer.valueOf(zzk());
            case 7:
                return Boolean.valueOf(zzl());
            case 8:
                return zzn();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                F(2);
                return H(HM0.a().b(cls), hl0);
            case 11:
                return a();
            case 12:
                return Integer.valueOf(l());
            case 13:
                return Integer.valueOf(f());
            case 14:
                return Integer.valueOf(g());
            case 15:
                return Long.valueOf(zzu());
            case 16:
                return Integer.valueOf(q());
            case 17:
                return Long.valueOf(p());
        }
    }

    private final void K(int i10) throws C3598gM0 {
        if (this.f34793a.c() != i10) {
            throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void L(int i10) throws C3598gM0 {
        if ((i10 & 3) != 0) {
            throw new C3598gM0("Failed to parse the message.");
        }
    }

    private static final void M(int i10) throws C3598gM0 {
        if ((i10 & 7) != 0) {
            throw new C3598gM0("Failed to parse the message.");
        }
    }

    public static C5735xL0 N(AbstractC5609wL0 abstractC5609wL0) {
        Object obj = abstractC5609wL0.f34532d;
        return obj != null ? (C5735xL0) obj : new C5735xL0(abstractC5609wL0);
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void A(List list) throws C3598gM0 {
        int iK;
        int iK2;
        if (list instanceof VL0) {
            VL0 vl0 = (VL0) list;
            int i10 = this.f34794b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                int iC = abstractC5609wL0.c() + abstractC5609wL0.y();
                do {
                    vl0.zzi(abstractC5609wL0.y());
                } while (abstractC5609wL0.c() < iC);
                K(iC);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
                vl0.zzi(abstractC5609wL1.y());
                if (abstractC5609wL1.b()) {
                    return;
                } else {
                    iK2 = abstractC5609wL1.k();
                }
            } while (iK2 == this.f34794b);
        } else {
            int i11 = this.f34794b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL2 = this.f34793a;
                int iC2 = abstractC5609wL2.c() + abstractC5609wL2.y();
                do {
                    list.add(Integer.valueOf(abstractC5609wL2.y()));
                } while (abstractC5609wL2.c() < iC2);
                K(iC2);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL3 = this.f34793a;
                list.add(Integer.valueOf(abstractC5609wL3.y()));
                if (abstractC5609wL3.b()) {
                    return;
                } else {
                    iK = abstractC5609wL3.k();
                }
            } while (iK == this.f34794b);
            iK2 = iK;
        }
        this.f34796d = iK2;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void B(List list) throws C3472fM0 {
        int iK;
        if ((this.f34794b & 7) != 2) {
            throw new C3472fM0("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(a());
            AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
            if (abstractC5609wL0.b()) {
                return;
            } else {
                iK = abstractC5609wL0.k();
            }
        } while (iK == this.f34794b);
        this.f34796d = iK;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void C(List list) throws C3598gM0 {
        int iK;
        int iK2;
        if (list instanceof VL0) {
            VL0 vl0 = (VL0) list;
            int i10 = this.f34794b & 7;
            if (i10 == 2) {
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                int iY = abstractC5609wL0.y();
                L(iY);
                int iC = abstractC5609wL0.c() + iY;
                do {
                    vl0.zzi(abstractC5609wL0.A());
                } while (abstractC5609wL0.c() < iC);
                return;
            }
            if (i10 != 5) {
                throw new C3472fM0("Protocol message tag had invalid wire type.");
            }
            do {
                AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
                vl0.zzi(abstractC5609wL1.A());
                if (abstractC5609wL1.b()) {
                    return;
                } else {
                    iK2 = abstractC5609wL1.k();
                }
            } while (iK2 == this.f34794b);
        } else {
            int i11 = this.f34794b & 7;
            if (i11 == 2) {
                AbstractC5609wL0 abstractC5609wL2 = this.f34793a;
                int iY2 = abstractC5609wL2.y();
                L(iY2);
                int iC2 = abstractC5609wL2.c() + iY2;
                do {
                    list.add(Integer.valueOf(abstractC5609wL2.A()));
                } while (abstractC5609wL2.c() < iC2);
                return;
            }
            if (i11 != 5) {
                throw new C3472fM0("Protocol message tag had invalid wire type.");
            }
            do {
                AbstractC5609wL0 abstractC5609wL3 = this.f34793a;
                list.add(Integer.valueOf(abstractC5609wL3.A()));
                if (abstractC5609wL3.b()) {
                    return;
                } else {
                    iK = abstractC5609wL3.k();
                }
            } while (iK == this.f34794b);
            iK2 = iK;
        }
        this.f34796d = iK2;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void D(List list) throws C3598gM0 {
        int iK;
        int iK2;
        if (list instanceof VL0) {
            VL0 vl0 = (VL0) list;
            int i10 = this.f34794b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                int iC = abstractC5609wL0.c() + abstractC5609wL0.y();
                do {
                    vl0.zzi(abstractC5609wL0.z());
                } while (abstractC5609wL0.c() < iC);
                K(iC);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
                vl0.zzi(abstractC5609wL1.z());
                if (abstractC5609wL1.b()) {
                    return;
                } else {
                    iK2 = abstractC5609wL1.k();
                }
            } while (iK2 == this.f34794b);
        } else {
            int i11 = this.f34794b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL2 = this.f34793a;
                int iC2 = abstractC5609wL2.c() + abstractC5609wL2.y();
                do {
                    list.add(Integer.valueOf(abstractC5609wL2.z()));
                } while (abstractC5609wL2.c() < iC2);
                K(iC2);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL3 = this.f34793a;
                list.add(Integer.valueOf(abstractC5609wL3.z()));
                if (abstractC5609wL3.b()) {
                    return;
                } else {
                    iK = abstractC5609wL3.k();
                }
            } while (iK == this.f34794b);
            iK2 = iK;
        }
        this.f34796d = iK2;
    }

    public final void E(List list, boolean z9) throws C3472fM0 {
        int iK;
        if ((this.f34794b & 7) != 2) {
            throw new C3472fM0("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(z9 ? zzn() : e());
            AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
            if (abstractC5609wL0.b()) {
                return;
            } else {
                iK = abstractC5609wL0.k();
            }
        } while (iK == this.f34794b);
        this.f34796d = iK;
    }

    public final boolean O() {
        int i10;
        AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
        if (abstractC5609wL0.b() || (i10 = this.f34794b) == this.f34795c) {
            return false;
        }
        return abstractC5609wL0.m(i10);
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final AbstractC5231tL0 a() throws C3472fM0 {
        F(2);
        return this.f34793a.x();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final float b() throws C3472fM0 {
        F(5);
        return this.f34793a.o();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final long c() throws C3472fM0 {
        F(0);
        return this.f34793a.q();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final long d() throws C3472fM0 {
        F(1);
        return this.f34793a.s();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final String e() throws C3472fM0 {
        F(2);
        return this.f34793a.v();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final int f() throws C3472fM0 {
        F(0);
        return this.f34793a.z();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final int g() throws C3472fM0 {
        F(5);
        return this.f34793a.A();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void h(List list) throws C3598gM0 {
        int iK;
        int i10 = this.f34794b & 7;
        if (i10 == 2) {
            AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
            int iY = abstractC5609wL0.y();
            L(iY);
            int iC = abstractC5609wL0.c() + iY;
            do {
                list.add(Float.valueOf(abstractC5609wL0.o()));
            } while (abstractC5609wL0.c() < iC);
            return;
        }
        if (i10 != 5) {
            throw new C3472fM0("Protocol message tag had invalid wire type.");
        }
        do {
            AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
            list.add(Float.valueOf(abstractC5609wL1.o()));
            if (abstractC5609wL1.b()) {
                return;
            } else {
                iK = abstractC5609wL1.k();
            }
        } while (iK == this.f34794b);
        this.f34796d = iK;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void i(List list) throws C3598gM0 {
        int iK;
        int i10 = this.f34794b & 7;
        if (i10 == 0) {
            do {
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                list.add(Boolean.valueOf(abstractC5609wL0.u()));
                if (abstractC5609wL0.b()) {
                    return;
                } else {
                    iK = abstractC5609wL0.k();
                }
            } while (iK == this.f34794b);
            this.f34796d = iK;
            return;
        }
        if (i10 != 2) {
            throw new C3472fM0("Protocol message tag had invalid wire type.");
        }
        AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
        int iC = abstractC5609wL1.c() + abstractC5609wL1.y();
        do {
            list.add(Boolean.valueOf(abstractC5609wL1.u()));
        } while (abstractC5609wL1.c() < iC);
        K(iC);
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void j(List list) throws C3598gM0 {
        int iK;
        int i10 = this.f34794b & 7;
        if (i10 == 1) {
            do {
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                list.add(Double.valueOf(abstractC5609wL0.n()));
                if (abstractC5609wL0.b()) {
                    return;
                } else {
                    iK = abstractC5609wL0.k();
                }
            } while (iK == this.f34794b);
            this.f34796d = iK;
            return;
        }
        if (i10 != 2) {
            throw new C3472fM0("Protocol message tag had invalid wire type.");
        }
        AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
        int iY = abstractC5609wL1.y();
        M(iY);
        int iC = abstractC5609wL1.c() + iY;
        do {
            list.add(Double.valueOf(abstractC5609wL1.n()));
        } while (abstractC5609wL1.c() < iC);
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void k(List list) throws C3598gM0 {
        int iK;
        int iK2;
        if (list instanceof VL0) {
            VL0 vl0 = (VL0) list;
            int i10 = this.f34794b & 7;
            if (i10 == 2) {
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                int iY = abstractC5609wL0.y();
                L(iY);
                int iC = abstractC5609wL0.c() + iY;
                do {
                    vl0.zzi(abstractC5609wL0.t());
                } while (abstractC5609wL0.c() < iC);
                return;
            }
            if (i10 != 5) {
                throw new C3472fM0("Protocol message tag had invalid wire type.");
            }
            do {
                AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
                vl0.zzi(abstractC5609wL1.t());
                if (abstractC5609wL1.b()) {
                    return;
                } else {
                    iK2 = abstractC5609wL1.k();
                }
            } while (iK2 == this.f34794b);
        } else {
            int i11 = this.f34794b & 7;
            if (i11 == 2) {
                AbstractC5609wL0 abstractC5609wL2 = this.f34793a;
                int iY2 = abstractC5609wL2.y();
                L(iY2);
                int iC2 = abstractC5609wL2.c() + iY2;
                do {
                    list.add(Integer.valueOf(abstractC5609wL2.t()));
                } while (abstractC5609wL2.c() < iC2);
                return;
            }
            if (i11 != 5) {
                throw new C3472fM0("Protocol message tag had invalid wire type.");
            }
            do {
                AbstractC5609wL0 abstractC5609wL3 = this.f34793a;
                list.add(Integer.valueOf(abstractC5609wL3.t()));
                if (abstractC5609wL3.b()) {
                    return;
                } else {
                    iK = abstractC5609wL3.k();
                }
            } while (iK == this.f34794b);
            iK2 = iK;
        }
        this.f34796d = iK2;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final int l() throws C3472fM0 {
        F(0);
        return this.f34793a.y();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void m(List list) throws C3598gM0 {
        int iK;
        int iK2;
        if (list instanceof C4226lM0) {
            C4226lM0 c4226lM0 = (C4226lM0) list;
            int i10 = this.f34794b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                int iC = abstractC5609wL0.c() + abstractC5609wL0.y();
                do {
                    c4226lM0.f(abstractC5609wL0.p());
                } while (abstractC5609wL0.c() < iC);
                K(iC);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
                c4226lM0.f(abstractC5609wL1.p());
                if (abstractC5609wL1.b()) {
                    return;
                } else {
                    iK2 = abstractC5609wL1.k();
                }
            } while (iK2 == this.f34794b);
        } else {
            int i11 = this.f34794b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL2 = this.f34793a;
                int iC2 = abstractC5609wL2.c() + abstractC5609wL2.y();
                do {
                    list.add(Long.valueOf(abstractC5609wL2.p()));
                } while (abstractC5609wL2.c() < iC2);
                K(iC2);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL3 = this.f34793a;
                list.add(Long.valueOf(abstractC5609wL3.p()));
                if (abstractC5609wL3.b()) {
                    return;
                } else {
                    iK = abstractC5609wL3.k();
                }
            } while (iK == this.f34794b);
            iK2 = iK;
        }
        this.f34796d = iK2;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void n(Map map, C4730pM0 c4730pM0, HL0 hl0) throws C3472fM0 {
        F(2);
        AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
        int iE = abstractC5609wL0.E(abstractC5609wL0.y());
        Object obj = c4730pM0.f32371d;
        Object objJ = c4730pM0.f32369b;
        Object objJ2 = obj;
        while (true) {
            try {
                int iZzb = zzb();
                if (iZzb == Integer.MAX_VALUE || abstractC5609wL0.b()) {
                    break;
                }
                if (iZzb == 1) {
                    objJ = J(c4730pM0.f32368a, null, null);
                } else if (iZzb != 2) {
                    try {
                        if (!O()) {
                            throw new C3598gM0("Unable to parse map entry.");
                        }
                    } catch (C3472fM0 e10) {
                        if (!O()) {
                            throw new C3598gM0("Unable to parse map entry.", e10);
                        }
                    }
                } else {
                    objJ2 = J(c4730pM0.f32370c, obj.getClass(), hl0);
                }
            } catch (Throwable th) {
                this.f34793a.a(iE);
                throw th;
            }
        }
        map.put(objJ, objJ2);
        this.f34793a.a(iE);
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void o(Object obj, PM0 pm0, HL0 hl0) throws C3472fM0 {
        F(3);
        I(obj, pm0, hl0);
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final long p() throws C3472fM0 {
        F(0);
        return this.f34793a.D();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final int q() throws C3472fM0 {
        F(0);
        return this.f34793a.C();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void r(List list) throws C3598gM0 {
        int iK;
        int iK2;
        if (list instanceof C4226lM0) {
            C4226lM0 c4226lM0 = (C4226lM0) list;
            int i10 = this.f34794b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                int iC = abstractC5609wL0.c() + abstractC5609wL0.y();
                do {
                    c4226lM0.f(abstractC5609wL0.q());
                } while (abstractC5609wL0.c() < iC);
                K(iC);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
                c4226lM0.f(abstractC5609wL1.q());
                if (abstractC5609wL1.b()) {
                    return;
                } else {
                    iK2 = abstractC5609wL1.k();
                }
            } while (iK2 == this.f34794b);
        } else {
            int i11 = this.f34794b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL2 = this.f34793a;
                int iC2 = abstractC5609wL2.c() + abstractC5609wL2.y();
                do {
                    list.add(Long.valueOf(abstractC5609wL2.q()));
                } while (abstractC5609wL2.c() < iC2);
                K(iC2);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL3 = this.f34793a;
                list.add(Long.valueOf(abstractC5609wL3.q()));
                if (abstractC5609wL3.b()) {
                    return;
                } else {
                    iK = abstractC5609wL3.k();
                }
            } while (iK == this.f34794b);
            iK2 = iK;
        }
        this.f34796d = iK2;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void s(Object obj, PM0 pm0, HL0 hl0) throws C3598gM0 {
        F(2);
        G(obj, pm0, hl0);
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void t(List list) throws C3598gM0 {
        int iK;
        int iK2;
        if (list instanceof C4226lM0) {
            C4226lM0 c4226lM0 = (C4226lM0) list;
            int i10 = this.f34794b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                int iY = abstractC5609wL0.y();
                M(iY);
                int iC = abstractC5609wL0.c() + iY;
                do {
                    c4226lM0.f(abstractC5609wL0.s());
                } while (abstractC5609wL0.c() < iC);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
                c4226lM0.f(abstractC5609wL1.s());
                if (abstractC5609wL1.b()) {
                    return;
                } else {
                    iK2 = abstractC5609wL1.k();
                }
            } while (iK2 == this.f34794b);
        } else {
            int i11 = this.f34794b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL2 = this.f34793a;
                int iY2 = abstractC5609wL2.y();
                M(iY2);
                int iC2 = abstractC5609wL2.c() + iY2;
                do {
                    list.add(Long.valueOf(abstractC5609wL2.s()));
                } while (abstractC5609wL2.c() < iC2);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL3 = this.f34793a;
                list.add(Long.valueOf(abstractC5609wL3.s()));
                if (abstractC5609wL3.b()) {
                    return;
                } else {
                    iK = abstractC5609wL3.k();
                }
            } while (iK == this.f34794b);
            iK2 = iK;
        }
        this.f34796d = iK2;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void u(List list) throws C3598gM0 {
        int iK;
        int iK2;
        if (list instanceof VL0) {
            VL0 vl0 = (VL0) list;
            int i10 = this.f34794b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                int iC = abstractC5609wL0.c() + abstractC5609wL0.y();
                do {
                    vl0.zzi(abstractC5609wL0.r());
                } while (abstractC5609wL0.c() < iC);
                K(iC);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
                vl0.zzi(abstractC5609wL1.r());
                if (abstractC5609wL1.b()) {
                    return;
                } else {
                    iK2 = abstractC5609wL1.k();
                }
            } while (iK2 == this.f34794b);
        } else {
            int i11 = this.f34794b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL2 = this.f34793a;
                int iC2 = abstractC5609wL2.c() + abstractC5609wL2.y();
                do {
                    list.add(Integer.valueOf(abstractC5609wL2.r()));
                } while (abstractC5609wL2.c() < iC2);
                K(iC2);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL3 = this.f34793a;
                list.add(Integer.valueOf(abstractC5609wL3.r()));
                if (abstractC5609wL3.b()) {
                    return;
                } else {
                    iK = abstractC5609wL3.k();
                }
            } while (iK == this.f34794b);
            iK2 = iK;
        }
        this.f34796d = iK2;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void v(List list) throws C3598gM0 {
        int iK;
        int iK2;
        if (list instanceof VL0) {
            VL0 vl0 = (VL0) list;
            int i10 = this.f34794b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                int iC = abstractC5609wL0.c() + abstractC5609wL0.y();
                do {
                    vl0.zzi(abstractC5609wL0.C());
                } while (abstractC5609wL0.c() < iC);
                K(iC);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
                vl0.zzi(abstractC5609wL1.C());
                if (abstractC5609wL1.b()) {
                    return;
                } else {
                    iK2 = abstractC5609wL1.k();
                }
            } while (iK2 == this.f34794b);
        } else {
            int i11 = this.f34794b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL2 = this.f34793a;
                int iC2 = abstractC5609wL2.c() + abstractC5609wL2.y();
                do {
                    list.add(Integer.valueOf(abstractC5609wL2.C()));
                } while (abstractC5609wL2.c() < iC2);
                K(iC2);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL3 = this.f34793a;
                list.add(Integer.valueOf(abstractC5609wL3.C()));
                if (abstractC5609wL3.b()) {
                    return;
                } else {
                    iK = abstractC5609wL3.k();
                }
            } while (iK == this.f34794b);
            iK2 = iK;
        }
        this.f34796d = iK2;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void w(List list, PM0 pm0, HL0 hl0) throws C3472fM0 {
        int iK;
        int i10 = this.f34794b;
        if ((i10 & 7) != 2) {
            throw new C3472fM0("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(H(pm0, hl0));
            AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
            if (abstractC5609wL0.b() || this.f34796d != 0) {
                return;
            } else {
                iK = abstractC5609wL0.k();
            }
        } while (iK == i10);
        this.f34796d = iK;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void x(List list) throws C3598gM0 {
        int iK;
        int iK2;
        if (list instanceof C4226lM0) {
            C4226lM0 c4226lM0 = (C4226lM0) list;
            int i10 = this.f34794b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                int iY = abstractC5609wL0.y();
                M(iY);
                int iC = abstractC5609wL0.c() + iY;
                do {
                    c4226lM0.f(abstractC5609wL0.B());
                } while (abstractC5609wL0.c() < iC);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
                c4226lM0.f(abstractC5609wL1.B());
                if (abstractC5609wL1.b()) {
                    return;
                } else {
                    iK2 = abstractC5609wL1.k();
                }
            } while (iK2 == this.f34794b);
        } else {
            int i11 = this.f34794b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL2 = this.f34793a;
                int iY2 = abstractC5609wL2.y();
                M(iY2);
                int iC2 = abstractC5609wL2.c() + iY2;
                do {
                    list.add(Long.valueOf(abstractC5609wL2.B()));
                } while (abstractC5609wL2.c() < iC2);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL3 = this.f34793a;
                list.add(Long.valueOf(abstractC5609wL3.B()));
                if (abstractC5609wL3.b()) {
                    return;
                } else {
                    iK = abstractC5609wL3.k();
                }
            } while (iK == this.f34794b);
            iK2 = iK;
        }
        this.f34796d = iK2;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void y(List list, PM0 pm0, HL0 hl0) throws C3472fM0 {
        int iK;
        int i10 = this.f34794b;
        if ((i10 & 7) != 3) {
            throw new C3472fM0("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZza = pm0.zza();
            I(objZza, pm0, hl0);
            pm0.b(objZza);
            list.add(objZza);
            AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
            if (abstractC5609wL0.b() || this.f34796d != 0) {
                return;
            } else {
                iK = abstractC5609wL0.k();
            }
        } while (iK == i10);
        this.f34796d = iK;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void z(List list) throws C3598gM0 {
        int iK;
        int iK2;
        if (list instanceof C4226lM0) {
            C4226lM0 c4226lM0 = (C4226lM0) list;
            int i10 = this.f34794b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL0 = this.f34793a;
                int iC = abstractC5609wL0.c() + abstractC5609wL0.y();
                do {
                    c4226lM0.f(abstractC5609wL0.D());
                } while (abstractC5609wL0.c() < iC);
                K(iC);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL1 = this.f34793a;
                c4226lM0.f(abstractC5609wL1.D());
                if (abstractC5609wL1.b()) {
                    return;
                } else {
                    iK2 = abstractC5609wL1.k();
                }
            } while (iK2 == this.f34794b);
        } else {
            int i11 = this.f34794b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new C3472fM0("Protocol message tag had invalid wire type.");
                }
                AbstractC5609wL0 abstractC5609wL2 = this.f34793a;
                int iC2 = abstractC5609wL2.c() + abstractC5609wL2.y();
                do {
                    list.add(Long.valueOf(abstractC5609wL2.D()));
                } while (abstractC5609wL2.c() < iC2);
                K(iC2);
                return;
            }
            do {
                AbstractC5609wL0 abstractC5609wL3 = this.f34793a;
                list.add(Long.valueOf(abstractC5609wL3.D()));
                if (abstractC5609wL3.b()) {
                    return;
                } else {
                    iK = abstractC5609wL3.k();
                }
            } while (iK == this.f34794b);
            iK2 = iK;
        }
        this.f34796d = iK2;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final int zzb() {
        int iK = this.f34796d;
        if (iK != 0) {
            this.f34794b = iK;
            this.f34796d = 0;
        } else {
            iK = this.f34793a.k();
            this.f34794b = iK;
        }
        return (iK == 0 || iK == this.f34795c) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iK >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final int zzc() {
        return this.f34794b;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final double zze() throws C3472fM0 {
        F(1);
        return this.f34793a.n();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final long zzg() throws C3472fM0 {
        F(0);
        return this.f34793a.p();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final int zzi() throws C3472fM0 {
        F(0);
        return this.f34793a.r();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final int zzk() throws C3472fM0 {
        F(5);
        return this.f34793a.t();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final boolean zzl() throws C3472fM0 {
        F(0);
        return this.f34793a.u();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final String zzn() throws C3472fM0 {
        F(2);
        return this.f34793a.w();
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final long zzu() throws C3472fM0 {
        F(1);
        return this.f34793a.B();
    }
}
