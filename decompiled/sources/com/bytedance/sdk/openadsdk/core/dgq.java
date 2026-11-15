package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class dgq {
    public static wki kq = null;
    public static final Set<String> oq = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.dgq.1
        {
            add("8025677");
            add("5001121");
        }
    };
    private static boolean wki = false;
    private boolean bob;
    private String csi;
    private int dgq;

    @NonNull
    private String fou;
    private String mxq;
    private Bitmap nn;
    private boolean nze;

    @NonNull
    private String rhi;
    private int rjo;
    private com.bytedance.sdk.openadsdk.core.wki.bob.bob sns;
    private String suf;
    private String syt;
    private Integer ubx;
    private int vvw;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.core.fou.rjo.kq> wcx;

    private static class kq {
        private static final dgq kq = new dgq();
    }

    public static int csi() {
        try {
            String strKq = kq("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strKq)) {
                return 0;
            }
            return Integer.valueOf(strKq).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static boolean jhe() {
        return wki;
    }

    @NonNull
    public static dgq oq() {
        return kq.kq;
    }

    public static int rhi() {
        try {
            String strKq = kq("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strKq)) {
                return 0;
            }
            return Integer.valueOf(strKq).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static void uml() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            wki = true;
        }
    }

    public boolean bob() {
        return com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("sp_global_file", "sdk_activate_init", true);
    }

    public int dgq() {
        return com.bytedance.sdk.openadsdk.multipro.oq.bob() ? com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("sp_global_icon_id", "icon_id", 0) : this.rjo;
    }

    public String fax() {
        if (!TextUtils.isEmpty(this.mxq)) {
            return this.mxq;
        }
        String strKq = com.bytedance.sdk.openadsdk.utils.vvw.kq();
        this.mxq = strKq;
        if (!TextUtils.isEmpty(strKq)) {
            return this.mxq;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.vvw.kq(strValueOf);
        this.mxq = strValueOf;
        return strValueOf;
    }

    public String fou() {
        if (TextUtils.isEmpty(this.fou)) {
            String strKq = kq("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strKq)) {
                this.fou = strKq;
            }
        }
        return this.fou;
    }

    public boolean gm() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.wol.rhi());
    }

    public void mq() {
        try {
            if (this.wcx == null || this.wcx.size() != 0) {
                return;
            }
            this.wcx = null;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public Bitmap mxq() {
        return com.bytedance.sdk.openadsdk.multipro.oq.bob() ? com.bytedance.sdk.component.utils.fou.kq(com.bytedance.sdk.openadsdk.multipro.fou.fou.oq("sp_global_file", "pause_icon", null)) : this.nn;
    }

    public String nb() {
        return com.bytedance.sdk.openadsdk.multipro.oq.bob() ? com.bytedance.sdk.openadsdk.multipro.fou.fou.oq("sp_global_file", "adx_id", "") : this.suf;
    }

    public int nn() {
        Integer num = this.ubx;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("sp_global_privacy", "tt_gdpr", -1);
    }

    public boolean nze() {
        return true;
    }

    public String rjo() {
        String str = this.csi;
        if (str != null) {
            return str;
        }
        String strKq = kq("mediation_info", Long.MAX_VALUE);
        this.csi = strKq;
        if (strKq == null) {
            this.csi = "";
        }
        return this.csi;
    }

    public boolean sns() {
        return oq.contains(this.fou);
    }

    public com.bytedance.sdk.openadsdk.core.wki.bob.bob suf() {
        if (this.sns == null) {
            this.sns = new com.bytedance.sdk.openadsdk.core.wki.bob.bob(10, 8);
        }
        return this.sns;
    }

    @NonNull
    public String syt() {
        if (TextUtils.isEmpty(this.rhi)) {
            this.rhi = kq(sns.kq());
        }
        return this.rhi;
    }

    public int ubx() {
        return this.vvw;
    }

    public boolean vvw() {
        int i10 = this.vvw;
        return i10 < -1 || i10 > 1;
    }

    public boolean wcx() {
        return "5001121".contains(this.fou);
    }

    public String wki() {
        return com.bytedance.sdk.openadsdk.multipro.oq.bob() ? com.bytedance.sdk.openadsdk.multipro.fou.fou.oq("sp_global_file", "extra_data", null) : this.syt;
    }

    private dgq() {
        this.bob = false;
        this.dgq = 0;
        this.nn = null;
        this.ubx = null;
        this.vvw = -1;
        this.wcx = null;
    }

    private static void ubx(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        wki wkiVar = kq;
        if (wkiVar != null) {
            wkiVar.kq(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.fax.bob("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    private static JSONObject vvw(String str) {
        String strOq = com.bytedance.sdk.openadsdk.multipro.fou.fou.oq("sp_global_file", str, null);
        if (TextUtils.isEmpty(strOq)) {
            return null;
        }
        try {
            return new JSONObject(strOq);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    public void bob(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("sp_global_icon_id", "icon_id", Integer.valueOf(i10));
        }
        this.rjo = i10;
    }

    public void oq(boolean z9) {
        com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("sp_global_file", "sdk_activate_init", Boolean.valueOf(z9));
    }

    public static void kq(wki wkiVar) {
        kq = wkiVar;
    }

    public static void oq(int i10) {
        if (i10 >= 0) {
            kq("config_fail_times", String.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dgq(String str) {
        if (!TextUtils.isEmpty(this.syt)) {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArray = new JSONArray(this.syt);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString(MediationMetaData.KEY_NAME);
                        if (!TextUtils.isEmpty(strOptString)) {
                            map.put(strOptString, jSONObjectOptJSONObject);
                        }
                    }
                }
                JSONArray jSONArray2 = new JSONArray(str);
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i11);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString(MediationMetaData.KEY_NAME);
                        String strOptString3 = jSONObjectOptJSONObject2.optString("value");
                        if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                            map.put(strOptString2, jSONObjectOptJSONObject2);
                        }
                    }
                }
                Collection collectionValues = map.values();
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    jSONArray3.put((JSONObject) it.next());
                }
                this.syt = jSONArray3.toString();
            } catch (Throwable th) {
                th.getMessage();
            }
        } else {
            this.syt = str;
        }
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("sp_global_file", "extra_data", this.syt);
        }
    }

    private static void nn(String str) {
        wki wkiVar;
        if (TextUtils.isEmpty(str) && (wkiVar = kq) != null) {
            wkiVar.kq(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.fax.bob("TTAD.GlobalInfo", "appid cannot be empty");
    }

    public boolean kq() {
        return this.nze;
    }

    public void oq(String str) {
        this.csi = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        kq("mediation_info", str);
    }

    public void syt(String str) {
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("sp_global_file", "adx_id", str);
        }
        this.suf = str;
    }

    public static boolean rjo(String str) {
        return (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public void bob(final String str) {
        ubx(str);
        if (com.bytedance.sdk.openadsdk.utils.nz.rhi()) {
            suf.oq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dgq.3
                @Override // java.lang.Runnable
                public void run() {
                    dgq.this.dgq(str);
                }
            });
        } else {
            dgq(str);
        }
    }

    public void csi(int i10) {
        this.vvw = i10;
    }

    public void kq(boolean z9) {
        this.nze = z9;
    }

    public void rhi(int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("sp_global_file", "title_bar_theme", Integer.valueOf(i10));
        }
        this.dgq = i10;
    }

    public static void kq(int i10) {
        if (i10 >= 0) {
            kq("domain_index", String.valueOf(i10));
        }
    }

    public com.bytedance.sdk.openadsdk.core.fou.rjo.kq csi(String str) {
        try {
            if (this.wcx == null || str == null) {
                return null;
            }
            return this.wcx.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void fou(final int i10) {
        if (i10 == 1) {
            i10 = 0;
        } else if (i10 == 0) {
            i10 = 1;
        }
        if (i10 == 0 || i10 == 1 || i10 == -1) {
            final Integer num = this.ubx;
            if (num == null || num.intValue() != i10) {
                this.ubx = Integer.valueOf(i10);
                if (!com.bytedance.sdk.openadsdk.utils.nz.rhi()) {
                    kq(num, i10);
                } else {
                    suf.oq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dgq.2
                        @Override // java.lang.Runnable
                        public void run() {
                            dgq.this.kq(num, i10);
                        }
                    });
                }
            }
        }
    }

    public void kq(@NonNull String str) {
        nn(str);
        this.fou = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        kq("app_id", str);
        com.bytedance.sdk.openadsdk.core.settings.ubx.bob().fou(7);
    }

    public void rhi(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                com.bytedance.sdk.openadsdk.bob.nn.kq(6, str);
            } else if (this.wcx != null) {
                this.wcx.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public void bob(boolean z9) {
        this.bob = z9;
    }

    public static Pair<String, Long> fou(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectVvw = vvw(str);
            if (jSONObjectVvw == null) {
                return null;
            }
            return new Pair<>(jSONObjectVvw.getString("value"), Long.valueOf(jSONObjectVvw.getLong("time")));
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.GlobalInfo", e10.getMessage());
            return null;
        }
    }

    private String kq(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(Integer num, int i10) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.ubx.bob().kq(4, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("sp_global_privacy", "tt_gdpr", -1) != i10) {
            com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("sp_global_privacy", "tt_gdpr", Integer.valueOf(i10));
            com.bytedance.sdk.openadsdk.core.settings.ubx.bob().kq(4, true);
        }
    }

    public static void kq(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.GlobalInfo", e10.getMessage());
        }
    }

    public static String kq(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectVvw = vvw(str);
            if (jSONObjectVvw == null) {
                return null;
            }
            if (System.currentTimeMillis() - jSONObjectVvw.getLong("time") <= j10) {
                return jSONObjectVvw.getString("value");
            }
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.fax.bob("TTAD.GlobalInfo", e10.getMessage());
        }
        return null;
    }

    public void kq(String str, com.bytedance.sdk.openadsdk.core.fou.rjo.kq kqVar) {
        try {
            if (TextUtils.isEmpty(str) || kqVar == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                com.bytedance.sdk.openadsdk.bob.nn.kq(6, str, kqVar);
                return;
            }
            if (this.wcx == null) {
                synchronized (dgq.class) {
                    try {
                        if (this.wcx == null) {
                            this.wcx = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.wcx != null) {
                this.wcx.put(str, kqVar);
            }
        } catch (Throwable unused) {
        }
    }
}
