package com.appsflyer.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1iSDK implements AFj1gSDK {
    @Override // com.appsflyer.internal.AFj1gSDK
    @NotNull
    public final String getRevenue() {
        Object objB;
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            Field declaredField = p222w1.a.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.d(obj, "");
            objB = p129m8.m.b((String) obj);
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            objB = p129m8.m.b(p129m8.n.a(th));
        }
        return (String) (p129m8.m.f(objB) ? "" : objB);
    }
}
