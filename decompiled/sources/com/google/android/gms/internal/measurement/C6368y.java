package com.google.android.gms.internal.measurement;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.protobuf.DescriptorProtos;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6368y extends AbstractC6351w {
    public C6368y() {
        this.f36930a.add(M.EQUALS);
        this.f36930a.add(M.GREATER_THAN);
        this.f36930a.add(M.GREATER_THAN_EQUALS);
        this.f36930a.add(M.IDENTITY_EQUALS);
        this.f36930a.add(M.IDENTITY_NOT_EQUALS);
        this.f36930a.add(M.LESS_THAN);
        this.f36930a.add(M.LESS_THAN_EQUALS);
        this.f36930a.add(M.NOT_EQUALS);
    }

    private static boolean c(InterfaceC6289p interfaceC6289p, InterfaceC6289p interfaceC6289p2) {
        if (interfaceC6289p instanceof InterfaceC6253l) {
            interfaceC6289p = new C6324t(interfaceC6289p.zzc());
        }
        if (interfaceC6289p2 instanceof InterfaceC6253l) {
            interfaceC6289p2 = new C6324t(interfaceC6289p2.zzc());
        }
        if ((interfaceC6289p instanceof C6324t) && (interfaceC6289p2 instanceof C6324t)) {
            return interfaceC6289p.zzc().compareTo(interfaceC6289p2.zzc()) < 0;
        }
        double dDoubleValue = interfaceC6289p.zzd().doubleValue();
        double dDoubleValue2 = interfaceC6289p2.zzd().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean d(InterfaceC6289p interfaceC6289p, InterfaceC6289p interfaceC6289p2) {
        if (interfaceC6289p.getClass().equals(interfaceC6289p2.getClass())) {
            if ((interfaceC6289p instanceof C6333u) || (interfaceC6289p instanceof C6271n)) {
                return true;
            }
            if (interfaceC6289p instanceof C6226i) {
                return (Double.isNaN(interfaceC6289p.zzd().doubleValue()) || Double.isNaN(interfaceC6289p2.zzd().doubleValue()) || interfaceC6289p.zzd().doubleValue() != interfaceC6289p2.zzd().doubleValue()) ? false : true;
            }
            if (interfaceC6289p instanceof C6324t) {
                return interfaceC6289p.zzc().equals(interfaceC6289p2.zzc());
            }
            if (interfaceC6289p instanceof C6208g) {
                return interfaceC6289p.zze().equals(interfaceC6289p2.zze());
            }
            return interfaceC6289p == interfaceC6289p2;
        }
        if (((interfaceC6289p instanceof C6333u) || (interfaceC6289p instanceof C6271n)) && ((interfaceC6289p2 instanceof C6333u) || (interfaceC6289p2 instanceof C6271n))) {
            return true;
        }
        boolean z9 = interfaceC6289p instanceof C6226i;
        if (z9 && (interfaceC6289p2 instanceof C6324t)) {
            return d(interfaceC6289p, new C6226i(interfaceC6289p2.zzd()));
        }
        boolean z10 = interfaceC6289p instanceof C6324t;
        if (z10 && (interfaceC6289p2 instanceof C6226i)) {
            return d(new C6226i(interfaceC6289p.zzd()), interfaceC6289p2);
        }
        if (interfaceC6289p instanceof C6208g) {
            return d(new C6226i(interfaceC6289p.zzd()), interfaceC6289p2);
        }
        if (interfaceC6289p2 instanceof C6208g) {
            return d(interfaceC6289p, new C6226i(interfaceC6289p2.zzd()));
        }
        if ((z10 || z9) && (interfaceC6289p2 instanceof InterfaceC6253l)) {
            return d(interfaceC6289p, new C6324t(interfaceC6289p2.zzc()));
        }
        if ((interfaceC6289p instanceof InterfaceC6253l) && ((interfaceC6289p2 instanceof C6324t) || (interfaceC6289p2 instanceof C6226i))) {
            return d(new C6324t(interfaceC6289p.zzc()), interfaceC6289p2);
        }
        return false;
    }

    private static boolean e(InterfaceC6289p interfaceC6289p, InterfaceC6289p interfaceC6289p2) {
        if (interfaceC6289p instanceof InterfaceC6253l) {
            interfaceC6289p = new C6324t(interfaceC6289p.zzc());
        }
        if (interfaceC6289p2 instanceof InterfaceC6253l) {
            interfaceC6289p2 = new C6324t(interfaceC6289p2.zzc());
        }
        return (((interfaceC6289p instanceof C6324t) && (interfaceC6289p2 instanceof C6324t)) || !(Double.isNaN(interfaceC6289p.zzd().doubleValue()) || Double.isNaN(interfaceC6289p2.zzd().doubleValue()))) && !c(interfaceC6289p2, interfaceC6289p);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6351w
    public final InterfaceC6289p a(String str, C6157a2 c6157a2, List list) {
        boolean zD;
        boolean zD2;
        B2.a(B2.e(str).name(), 2, list);
        InterfaceC6289p interfaceC6289pA = c6157a2.a((InterfaceC6289p) list.get(0));
        InterfaceC6289p interfaceC6289pA2 = c6157a2.a((InterfaceC6289p) list.get(1));
        int iOrdinal = B2.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zD2 = d(interfaceC6289pA, interfaceC6289pA2);
            } else if (iOrdinal == 42) {
                zD = c(interfaceC6289pA, interfaceC6289pA2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        zD = c(interfaceC6289pA2, interfaceC6289pA);
                        break;
                    case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                        zD = e(interfaceC6289pA2, interfaceC6289pA);
                        break;
                    case 39:
                        zD = B2.f(interfaceC6289pA, interfaceC6289pA2);
                        break;
                    case 40:
                        zD2 = B2.f(interfaceC6289pA, interfaceC6289pA2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                zD = e(interfaceC6289pA, interfaceC6289pA2);
            }
            zD = !zD2;
        } else {
            zD = d(interfaceC6289pA, interfaceC6289pA2);
        }
        return zD ? InterfaceC6289p.f36805C : InterfaceC6289p.f36806D;
    }
}
