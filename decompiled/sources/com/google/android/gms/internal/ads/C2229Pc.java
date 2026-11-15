package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2229Pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f22134a = Collections.EMPTY_LIST;

    public final void a(List list) {
        this.f22134a = new ArrayList(list);
    }

    public final List b() {
        List list = this.f22134a;
        this.f22134a = Collections.EMPTY_LIST;
        return list;
    }
}
