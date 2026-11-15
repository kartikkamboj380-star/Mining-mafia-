package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.br0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3032br0 implements InterfaceC2102Mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f26948a = new ArrayList();

    C3032br0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void a(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final void b(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2102Mq0
    public final synchronized void c(Map map, Context context, View view) {
        List list = this.f26948a;
        map.put("vst", new ArrayList(list));
        list.clear();
    }

    public final synchronized void d(List list) {
        List list2 = this.f26948a;
        list2.clear();
        list2.addAll(list);
    }
}
