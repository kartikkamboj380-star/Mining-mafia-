package com.bytedance.sdk.openadsdk.fax.kq.kq;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.syt.syt;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.dgq;
import com.bytedance.sdk.openadsdk.core.model.rhi;
import com.bytedance.sdk.openadsdk.core.model.rs;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.core.model.wki;
import com.bytedance.sdk.openadsdk.core.nz;
import com.bytedance.sdk.openadsdk.core.nze;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.csi;
import com.bytedance.sdk.openadsdk.utils.wol;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq implements bob {
    private final WeakReference<Context> bob;
    protected String kq;
    protected int oq;

    public oq(Context context, String str) {
        this.bob = new WeakReference<>(context);
        this.kq = str;
        "====tag===".concat(String.valueOf(str));
        if (sns.kq() == null) {
            sns.oq(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void csi(uml umlVar) {
        if (oq(umlVar)) {
            umlVar.csi(true);
            csi.kq(umlVar);
            return;
        }
        if (fou(umlVar)) {
            umlVar.csi(true);
            csi.kq(umlVar);
            return;
        }
        if (kq(umlVar, false)) {
            csi.kq(umlVar);
            return;
        }
        if (bob(umlVar)) {
            umlVar.csi(true);
            csi.kq(umlVar);
        } else {
            if (umlVar.xo() != null || umlVar.ze() == null) {
                return;
            }
            nz.kq(kq(), umlVar.ze(), umlVar, wol.kq(this.kq), this.kq, true);
            umlVar.csi(true);
            csi.kq(umlVar);
        }
    }

    private static boolean oq() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.fax.kq.kq.bob
    public boolean bob(uml umlVar) {
        rhi rhiVarXo;
        if (umlVar == null || (rhiVarXo = umlVar.xo()) == null) {
            return false;
        }
        return kq(kq(), umlVar, rhiVarXo.kq(), rhiVarXo.bob());
    }

    @Override // com.bytedance.sdk.openadsdk.fax.kq.kq.bob
    public boolean fou(uml umlVar) {
        rhi rhiVarXo;
        if (umlVar == null || (rhiVarXo = umlVar.xo()) == null || umlVar.czb() == 0) {
            return false;
        }
        String strBob = rhiVarXo.bob();
        if (TextUtils.isEmpty(strBob)) {
            return false;
        }
        return kq(umlVar, strBob, kq(), this.kq, new HashMap());
    }

    public static boolean kq(Context context, String str, String str2, String str3, uml umlVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.fou.bob.oq(umlVar, str3, "store_open", (JSONObject) null);
                csi.kq(umlVar);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(uri);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        com.bytedance.sdk.openadsdk.fou.bob.oq(umlVar, str3, "store_open", (JSONObject) null);
                        csi.kq(umlVar);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th);
            }
        }
        return false;
    }

    public boolean oq(uml umlVar) {
        com.bytedance.sdk.openadsdk.core.fou.kq(umlVar, this.kq, 1, null);
        wki wkiVarNe = umlVar.ne();
        if (wkiVarNe == null) {
            com.bytedance.sdk.openadsdk.core.fou.kq(umlVar, this.kq, -1, null);
            return false;
        }
        HashMap map = new HashMap();
        kq(umlVar, map);
        if (kq.kq(kq(), wkiVarNe.kq(), umlVar, wol.oq(umlVar), map, true)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.fou.bob.kq(umlVar, this.kq, "open_fallback_url", map);
        return false;
    }

    public static boolean oq(uml umlVar, Context context, boolean z9) {
        String strBob;
        IPBroadcastReceiver iPBroadcastReceiverKq;
        if (umlVar != null && context != null) {
            try {
                rs rsVarWe = umlVar.we();
                if (rsVarWe != null && !TextUtils.isEmpty(rsVarWe.nn())) {
                    if (rsVarWe.dgq() && kq(umlVar, context, z9)) {
                        return true;
                    }
                    if (rsVarWe.rjo() || rsVarWe.syt()) {
                        if (umlVar.wcx() == 1) {
                            strBob = rsVarWe.kq();
                        } else {
                            strBob = (umlVar.xo() == null || TextUtils.isEmpty(umlVar.xo().bob())) ? null : umlVar.xo().bob();
                        }
                        if (!TextUtils.isEmpty(strBob) && (iPBroadcastReceiverKq = IPBroadcastReceiver.kq(context, umlVar)) != null) {
                            iPBroadcastReceiverKq.kq(strBob, umlVar);
                        }
                    }
                    final boolean zKq = kq.kq(context, rsVarWe.nn(), umlVar, wol.oq(umlVar), kq(umlVar, z9, rsVarWe), true);
                    com.bytedance.sdk.openadsdk.utils.nz.oq(new syt("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.fax.kq.kq.oq.4
                        @Override // java.lang.Runnable
                        public void run() {
                            if (zKq) {
                                dgq.kq("oem_store", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                            } else {
                                dgq.kq("oem_store", "-2");
                            }
                        }
                    });
                    return zKq;
                }
            } catch (Throwable th) {
                fax.bob("GPDownLoader", th.getMessage());
            }
        }
        return false;
    }

    public static boolean kq(uml umlVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentKq;
        if (umlVar != null && umlVar.czb() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentKq = wol.kq(context, str)) == null) {
                return false;
            }
            intentKq.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentKq.addFlags(268435456);
            }
            context.startActivity(intentKq);
            if (map == null) {
                map = new HashMap<>();
            }
            if (umlVar != null && umlVar.ty() == 0) {
                map.put("auto_click", Boolean.valueOf(!umlVar.gm()));
            }
            map.put("can_query_install", Integer.valueOf(oq() ? 1 : 0));
            com.bytedance.sdk.openadsdk.fou.bob.kq(umlVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.fax.kq.kq.bob
    public void kq(int i10) {
        this.oq = i10;
    }

    public boolean kq(Context context, uml umlVar, String str, String str2) {
        return kq(context, str, str2, this.kq, umlVar);
    }

    protected Context kq() {
        WeakReference<Context> weakReference = this.bob;
        return (weakReference == null || weakReference.get() == null) ? sns.kq() : this.bob.get();
    }

    @Override // com.bytedance.sdk.openadsdk.fax.kq.kq.bob
    public void kq(final uml umlVar) {
        if (kq() == null || umlVar == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.jhe.kq.kq("gp_downloader_async", 0) == 1) {
            com.bytedance.sdk.openadsdk.utils.nz.dgq().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.fax.kq.kq.oq.1
                @Override // java.lang.Runnable
                public void run() {
                    oq.this.csi(umlVar);
                }
            });
        } else {
            csi(umlVar);
        }
    }

    private void kq(uml umlVar, Map<String, Object> map) {
        if (umlVar != null && umlVar.ty() == 0) {
            map.put("auto_click", Boolean.valueOf(!umlVar.gm()));
        }
        if (umlVar != null && umlVar.ty() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.oq >= 11));
        }
        map.put("can_query_install", Integer.valueOf(oq() ? 1 : 0));
    }

    public boolean kq(uml umlVar, boolean z9) {
        return oq(umlVar, kq(), z9);
    }

    private static void kq(final JSONObject jSONObject, uml umlVar, String str, final int i10) {
        try {
            com.bytedance.sdk.openadsdk.fou.bob.kq(System.currentTimeMillis(), umlVar, str, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.mxq.bob.kq() { // from class: com.bytedance.sdk.openadsdk.fax.kq.kq.oq.2
                @Override // com.bytedance.sdk.openadsdk.mxq.bob.kq, com.bytedance.sdk.openadsdk.mxq.bob.oq
                public JSONObject kq() {
                    try {
                        jSONObject.put("status", i10);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static boolean kq(uml umlVar, Context context, boolean z9) {
        if (umlVar != null && umlVar.we() != null && umlVar.we().dgq() && !TextUtils.isEmpty(umlVar.we().nn()) && context != null) {
            try {
                rs rsVarWe = umlVar.we();
                String strKq = wol.kq(umlVar);
                final JSONObject jSONObjectUbx = rsVarWe.ubx();
                jSONObjectUbx.put("from_web", z9 ? 1 : 0);
                jSONObjectUbx.put("is_w2a", umlVar.wcx());
                com.bytedance.sdk.openadsdk.fou.bob.kq(System.currentTimeMillis(), umlVar, strKq, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.mxq.bob.kq() { // from class: com.bytedance.sdk.openadsdk.fax.kq.kq.oq.3
                    @Override // com.bytedance.sdk.openadsdk.mxq.bob.kq, com.bytedance.sdk.openadsdk.mxq.bob.oq
                    public JSONObject kq() {
                        try {
                            jSONObjectUbx.put("status", 0);
                        } catch (Throwable unused) {
                        }
                        return jSONObjectUbx;
                    }
                });
                Intent intentKq = kq(context, rsVarWe);
                if (intentKq == null) {
                    kq(jSONObjectUbx, umlVar, strKq, -2);
                    return false;
                }
                if (context instanceof Activity) {
                    if (!com.bytedance.sdk.openadsdk.utils.uml.kq((Activity) context)) {
                        context = null;
                    }
                } else {
                    Activity activityOq = nze.kq().csi().oq();
                    if (activityOq != null && com.bytedance.sdk.openadsdk.utils.uml.kq(activityOq)) {
                        context = activityOq;
                    }
                }
                if (!(context instanceof Activity)) {
                    kq(jSONObjectUbx, umlVar, strKq, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && intentKq.resolveActivity(packageManager) != null) {
                    try {
                        ((Activity) context).startActivityForResult(intentKq, 0);
                        kq(jSONObjectUbx, umlVar, strKq, 1);
                        return true;
                    } catch (Throwable unused) {
                        kq(jSONObjectUbx, umlVar, strKq, -3);
                        return false;
                    }
                }
                kq(jSONObjectUbx, umlVar, strKq, -4);
                return false;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    private static Intent kq(Context context, rs rsVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String strFou = rsVar.fou();
            if (!TextUtils.isEmpty(strFou)) {
                intent.setPackage(strFou);
            } else {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(rsVar.nn()));
            boolean z9 = true;
            if (rsVar.oq() != 1) {
                z9 = false;
            }
            intent.putExtra("overlay", z9);
            if (TextUtils.isEmpty(rsVar.bob())) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", rsVar.bob());
            }
            rsVar.kq(intent);
            return intent;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    @NonNull
    private static Map<String, Object> kq(uml umlVar, boolean z9, rs rsVar) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", rsVar.rhi());
            jSONObject.put("from_web", z9 ? 1 : 0);
            jSONObject.put("is_w2a", umlVar.wcx());
            map.put("pag_json_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        return map;
    }

    public static boolean kq(String str, uml umlVar) {
        String queryParameter;
        if (str != null && !str.isEmpty()) {
            try {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                if ("market".equals(scheme) && "details".equals(host)) {
                    return true;
                }
                if ((!"http".equals(scheme) && !HttpRequest.DEFAULT_SCHEME.equals(scheme)) || (!"play.google.com".equals(host) && !"market.android.com".equals(host))) {
                    if ("market".equals(scheme) && "webstoreredirect".equals(host) && (queryParameter = uri.getQueryParameter("uri")) != null) {
                        return kq(queryParameter, umlVar);
                    }
                }
                return true;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    public static boolean kq(uml umlVar, String str) {
        if (umlVar == null || umlVar.we() == null) {
            return false;
        }
        String strCsi = umlVar.we().csi();
        if (TextUtils.isEmpty(strCsi)) {
            return false;
        }
        return Pattern.compile(strCsi).matcher(str).matches();
    }
}
