package com.bytedance.sdk.component.adexpress.kq.oq;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.fou.dgq;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    static Object kq = new Object();

    public static String bob() {
        return rhi.bob();
    }

    public static boolean csi() {
        return csi.oq().csi();
    }

    public static com.bytedance.sdk.component.adexpress.kq.bob.kq fou() {
        return csi.oq().rhi();
    }

    public static void kq() {
        csi.oq();
    }

    public static void oq() {
        try {
            syt.fou();
            File fileSyt = csi.syt();
            if (fileSyt == null || !fileSyt.exists()) {
                return;
            }
            if (fileSyt.getParentFile() != null) {
                com.bytedance.sdk.component.utils.rjo.bob(fileSyt.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.rjo.bob(fileSyt);
            }
        } catch (Throwable unused) {
        }
    }

    private static String rhi() {
        com.bytedance.sdk.component.adexpress.kq.bob.kq kqVarFou = fou();
        if (kqVarFou == null) {
            return null;
        }
        return kqVarFou.fou();
    }

    private static File rjo(String str) {
        List<Pair<String, String>> listOq;
        com.bytedance.sdk.component.adexpress.kq.bob.kq.oq oqVarCsi = fou().csi();
        if (oqVarCsi != null && (listOq = oqVarCsi.oq()) != null && listOq.size() > 0) {
            for (Pair<String, String> pair : listOq) {
                Object obj = pair.second;
                if (obj != null && ((String) obj).equals(str)) {
                    return new File(csi.syt(), (String) pair.first);
                }
            }
        }
        return null;
    }

    public static com.bytedance.sdk.component.adexpress.kq.bob.oq bob(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.kq.bob.oq oqVarKq = rjo.kq().kq(str);
        if (oqVarKq != null) {
            oqVarKq.kq(Long.valueOf(System.currentTimeMillis()));
            kq(oqVarKq);
        }
        return oqVarKq;
    }

    private static boolean csi(String str) {
        com.bytedance.sdk.component.adexpress.kq.bob.kq kqVarFou;
        List<com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq> listRhi;
        if (!csi() || (kqVarFou = fou()) == null || (listRhi = kqVarFou.rhi()) == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq c0238kq : listRhi) {
            if (c0238kq != null && TextUtils.equals(str, c0238kq.kq())) {
                return true;
            }
        }
        return false;
    }

    public static String fou(String str) {
        com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar;
        com.bytedance.sdk.component.adexpress.kq.bob.kq kqVarFou = fou();
        if (kqVarFou == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return rhi();
        }
        Map<String, com.bytedance.sdk.component.adexpress.kq.bob.kq> mapKq = kqVarFou.kq();
        if (mapKq == null || mapKq.size() <= 0 || (kqVar = mapKq.get(str)) == null) {
            return null;
        }
        return kqVar.fou();
    }

    public static com.bytedance.sdk.component.adexpress.kq.bob.oq kq(String str) {
        return rjo.kq().kq(str);
    }

    public static void kq(com.bytedance.sdk.component.adexpress.kq.bob.fou fouVar) {
        rjo.kq().kq(fouVar, fouVar.rhi);
    }

    private static File rhi(String str) {
        if (csi()) {
            for (com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq c0238kq : fou().rhi()) {
                if (c0238kq.kq() != null && c0238kq.kq().equals(str)) {
                    File file = new File(csi.syt(), com.bytedance.sdk.component.utils.csi.kq(c0238kq.kq()));
                    String strKq = com.bytedance.sdk.component.utils.csi.kq(file);
                    if (c0238kq.oq() == null || !c0238kq.oq().equals(strKq)) {
                        break;
                    }
                    return file;
                }
            }
        }
        return null;
    }

    private static void kq(final com.bytedance.sdk.component.adexpress.kq.bob.oq oqVar) {
        com.bytedance.sdk.component.adexpress.fou.fou.kq(new com.bytedance.sdk.component.syt.syt("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.kq.oq.oq.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (oq.kq) {
                    rhi.kq().kq(oqVar, true);
                }
            }
        }, 10);
    }

    public static kq kq(String str, dgq.kq kqVar, String str2, String str3) {
        File fileRhi;
        kq kqVar2 = new kq();
        if (TextUtils.isEmpty(str3)) {
            fileRhi = null;
        } else {
            fileRhi = oq(str3, str);
            if (fileRhi != null) {
                kqVar2.kq(1);
            }
        }
        if (fileRhi == null && (fileRhi = rjo(str)) != null) {
            kqVar2.kq(3);
        }
        if (fileRhi == null && (fileRhi = rhi(str)) != null) {
            kqVar2.kq(2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (!kq(str, str3)) {
                kqVar2.kq(4);
            }
        } else if (!csi(str)) {
            kqVar2.kq(6);
        }
        kqVar2.oq();
        if (fileRhi != null) {
            try {
                kqVar2.kq(new WebResourceResponse(kqVar.kq(), "utf-8", new FileInputStream(fileRhi)));
            } catch (Throwable unused) {
            }
        }
        return kqVar2;
    }

    public static Set<String> oq(String str) {
        return rjo.kq().oq(str);
    }

    private static File oq(String str, String str2) {
        com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar;
        com.bytedance.sdk.component.adexpress.kq.bob.kq kqVarFou = fou();
        if (kqVarFou != null && csi()) {
            Map<String, com.bytedance.sdk.component.adexpress.kq.bob.kq> mapKq = kqVarFou.kq();
            if (mapKq.size() != 0 && (kqVar = mapKq.get(str)) != null) {
                for (com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq c0238kq : kqVar.rhi()) {
                    if (c0238kq.kq() != null && c0238kq.kq().equals(str2)) {
                        File file = new File(csi.syt(), com.bytedance.sdk.component.utils.csi.kq(c0238kq.kq()));
                        String strKq = com.bytedance.sdk.component.utils.csi.kq(file);
                        if (c0238kq.oq() == null || !c0238kq.oq().equals(strKq)) {
                            break;
                        }
                        return file;
                    }
                }
            }
        }
        return null;
    }

    public static boolean oq(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    private static boolean kq(String str, String str2) {
        com.bytedance.sdk.component.adexpress.kq.bob.kq kqVarFou;
        com.bytedance.sdk.component.adexpress.kq.bob.kq kqVar;
        if (!csi() || (kqVarFou = fou()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.kq.bob.kq> mapKq = kqVarFou.kq();
        if (mapKq.size() == 0 || (kqVar = mapKq.get(str2)) == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.kq.bob.kq.C0238kq c0238kq : kqVar.rhi()) {
            if (c0238kq != null && TextUtils.equals(str, c0238kq.kq())) {
                return true;
            }
        }
        return false;
    }

    public static boolean kq(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }
}
