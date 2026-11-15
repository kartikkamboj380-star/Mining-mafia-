package p109k8;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
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
                writableArray.pushArray(b((JSONArray) obj));
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
                writableArray.pushMap(c((JSONObject) obj));
            } catch (JSONException unused2) {
                writableArray.pushNull();
            }
        } else {
            if (List.class.isAssignableFrom(obj.getClass())) {
                writableArray.pushArray(d((List) obj));
                return;
            }
            if (Map.class.isAssignableFrom(obj.getClass())) {
                writableArray.pushMap(f((Map) obj));
                return;
            }
            Log.d("Utils", "utils:arrayPushValue:unknownType:" + name);
            writableArray.pushNull();
        }
    }

    public static WritableArray b(JSONArray jSONArray) throws JSONException {
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
                writableArrayCreateArray.pushMap(c(jSONArray.getJSONObject(i10)));
            } else if (obj instanceof JSONArray) {
                writableArrayCreateArray.pushArray(b(jSONArray.getJSONArray(i10)));
            } else if (obj == JSONObject.NULL) {
                writableArrayCreateArray.pushNull();
            }
        }
        return writableArrayCreateArray;
    }

    public static WritableMap c(JSONObject jSONObject) throws JSONException {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                writableNativeMap.putMap(next, c((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeMap.putArray(next, b((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeMap.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeMap.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeMap.putString(next, (String) obj);
            } else {
                writableNativeMap.putString(next, obj.toString());
            }
        }
        return writableNativeMap;
    }

    private static WritableArray d(List list) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), writableArrayCreateArray);
        }
        return writableArrayCreateArray;
    }

    public static void e(String str, Object obj, WritableMap writableMap) {
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
                writableMap.putArray(str, b((JSONArray) obj));
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
                writableMap.putMap(str, c((JSONObject) obj));
            } catch (JSONException unused2) {
                writableMap.putNull(str);
            }
        } else {
            if (List.class.isAssignableFrom(obj.getClass())) {
                writableMap.putArray(str, d((List) obj));
                return;
            }
            if (Map.class.isAssignableFrom(obj.getClass())) {
                writableMap.putMap(str, f((Map) obj));
                return;
            }
            Log.d("Utils", "utils:mapPutValue:unknownType:" + name);
            writableMap.putNull(str);
        }
    }

    public static WritableMap f(Map map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry entry : map.entrySet()) {
            e((String) entry.getKey(), entry.getValue(), writableMapCreateMap);
        }
        return writableMapCreateMap;
    }
}
