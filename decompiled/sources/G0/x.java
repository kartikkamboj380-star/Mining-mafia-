package G0;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f918a = true;

    static class a {
        static void a(ViewGroup viewGroup, boolean z9) {
            viewGroup.suppressLayout(z9);
        }
    }

    private static void a(ViewGroup viewGroup, boolean z9) {
        if (f918a) {
            try {
                a.a(viewGroup, z9);
            } catch (NoSuchMethodError unused) {
                f918a = false;
            }
        }
    }

    static void b(ViewGroup viewGroup, boolean z9) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(viewGroup, z9);
        } else {
            a(viewGroup, z9);
        }
    }
}
