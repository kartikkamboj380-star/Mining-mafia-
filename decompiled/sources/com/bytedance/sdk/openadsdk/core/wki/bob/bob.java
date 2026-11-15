package com.bytedance.sdk.openadsdk.core.wki.bob;

import com.bytedance.sdk.component.utils.rjo;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bob extends com.bytedance.sdk.openadsdk.oq.oq {
    public bob(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.bytedance.sdk.openadsdk.oq.oq, com.bytedance.sdk.openadsdk.oq.kq
    protected void kq(List<File> list) {
        int size = list.size();
        if (kq(0L, size)) {
            return;
        }
        for (File file : list) {
            rjo.bob(file);
            size--;
            if (kq(file, 0L, size)) {
                return;
            }
        }
    }

    public bob(int i10, int i11, boolean z9) {
        super(i10, i11);
        this.kq = z9;
    }
}
