package J8;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p129m8.m;
import p129m8.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f2379a;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objB;
        try {
            m.a aVar = m.f46450b;
            objB = m.b(new e(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        f2379a = (f) (m.f(objB) ? null : objB);
    }

    public static final Handler a(Looper looper, boolean z9) throws IllegalAccessException, InvocationTargetException {
        if (!z9) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.d(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
