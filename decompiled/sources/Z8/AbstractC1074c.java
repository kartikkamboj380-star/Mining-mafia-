package Z8;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: Z8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1074c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f7188a;

    static {
        Object objB;
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            objB = p129m8.m.b(StringsKt.toIntOrNull(property));
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            objB = p129m8.m.b(p129m8.n.a(th));
        }
        if (p129m8.m.f(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        f7188a = num != null ? num.intValue() : 2097152;
    }
}
