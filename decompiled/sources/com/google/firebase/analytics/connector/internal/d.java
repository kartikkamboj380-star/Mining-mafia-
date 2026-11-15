package com.google.firebase.analytics.connector.internal;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f39986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d6.a.b f39987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p126m5.a f39988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f39989d;

    public d(p126m5.a aVar, d6.a.b bVar) {
        this.f39987b = bVar;
        this.f39988c = aVar;
        c cVar = new c(this);
        this.f39989d = cVar;
        aVar.f(cVar);
        this.f39986a = new HashSet();
    }

    final /* synthetic */ d6.a.b a() {
        return this.f39987b;
    }
}
