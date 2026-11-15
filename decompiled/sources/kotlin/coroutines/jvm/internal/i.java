package kotlin.coroutines.jvm.internal;

import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f45958a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f45959b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f45960c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f45961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f45962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f45963c;

        public a(Method method, Method method2, Method method3) {
            this.f45961a = method;
            this.f45962b = method2;
            this.f45963c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(MediationMetaData.KEY_NAME, null));
            f45960c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f45959b;
            f45960c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        a aVarA = f45960c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA != f45959b && (method = aVarA.f45961a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVarA.f45962b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarA.f45963c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
