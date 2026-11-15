package com.google.android.gms.internal.measurement;

import com.google.protobuf.DescriptorProtos;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC6351w {
    protected J() {
        this.f36930a.add(M.ADD);
        this.f36930a.add(M.DIVIDE);
        this.f36930a.add(M.MODULUS);
        this.f36930a.add(M.MULTIPLY);
        this.f36930a.add(M.NEGATE);
        this.f36930a.add(M.POST_DECREMENT);
        this.f36930a.add(M.POST_INCREMENT);
        this.f36930a.add(M.PRE_DECREMENT);
        this.f36930a.add(M.PRE_INCREMENT);
        this.f36930a.add(M.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6351w
    public final InterfaceC6289p a(String str, C6157a2 c6157a2, List list) {
        M m10 = M.ADD;
        int iOrdinal = B2.e(str).ordinal();
        if (iOrdinal == 0) {
            B2.a(M.ADD.name(), 2, list);
            InterfaceC6289p interfaceC6289pA = c6157a2.a((InterfaceC6289p) list.get(0));
            InterfaceC6289p interfaceC6289pA2 = c6157a2.a((InterfaceC6289p) list.get(1));
            if (!(interfaceC6289pA instanceof InterfaceC6253l) && !(interfaceC6289pA instanceof C6324t) && !(interfaceC6289pA2 instanceof InterfaceC6253l) && !(interfaceC6289pA2 instanceof C6324t)) {
                return new C6226i(Double.valueOf(interfaceC6289pA.zzd().doubleValue() + interfaceC6289pA2.zzd().doubleValue()));
            }
            return new C6324t(String.valueOf(interfaceC6289pA.zzc()).concat(String.valueOf(interfaceC6289pA2.zzc())));
        }
        if (iOrdinal == 21) {
            B2.a(M.DIVIDE.name(), 2, list);
            return new C6226i(Double.valueOf(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue() / c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue()));
        }
        if (iOrdinal == 59) {
            B2.a(M.SUBTRACT.name(), 2, list);
            return new C6226i(Double.valueOf(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue() + new C6226i(Double.valueOf(-c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue())).zzd().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            B2.a(str, 2, list);
            InterfaceC6289p interfaceC6289pA3 = c6157a2.a((InterfaceC6289p) list.get(0));
            c6157a2.a((InterfaceC6289p) list.get(1));
            return interfaceC6289pA3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            B2.a(str, 1, list);
            return c6157a2.a((InterfaceC6289p) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                B2.a(M.MODULUS.name(), 2, list);
                return new C6226i(Double.valueOf(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue() % c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue()));
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                B2.a(M.MULTIPLY.name(), 2, list);
                return new C6226i(Double.valueOf(c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue() * c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue()));
            case 46:
                B2.a(M.NEGATE.name(), 1, list);
                return new C6226i(Double.valueOf(-c6157a2.a((InterfaceC6289p) list.get(0)).zzd().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
