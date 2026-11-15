package com.facebook.react.uimanager;

/* JADX INFO: renamed from: com.facebook.react.uimanager.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1379r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1379r0 f15831a = new C1379r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f15832b = 1;

    private C1379r0() {
    }

    public static final synchronized int a() {
        int i10;
        i10 = f15832b;
        f15832b = i10 + 10;
        return i10;
    }
}
