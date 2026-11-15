package com.facebook.soloader;

/* JADX INFO: loaded from: classes2.dex */
public class o implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f16572a;

    public o(x xVar) {
        this.f16572a = xVar;
    }

    @Override // com.facebook.soloader.x
    public void a(String str, int i10) {
        p045e4.b.j(this.f16572a, "load", i10);
        try {
            this.f16572a.a(str, i10);
            p045e4.b.i(null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p045e4.b.i(th);
                throw th2;
            }
        }
    }
}
