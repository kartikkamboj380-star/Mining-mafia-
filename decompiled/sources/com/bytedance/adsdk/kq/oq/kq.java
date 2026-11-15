package com.bytedance.adsdk.kq.oq;

import com.bytedance.adsdk.kq.oq.bob.kq.bob;
import com.bytedance.adsdk.kq.oq.bob.kq.csi;
import com.bytedance.adsdk.kq.oq.bob.kq.dgq;
import com.bytedance.adsdk.kq.oq.bob.kq.fou;
import com.bytedance.adsdk.kq.oq.bob.kq.nn;
import com.bytedance.adsdk.kq.oq.bob.kq.oq;
import com.bytedance.adsdk.kq.oq.bob.kq.rhi;
import com.bytedance.adsdk.kq.oq.bob.kq.rjo;
import com.bytedance.adsdk.kq.oq.bob.kq.syt;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static final com.bytedance.adsdk.kq.oq.bob.kq kq;
    private com.bytedance.adsdk.kq.oq.oq.kq bob;
    private String csi;
    private Deque<com.bytedance.adsdk.kq.oq.oq.kq> fou = new LinkedList();
    private final com.bytedance.adsdk.kq.oq.bob.kq oq;

    static {
        int i10 = 8;
        rhi[] rhiVarArr = {new nn(), new fou(), new dgq(), new oq(), new csi(), new com.bytedance.adsdk.kq.oq.bob.kq.kq(), new rjo(), new bob(), new syt()};
        final com.bytedance.adsdk.kq.oq.bob.kq kqVar = new com.bytedance.adsdk.kq.oq.bob.kq() { // from class: com.bytedance.adsdk.kq.oq.kq.1
            @Override // com.bytedance.adsdk.kq.oq.bob.kq
            public int kq(String str, int i11, Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque) {
                return i11;
            }
        };
        while (i10 >= 0) {
            final rhi rhiVar = rhiVarArr[i10];
            i10--;
            kqVar = new com.bytedance.adsdk.kq.oq.bob.kq() { // from class: com.bytedance.adsdk.kq.oq.kq.2
                @Override // com.bytedance.adsdk.kq.oq.bob.kq
                public int kq(String str, int i11, Deque<com.bytedance.adsdk.kq.oq.oq.kq> deque) {
                    return rhiVar.kq(str, i11, deque, kqVar);
                }
            };
        }
        kq = kqVar;
    }

    private kq(String str, com.bytedance.adsdk.kq.oq.bob.kq kqVar) {
        this.oq = kqVar;
        this.csi = str;
        try {
            kq();
        } catch (Exception e10) {
            throw new com.bytedance.adsdk.kq.kq.oq(str, e10);
        }
    }

    public static kq kq(String str) {
        return new kq(str, kq);
    }

    private void kq() {
        int length = this.csi.length();
        int i10 = 0;
        while (i10 < length) {
            int iKq = this.oq.kq(this.csi, i10, this.fou);
            if (iKq == i10) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.csi.substring(0, i10));
            }
            i10 = iKq;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.kq.oq.oq.kq kqVarPollFirst = this.fou.pollFirst();
            if (kqVarPollFirst == null) {
                this.bob = com.bytedance.adsdk.kq.oq.csi.oq.kq(arrayList, this.csi, i10);
                this.fou = null;
                return;
            }
            arrayList.add(0, kqVarPollFirst);
        }
    }

    public <T> T kq(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) kq(map);
    }

    public <T> T kq(Map<String, JSONObject> map) {
        return (T) this.bob.kq(map);
    }
}
