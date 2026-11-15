package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends g implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f40781a = new ArrayList();

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof f) && ((f) obj).f40781a.equals(this.f40781a);
        }
        return true;
    }

    public int hashCode() {
        return this.f40781a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f40781a.iterator();
    }

    public void k(g gVar) {
        if (gVar == null) {
            gVar = i.f40782a;
        }
        this.f40781a.add(gVar);
    }
}
