package com.google.android.gms.internal.ads;

import Q4.AbstractC0928c;
import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2700Yd0 {
    static InterfaceC2700Yd0 f(Context context, int i10) {
        boolean zBooleanValue;
        if (RunnableC4262le0.a()) {
            int i11 = i10 - 2;
            if (i11 == 20 || i11 == 21) {
                zBooleanValue = ((Boolean) AbstractC3140cj.f27186e.e()).booleanValue();
            } else if (i11 != 110) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) AbstractC3140cj.f27184c.e()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) AbstractC3140cj.f27185d.e()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) AbstractC3140cj.f27183b.e()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) H4.B.c().d(AbstractC3892ii.na)).booleanValue();
            }
            if (zBooleanValue) {
                return new C2880ae0(context, i10);
            }
        }
        return new C1559Ce0();
    }

    static InterfaceC2700Yd0 g(Context context, int i10, int i11, H4.h2 h2Var) {
        InterfaceC2700Yd0 interfaceC2700Yd0F = f(context, i10);
        if (interfaceC2700Yd0F instanceof C2880ae0) {
            interfaceC2700Yd0F.zza();
            interfaceC2700Yd0F.h(i11);
            interfaceC2700Yd0F.b(AbstractC0928c.d(h2Var.f1303m));
            String str = h2Var.f1278G;
            if (AbstractC3760he0.a(str)) {
                interfaceC2700Yd0F.k(str);
            }
        }
        return interfaceC2700Yd0F;
    }

    InterfaceC2700Yd0 M(String str);

    InterfaceC2700Yd0 N(boolean z9);

    InterfaceC2700Yd0 Q(String str);

    InterfaceC2700Yd0 a(Throwable th);

    InterfaceC2700Yd0 b(EnumC4514ne0 enumC4514ne0);

    InterfaceC2700Yd0 c(H4.Z0 z9);

    InterfaceC2700Yd0 d(C4886qb0 c4886qb0);

    C3006be0 e();

    InterfaceC2700Yd0 h(int i10);

    InterfaceC2700Yd0 k(String str);

    InterfaceC2700Yd0 zza();

    boolean zzb();

    InterfaceC2700Yd0 zzc();

    boolean zzl();
}
