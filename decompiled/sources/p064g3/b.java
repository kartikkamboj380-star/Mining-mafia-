package p064g3;

import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import kotlin.jvm.internal.Intrinsics;
import p129m8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f44382a = new b();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44383a;

        static {
            int[] iArr = new int[p064g3.a.values().length];
            try {
                iArr[p064g3.a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p064g3.a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f44383a = iArr;
        }
    }

    private b() {
    }

    public static final void a(String name, p064g3.a logLevel) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        if (p084i3.a.f45070f) {
            f44382a.c(name, logLevel);
        }
    }

    public static /* synthetic */ void b(String str, p064g3.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = p064g3.a.WARNING;
        }
        a(str, aVar);
    }

    private final void c(String str, p064g3.a aVar) {
        if (p084i3.a.f45066b) {
            int i10 = a.f44383a[aVar.ordinal()];
            if (i10 == 1) {
                throw new AssertionException(str + " is being executed when app is fully running on the NEW Architecture.");
            }
            if (i10 != 2) {
                throw new k();
            }
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SOFT_ASSERTIONS, new ReactNoCrashSoftException(str + " is being executed when app is fully running on the NEW Architecture."));
        }
    }
}
