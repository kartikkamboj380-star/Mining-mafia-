package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final I f41106c = new I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f41108b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f41107a = new C6761t();

    private I() {
    }

    public static I a() {
        return f41106c;
    }

    public N b(Class cls, N n10) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(n10, "schema");
        return (N) this.f41108b.putIfAbsent(cls, n10);
    }

    public N c(Class cls) {
        N nB;
        Internal.checkNotNull(cls, "messageType");
        N nA = (N) this.f41108b.get(cls);
        return (nA != null || (nB = b(cls, (nA = this.f41107a.a(cls)))) == null) ? nA : nB;
    }

    public N d(Object obj) {
        return c(obj.getClass());
    }
}
