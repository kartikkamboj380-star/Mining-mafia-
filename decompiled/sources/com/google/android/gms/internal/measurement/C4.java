package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class C4 extends C6262m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6172c f36257b;

    public C4(C6172c c6172c) {
        this.f36257b = c6172c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    @Override // com.google.android.gms.internal.measurement.C6262m, com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p e(String str, C6157a2 c6157a2, List list) {
        byte b10;
        switch (str) {
            case "getEventName":
                b10 = 0;
                break;
            case "getTimestamp":
                b10 = 3;
                break;
            case "getParamValue":
                b10 = 1;
                break;
            case "getParams":
                b10 = 2;
                break;
            case "setParamValue":
                b10 = 5;
                break;
            case "setEventName":
                b10 = 4;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            B2.a("getEventName", 0, list);
            return new C6324t(this.f36257b.c().b());
        }
        if (b10 == 1) {
            B2.a("getParamValue", 1, list);
            return AbstractC6176c3.a(this.f36257b.c().e(c6157a2.a((InterfaceC6289p) list.get(0)).zzc()));
        }
        if (b10 == 2) {
            B2.a("getParams", 0, list);
            Map mapF = this.f36257b.c().f();
            C6262m c6262m = new C6262m();
            for (String str2 : mapF.keySet()) {
                c6262m.d(str2, AbstractC6176c3.a(mapF.get(str2)));
            }
            return c6262m;
        }
        if (b10 == 3) {
            B2.a("getTimestamp", 0, list);
            return new C6226i(Double.valueOf(this.f36257b.c().a()));
        }
        if (b10 != 4) {
            if (b10 != 5) {
                return super.e(str, c6157a2, list);
            }
            B2.a("setParamValue", 2, list);
            String strZzc = c6157a2.a((InterfaceC6289p) list.get(0)).zzc();
            InterfaceC6289p interfaceC6289pA = c6157a2.a((InterfaceC6289p) list.get(1));
            this.f36257b.c().d(strZzc, B2.j(interfaceC6289pA));
            return interfaceC6289pA;
        }
        B2.a("setEventName", 1, list);
        InterfaceC6289p interfaceC6289pA2 = c6157a2.a((InterfaceC6289p) list.get(0));
        if (InterfaceC6289p.f36808x.equals(interfaceC6289pA2) || InterfaceC6289p.f36809y.equals(interfaceC6289pA2)) {
            throw new IllegalArgumentException("Illegal event name");
        }
        this.f36257b.c().c(interfaceC6289pA2.zzc());
        return new C6324t(interfaceC6289pA2.zzc());
    }
}
