package X6;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import c9.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f6773a;

    public static void a(boolean z9, String str) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(Context context) {
        Boolean bool = f6773a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f6773a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            R6.a.e().a("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    public static int c(long j10) {
        if (j10 > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return j10 < -2147483648L ? LinearLayoutManager.INVALID_OFFSET : (int) j10;
    }

    public static String d(String str) {
        u uVarL = u.l(str);
        return uVarL != null ? uVarL.j().x("").j("").n(null).d(null).toString() : str;
    }

    public static String e(String str, int i10) {
        int iLastIndexOf;
        if (str.length() <= i10) {
            return str;
        }
        if (str.charAt(i10) == '/') {
            return str.substring(0, i10);
        }
        u uVarL = u.l(str);
        if (uVarL == null) {
            return str.substring(0, i10);
        }
        return (uVarL.d().lastIndexOf(47) < 0 || (iLastIndexOf = str.lastIndexOf(47, i10 + (-1))) < 0) ? str.substring(0, i10) : str.substring(0, iLastIndexOf);
    }
}
