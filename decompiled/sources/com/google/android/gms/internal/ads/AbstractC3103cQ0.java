package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3103cQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final LinkedHashMap f27106a;

    AbstractC3103cQ0(int i10) {
        this.f27106a = AbstractC3354eQ0.c(i10);
    }

    final AbstractC3103cQ0 a(Object obj, InterfaceC4864qQ0 interfaceC4864qQ0) {
        AbstractC4738pQ0.a(obj, "key");
        AbstractC4738pQ0.a(interfaceC4864qQ0, "provider");
        this.f27106a.put(obj, interfaceC4864qQ0);
        return this;
    }
}
