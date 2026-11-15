package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4586oD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32010b;

    /* synthetic */ C4586oD0(C4963rD0 c4963rD0, byte[] bArr) {
        this.f32009a = new HashMap(c4963rD0.d());
        this.f32010b = new HashMap(c4963rD0.e());
    }

    public final C4586oD0 a(AbstractC4460nD0 abstractC4460nD0) throws GeneralSecurityException {
        if (abstractC4460nD0 == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        C4712pD0 c4712pD0 = new C4712pD0(abstractC4460nD0.b(), abstractC4460nD0.c(), null);
        Map map = this.f32009a;
        if (!map.containsKey(c4712pD0)) {
            map.put(c4712pD0, abstractC4460nD0);
            return this;
        }
        AbstractC4460nD0 abstractC4460nD1 = (AbstractC4460nD0) map.get(c4712pD0);
        if (abstractC4460nD1.equals(abstractC4460nD0) && abstractC4460nD0.equals(abstractC4460nD1)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(c4712pD0.toString()));
    }

    public final C4586oD0 b(InterfaceC5341uD0 interfaceC5341uD0) throws GeneralSecurityException {
        Map map = this.f32010b;
        Class clsZza = interfaceC5341uD0.zza();
        if (!map.containsKey(clsZza)) {
            map.put(clsZza, interfaceC5341uD0);
            return this;
        }
        InterfaceC5341uD0 interfaceC5341uD1 = (InterfaceC5341uD0) map.get(clsZza);
        if (interfaceC5341uD1.equals(interfaceC5341uD0) && interfaceC5341uD0.equals(interfaceC5341uD1)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
    }

    public final C4963rD0 c() {
        return new C4963rD0(this, null);
    }

    final /* synthetic */ Map d() {
        return this.f32009a;
    }

    final /* synthetic */ Map e() {
        return this.f32010b;
    }

    /* synthetic */ C4586oD0(byte[] bArr) {
        this.f32009a = new HashMap();
        this.f32010b = new HashMap();
    }
}
