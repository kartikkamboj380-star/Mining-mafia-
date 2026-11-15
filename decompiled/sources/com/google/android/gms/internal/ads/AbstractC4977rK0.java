package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4977rK0 {
    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final C5229tK0 b() {
        if (this instanceof C5229tK0) {
            return (C5229tK0) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final C4852qK0 d() {
        if (this instanceof C4852qK0) {
            return (C4852qK0) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final C5481vK0 e() {
        if (this instanceof C5481vK0) {
            return (C5481vK0) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            ZK0 zk0 = new ZK0(NK0.a(sb));
            zk0.a(EnumC5607wK0.LENIENT);
            VK0.f24240a.a(zk0, this);
            return sb.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
