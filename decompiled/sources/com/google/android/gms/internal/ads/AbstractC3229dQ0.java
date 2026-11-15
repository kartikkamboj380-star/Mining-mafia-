package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3229dQ0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f27412a;

    AbstractC3229dQ0(Map map) {
        this.f27412a = Collections.unmodifiableMap(map);
    }

    final Map a() {
        return this.f27412a;
    }
}
