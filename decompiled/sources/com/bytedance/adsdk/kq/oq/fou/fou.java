package com.bytedance.adsdk.kq.oq.fou;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum fou implements csi {
    LEFT_PAREN("("),
    RIGHT_PAREN(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");

    private static final Map<String, fou> rhi;
    private final String rjo;

    static {
        HashMap map = new HashMap(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        rhi = map;
        for (fou fouVar : map.values()) {
            rhi.put(fouVar.kq(), fouVar);
        }
    }

    fou(String str) {
        this.rjo = str;
    }

    public static boolean kq(csi csiVar) {
        return csiVar instanceof fou;
    }

    public String kq() {
        return this.rjo;
    }
}
