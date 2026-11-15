package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ad0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2878ad0 implements InterfaceC3732hQ0 {
    public static C2878ad0 a() {
        return AbstractC2750Zc0.f26257a;
    }

    public static InterfaceExecutorServiceC1805Gx0 b() {
        InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29596J6)).booleanValue()) {
            interfaceExecutorServiceC1805Gx0 = AbstractC2315Qt.f22475c;
        } else {
            interfaceExecutorServiceC1805Gx0 = ((Boolean) H4.B.c().d(AbstractC3892ii.f29586I6)).booleanValue() ? AbstractC2315Qt.f22473a : AbstractC2315Qt.f22478f;
        }
        AbstractC4738pQ0.b(interfaceExecutorServiceC1805Gx0);
        return interfaceExecutorServiceC1805Gx0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return b();
    }
}
