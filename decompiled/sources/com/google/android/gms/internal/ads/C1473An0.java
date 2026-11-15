package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.An0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1473An0 extends AbstractC1681En0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Long f17404i = -1L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final EnumC2894al0 f17405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f17406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f17407h;

    C1473An0(C1966Ka c1966Ka, InterfaceC2718Ym0 interfaceC2718Ym0, EnumC2894al0 enumC2894al0, Context context, Map map, C5043rr0 c5043rr0) {
        super("cNPndN+EzA0ppawmtlMhouOhZ8up9MCZv7/NNjE52JSJNgkl5UKlR5xuXAGt5rDT", "maxrbwgAVilcsYV2zOy8o/EZWuXXlpXIbHDx2rc0DB0=", c1966Ka, interfaceC2718Ym0, c5043rr0.a(121));
        this.f17405f = enumC2894al0;
        this.f17406g = context;
        this.f17407h = map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1681En0
    protected final void a(Method method, C1966Ka c1966Ka) {
        EnumC2894al0 enumC2894al0 = this.f17405f;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(enumC2894al0.ordinal()), this.f17406g, AbstractC2210Os0.a(this.f17407h.get("up"), Boolean.TRUE));
        objArr.getClass();
        synchronized (c1966Ka) {
            try {
                if (enumC2894al0 == EnumC2894al0.QUERY) {
                    Object obj = objArr[0];
                    Long l10 = f17404i;
                    c1966Ka.F0(((Long) AbstractC2210Os0.a(obj, l10)).longValue());
                    c1966Ka.G0(((Long) AbstractC2210Os0.a(objArr[1], l10)).longValue());
                }
                c1966Ka.v0(((Long) objArr[2]).longValue());
                c1966Ka.V(((Long) objArr[3]).longValue());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
