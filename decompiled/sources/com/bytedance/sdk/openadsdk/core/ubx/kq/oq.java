package com.bytedance.sdk.openadsdk.core.ubx.kq;

import android.text.TextUtils;
import com.bytedance.sdk.component.syt.syt;
import com.bytedance.sdk.openadsdk.core.dgq;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.utils.nz;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private static volatile oq kq;

    public interface kq {
        void kq(int i10, String str, String str2);

        void kq(JSONObject jSONObject, String str);
    }

    private void oq(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.ubx.kq.kq kqVar = new com.bytedance.sdk.openadsdk.core.ubx.kq.kq();
        kqVar.bob(str).csi(str3).fou(str4).oq(str2).kq(str5).kq(Long.valueOf(System.currentTimeMillis()));
        bob.kq().kq(kqVar);
        oq();
    }

    public static oq kq() {
        if (kq == null) {
            synchronized (oq.class) {
                try {
                    if (kq == null) {
                        kq = new oq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }

    public void kq(com.bytedance.sdk.openadsdk.core.ubx.syt.kq kqVar, String str) {
        if (kqVar == null || TextUtils.isEmpty(kqVar.kq())) {
            return;
        }
        final String str2 = str + "_" + kqVar.kq();
        final String strBob = kqVar.bob();
        final String strOq = kqVar.oq();
        final String strFou = kqVar.fou();
        String strCsi = kqVar.csi();
        if (TextUtils.isEmpty(strCsi)) {
            if (str.equals("ad")) {
                strCsi = dgq.oq().fou();
            } else if (str.equals("adv3")) {
                strCsi = dgq.oq().fou() + "_v3";
            }
        }
        final String str3 = strCsi;
        nz.kq(new syt("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.ubx.kq.oq.1
            @Override // java.lang.Runnable
            public void run() {
                oq.this.kq(str2, strBob, strOq, strFou, str3);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq() {
        int iRhi = sns.fou().rhi();
        if (iRhi <= 0) {
            iRhi = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.ubx.kq.kq> listOq = bob.kq().oq();
        if (listOq == null || listOq.isEmpty() || iRhi >= listOq.size()) {
            if (listOq == null) {
                return;
            }
            listOq.size();
            return;
        }
        int size = (int) (listOq.size() - (iRhi * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.ubx.kq.kq kqVar : listOq) {
            treeMap.put(kqVar.fou(), kqVar);
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i10 < size) {
                i10++;
                com.bytedance.sdk.openadsdk.core.ubx.kq.kq kqVar2 = (com.bytedance.sdk.openadsdk.core.ubx.kq.kq) entry.getValue();
                if (kqVar2 != null) {
                    hashSet.add(kqVar2.kq());
                }
            }
        }
        kq(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(String str, String str2, String str3, String str4, String str5) {
        if (kq(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            oq(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            kq(str2, str, str3, str5, (kq) null);
        } else {
            oq(str2, str3, str5, str4, str);
        }
    }

    public void kq(String str, String str2, String str3, String str4, String str5, final kq kqVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (kqVar != null) {
                kqVar.kq(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String str6 = str + "_" + str3;
        com.bytedance.sdk.openadsdk.core.ubx.kq.kq kqVarKq = kq(str6, str4);
        if (kqVarKq != null && !TextUtils.isEmpty(kqVarKq.csi())) {
            kq(kqVarKq);
            if (kqVar != null) {
                try {
                    kqVar.kq(new JSONObject(kqVarKq.csi()), "local");
                    return;
                } catch (JSONException unused) {
                    kqVar.kq(2, "parse json exception data is " + kqVarKq.csi(), "local");
                    return;
                }
            }
            return;
        }
        kq(str2, str6, str4, str5, new kq() { // from class: com.bytedance.sdk.openadsdk.core.ubx.kq.oq.2
            @Override // com.bytedance.sdk.openadsdk.core.ubx.kq.oq.kq
            public void kq(JSONObject jSONObject, String str7) {
                kq kqVar2 = kqVar;
                if (kqVar2 != null) {
                    kqVar2.kq(jSONObject, str7);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ubx.kq.oq.kq
            public void kq(int i10, String str7, String str8) {
                kq kqVar2 = kqVar;
                if (kqVar2 != null) {
                    kqVar2.kq(i10, str7, str8);
                }
            }
        });
    }

    private void kq(final String str, final String str2, final String str3, final String str4, final kq kqVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (kqVar != null) {
                kqVar.kq(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.rjo.oq.oq oqVarBob = com.bytedance.sdk.openadsdk.gm.oq.oq().bob().bob();
            oqVarBob.oq(str);
            oqVarBob.kq(7);
            oqVarBob.kq("load_ug_t");
            oqVarBob.kq(new com.bytedance.sdk.component.rjo.kq.kq() { // from class: com.bytedance.sdk.openadsdk.core.ubx.kq.oq.3
                @Override // com.bytedance.sdk.component.rjo.kq.kq
                public void kq(com.bytedance.sdk.component.rjo.oq.bob bobVar, com.bytedance.sdk.component.rjo.oq oqVar) {
                    if (oqVar == null) {
                        return;
                    }
                    if (!oqVar.rhi()) {
                        kq kqVar2 = kqVar;
                        if (kqVar2 != null) {
                            kqVar2.kq(3, "net code error code is " + oqVar.kq() + " message is " + oqVar.oq(), "net");
                            return;
                        }
                        return;
                    }
                    String strFou = oqVar.fou();
                    if (TextUtils.isEmpty(strFou)) {
                        kq kqVar3 = kqVar;
                        if (kqVar3 != null) {
                            kqVar3.kq(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    bob.kq().kq(new com.bytedance.sdk.openadsdk.core.ubx.kq.kq().kq(str2).oq(str3).bob(str).csi(str4).fou(strFou).kq(Long.valueOf(System.currentTimeMillis())));
                    oq.this.oq();
                    if (kqVar != null) {
                        try {
                            kqVar.kq(new JSONObject(strFou), "net");
                        } catch (JSONException unused) {
                            kqVar.kq(2, "parse json exception data is".concat(String.valueOf(strFou)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.rjo.kq.kq
                public void kq(com.bytedance.sdk.component.rjo.oq.bob bobVar, IOException iOException) {
                    kq kqVar2 = kqVar;
                    if (kqVar2 != null) {
                        kqVar2.kq(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.ubx.kq.kq> kq(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return bob.kq().kq(str);
    }

    public String kq(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.ubx.kq.kq kqVarKq = kq(str + "_" + str2, str3);
        if (kqVarKq == null) {
            return null;
        }
        kq(kqVarKq);
        return kqVarKq.csi();
    }

    private com.bytedance.sdk.openadsdk.core.ubx.kq.kq kq(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return bob.kq().kq(str, str2);
    }

    private void kq(final com.bytedance.sdk.openadsdk.core.ubx.kq.kq kqVar) {
        kqVar.kq(Long.valueOf(System.currentTimeMillis()));
        nz.kq(new syt("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.ubx.kq.oq.4
            @Override // java.lang.Runnable
            public void run() {
                bob.kq().kq(kqVar);
            }
        }, 10);
    }

    public void kq(Set<String> set) {
        try {
            bob.kq().kq(set);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
