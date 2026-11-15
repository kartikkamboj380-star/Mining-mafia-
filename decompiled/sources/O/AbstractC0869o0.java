package O;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: O.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0869o0 {

    /* JADX INFO: renamed from: O.o0$a */
    static class a {
        static void a(Window window, boolean z9) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z9 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: O.o0$b */
    static class b {
        static void a(@NonNull Window window, boolean z9) {
            window.setDecorFitsSystemWindows(z9);
        }
    }

    public static d1 a(Window window, View view) {
        return new d1(window, view);
    }

    public static void b(Window window, boolean z9) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z9);
        } else {
            a.a(window, z9);
        }
    }
}
