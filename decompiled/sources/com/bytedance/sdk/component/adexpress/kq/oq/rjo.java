package com.bytedance.sdk.component.adexpress.kq.oq;

import android.text.TextUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rjo {
    private static volatile rjo kq;
    private AtomicBoolean oq = new AtomicBoolean(false);

    private rjo() {
    }

    private JSONObject bob(String str) {
        com.bytedance.sdk.component.adexpress.kq.kq.bob bobVarBob = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob();
        if (bobVarBob == null) {
            return null;
        }
        com.bytedance.sdk.component.rjo.oq.oq oqVarRjo = bobVarBob.rjo();
        oqVarRjo.oq(str);
        com.bytedance.sdk.component.rjo.oq oqVarKq = oqVarRjo.kq();
        if (oqVarKq != null) {
            try {
                if (oqVarKq.rhi() && oqVarKq.fou() != null) {
                    return new JSONObject(oqVarKq.fou());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Set<String> oq(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return rhi.kq().oq(str);
    }

    public static rjo kq() {
        if (kq == null) {
            synchronized (rjo.class) {
                try {
                    if (kq == null) {
                        kq = new rjo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }

    private void oq() {
        if (com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob() == null) {
            return;
        }
        int iKq = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().kq();
        if (iKq <= 0) {
            iKq = 100;
        }
        List<com.bytedance.sdk.component.adexpress.kq.bob.oq> listOq = rhi.kq().oq();
        if (listOq == null || listOq.isEmpty() || iKq >= listOq.size()) {
            if (listOq == null) {
                return;
            }
            listOq.size();
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.component.adexpress.kq.bob.oq oqVar : listOq) {
            treeMap.put(oqVar.rjo(), oqVar);
        }
        HashSet hashSet = new HashSet();
        int size = (int) (listOq.size() - (iKq * 0.75f));
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i10 < size) {
                i10++;
                ((Long) entry.getKey()).getClass();
                com.bytedance.sdk.component.adexpress.kq.bob.oq oqVar2 = (com.bytedance.sdk.component.adexpress.kq.bob.oq) entry.getValue();
                if (oqVar2 != null) {
                    hashSet.add(oqVar2.oq());
                }
            }
        }
        kq(hashSet);
        this.oq.set(false);
    }

    public com.bytedance.sdk.component.adexpress.kq.bob.oq kq(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return rhi.kq().kq(str);
    }

    public void kq(com.bytedance.sdk.component.adexpress.kq.bob.fou fouVar, String str) {
        String strSyt;
        if (fouVar == null) {
            return;
        }
        final String str2 = fouVar.kq;
        final String str3 = fouVar.bob;
        final String str4 = fouVar.oq;
        final String str5 = fouVar.fou;
        final String str6 = fouVar.csi;
        if (com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob() != null) {
            strSyt = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().syt();
        } else {
            strSyt = "";
        }
        final String str7 = TextUtils.isEmpty(str) ? strSyt : str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.fou.fou.kq(new com.bytedance.sdk.component.syt.syt("saveTemplate") { // from class: com.bytedance.sdk.component.adexpress.kq.oq.rjo.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                rjo.this.kq(str2, str3, str4, str5, str6, str7);
            }
        }, 10);
    }

    private void oq(String str, String str2, String str3, String str4, String str5, String str6) {
        rhi.kq().kq(new com.bytedance.sdk.component.adexpress.kq.bob.oq().kq(str).oq(str2).bob(str3).fou(str4).csi(str5).rhi(str6).kq(Long.valueOf(System.currentTimeMillis())), false);
        oq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void kq(String str, String str2, String str3, String str4, String str5, String str6) throws Throwable {
        String str7;
        try {
            try {
                if (kq(str) != null) {
                    if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                        return;
                    }
                    str7 = str5;
                    oq(str6, str, str3, str2, str4, str7);
                } else {
                    str7 = str5;
                    if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                        kq(str2, str6, str);
                    } else {
                        oq(str6, str, str3, str2, str4, str7);
                    }
                }
                boolean zKq = syt.kq(str7);
                if (!oq.csi() || zKq) {
                    csi.oq().kq(true);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private void kq(String str, String str2, String str3) {
        JSONObject jSONObjectBob;
        if (TextUtils.isEmpty(str) || (jSONObjectBob = bob(str)) == null) {
            return;
        }
        String strOptString = jSONObjectBob.optString("md5");
        String strOptString2 = jSONObjectBob.optString("version");
        String strOptString3 = jSONObjectBob.optString(JsonStorageKeyNames.DATA_KEY);
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.kq.bob.oq oqVarKq = new com.bytedance.sdk.component.adexpress.kq.bob.oq().kq(str2).oq(str3).bob(strOptString).fou(str).csi(strOptString3).rhi(strOptString2).kq(Long.valueOf(System.currentTimeMillis()));
        rhi.kq().kq(oqVarKq, false);
        oq();
        if (syt.kq(strOptString2)) {
            oqVarKq.rhi(strOptString2);
            csi.oq().kq(true);
        }
    }

    public void kq(Set<String> set) {
        try {
            rhi.kq().kq(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
