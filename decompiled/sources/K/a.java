package K;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f2380a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f2381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f2382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f2383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f2384e;

    /* JADX INFO: renamed from: K.a$a, reason: collision with other inner class name */
    private static final class C0035a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0035a f2385a = new C0035a();

        private C0035a() {
        }

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f2381b = i10 >= 30 ? C0035a.f2385a.a(30) : 0;
        f2382c = i10 >= 30 ? C0035a.f2385a.a(31) : 0;
        f2383d = i10 >= 30 ? C0035a.f2385a.a(33) : 0;
        f2384e = i10 >= 30 ? C0035a.f2385a.a(1000000) : 0;
    }

    private a() {
    }

    public static final boolean a(@NotNull String codename, @NotNull String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.b("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return true;
        }
        if (i10 < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("UpsideDownCake", CODENAME);
    }

    public static final boolean c() {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return a("VanillaIceCream", CODENAME);
    }
}
