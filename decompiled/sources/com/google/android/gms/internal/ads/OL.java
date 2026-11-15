package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class OL implements InterfaceC5088sD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f21508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f21509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f21510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC5493vQ0 f21511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final YM f21512e;

    OL(Map map, Map map2, Map map3, InterfaceC5493vQ0 interfaceC5493vQ0, YM ym) {
        this.f21508a = map;
        this.f21509b = map2;
        this.f21510c = map3;
        this.f21511d = interfaceC5493vQ0;
        this.f21512e = ym;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5088sD
    public final InterfaceC4375mY a(int i10, String str) {
        InterfaceC4375mY interfaceC4375mYA;
        InterfaceC4375mY interfaceC4375mY = (InterfaceC4375mY) this.f21508a.get(str);
        if (interfaceC4375mY != null) {
            return interfaceC4375mY;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            InterfaceC5384uZ interfaceC5384uZ = (InterfaceC5384uZ) this.f21510c.get(str);
            if (interfaceC5384uZ != null) {
                return C5718xD.a(interfaceC5384uZ);
            }
            interfaceC4375mYA = (InterfaceC4375mY) this.f21509b.get(str);
            if (interfaceC4375mYA == null) {
                return null;
            }
        } else if (this.f21512e.d() == null || (interfaceC4375mYA = ((InterfaceC5088sD) this.f21511d.zzb()).a(i10, str)) == null) {
            return null;
        }
        return C5718xD.b(interfaceC4375mYA);
    }
}
