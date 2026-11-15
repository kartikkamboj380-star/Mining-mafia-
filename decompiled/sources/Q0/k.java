package Q0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4797a;

    static {
        String strI = q.i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"NetworkStateTracker\")");
        f4797a = strI;
    }

    public static final h a(Context context, U0.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new j(context, taskExecutor);
    }

    public static final O0.b c(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z9 = false;
        boolean z10 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zD = d(connectivityManager);
        boolean zA = J.a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z9 = true;
        }
        return new O0.b(z10, zD, zA, z9);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesA = T0.m.a(connectivityManager, T0.n.a(connectivityManager));
            if (networkCapabilitiesA != null) {
                return T0.m.b(networkCapabilitiesA, 16);
            }
            return false;
        } catch (SecurityException e10) {
            q.e().d(f4797a, "Unable to validate active network", e10);
            return false;
        }
    }
}
