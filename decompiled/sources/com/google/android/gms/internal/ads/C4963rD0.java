package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4963rD0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32860b;

    /* synthetic */ C4963rD0(C4586oD0 c4586oD0, byte[] bArr) {
        this.f32859a = new HashMap(c4586oD0.d());
        this.f32860b = new HashMap(c4586oD0.e());
    }

    public static C4586oD0 a() {
        return new C4586oD0(null);
    }

    public final Object b(AbstractC4050jy0 abstractC4050jy0, Class cls) throws GeneralSecurityException {
        C4712pD0 c4712pD0 = new C4712pD0(abstractC4050jy0.getClass(), cls, null);
        Map map = this.f32859a;
        if (map.containsKey(c4712pD0)) {
            return ((AbstractC4460nD0) map.get(c4712pD0)).a(abstractC4050jy0);
        }
        String string = c4712pD0.toString();
        StringBuilder sb = new StringBuilder(string.length() + 102);
        sb.append("No PrimitiveConstructor for ");
        sb.append(string);
        sb.append(" available, see https://developers.google.com/tink/faq/registration_errors");
        throw new GeneralSecurityException(sb.toString());
    }

    public final Object c(BC0 bc0, JC0 jc0, Class cls) throws GeneralSecurityException {
        Map map = this.f32860b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        final InterfaceC5341uD0 interfaceC5341uD0 = (InterfaceC5341uD0) map.get(cls);
        return interfaceC5341uD0.a(bc0, jc0, new InterfaceC5089sD0() { // from class: com.google.android.gms.internal.ads.qD0
            @Override // com.google.android.gms.internal.ads.InterfaceC5089sD0
            public final /* synthetic */ Object a(C5309ty0 c5309ty0) {
                return this.f32602a.b(c5309ty0.a(), interfaceC5341uD0.zzb());
            }
        });
    }

    final /* synthetic */ Map d() {
        return this.f32859a;
    }

    final /* synthetic */ Map e() {
        return this.f32860b;
    }
}
