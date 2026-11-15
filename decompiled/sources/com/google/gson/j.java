package com.google.gson;

import java.util.Set;
import p108k7.A;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f40927a = new A(false);

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof j) && ((j) obj).f40927a.equals(this.f40927a);
        }
        return true;
    }

    public int hashCode() {
        return this.f40927a.hashCode();
    }

    public void k(String str, g gVar) {
        A a10 = this.f40927a;
        if (gVar == null) {
            gVar = i.f40782a;
        }
        a10.put(str, gVar);
    }

    public Set l() {
        return this.f40927a.entrySet();
    }
}
