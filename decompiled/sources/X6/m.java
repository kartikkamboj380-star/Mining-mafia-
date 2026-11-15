package X6;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f6771a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        R6.a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f6771a == null) {
            f6771a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f6771a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
