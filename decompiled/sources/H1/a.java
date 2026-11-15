package H1;

import D1.b;
import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1115a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f1116b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f1117c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f1118d = 10;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f1119e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f1120f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f1121g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f1122h = 8192;

    public static int a() {
        return f1116b;
    }

    public static int b() {
        return f1118d;
    }

    public static int c() {
        return f1117c;
    }

    public static void d() {
        b bVar = f1119e;
        if (bVar != null) {
            bVar.fou();
        }
    }

    public static void e(b bVar) {
        f1119e = bVar;
    }

    public static void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            f1120f = jSONObject.optInt("check_moov", 0) == 1;
            f1121g = jSONObject.optInt("new_media_source", 1);
            f1122h = jSONObject.optInt("read_buffer_size_k", 8) * IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } catch (JSONException unused) {
        }
    }

    public static void g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            f1115a = jSONObject.optInt("splash", 10);
            f1116b = jSONObject.optInt("reward", 10);
            f1117c = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt("other", 10);
            f1118d = iOptInt;
            if (f1115a < 0) {
                f1115a = 10;
            }
            if (f1116b < 0) {
                f1116b = 10;
            }
            if (f1117c < 0) {
                f1117c = 10;
            }
            if (iOptInt < 0) {
                f1118d = 10;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static int h() {
        return f1115a;
    }

    public static boolean i(String str) {
        return f1120f && str != null && str.endsWith(".mp4");
    }

    public static int j() {
        return f1121g;
    }

    public static int k() {
        return f1122h;
    }
}
