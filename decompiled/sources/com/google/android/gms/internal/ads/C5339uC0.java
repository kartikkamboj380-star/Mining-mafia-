package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5339uC0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f33749c = Logger.getLogger(C5339uC0.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C5339uC0 f33750d = new C5339uC0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f33751a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f33752b = new ConcurrentHashMap();

    public static C5339uC0 a() {
        return f33750d;
    }

    private final synchronized InterfaceC4302ly0 g(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.f33751a;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (InterfaceC4302ly0) concurrentMap.get(str);
    }

    private final synchronized void h(InterfaceC4302ly0 interfaceC4302ly0, boolean z9, boolean z10) {
        try {
            String strZzb = interfaceC4302ly0.zzb();
            if (z10) {
                ConcurrentMap concurrentMap = this.f33752b;
                if (concurrentMap.containsKey(strZzb) && !((Boolean) concurrentMap.get(strZzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
                }
            }
            ConcurrentMap concurrentMap2 = this.f33751a;
            InterfaceC4302ly0 interfaceC4302ly1 = (InterfaceC4302ly0) concurrentMap2.get(strZzb);
            if (interfaceC4302ly1 != null && !interfaceC4302ly1.getClass().equals(interfaceC4302ly0.getClass())) {
                f33749c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzb, interfaceC4302ly1.getClass().getName(), interfaceC4302ly0.getClass().getName()));
            }
            concurrentMap2.putIfAbsent(strZzb, interfaceC4302ly0);
            this.f33752b.put(strZzb, Boolean.valueOf(z10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(InterfaceC4302ly0 interfaceC4302ly0, boolean z9) {
        f(interfaceC4302ly0, 1, z9);
    }

    public final InterfaceC4302ly0 c(String str, Class cls) throws GeneralSecurityException {
        InterfaceC4302ly0 interfaceC4302ly0G = g(str);
        if (interfaceC4302ly0G.zzc().equals(cls)) {
            return interfaceC4302ly0G;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(interfaceC4302ly0G.getClass());
        String string = interfaceC4302ly0G.zzc().toString();
        StringBuilder sb = new StringBuilder(name.length() + 53 + strValueOf.length() + 23 + string.length());
        sb.append("Primitive type ");
        sb.append(name);
        sb.append(" not supported by key manager of type ");
        sb.append(strValueOf);
        sb.append(", which only supports: ");
        sb.append(string);
        throw new GeneralSecurityException(sb.toString());
    }

    public final InterfaceC4302ly0 d(String str) {
        return g(str);
    }

    public final boolean e(String str) {
        return ((Boolean) this.f33752b.get(str)).booleanValue();
    }

    public final synchronized void f(InterfaceC4302ly0 interfaceC4302ly0, int i10, boolean z9) {
        if (!UB0.a(i10)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        h(interfaceC4302ly0, false, z9);
    }
}
