package com.bytedance.adsdk.ugeno.kq;

import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    public static float[] bob(String str) {
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        JSONArray jSONArrayKq = com.bytedance.adsdk.ugeno.rjo.oq.kq(str, (JSONArray) null);
        if (jSONArrayKq != null && jSONArrayKq.length() == 2) {
            fArr[0] = (float) jSONArrayKq.optDouble(0);
            fArr[1] = (float) jSONArrayKq.optDouble(1);
        }
        return fArr;
    }

    public static int kq(int i10) {
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? LinearLayoutManager.INVALID_OFFSET : i10 - 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    public static Interpolator oq(String str) {
        byte b10;
        switch (str) {
            case "ease_in":
                b10 = 0;
                break;
            case "linear":
                b10 = 3;
                break;
            case "ease_out":
                b10 = 2;
                break;
            case "ease_in_out":
                b10 = 1;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            return new AccelerateInterpolator();
        }
        if (b10 != 1) {
            return b10 != 2 ? new LinearInterpolator() : new DecelerateInterpolator();
        }
        return new AccelerateDecelerateInterpolator();
    }

    public static List<bob> kq(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(kq(jSONObjectOptJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static bob.kq oq(String str, JSONObject jSONObject) {
        JSONArray jSONArrayKq;
        if (TextUtils.isEmpty(str) || (jSONArrayKq = com.bytedance.adsdk.ugeno.rjo.oq.kq(str, (JSONArray) null)) == null || jSONArrayKq.length() != 2) {
            return null;
        }
        bob.kq kqVar = new bob.kq();
        kqVar.kq = com.bytedance.adsdk.ugeno.bob.oq.kq(jSONArrayKq.optString(0), jSONObject);
        kqVar.oq = com.bytedance.adsdk.ugeno.bob.oq.kq(jSONArrayKq.optString(1), jSONObject);
        return kqVar;
    }

    public static bob kq(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        bob bobVar = new bob();
        bobVar.oq(com.bytedance.adsdk.ugeno.rjo.bob.kq(com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObject.optString("delay"), jSONObject2), 0L));
        bobVar.bob(com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObject.optString(MediationMetaData.KEY_NAME), jSONObject2));
        bobVar.oq(com.bytedance.adsdk.ugeno.rjo.bob.kq(com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObject.optString("playState"), jSONObject2), 1));
        bobVar.kq(Math.max(com.bytedance.adsdk.ugeno.rjo.bob.kq(com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObject.optString("duration"), jSONObject2), 0L), 0L));
        bobVar.kq(com.bytedance.adsdk.ugeno.rjo.bob.kq(com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObject.optString("playCount"), jSONObject2), 1));
        bobVar.kq(com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObject.optString("playDirection"), jSONObject2));
        bobVar.kq(oq(jSONObject.optString("transformOrigin"), jSONObject2));
        bobVar.oq(com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        bobVar.kq(jSONObject.optJSONObject("effect"));
        bobVar.kq(kq(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return bobVar;
    }

    public static Map<String, TreeMap<Float, String>> kq(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("offset");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    TreeMap treeMap = (TreeMap) map.get(next);
                    if (!TextUtils.equals(next, "offset")) {
                        if (map.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObjectOptJSONObject.optString(next), jSONObject));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            treeMap2.put(Float.valueOf(fOptDouble), com.bytedance.adsdk.ugeno.bob.oq.kq(jSONObjectOptJSONObject.optString(next), jSONObject));
                            map.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static int kq(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1408024454) {
            return str.equals("alternate") ? 2 : 1;
        }
        if (iHashCode != -1039745817) {
            return 1;
        }
        str.equals("normal");
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int kq(String str, int i10) {
        int i11 = i10 / 2;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "bottom":
                case "right":
                    return i10;
                case "center":
                    break;
                case "top":
                case "left":
                    return 0;
                default:
                    if (str.endsWith("%")) {
                        try {
                            return (int) ((i10 * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                        } catch (NumberFormatException unused) {
                        }
                        break;
                    } else {
                        try {
                            return Integer.parseInt(str);
                        } catch (NumberFormatException unused2) {
                            return i11;
                        }
                    }
                    break;
            }
        }
        return i11;
    }
}
