package p089i8;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {
    public static void a(Object obj, WritableArray writableArray) {
        if (obj == null || obj == JSONObject.NULL) {
            writableArray.pushNull();
            return;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.lang.Integer")) {
            writableArray.pushInt(((Integer) obj).intValue());
            return;
        }
        if (name.equals("java.lang.Float")) {
            writableArray.pushDouble(((Float) obj).floatValue());
            return;
        }
        if (name.equals("org.json.JSONArray$1")) {
            try {
                writableArray.pushArray(d((JSONArray) obj));
                return;
            } catch (JSONException unused) {
                writableArray.pushNull();
                return;
            }
        }
        if (name.equals("java.lang.Boolean")) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (name.equals("java.lang.Long")) {
            writableArray.pushDouble(((Long) obj).longValue());
            return;
        }
        if (name.equals("java.lang.Double")) {
            writableArray.pushDouble(((Double) obj).doubleValue());
            return;
        }
        if (name.equals("java.lang.String")) {
            writableArray.pushString((String) obj);
            return;
        }
        if (name.equals("org.json.JSONObject$1")) {
            try {
                writableArray.pushMap(e((JSONObject) obj));
            } catch (JSONException unused2) {
                writableArray.pushNull();
            }
        } else {
            if (List.class.isAssignableFrom(obj.getClass())) {
                writableArray.pushArray(f((List) obj));
                return;
            }
            if (Map.class.isAssignableFrom(obj.getClass())) {
                writableArray.pushMap(h((Map) obj));
                return;
            }
            Log.d("Utils", "utils:arrayPushValue:unknownType:" + name);
            writableArray.pushNull();
        }
    }

    public static WritableMap b(Exception exc) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String message = exc.getMessage();
        writableMapCreateMap.putString("code", "unknown");
        writableMapCreateMap.putString("nativeErrorCode", "unknown");
        writableMapCreateMap.putString(PglCryptUtils.KEY_MESSAGE, message);
        writableMapCreateMap.putString("nativeErrorMessage", message);
        return writableMapCreateMap;
    }

    public static boolean c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        i iVarH = i.h();
        if (iVarH.a("android_background_activity_names")) {
            ArrayList arrayListC = iVarH.c("android_background_activity_names");
            if (arrayListC.size() != 0) {
                List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                String shortClassName = appTasks.size() > 0 ? appTasks.get(0).getTaskInfo().baseActivity.getShortClassName() : "";
                if (!"".equals(shortClassName) && arrayListC.contains(shortClassName)) {
                    return false;
                }
            }
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                try {
                    return ((ReactContext) context).getLifecycleState() == LifecycleState.RESUMED;
                } catch (ClassCastException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public static WritableArray d(JSONArray jSONArray) throws JSONException {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                writableArrayCreateArray.pushDouble(jSONArray.getDouble(i10));
            } else if (obj instanceof Number) {
                writableArrayCreateArray.pushInt(jSONArray.getInt(i10));
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString(jSONArray.getString(i10));
            } else if (obj instanceof JSONObject) {
                writableArrayCreateArray.pushMap(e(jSONArray.getJSONObject(i10)));
            } else if (obj instanceof JSONArray) {
                writableArrayCreateArray.pushArray(d(jSONArray.getJSONArray(i10)));
            } else if (obj == JSONObject.NULL) {
                writableArrayCreateArray.pushNull();
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableMap e(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        WritableMap writableMapCreateMap = Arguments.createMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                writableMapCreateMap.putDouble(next, jSONObject.getDouble(next));
            } else if (obj instanceof Number) {
                writableMapCreateMap.putInt(next, jSONObject.getInt(next));
            } else if (obj instanceof String) {
                writableMapCreateMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                writableMapCreateMap.putMap(next, e(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                writableMapCreateMap.putArray(next, d(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                writableMapCreateMap.putNull(next);
            }
        }
        return writableMapCreateMap;
    }

    private static WritableArray f(List list) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), writableArrayCreateArray);
        }
        return writableArrayCreateArray;
    }

    public static void g(String str, Object obj, WritableMap writableMap) {
        if (obj == null || obj == JSONObject.NULL) {
            writableMap.putNull(str);
            return;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.lang.Integer")) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (name.equals("java.lang.Float")) {
            writableMap.putDouble(str, ((Float) obj).floatValue());
            return;
        }
        if (name.equals("org.json.JSONArray$1")) {
            try {
                writableMap.putArray(str, d((JSONArray) obj));
                return;
            } catch (JSONException unused) {
                writableMap.putNull(str);
                return;
            }
        }
        if (name.equals("java.lang.Boolean")) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (name.equals("java.lang.Long")) {
            writableMap.putDouble(str, ((Long) obj).longValue());
            return;
        }
        if (name.equals("java.lang.Double")) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (name.equals("java.lang.String")) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (name.equals("org.json.JSONObject$1")) {
            try {
                writableMap.putMap(str, e((JSONObject) obj));
            } catch (JSONException unused2) {
                writableMap.putNull(str);
            }
        } else {
            if (List.class.isAssignableFrom(obj.getClass())) {
                writableMap.putArray(str, f((List) obj));
                return;
            }
            if (Map.class.isAssignableFrom(obj.getClass())) {
                writableMap.putMap(str, h((Map) obj));
                return;
            }
            Log.d("Utils", "utils:mapPutValue:unknownType:" + name);
            writableMap.putNull(str);
        }
    }

    public static WritableMap h(Map map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry entry : map.entrySet()) {
            g((String) entry.getKey(), entry.getValue(), writableMapCreateMap);
        }
        return writableMapCreateMap;
    }
}
