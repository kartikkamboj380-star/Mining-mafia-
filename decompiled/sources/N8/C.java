package N8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f3677a = new p000a.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f3678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f3679c;

    static {
        Object objB;
        Object objB2;
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            objB = p129m8.m.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            objB = p129m8.m.b(p129m8.n.a(th));
        }
        if (p129m8.m.d(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f3678b = (String) objB;
        try {
            objB2 = p129m8.m.b(C.class.getCanonicalName());
        } catch (Throwable th2) {
            m8.m.a aVar3 = p129m8.m.f46450b;
            objB2 = p129m8.m.b(p129m8.n.a(th2));
        }
        if (p129m8.m.d(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f3679c = (String) objB2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
