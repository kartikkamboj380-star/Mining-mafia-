package com.google.android.gms.internal.auth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6091h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C6091h1 f36030c = new C6091h1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f36032b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6103l1 f36031a = new S0();

    private C6091h1() {
    }

    public static C6091h1 a() {
        return f36030c;
    }

    public final InterfaceC6100k1 b(Class cls) {
        G0.c(cls, "messageType");
        InterfaceC6100k1 interfaceC6100k1 = (InterfaceC6100k1) this.f36032b.get(cls);
        if (interfaceC6100k1 != null) {
            return interfaceC6100k1;
        }
        InterfaceC6100k1 interfaceC6100k1Zza = this.f36031a.zza(cls);
        G0.c(cls, "messageType");
        InterfaceC6100k1 interfaceC6100k2 = (InterfaceC6100k1) this.f36032b.putIfAbsent(cls, interfaceC6100k1Zza);
        return interfaceC6100k2 == null ? interfaceC6100k1Zza : interfaceC6100k2;
    }
}
