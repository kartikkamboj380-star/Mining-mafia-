package com.google.firebase.crashlytics.ndk;

import java.io.File;
import p147o6.F;

/* JADX INFO: loaded from: classes3.dex */
class g implements p087i6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f40085a;

    g(f fVar) {
        this.f40085a = fVar;
    }

    @Override // p087i6.h
    public File a() {
        return this.f40085a.f40074f;
    }

    @Override // p087i6.h
    public F.a b() {
        f.c cVar = this.f40085a.f40069a;
        if (cVar != null) {
            return cVar.f40084b;
        }
        return null;
    }

    @Override // p087i6.h
    public File c() {
        return this.f40085a.f40069a.f40083a;
    }

    @Override // p087i6.h
    public File d() {
        return this.f40085a.f40071c;
    }

    @Override // p087i6.h
    public File e() {
        return this.f40085a.f40073e;
    }

    @Override // p087i6.h
    public File f() {
        return this.f40085a.f40075g;
    }

    @Override // p087i6.h
    public File g() {
        return this.f40085a.f40072d;
    }
}
