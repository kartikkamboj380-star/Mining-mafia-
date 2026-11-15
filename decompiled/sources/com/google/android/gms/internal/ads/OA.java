package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OA implements InterfaceC4705pA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BT f21487a;

    OA(BT bt) {
        this.f21487a = bt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4705pA
    public final void a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f21487a.d(str.equals("true"));
    }
}
