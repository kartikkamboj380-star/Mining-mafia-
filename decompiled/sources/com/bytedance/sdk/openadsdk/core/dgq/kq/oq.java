package com.bytedance.sdk.openadsdk.core.dgq.kq;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.kq.kq.kq.bob.c;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.core.dgq;
import com.bytedance.sdk.openadsdk.core.model.gm;
import com.bytedance.sdk.openadsdk.core.model.ktb;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.core.model.wcx;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.core.ubx.rjo.bob;
import com.bytedance.sdk.openadsdk.core.vvw;
import com.bytedance.sdk.openadsdk.core.wf;
import com.unity3d.services.core.device.MimeTypes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public static String kq = "https://pag_open_icon_id/appicon.png";
    private static String oq = "";

    public static boolean bob() {
        return true;
    }

    public static String kq() {
        return oq;
    }

    public static JSONObject oq() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", vvw.oq());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            wf.oq(jSONObject3);
            jSONObject3.put("platform", "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e10) {
            fax.bob("TemplateUtils", e10.getMessage());
            return jSONObject;
        }
    }

    private static JSONObject bob(uml umlVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            wf.kq(jSONObject, umlVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject kq(float f10, float f11, boolean z9, @NonNull uml umlVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f10);
            jSONObject2.put("height", f11);
            if (z9) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", kq(false, umlVar));
            jSONObject.put("template_Plugin", oq(umlVar.zp()));
            jSONObject.put("diff_template_Plugin", kq(umlVar.zp()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String oq(uml.kq kqVar) {
        com.bytedance.sdk.component.adexpress.kq.bob.oq oqVarBob;
        if (kqVar != null) {
            String strRjo = kqVar.rjo();
            return (!TextUtils.isEmpty(strRjo) || (oqVarBob = com.bytedance.sdk.component.adexpress.kq.oq.oq.bob(kqVar.fou())) == null) ? strRjo : oqVarBob.csi();
        }
        return "";
    }

    public static JSONObject kq(uml umlVar) {
        return kq(umlVar, false, (JSONObject) null);
    }

    public static JSONObject kq(uml umlVar, boolean z9, JSONObject jSONObject) {
        JSONObject jSONObjectKq = null;
        if (umlVar == null) {
            return null;
        }
        try {
            jSONObjectKq = kq(umlVar, false, z9);
            if (jSONObjectKq == null) {
                jSONObjectKq = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            wf.oq(jSONObject2);
            jSONObject2.put("platform", "android");
            jSONObjectKq.put("xAppInfo", jSONObject2);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectKq.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObjectOq = wf.oq(umlVar);
            jSONObjectOq.put("language", vvw.oq());
            jSONObjectKq.put("xSetting", jSONObjectOq);
            return jSONObjectKq;
        } catch (Throwable th) {
            th.getMessage();
            return jSONObjectKq;
        }
    }

    public static Map<String, String> oq(uml umlVar) {
        HashMap map = null;
        if (umlVar == null) {
            return null;
        }
        List<wcx> listKiq = umlVar.kiq();
        if (listKiq != null && listKiq.size() > 0) {
            map = new HashMap();
            for (wcx wcxVar : listKiq) {
                if (wcxVar != null) {
                    map.put(wcxVar.kq(), wcxVar.rjo());
                }
            }
            wcx wcxVarQvq = umlVar.qvq();
            if (wcxVarQvq != null) {
                map.put(wcxVarQvq.kq(), wcxVarQvq.rjo());
            }
        }
        return map;
    }

    private static JSONObject kq(uml umlVar, boolean z9, boolean z10) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = null;
        if (umlVar != null) {
            try {
                String strSb = umlVar.sb();
                if (strSb != null) {
                    JSONObject jSONObject2 = new JSONObject(strSb);
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("creatives");
                    if (!z9 && !z10) {
                        jSONObject = new JSONObject();
                    } else {
                        JSONObject jSONObject3 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= umlVar.bob() || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(umlVar.bob())) == null) ? null : new JSONObject(jSONObjectOptJSONObject.toString());
                        if (jSONObject3 == null) {
                            return null;
                        }
                        jSONObject = jSONObject3;
                    }
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 1) {
                        jSONArrayOptJSONArray.remove(0);
                        jSONObject.put("xRestCreatives", jSONArrayOptJSONArray);
                    }
                    jSONObject2.remove("creatives");
                    jSONObject.put("xRestResponse", jSONObject2);
                }
            } catch (Throwable th) {
                fax.kq("TemplateUtils", "filterTemplateInfo", th);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static JSONObject kq(float f10, float f11, boolean z9, uml umlVar, String str, bob bobVar) {
        oq = "";
        if (umlVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectKq = kq(f10, f11, z9, umlVar, str);
            if (bobVar != null) {
                bobVar.kq("adv3");
            }
            ktb ktbVarYo = umlVar.yo();
            if (ktbVarYo != null) {
                String strFou = ktbVarYo.fou();
                if (!TextUtils.isEmpty(strFou)) {
                    jSONObjectKq.put("xTemplate", new JSONObject(strFou));
                    oq = "getTemplate success by local data";
                    if (bobVar != null) {
                        bobVar.oq("local");
                        return jSONObjectKq;
                    }
                } else {
                    String strKq = com.bytedance.sdk.openadsdk.core.ubx.kq.oq.kq().kq("adv3", ktbVarYo.kq(), ktbVarYo.oq());
                    if (!TextUtils.isEmpty(strKq)) {
                        jSONObjectKq.put("xTemplate", new JSONObject(strKq));
                        oq = "getTemplate success by db data";
                        if (bobVar != null) {
                            bobVar.oq("local");
                            return jSONObjectKq;
                        }
                    } else {
                        String str2 = "local db data is null id is " + ktbVarYo.kq() + " md5 is " + ktbVarYo.oq();
                        oq = str2;
                        if (bobVar != null) {
                            bobVar.kq(3, str2, "net");
                        }
                    }
                }
            }
            return jSONObjectKq;
        } catch (Exception e10) {
            String str3 = "load template exception " + e10.getMessage();
            oq = str3;
            if (bobVar != null) {
                bobVar.kq(3, str3, "net");
            }
            return null;
        }
    }

    public static JSONObject kq(float f10, float f11, boolean z9, uml umlVar, String str) {
        if (umlVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectKq = kq(umlVar, true, true);
            if (jSONObjectKq == null) {
                return null;
            }
            try {
                kq(jSONObjectKq, umlVar, str);
                JSONObject jSONObjectOq = wf.oq(umlVar);
                jSONObjectOq.put("language", vvw.oq());
                jSONObjectKq.put("xSetting", jSONObjectOq);
                jSONObjectKq.put("xAdInfo", kq(str, bob(umlVar), umlVar));
                JSONObject jSONObject = new JSONObject();
                wf.oq(jSONObject);
                jSONObject.put("platform", "android");
                jSONObjectKq.put("xAppInfo", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", f10);
                jSONObject2.put("height", f11);
                if (z9) {
                    jSONObject2.put("isLandscape", true);
                }
                jSONObjectKq.put("xSize", jSONObject2);
                return jSONObjectKq;
            } catch (Throwable unused) {
                return jSONObjectKq;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static void kq(JSONObject jSONObject, uml umlVar, String str) {
        if (umlVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            c cVarJob = umlVar.job();
            if (cVarJob != null) {
                JSONObject jSONObjectM = cVarJob.M();
                jSONObjectM.put("video_duration", cVarJob.B() * ((double) cVarJob.n()));
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, jSONObjectM);
            } else if ("open_ad".equals(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("video_duration", sns.fou().uml(String.valueOf(umlVar.tt())));
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, jSONObject2);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private static JSONObject kq(String str, JSONObject jSONObject, uml umlVar) {
        if (umlVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_name", dgq.oq().syt());
                    int iDgq = dgq.oq().dgq();
                    if (iDgq != 0) {
                        int iMz = umlVar.mz();
                        if (9 == iMz) {
                            jSONObject2.put("app_icon", kq);
                        } else if (10 == iMz) {
                            jSONObject2.put("app_icon", "@".concat(String.valueOf(iDgq)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject kq(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("keys");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (jSONObject.has(strOptString)) {
                        jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String kq(uml.kq kqVar) {
        if (kqVar != null) {
            return kqVar.syt();
        }
        return "";
    }

    public static JSONObject kq(boolean z9, @NonNull uml umlVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", umlVar.jqv());
            if (umlVar.qvq() != null) {
                if (umlVar.qvq() != null && !TextUtils.isEmpty(umlVar.qvq().kq())) {
                    jSONObject.put("icon", umlVar.qvq().kq());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (umlVar.kiq() != null) {
                for (int i10 = 0; i10 < umlVar.kiq().size(); i10++) {
                    wcx wcxVar = umlVar.kiq().get(i10);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", wcxVar.bob());
                    jSONObject2.put("width", wcxVar.oq());
                    jSONObject2.put("url", wcxVar.kq());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", umlVar.pcj());
            jSONObject.put("interaction_type", umlVar.wqw());
            jSONObject.put("interaction_method", umlVar.uaj());
            jSONObject.put("is_compliance_template", bob());
            jSONObject.put("title", umlVar.gg());
            jSONObject.put("description", umlVar.be());
            jSONObject.put("source", umlVar.fsp());
            JSONObject jSONObject3 = new JSONObject();
            gm gmVarEbt = umlVar.ebt();
            if (gmVarEbt == null) {
                gmVarEbt = new gm();
            }
            jSONObject3.put("ceiling_time", gmVarEbt.fou());
            jSONObject3.put("ceiling_ratio", gmVarEbt.csi());
            jSONObject3.put("expand_ratio", gmVarEbt.rhi());
            jSONObject.put("interaction_params", jSONObject3);
            if (umlVar.xo() != null) {
                jSONObject.put("comment_num", umlVar.xo().csi());
                jSONObject.put("score", umlVar.xo().fou());
                jSONObject.put("app_size", umlVar.xo().rhi());
                jSONObject.put("app", umlVar.xo().syt());
            }
            c cVarJob = umlVar.job();
            if (cVarJob != null) {
                JSONObject jSONObjectM = cVarJob.M();
                jSONObjectM.put("video_duration", cVarJob.B() * ((double) cVarJob.n()));
                jSONObject.put(MimeTypes.BASE_TYPE_VIDEO, jSONObjectM);
            }
            if (umlVar.zp() != null) {
                jSONObject.put("dynamic_creative", umlVar.zp().dgq());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String kq(uml umlVar, String str) {
        List<wcx> listKiq;
        if (umlVar != null && (listKiq = umlVar.kiq()) != null && listKiq.size() > 0) {
            for (wcx wcxVar : listKiq) {
                if (wcxVar != null && TextUtils.equals(str, wcxVar.kq())) {
                    return wcxVar.rjo();
                }
            }
        }
        return null;
    }
}
