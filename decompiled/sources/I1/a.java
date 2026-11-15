package I1;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f1579a = Build.VERSION.SDK_INT;

    public static int a(long j10, long j11) {
        return Math.min(Math.max(0, j11 > 0 ? (int) (((j10 * 1.0d) / j11) * 100.0d) : 0), 100);
    }

    public static String b(long j10) {
        StringBuilder sb = new StringBuilder();
        long j11 = j10 / 60000;
        long j12 = ((j10 % 3600000) % 60000) / 1000;
        if (j11 >= 10) {
            sb.append(j11);
        } else if (j11 > 0) {
            sb.append(0);
            sb.append(j11);
        } else {
            sb.append(0);
            sb.append(0);
        }
        sb.append(":");
        if (j12 >= 10) {
            sb.append(j12);
        } else if (j12 > 0) {
            sb.append(0);
            sb.append(j12);
        } else {
            sb.append(0);
            sb.append(0);
        }
        return sb.toString();
    }

    public static void c(View view, boolean z9) {
        if (view == null) {
            return;
        }
        if (z9) {
            view.setSystemUiVisibility(0);
            return;
        }
        int i10 = f1579a;
        if (i10 >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (i10 >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }
}
