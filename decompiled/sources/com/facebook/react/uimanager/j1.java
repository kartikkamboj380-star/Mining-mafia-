package com.facebook.react.uimanager;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f15827a = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f15828b;

    static {
        p064g3.b.a("YogaNodePool", p064g3.a.ERROR);
        f15828b = p129m8.g.b(p129m8.j.SYNCHRONIZED, new Function0() { // from class: com.facebook.react.uimanager.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j1.d();
            }
        });
    }

    private j1() {
    }

    public static final p044e3.b b() {
        return f15827a.c();
    }

    private final p044e3.b c() {
        return (p044e3.b) f15828b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p044e3.b d() {
        return new p044e3.b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
    }
}
