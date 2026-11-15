package p219v8;

import kotlin.random.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class a extends p209u8.a {

    /* JADX INFO: renamed from: v8.a$a, reason: collision with other inner class name */
    private static final class C0551a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0551a f50222a = new C0551a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f50223b;

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
            f50223b = num2;
        }

        private C0551a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0551a.f50223b;
        return num == null || num.intValue() >= i10;
    }

    @Override // p199t8.a
    public c b() {
        return c(34) ? new D8.a() : super.b();
    }
}
