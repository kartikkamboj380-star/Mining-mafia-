package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PC0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC5213tC0 f22060b = OC0.f21493a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final PC0 f22061c = d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f22062d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f22063a = new HashMap();

    public static PC0 a() {
        return f22061c;
    }

    private static PC0 d() {
        PC0 pc0 = new PC0();
        try {
            pc0.b(f22060b, HC0.class);
            return pc0;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    private final synchronized AbstractC4050jy0 e(AbstractC1495Ay0 abstractC1495Ay0, Integer num) {
        InterfaceC5213tC0 interfaceC5213tC0;
        interfaceC5213tC0 = (InterfaceC5213tC0) this.f22063a.get(abstractC1495Ay0.getClass());
        if (interfaceC5213tC0 == null) {
            String string = abstractC1495Ay0.toString();
            StringBuilder sb = new StringBuilder(string.length() + 86);
            sb.append("Cannot create a new key for parameters ");
            sb.append(string);
            sb.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb.toString());
        }
        return interfaceC5213tC0.a(abstractC1495Ay0, num);
    }

    public final synchronized void b(InterfaceC5213tC0 interfaceC5213tC0, Class cls) {
        try {
            Map map = this.f22063a;
            InterfaceC5213tC0 interfaceC5213tC1 = (InterfaceC5213tC0) map.get(cls);
            if (interfaceC5213tC1 != null && !interfaceC5213tC1.equals(interfaceC5213tC0)) {
                String string = cls.toString();
                StringBuilder sb = new StringBuilder(string.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(string);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            map.put(cls, interfaceC5213tC0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final AbstractC4050jy0 c(AbstractC1495Ay0 abstractC1495Ay0, Integer num) {
        return e(abstractC1495Ay0, num);
    }
}
