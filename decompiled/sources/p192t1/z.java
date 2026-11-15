package p192t1;

import G8.j;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import p129m8.g;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f49518a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f49519b = g.a(new Function0() { // from class: t1.x
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return z.d();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f49520c = g.a(new Function0() { // from class: t1.y
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return z.c();
        }
    });

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c() {
        return AbstractC7125c.c(j.D(j.d(ServiceLoader.load(InterfaceC7128f.class, InterfaceC7128f.class.getClassLoader()).iterator())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d() {
        return AbstractC7125c.c(j.D(j.d(ServiceLoader.load(h.class, h.class.getClassLoader()).iterator())));
    }

    public final List e() {
        return (List) f49520c.getValue();
    }

    public final List f() {
        return (List) f49519b.getValue();
    }
}
