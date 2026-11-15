package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class N01 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ N01 f21002a = new N01();

    private /* synthetic */ N01() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((l11) ((List) obj).get(0)).compareTo((l11) ((List) obj2).get(0));
    }
}
