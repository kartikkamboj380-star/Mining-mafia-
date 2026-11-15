package p207u6;

import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f49993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f49994d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f49991a = str;
        this.f49992b = str2;
        this.f49993c = stackTraceElementArr;
        this.f49994d = eVar;
    }

    public static e a(Throwable th, d dVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eVar = new e(th2.getLocalizedMessage(), th2.getClass().getName(), dVar.a(th2.getStackTrace()), eVar);
        }
        return eVar;
    }
}
