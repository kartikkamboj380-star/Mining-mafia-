package J0;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class t implements I0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScriptHandlerBoundaryInterface f1917a;

    private t(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f1917a = scriptHandlerBoundaryInterface;
    }

    public static t a(InvocationHandler invocationHandler) {
        return new t((ScriptHandlerBoundaryInterface) t9.a.a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }
}
