package com.bytedance.sdk.openadsdk.nn;

import android.content.Context;
import com.bytedance.sdk.component.csi.fax;
import com.bytedance.sdk.component.csi.mq;
import com.bytedance.sdk.component.csi.nze;
import com.bytedance.sdk.component.oq.kq.rhi;
import com.bytedance.sdk.component.oq.kq.suf;
import com.bytedance.sdk.component.oq.kq.ubx;
import com.bytedance.sdk.component.oq.kq.vvw;
import com.bytedance.sdk.component.utils.nn;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.wcx;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.bytedance.sdk.openadsdk.utils.nz;
import com.bytedance.sdk.openadsdk.utils.xn;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class fou {

    private static final class kq {
        private static final nze oq = kq(sns.kq());
        public static boolean kq = true;
        private static int bob = 10;
        private static int fou = 15;
        private static int csi = 30;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.nn.fou$kq$kq, reason: collision with other inner class name */
        private static class C0313kq implements com.bytedance.sdk.component.csi.fou {
            private C0313kq() {
            }

            @Override // com.bytedance.sdk.component.csi.fou
            /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.component.csi.oq.bob kq(com.bytedance.sdk.component.csi.csi csiVar) {
                ubx ubxVarRhi = com.bytedance.sdk.openadsdk.gm.oq.oq().bob().rhi();
                vvw vvwVarOq = new vvw.kq().oq(csiVar.kq()).kq().oq();
                suf sufVarOq = null;
                com.bytedance.sdk.component.csi.oq.fou fouVar = csiVar.bob() ? new com.bytedance.sdk.component.csi.oq.fou() : null;
                if (fouVar != null) {
                    fouVar.kq(System.currentTimeMillis());
                }
                try {
                    sufVarOq = ubxVarRhi.kq(vvwVarOq).oq();
                    if (fouVar != null) {
                        fouVar.oq(System.currentTimeMillis());
                    }
                    com.bytedance.sdk.component.csi.oq.bob bobVar = new com.bytedance.sdk.component.csi.oq.bob(sufVarOq.bob(), sufVarOq.rhi().fou(), "", kq(csiVar, sufVarOq));
                    nn.kq(sufVarOq);
                    return bobVar;
                } catch (Throwable th) {
                    try {
                        return kq(fouVar, th);
                    } finally {
                        nn.kq(sufVarOq);
                    }
                }
            }

            private Map<String, String> kq(com.bytedance.sdk.component.csi.csi csiVar, suf sufVar) {
                if (!csiVar.oq()) {
                    return null;
                }
                rhi rhiVarRjo = sufVar.rjo();
                HashMap map = new HashMap();
                int iKq = rhiVarRjo.kq();
                for (int i10 = 0; i10 < iKq; i10++) {
                    String strKq = rhiVarRjo.kq(i10);
                    String strOq = rhiVarRjo.oq(i10);
                    if (strKq != null) {
                        map.put(strKq, strOq);
                    }
                }
                return map;
            }

            private com.bytedance.sdk.component.csi.oq.bob kq(com.bytedance.sdk.component.csi.oq.fou fouVar, Throwable th) {
                th.getMessage();
                if (fouVar != null) {
                    fouVar.bob(System.currentTimeMillis());
                }
                com.bytedance.sdk.component.csi.oq.bob bobVar = new com.bytedance.sdk.component.csi.oq.bob(98765, th, "net failed");
                bobVar.kq(fouVar);
                return bobVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.csi.nn oq(String str) {
            return kq(oq.kq(str).csi(bss.csi(sns.kq())).fou(bss.bob(sns.kq())));
        }

        public static void kq() {
            kq = com.bytedance.sdk.openadsdk.jhe.kq.kq("image_config", "use_new_img", 1) == 1;
            bob = com.bytedance.sdk.openadsdk.jhe.kq.kq("image_config", "bitmap_cache_count", 10);
            fou = com.bytedance.sdk.openadsdk.jhe.kq.kq("image_config", "data_cache_count", 15);
            csi = com.bytedance.sdk.openadsdk.jhe.kq.kq("image_config", "disk_cache_count", 30);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.csi.nn oq(wcx wcxVar) {
            return kq(oq.kq(wcxVar.kq()).kq(wcxVar.oq()).oq(wcxVar.bob()).csi(bss.csi(sns.kq())).fou(bss.bob(sns.kq())).kq(wcxVar.rjo()));
        }

        private static nze kq(Context context) {
            kq();
            if (kq) {
                return com.bytedance.sdk.component.csi.fou.bob.oq.kq(context, new com.bytedance.sdk.component.csi.fou.bob.csi.kq().kq(new com.bytedance.sdk.component.csi.fou.bob.kq.oq(0, bob, fou, csi, new File(CacheDirFactory.getImageCacheDir("image_p")))).kq(com.bytedance.sdk.openadsdk.multipro.oq.bob()).kq(new fax() { // from class: com.bytedance.sdk.openadsdk.nn.fou.kq.2
                    @Override // com.bytedance.sdk.component.csi.fax
                    public ExecutorService kq() {
                        return nz.oq();
                    }

                    @Override // com.bytedance.sdk.component.csi.fax
                    public ExecutorService oq() {
                        return nz.bob();
                    }
                }).kq(new mq() { // from class: com.bytedance.sdk.openadsdk.nn.fou.kq.1
                    @Override // com.bytedance.sdk.component.csi.mq
                    public void kq(int i10, String str) {
                        com.bytedance.sdk.openadsdk.mxq.bob.kq(str, true);
                    }
                }).kq(new C0313kq()).kq());
            }
            return com.bytedance.sdk.component.csi.bob.oq.kq(context, new com.bytedance.sdk.component.csi.bob.csi.kq().kq(new com.bytedance.sdk.component.csi.bob.kq.kq(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir("image")))).kq(com.bytedance.sdk.openadsdk.multipro.oq.bob()).kq(new fax() { // from class: com.bytedance.sdk.openadsdk.nn.fou.kq.4
                @Override // com.bytedance.sdk.component.csi.fax
                public ExecutorService kq() {
                    return nz.oq();
                }

                @Override // com.bytedance.sdk.component.csi.fax
                public ExecutorService oq() {
                    return null;
                }
            }).kq(new mq() { // from class: com.bytedance.sdk.openadsdk.nn.fou.kq.3
                @Override // com.bytedance.sdk.component.csi.mq
                public void kq(int i10, String str) {
                    com.bytedance.sdk.openadsdk.mxq.bob.kq(str, false);
                }
            }).kq(new C0313kq()).kq());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream oq(String str, String str2) {
            return oq.kq(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean oq(String str, String str2, String str3) {
            return oq.kq(str, str2, str3);
        }

        private static com.bytedance.sdk.component.csi.nn kq(com.bytedance.sdk.component.csi.nn nnVar) {
            return xn.kq() ? nnVar.kq(new csi()) : nnVar;
        }
    }

    public static com.bytedance.sdk.component.csi.nn kq(String str) {
        return kq.oq(str);
    }

    public static boolean oq() {
        return kq.kq;
    }

    public static com.bytedance.sdk.component.csi.nn kq(wcx wcxVar) {
        return kq.oq(wcxVar);
    }

    public static InputStream kq(String str, String str2) {
        return kq.oq(str, str2);
    }

    public static boolean kq(String str, String str2, String str3) {
        return kq.oq(str, str2, str3);
    }

    public static nze kq() {
        return kq.oq;
    }
}
