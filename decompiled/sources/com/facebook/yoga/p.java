package com.facebook.yoga;

/* JADX INFO: loaded from: classes2.dex */
public enum p {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16676a;

    p(int i10) {
        this.f16676a = i10;
    }

    public static p d(int i10) {
        if (i10 == 0) {
            return UNDEFINED;
        }
        if (i10 == 1) {
            return EXACTLY;
        }
        if (i10 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: " + i10);
    }
}
