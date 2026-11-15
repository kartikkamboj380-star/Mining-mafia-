package com.bytedance.sdk.component.kq;

import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
class rjo {
    private nn kq;

    private rjo(nn nnVar) {
        this.kq = nnVar;
    }

    static rjo kq(nn nnVar) {
        return new rjo(nnVar);
    }

    <T> T kq(String str, Type type) {
        kq(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.kq.kq(str, type);
    }

    <T> String kq(T t10) {
        String string;
        if (t10 == null) {
            return "{}";
        }
        if (!(t10 instanceof JSONObject) && !(t10 instanceof JSONArray)) {
            string = this.kq.kq(t10);
        } else {
            string = t10.toString();
        }
        kq(string);
        return string;
    }

    private static void kq(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        syt.kq(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
