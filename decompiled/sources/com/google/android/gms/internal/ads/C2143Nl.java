package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2143Nl implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BT f21335a;

    public C2143Nl(BT bt) {
        Preconditions.checkNotNull(bt, "The Inspector Manager must not be null");
        this.f21335a = bt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.f21335a.k((String) map.get("persistentData"));
    }
}
