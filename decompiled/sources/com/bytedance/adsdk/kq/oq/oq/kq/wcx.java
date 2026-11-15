package com.bytedance.adsdk.kq.oq.oq.kq;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wcx extends sns {
    private static final ThreadLocal<StringBuilder> fou = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.kq.oq.oq.kq.wcx.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public wcx() {
        super(com.bytedance.adsdk.kq.oq.fou.bob.PLUS);
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public Object kq(Map<String, JSONObject> map) {
        Object objKq;
        Object objKq2 = this.kq.kq(map);
        if (objKq2 == null || (objKq = this.oq.kq(map)) == null) {
            return null;
        }
        if (!(objKq2 instanceof String) && !(objKq instanceof String)) {
            return com.bytedance.adsdk.kq.oq.csi.kq.syt.kq((Number) objKq2, (Number) objKq);
        }
        StringBuilder sb = fou.get();
        sb.append(objKq2);
        sb.append(objKq);
        String string = sb.toString();
        sb.setLength(0);
        return string;
    }
}
