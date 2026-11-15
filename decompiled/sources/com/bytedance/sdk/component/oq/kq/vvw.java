package com.bytedance.sdk.component.oq.kq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class vvw {
    public ubx kq;
    public com.bytedance.sdk.component.bob.kq.kq oq = new com.bytedance.sdk.component.bob.kq.kq();

    public static class kq {
        rjo bob;
        Object csi;
        String fou;
        com.bytedance.sdk.component.oq.kq.kq kq;
        Map<String, List<String>> oq;
        wki rhi;
        int rjo;
        String syt;

        public kq() {
            this.oq = new HashMap();
        }

        public kq kq(com.bytedance.sdk.component.oq.kq.kq kqVar) {
            this.kq = kqVar;
            return this;
        }

        public kq oq(String str) {
            return kq(rjo.bob(str));
        }

        public kq kq(String str) {
            this.syt = str;
            return this;
        }

        public kq oq(String str, String str2) {
            if (!this.oq.containsKey(str)) {
                this.oq.put(str, new ArrayList());
            }
            this.oq.get(str).add(str2);
            return this;
        }

        kq(vvw vvwVar) {
            this.bob = vvwVar.oq();
            this.fou = vvwVar.bob();
            this.oq = vvwVar.fou();
            this.csi = vvwVar.kq();
            this.rhi = vvwVar.syt();
            this.kq = vvwVar.csi();
            this.rjo = vvwVar.rjo();
            this.syt = vvwVar.rhi();
        }

        public kq kq(int i10) {
            this.rjo = i10;
            return this;
        }

        public kq kq(Object obj) {
            this.csi = obj;
            return this;
        }

        public kq kq(rjo rjoVar) {
            this.bob = rjoVar;
            return this;
        }

        public vvw oq() {
            return new vvw() { // from class: com.bytedance.sdk.component.oq.kq.vvw.kq.1
                @Override // com.bytedance.sdk.component.oq.kq.vvw
                public String bob() {
                    return kq.this.fou;
                }

                @Override // com.bytedance.sdk.component.oq.kq.vvw
                public com.bytedance.sdk.component.oq.kq.kq csi() {
                    return kq.this.kq;
                }

                @Override // com.bytedance.sdk.component.oq.kq.vvw
                public Map fou() {
                    return kq.this.oq;
                }

                @Override // com.bytedance.sdk.component.oq.kq.vvw
                public Object kq() {
                    return kq.this.csi;
                }

                @Override // com.bytedance.sdk.component.oq.kq.vvw
                public rjo oq() {
                    return kq.this.bob;
                }

                @Override // com.bytedance.sdk.component.oq.kq.vvw
                public String rhi() {
                    return kq.this.syt;
                }

                @Override // com.bytedance.sdk.component.oq.kq.vvw
                public int rjo() {
                    return kq.this.rjo;
                }

                @Override // com.bytedance.sdk.component.oq.kq.vvw
                public wki syt() {
                    return kq.this.rhi;
                }

                public String toString() {
                    return "";
                }
            };
        }

        public kq kq(String str, String str2) {
            return oq(str, str2);
        }

        public kq kq() {
            return kq("GET", (wki) null);
        }

        private kq kq(String str, wki wkiVar) {
            this.fou = str;
            this.rhi = wkiVar;
            return this;
        }

        public kq kq(wki wkiVar) {
            return kq("POST", wkiVar);
        }
    }

    public abstract String bob();

    public abstract com.bytedance.sdk.component.oq.kq.kq csi();

    public kq dgq() {
        return new kq(this);
    }

    public abstract Map<String, List<String>> fou();

    public abstract Object kq();

    public void kq(ubx ubxVar) {
        this.kq = ubxVar;
    }

    public abstract rjo oq();

    public abstract String rhi();

    public abstract int rjo();

    public wki syt() {
        return null;
    }
}
