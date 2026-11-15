package com.facebook.common.time;

import Y1.d;
import p053f2.c;

/* JADX INFO: loaded from: classes.dex */
@d
public class AwakeTimeSinceBootClock implements c {

    @d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // p053f2.c, p053f2.b
    @d
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // p053f2.c, p053f2.b
    @d
    public long nowNanos() {
        return System.nanoTime();
    }
}
