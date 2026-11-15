package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4962rD implements InterfaceC5088sD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f32858a;

    C4962rD(Map map) {
        this.f32858a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5088sD
    public final InterfaceC4375mY a(int i10, String str) {
        return (InterfaceC4375mY) this.f32858a.get(str);
    }
}
