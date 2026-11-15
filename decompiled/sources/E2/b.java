package E2;

import H2.n;
import J2.InterfaceC0731p;
import W1.d;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import p070h.w;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f565a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f566b;

    private b() {
    }

    public static final a a(G2.b bVar, InterfaceC0731p interfaceC0731p, n nVar, boolean z9, boolean z10, int i10, int i11, ExecutorService executorService) {
        if (f566b) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl");
            Class cls2 = Boolean.TYPE;
            Class cls3 = Integer.TYPE;
            Object objNewInstance = cls.getConstructor(G2.b.class, InterfaceC0731p.class, n.class, cls2, cls2, cls3, cls3, d.class).newInstance(bVar, interfaceC0731p, nVar, Boolean.valueOf(z9), Boolean.valueOf(z10), Integer.valueOf(i10), Integer.valueOf(i11), executorService);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
            w.a(objNewInstance);
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
