package com.google.android.gms.internal.ads;

import java.util.Collection;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2576Vt0 {
    static boolean a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
