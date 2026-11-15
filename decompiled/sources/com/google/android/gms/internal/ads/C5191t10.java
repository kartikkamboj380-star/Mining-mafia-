package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5191t10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f33299a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DQ f33300b;

    public C5191t10(DQ dq) {
        this.f33300b = dq;
    }

    public final void a(String str) {
        try {
            this.f33299a.put(str, this.f33300b.b(str));
        } catch (RemoteException e10) {
            AbstractC0786o0.l("Couldn't create RTB adapter : ", e10);
        }
    }

    public final InterfaceC5542vp b(String str) {
        ConcurrentHashMap concurrentHashMap = this.f33299a;
        if (concurrentHashMap.containsKey(str)) {
            return (InterfaceC5542vp) concurrentHashMap.get(str);
        }
        return null;
    }
}
