package R2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f5138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f5139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile C0957g f5141d;

    static {
        h hVar = new h();
        f5138a = hVar;
        f5139b = hVar.b();
        f5140c = 384;
    }

    private h() {
    }

    public static final C0957g a() {
        if (f5141d == null) {
            synchronized (h.class) {
                try {
                    if (f5141d == null) {
                        f5141d = new C0957g(f5140c, f5139b);
                    }
                    Unit unit = Unit.f45918a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0957g c0957g = f5141d;
        Intrinsics.c(c0957g);
        return c0957g;
    }

    private final int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
