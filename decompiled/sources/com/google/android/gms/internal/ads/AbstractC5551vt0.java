package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC5551vt0 extends AbstractC2108Mt0 implements InterfaceC2526Uu0 {
    protected AbstractC5551vt0(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2108Mt0
    final Collection i(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2108Mt0
    final Collection j(Object obj, Collection collection) {
        return l(obj, (List) collection, null);
    }
}
