package com.bytedance.sdk.component.oq.kq;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class csi extends wki {
    List<String> kq;
    List<String> oq;

    csi(List<String> list, List<String> list2) {
        this.kq = list;
        this.oq = list2;
    }

    public static final class kq {
        private final List<String> kq = new ArrayList();
        private final List<String> oq = new ArrayList();

        public kq kq(String str, String str2) {
            this.kq.add(str);
            this.oq.add(str2);
            return this;
        }

        public csi kq() {
            return new csi(this.kq, this.oq);
        }
    }
}
