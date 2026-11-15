package p085i4;

import B4.C0564a;
import B4.t;
import com.google.android.gms.ads.MobileAds;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static C0564a a(int i10, String str) {
        return new C0564a(i10, str, "com.google.ads.mediation.pangle");
    }

    public static C0564a b() {
        return new C0564a(103, "MobileAds.getRequestConfiguration() indicates the user is a child. Pangle SDK V71 or higher does not support child users.", "com.google.ads.mediation.pangle");
    }

    public static C0564a c(int i10, String str) {
        return new C0564a(i10, str, "com.pangle.ads");
    }

    public static boolean d() {
        t requestConfiguration = MobileAds.getRequestConfiguration();
        return requestConfiguration.c() == 1 || requestConfiguration.d() == 1;
    }
}
