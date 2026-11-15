package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1947Jq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f20006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3032br0 f20007b;

    C1947Jq0(C3032br0 c3032br0, Set set) {
        this.f20006a = set;
        this.f20007b = c3032br0;
    }

    public final void a(List list) {
        this.f20007b.d(list);
    }

    public final Map b() {
        HashMap map = new HashMap();
        Iterator it = this.f20006a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2102Mq0) it.next()).b(map);
        }
        return map;
    }

    public final Map c(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.f20006a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2102Mq0) it.next()).c(map, context, view);
        }
        return map;
    }

    public final Map d() {
        HashMap map = new HashMap();
        Iterator it = this.f20006a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2102Mq0) it.next()).a(map);
        }
        return map;
    }
}
