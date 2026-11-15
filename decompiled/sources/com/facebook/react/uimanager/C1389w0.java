package com.facebook.react.uimanager;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1389w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1389w0 f15858a = new C1389w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f15859b;

    static {
        p064g3.b.b("ReactYogaConfigProvider", null, 2, null);
        f15859b = p129m8.g.b(p129m8.j.NONE, new Function0() { // from class: com.facebook.react.uimanager.v0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C1389w0.c();
            }
        });
    }

    private C1389w0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.facebook.yoga.c c() {
        com.facebook.yoga.c cVarA = com.facebook.yoga.d.a();
        cVarA.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        cVarA.a(com.facebook.yoga.k.ALL);
        return cVarA;
    }

    public final com.facebook.yoga.c b() {
        Object value = f15859b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.facebook.yoga.c) value;
    }
}
