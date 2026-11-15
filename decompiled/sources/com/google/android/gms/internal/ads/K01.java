package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class K01 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ K01 f20039a = new K01();

    private /* synthetic */ K01() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((J01) Collections.max((List) obj)).compareTo((J01) Collections.max((List) obj2));
    }
}
