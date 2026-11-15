package p151p0;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f47734a = new b();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47735a = new a();

        private a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* JADX INFO: renamed from: p0.b$b, reason: collision with other inner class name */
    private static final class C0512b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0512b f47736a = new C0512b();

        private C0512b() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private b() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C0512b.f47736a.a();
        }
        return 0;
    }

    public final int b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return a.f47735a.a();
        }
        return 0;
    }
}
