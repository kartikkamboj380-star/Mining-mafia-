package com.swmansion.rnscreens.gamma.tabs;

import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends K7.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ReactContext reactContext, int i10) {
        super(reactContext, i10);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    public final void d(String tabKey) {
        Intrinsics.checkNotNullParameter(tabKey, "tabKey");
        a().c(new M7.e(b(), c(), tabKey));
    }
}
