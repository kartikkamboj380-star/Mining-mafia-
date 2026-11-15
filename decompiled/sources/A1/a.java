package A1;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.oq.kq.ubx;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f35a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f36b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f37c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ubx f38d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f39e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f40f = false;

    public static boolean a() {
        return f37c;
    }

    public static boolean b() {
        return f40f;
    }

    public static ubx c() {
        if (f38d == null) {
            ubx.kq kqVar = new ubx.kq("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            f38d = kqVar.kq(10000L, timeUnit).oq(10000L, timeUnit).bob(10000L, timeUnit).kq();
        }
        return f38d;
    }

    public static Context d() {
        return f35a;
    }

    public static void e(int i10) {
        f39e = i10;
    }

    public static void f(Context context, String str) {
        f35a = context;
        f36b = str;
    }

    public static void g(ubx ubxVar) {
        f38d = ubxVar;
    }

    public static void h(boolean z9) {
        f37c = z9;
    }

    public static String i() {
        if (TextUtils.isEmpty(f36b)) {
            try {
                File file = new File(d().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f36b = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return f36b;
    }

    public static int j() {
        return f39e;
    }
}
