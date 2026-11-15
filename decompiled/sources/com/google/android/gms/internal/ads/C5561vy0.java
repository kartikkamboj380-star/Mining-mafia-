package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5561vy0 implements BC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f34201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JC0 f34202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5561vy0 f34203c;

    private C5561vy0(List list, JC0 jc0, C5561vy0 c5561vy0) {
        this.f34201a = list;
        this.f34202b = jc0;
        this.f34203c = c5561vy0;
    }

    static final C5561vy0 a(C4088kG0 c4088kG0) throws GeneralSecurityException {
        if (c4088kG0 == null || c4088kG0.f0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new C5561vy0(h(c4088kG0), JC0.f19805b);
    }

    public static final C5561vy0 e(AbstractC1495Ay0 abstractC1495Ay0) {
        C4932qy0 c4932qy0 = new C4932qy0();
        C4680oy0 c4680oy0 = new C4680oy0(abstractC1495Ay0, null);
        c4680oy0.b();
        c4680oy0.a();
        c4932qy0.a(c4680oy0);
        return c4932qy0.b();
    }

    static /* synthetic */ C5561vy0 g(final C5561vy0 c5561vy0) {
        final JC0 jc0 = c5561vy0.f34202b;
        if (jc0.a()) {
            return c5561vy0;
        }
        InterfaceC5057ry0 interfaceC5057ry0 = new InterfaceC5057ry0() { // from class: com.google.android.gms.internal.ads.uy0
            @Override // com.google.android.gms.internal.ads.InterfaceC5057ry0
            public final /* synthetic */ void a(C5309ty0 c5309ty0) {
                UC0.a().b().a(this.f33956a, jc0, "keyset_handle", "get_key");
            }
        };
        List<C5309ty0> list = c5561vy0.f34201a;
        ArrayList arrayList = new ArrayList(list.size());
        for (C5309ty0 c5309ty0 : list) {
            arrayList.add(new C5309ty0(c5309ty0.f(), c5309ty0.j(), c5309ty0.g(), c5309ty0.h(), c5309ty0.i(), interfaceC5057ry0, null));
        }
        return new C5561vy0(arrayList, jc0, c5561vy0);
    }

    private static List h(C4088kG0 c4088kG0) throws GeneralSecurityException {
        AbstractC4050jy0 gc0;
        boolean z9;
        ArrayList arrayList = new ArrayList(c4088kG0.f0());
        for (C3962jG0 c3962jG0 : c4088kG0.e0()) {
            int iF0 = c3962jG0.f0();
            try {
                C5467vD0 c5467vD0J = j(c3962jG0);
                ZC0 zc0A = ZC0.a();
                C1703Ey0 c1703Ey0A = C1703Ey0.a();
                gc0 = !zc0A.f(c5467vD0J) ? new GC0(c5467vD0J, c1703Ey0A) : zc0A.g(c5467vD0J, c1703Ey0A);
                z9 = false;
            } catch (GeneralSecurityException e10) {
                if (SB0.f23148a.zza()) {
                    throw e10;
                }
                gc0 = new GC0(j(c3962jG0), C1703Ey0.a());
                z9 = true;
            }
            if (SB0.f23148a.zza() && !k(c3962jG0.m0())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z10 = true;
            int iM0 = c3962jG0.m0();
            if (iF0 != c4088kG0.d0()) {
                z10 = false;
            }
            arrayList.add(new C5309ty0(gc0, iM0, iF0, z10, z9, C5309ty0.f33518h, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final C5561vy0 i() {
        C5561vy0 c5561vy0 = this.f34203c;
        return c5561vy0 == null ? this : c5561vy0;
    }

    private static C5467vD0 j(C3962jG0 c3962jG0) {
        return C5467vD0.a(c3962jG0.e0().d0(), c3962jG0.e0().e0(), c3962jG0.e0().f0(), c3962jG0.g0(), c3962jG0.g0() == EnumC5725xG0.RAW ? null : Integer.valueOf(c3962jG0.f0()));
    }

    private static boolean k(int i10) {
        int i11 = i10 - 2;
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    final C4088kG0 b() {
        try {
            C3712hG0 c3712hG0J0 = C4088kG0.j0();
            for (C5309ty0 c5309ty0 : this.f34201a) {
                AbstractC4050jy0 abstractC4050jy0A = c5309ty0.a();
                int iJ = c5309ty0.j();
                int iC = c5309ty0.c();
                C5467vD0 c5467vD0 = (C5467vD0) ZC0.a().h(abstractC4050jy0A, C5467vD0.class, C1703Ey0.a());
                Integer numB = abstractC4050jy0A.b();
                if (numB != null && numB.intValue() != iC) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                C3838iG0 c3838iG0H0 = C3962jG0.h0();
                ZF0 zf0G0 = C2958bG0.g0();
                zf0G0.A(c5467vD0.g());
                zf0G0.B(c5467vD0.c());
                zf0G0.C(c5467vD0.d());
                c3838iG0H0.B(zf0G0);
                c3838iG0H0.E(iJ);
                c3838iG0H0.C(iC);
                c3838iG0H0.D(c5467vD0.e());
                c3712hG0J0.B((C3962jG0) c3838iG0H0.w());
                if (c5309ty0.d()) {
                    c3712hG0J0.A(c5309ty0.c());
                }
            }
            return (C4088kG0) c3712hG0J0.w();
        } catch (GeneralSecurityException e10) {
            throw new GD0(e10);
        }
    }

    public final C5309ty0 c() {
        for (C5309ty0 c5309ty0 : this.f34201a) {
            if (c5309ty0 != null && c5309ty0.d()) {
                if (c5309ty0.b() == C4428my0.f31625b) {
                    return c5309ty0;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public final C5309ty0 d(int i10) {
        if (i10 < 0 || i10 >= zzd()) {
            int iZzd = zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 34 + String.valueOf(iZzd).length());
            sb.append("Invalid index ");
            sb.append(i10);
            sb.append(" for keyset of size ");
            sb.append(iZzd);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        List list = this.f34201a;
        C5309ty0 c5309ty0 = (C5309ty0) list.get(i10);
        if (!k(c5309ty0.j())) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 42);
            sb2.append("Keyset-Entry at position ");
            sb2.append(i10);
            sb2.append(" has wrong status");
            throw new IllegalStateException(sb2.toString());
        }
        if (!c5309ty0.i()) {
            return (C5309ty0) list.get(i10);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 48);
        sb3.append("Keyset-Entry at position ");
        sb3.append(i10);
        sb3.append(" didn't parse correctly");
        throw new IllegalStateException(sb3.toString());
    }

    public final Object f(AbstractC3674gy0 abstractC3674gy0, Class cls) throws GeneralSecurityException {
        if (!(abstractC3674gy0 instanceof AbstractC4584oC0)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        AbstractC4584oC0 abstractC4584oC0 = (AbstractC4584oC0) abstractC3674gy0;
        C4088kG0 c4088kG0B = i().b();
        int i10 = AbstractC1859Hy0.f19423a;
        int iD0 = c4088kG0B.d0();
        boolean z9 = true;
        int i11 = 0;
        boolean z10 = false;
        for (C3962jG0 c3962jG0 : c4088kG0B.e0()) {
            if (c3962jG0.m0() == 3) {
                if (!c3962jG0.d0()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c3962jG0.f0())));
                }
                if (c3962jG0.g0() == EnumC5725xG0.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c3962jG0.f0())));
                }
                if (c3962jG0.m0() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c3962jG0.f0())));
                }
                if (c3962jG0.f0() == iD0) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z9 &= c3962jG0.e0().f0() == EnumC2832aG0.ASYMMETRIC_PUBLIC;
                i11++;
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z9) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i12 = 0; i12 < zzd(); i12++) {
            List list = this.f34201a;
            if (((C5309ty0) list.get(i12)).i() || !k(((C5309ty0) list.get(i12)).j())) {
                String strD0 = c4088kG0B.g0(i12).e0().d0();
                StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 44 + String.valueOf(strD0).length() + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i12);
                sb.append(" and type_url ");
                sb.append(strD0);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return abstractC4584oC0.a(i(), this.f34202b, cls);
    }

    public final String toString() {
        C4088kG0 c4088kG0B = b();
        int i10 = AbstractC1859Hy0.f19423a;
        C4214lG0 c4214lG0D0 = C4592oG0.d0();
        c4214lG0D0.A(c4088kG0B.d0());
        for (C3962jG0 c3962jG0 : c4088kG0B.e0()) {
            C4340mG0 c4340mG0D0 = C4466nG0.d0();
            c4340mG0D0.A(c3962jG0.e0().d0());
            c4340mG0D0.D(c3962jG0.m0());
            c4340mG0D0.C(c3962jG0.g0());
            c4340mG0D0.B(c3962jG0.f0());
            c4214lG0D0.B((C4466nG0) c4340mG0D0.w());
        }
        return ((C4592oG0) c4214lG0D0.w()).toString();
    }

    @Override // com.google.android.gms.internal.ads.BC0
    public final int zzd() {
        return this.f34201a.size();
    }

    /* synthetic */ C5561vy0(List list, JC0 jc0, byte[] bArr) {
        this(list, jc0);
    }

    private C5561vy0(List list, JC0 jc0) throws GeneralSecurityException {
        this.f34201a = list;
        this.f34202b = jc0;
        if (SB0.f23148a.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean zD = false;
            while (it.hasNext()) {
                C5309ty0 c5309ty0 = (C5309ty0) it.next();
                if (!hashSet.contains(Integer.valueOf(c5309ty0.c()))) {
                    hashSet.add(Integer.valueOf(c5309ty0.c()));
                    zD |= c5309ty0.d();
                } else {
                    int iC = c5309ty0.c();
                    StringBuilder sb = new StringBuilder(String.valueOf(iC).length() + 121);
                    sb.append("KeyID ");
                    sb.append(iC);
                    sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            if (!zD) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.f34203c = null;
    }
}
