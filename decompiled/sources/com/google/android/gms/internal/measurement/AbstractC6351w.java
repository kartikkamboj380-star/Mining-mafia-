package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6351w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f36930a = new ArrayList();

    protected AbstractC6351w() {
    }

    public abstract InterfaceC6289p a(String str, C6157a2 c6157a2, List list);

    final InterfaceC6289p b(String str) {
        if (this.f36930a.contains(B2.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
