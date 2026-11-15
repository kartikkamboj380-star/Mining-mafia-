package p209u8;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class a extends p199t8.a {

    /* JADX INFO: renamed from: u8.a$a, reason: collision with other inner class name */
    private static final class C0546a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0546a f50003a = new C0546a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f50004b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f50004b = num2;
        }

        private C0546a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0546a.f50004b;
        return num == null || num.intValue() >= i10;
    }

    @Override // p199t8.a
    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
