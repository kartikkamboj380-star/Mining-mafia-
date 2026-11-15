package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6342v extends AbstractC6351w {
    public C6342v() {
        this.f36930a.add(M.BITWISE_AND);
        this.f36930a.add(M.BITWISE_LEFT_SHIFT);
        this.f36930a.add(M.BITWISE_NOT);
        this.f36930a.add(M.BITWISE_OR);
        this.f36930a.add(M.BITWISE_RIGHT_SHIFT);
        this.f36930a.add(M.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f36930a.add(M.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6351w
    public final InterfaceC6289p a(String str, C6157a2 c6157a2, List list) {
        M m10 = M.ADD;
        switch (B2.e(str).ordinal()) {
            case 4:
                B2.a(M.BITWISE_AND.name(), 2, list);
                return new C6226i(Double.valueOf(B2.g(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue()) & B2.g(c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue())));
            case 5:
                B2.a(M.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C6226i(Double.valueOf(B2.g(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue()) << ((int) (B2.h(c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue()) & 31))));
            case 6:
                B2.a(M.BITWISE_NOT.name(), 1, list);
                return new C6226i(Double.valueOf(~B2.g(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue())));
            case 7:
                B2.a(M.BITWISE_OR.name(), 2, list);
                return new C6226i(Double.valueOf(B2.g(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue()) | B2.g(c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue())));
            case 8:
                B2.a(M.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C6226i(Double.valueOf(B2.g(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue()) >> ((int) (B2.h(c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue()) & 31))));
            case 9:
                B2.a(M.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C6226i(Double.valueOf(B2.h(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue()) >>> ((int) (B2.h(c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue()) & 31))));
            case 10:
                B2.a(M.BITWISE_XOR.name(), 2, list);
                return new C6226i(Double.valueOf(B2.g(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue()) ^ B2.g(c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue())));
            default:
                return super.b(str);
        }
    }
}
