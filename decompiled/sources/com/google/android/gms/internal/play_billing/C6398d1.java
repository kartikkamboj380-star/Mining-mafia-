package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6398d1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C6398d1 f37202c = new C6398d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f37204b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6414h1 f37203a = new N0();

    private C6398d1() {
    }

    public static C6398d1 a() {
        return f37202c;
    }

    public final InterfaceC6410g1 b(Class cls) {
        AbstractC6480y0.c(cls, "messageType");
        InterfaceC6410g1 interfaceC6410g1 = (InterfaceC6410g1) this.f37204b.get(cls);
        if (interfaceC6410g1 != null) {
            return interfaceC6410g1;
        }
        InterfaceC6410g1 interfaceC6410g1Zza = this.f37203a.zza(cls);
        AbstractC6480y0.c(cls, "messageType");
        InterfaceC6410g1 interfaceC6410g2 = (InterfaceC6410g1) this.f37204b.putIfAbsent(cls, interfaceC6410g1Zza);
        return interfaceC6410g2 == null ? interfaceC6410g1Zza : interfaceC6410g2;
    }
}
