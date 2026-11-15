package K3;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f2568e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f2569f = e.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f2571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f2573d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f2570a = appContext;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(appContext);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f2571b = defaultSharedPreferences;
        String packageName = appContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.f2572c = packageName;
        this.f2573d = new LinkedHashMap();
    }

    public final Map a() {
        return this.f2573d;
    }

    public String b() {
        String string = this.f2571b.getString("debug_http_host", null);
        if (string != null && string.length() != 0) {
            return string;
        }
        String strI = com.facebook.react.modules.systeminfo.a.i(this.f2570a);
        if (Intrinsics.b(strI, "localhost")) {
            Z1.a.I(f2569f, "You seem to be running on device. Run '" + com.facebook.react.modules.systeminfo.a.b(this.f2570a) + "' to forward the debug server's port to the device.");
        }
        return strI;
    }

    public final String c() {
        return this.f2572c;
    }

    public void d(String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        if (host.length() == 0) {
            this.f2571b.edit().remove("debug_http_host").apply();
        } else {
            this.f2571b.edit().putString("debug_http_host", host).apply();
        }
    }
}
