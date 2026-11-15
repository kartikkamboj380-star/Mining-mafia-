package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: loaded from: classes2.dex */
public final class R30 implements InterfaceC3065c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f22694a;

    private R30(Integer num) {
        this.f22694a = num;
    }

    static /* synthetic */ R30 a(L4.a aVar) {
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.zb)).booleanValue()) {
            return new R30(null);
        }
        G4.t.g();
        int extensionVersion = 0;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Cb)).booleanValue()) {
                    if (aVar.f3099c >= ((Integer) H4.B.c().d(AbstractC3892ii.Bb)).intValue() && i10 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (Exception e10) {
            G4.t.l().j(e10, "AdUtil.getAdServicesExtensionVersion");
        }
        return new R30(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065c70
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.f22694a;
        AF af = (AF) obj;
        if (num != null) {
            af.f17275a.putInt("aos", num.intValue());
        }
    }
}
