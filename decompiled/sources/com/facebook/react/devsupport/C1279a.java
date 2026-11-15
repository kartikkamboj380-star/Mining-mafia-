package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.devsupport.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1279a extends O {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1279a(Context applicationContext, l0 reactInstanceManagerHelper, String str, boolean z9, p124m3.i iVar, p124m3.b bVar, int i10, Map map, p044e3.i iVar2, p124m3.c cVar, p124m3.h hVar) {
        super(applicationContext, reactInstanceManagerHelper, str, z9, iVar, bVar, i10, map, iVar2, cVar, hVar);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(reactInstanceManagerHelper, "reactInstanceManagerHelper");
    }

    @Override // com.facebook.react.devsupport.O
    protected String i0() {
        return "Bridgeless";
    }

    @Override // p124m3.e
    public void x() {
        UiThreadUtil.assertOnUiThread();
        n();
        h0().reload("BridgelessDevSupportManager.handleReloadJS()");
    }
}
