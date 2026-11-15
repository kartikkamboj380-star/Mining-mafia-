package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1733Fn0 extends AbstractC1681En0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f18841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final EnumC2894al0 f18842g;

    C1733Fn0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, EnumC2894al0 enumC2894al0, Map map, C5043rr0 c5043rr0) {
        super("+PmnicIB6Ggxqdcyc5KXYWsM1j/GXRihAyryrcphzvI3AMIT+uhHMqbkBoIk/Q9k", "+zCNZC90FxKlnODut7cZO0wgbMEddS2/rBQzUBv6at4=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(122));
        this.f18841f = map;
        this.f18842g = enumC2894al0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = this.f18841f;
        lArr[0] = (Long) AbstractC2210Os0.a((Long) map.get("tcq"), -1L);
        lArr[1] = (Long) AbstractC2210Os0.a((Long) map.get("tpq"), -1L);
        lArr[2] = (Long) AbstractC2210Os0.a((Long) map.get("tcv"), -1L);
        lArr[3] = (Long) AbstractC2210Os0.a((Long) map.get("tpv"), -1L);
        lArr[4] = (Long) AbstractC2210Os0.a((Long) map.get("tchv"), -1L);
        lArr[5] = (Long) AbstractC2210Os0.a((Long) map.get("tphv"), -1L);
        lArr[6] = (Long) AbstractC2210Os0.a((Long) map.get("tcc"), -1L);
        lArr[7] = (Long) AbstractC2210Os0.a((Long) map.get("tpc"), -1L);
        lArr[8] = (Long) AbstractC2210Os0.a((Long) map.get("tst"), -1L);
        for (int i10 = 0; i10 < 9; i10++) {
            if (lArr[i10] == null) {
                lArr[i10] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.f18842g.ordinal()));
        lArr2.getClass();
        synchronized (c1966Ka) {
            c1966Ka.i0(lArr2[0].longValue());
            c1966Ka.H0(lArr2[1].longValue());
            c1966Ka.C0(lArr2[2].longValue());
            c1966Ka.z0(lArr2[3].longValue());
            c1966Ka.d0(lArr2[4].longValue());
            c1966Ka.e0(lArr2[5].longValue());
            c1966Ka.F(lArr2[6].longValue());
            c1966Ka.G(lArr2[7].longValue());
        }
    }
}
