package p208u7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p158p7.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WindowManager f49996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f49997b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static float f49998c = Resources.getSystem().getDisplayMetrics().density;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49999a;

        static {
            int[] iArr = new int[i.values().length];
            f49999a = iArr;
            try {
                iArr[i.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f50000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f50001b;

        b(float f10, float f11) {
            this.f50000a = f10;
            this.f50001b = f11;
        }
    }

    static float a(int i10) {
        return i10 / f49998c;
    }

    public static JSONObject b(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i10));
            jSONObject.put("y", a(i11));
            jSONObject.put("width", a(i12));
            jSONObject.put("height", a(i13));
            return jSONObject;
        } catch (JSONException e10) {
            d.b("Error with creating viewStateObject", e10);
            return jSONObject;
        }
    }

    private static b c(JSONObject jSONObject) {
        float fA;
        float fA2;
        if (f49996a != null) {
            Point point = new Point(0, 0);
            f49996a.getDefaultDisplay().getRealSize(point);
            fA = a(point.x);
            fA2 = a(point.y);
        } else {
            fA = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            fA2 = 0.0f;
        }
        return new b(fA, fA2);
    }

    public static void d(Context context) {
        if (context != null) {
            f49998c = context.getResources().getDisplayMetrics().density;
            f49996a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void e(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e10) {
            d.b("Error with setting has window focus", e10);
        }
    }

    public static void f(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            d.b("Error with setting ad session id", e10);
        }
    }

    public static void g(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e10) {
            d.b("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static void h(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void i(JSONObject jSONObject, i iVar) {
        try {
            jSONObject.put("noOutputDevice", l(iVar));
        } catch (JSONException e10) {
            d.b("Error with setting output device status", e10);
        }
    }

    public static void j(JSONObject jSONObject, v7.b.a aVar) {
        aVar.a();
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayListB = aVar.b();
        int size = arrayListB.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListB.get(i10);
            i10++;
            jSONArray.put((String) obj);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            throw null;
        } catch (JSONException e10) {
            d.b("Error with setting friendly obstruction", e10);
        }
    }

    private static boolean k(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    private static boolean l(i iVar) {
        return a.f49999a[iVar.ordinal()] == 1;
    }

    public static void m(JSONObject jSONObject) {
        b bVarC = c(jSONObject);
        try {
            jSONObject.put("width", bVarC.f50000a);
            jSONObject.put("height", bVarC.f50001b);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void n(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            d.b("Error with setting not visible reason", e10);
        }
    }

    private static boolean o(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!k(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!u(jSONArrayOptJSONArray.optJSONObject(i10), jSONArrayOptJSONArray2.optJSONObject(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean p(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!k(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            if (!jSONArrayOptJSONArray.optString(i10, "").equals(jSONArrayOptJSONArray2.optString(i10, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean q(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean r(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean s(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f49997b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean t(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean u(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && s(jSONObject, jSONObject2) && t(jSONObject, jSONObject2) && r(jSONObject, jSONObject2) && q(jSONObject, jSONObject2) && p(jSONObject, jSONObject2) && o(jSONObject, jSONObject2);
    }
}
