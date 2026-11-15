package com.bytedance.adsdk.kq.oq.fou;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum kq implements csi {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, kq> fou = new HashMap(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);

    static {
        for (kq kqVar : values()) {
            fou.put(kqVar.name().toLowerCase(), kqVar);
        }
    }

    public static kq kq(String str) {
        return fou.get(str.toLowerCase());
    }
}
