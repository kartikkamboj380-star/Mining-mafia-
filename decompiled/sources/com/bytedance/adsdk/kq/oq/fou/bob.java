package com.bytedance.adsdk.kq.oq.fou;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public enum bob implements csi {
    QUESTION("?", 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(">", 2),
    LT("<", 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS("-", 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD("%", 4);

    private final int gm;
    private final String wcx;
    private static final Map<String, bob> mxq = new HashMap(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
    private static final Set<bob> sns = new HashSet();

    static {
        for (bob bobVar : values()) {
            mxq.put(bobVar.kq(), bobVar);
            sns.add(bobVar);
        }
    }

    bob(String str, int i10) {
        this.wcx = str;
        this.gm = i10;
    }

    public static bob kq(String str) {
        return mxq.get(str);
    }

    public int oq() {
        return this.gm;
    }

    public static boolean kq(csi csiVar) {
        return csiVar instanceof bob;
    }

    public String kq() {
        return this.wcx;
    }
}
