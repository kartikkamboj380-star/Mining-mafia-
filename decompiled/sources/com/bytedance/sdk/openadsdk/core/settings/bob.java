package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.utils.wf;
import com.bytedance.sdk.openadsdk.utils.wki;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private static final ConcurrentHashMap<String, oq> kq = new ConcurrentHashMap<>();

    public static void kq(boolean z9) {
        File fileOq = oq();
        try {
            if (fileOq.exists()) {
                HashMap<String, oq> mapOq = oq(new JSONArray(new String(com.bytedance.sdk.component.utils.rjo.fou(fileOq))));
                if (mapOq.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, oq> entry : mapOq.entrySet()) {
                    kq.put(entry.getKey(), entry.getValue());
                }
                return;
            }
            String strOq = com.bytedance.sdk.openadsdk.multipro.oq.bob() ? com.bytedance.sdk.openadsdk.multipro.fou.kq.oq("tt_sdk_settings", "ad_slot_conf", null) : wf.kq("tt_sdk_settings", sns.kq()).kq("ad_slot_conf", (String) null);
            if (TextUtils.isEmpty(strOq)) {
                return;
            }
            HashMap<String, oq> mapOq2 = oq(new JSONArray(strOq));
            if (mapOq2.isEmpty()) {
                return;
            }
            ConcurrentHashMap<String, oq> concurrentHashMap = kq;
            concurrentHashMap.clear();
            concurrentHashMap.putAll(mapOq2);
        } catch (Exception unused) {
        }
    }

    @NonNull
    private static HashMap<String, oq> oq(JSONArray jSONArray) {
        HashMap<String, oq> map = new HashMap<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                oq oqVarKq = kq(jSONArray.getJSONObject(i10));
                if (oqVarKq != null) {
                    map.put(oqVarKq.kq, oqVarKq);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    @NonNull
    private static File oq() {
        return new File(sns.kq().getFilesDir(), "tt_ads_conf_sr");
    }

    private static oq oq(String str) {
        return new oq(str, 1);
    }

    private static oq kq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new oq(jSONObject);
    }

    @NonNull
    public static oq kq(String str) {
        oq oqVar = kq.get(str);
        return oqVar == null ? oq(str) : oqVar;
    }

    public static void kq(JSONArray jSONArray) throws Throwable {
        if (jSONArray == null) {
            return;
        }
        File fileOq = oq();
        File file = new File(fileOq.getParent(), fileOq.getName() + ".tmp");
        FileWriter fileWriter = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                FileWriter fileWriter2 = new FileWriter(file);
                try {
                    fileWriter2.write(jSONArray.toString());
                    file.renameTo(fileOq);
                    wf.kq("tt_sdk_settings", sns.kq()).kq("ad_slot_conf");
                    if (file.exists()) {
                        file.delete();
                    }
                    wki.kq(fileWriter2);
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    Log.e("SdkSettings.AdSlot", "saveAdSlotToLocal: ", e);
                    if (file.exists()) {
                        file.delete();
                    }
                    wki.kq(fileWriter);
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    if (file.exists()) {
                        file.delete();
                    }
                    wki.kq(fileWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        HashMap<String, oq> mapOq = oq(jSONArray);
        if (mapOq.isEmpty()) {
            return;
        }
        for (Map.Entry<String, oq> entry : mapOq.entrySet()) {
            kq.put(entry.getKey(), entry.getValue());
        }
    }

    public static void kq() {
        File fileOq = oq();
        if (fileOq.exists()) {
            fileOq.delete();
        }
    }
}
