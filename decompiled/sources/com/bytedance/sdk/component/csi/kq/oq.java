package com.bytedance.sdk.component.csi.kq;

import com.bytedance.sdk.component.csi.dgq;
import com.bytedance.sdk.component.csi.vvw;
import com.bytedance.sdk.component.utils.mxq;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public static vvw kq() {
        return new vvw() { // from class: com.bytedance.sdk.component.csi.kq.oq.1
            private WeakHashMap<String, String> kq = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.csi.vvw
            public String kq(dgq dgqVar) {
                return kq(dgqVar.kq() + "#width=" + dgqVar.oq() + "#height=" + dgqVar.bob() + "#scaletype=" + dgqVar.fou() + "#bitmapConfig=" + dgqVar.csi());
            }

            @Override // com.bytedance.sdk.component.csi.vvw
            public String oq(dgq dgqVar) {
                return kq(dgqVar.kq());
            }

            private String kq(String str) {
                String str2 = this.kq.get(str);
                if (str2 != null) {
                    return str2;
                }
                String strKq = mxq.kq(str);
                this.kq.put(str, strKq);
                return strKq;
            }
        };
    }
}
