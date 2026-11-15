package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum syt {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int fou;

    syt(int i10) {
        this.fou = i10;
    }

    public static syt kq(int i10) {
        if (i10 == 0) {
            return UNDEFINED;
        }
        if (i10 == 1) {
            return EXACTLY;
        }
        if (i10 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }
}
