package com.bykv.vk.openvk.preload.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IN f13420d;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) {
        this.f13420d = in;
        try {
            return bVar.a(a());
        } catch (i.a e10) {
            return a((b) bVar, e10.getCause());
        } catch (Throwable th) {
            return a((b) bVar, th);
        }
    }

    protected abstract boolean a(Throwable th);

    protected final IN g() {
        return this.f13420d;
    }

    private Object a(b<OUT> bVar, Throwable th) throws Throwable {
        while (a(th)) {
            try {
                return bVar.a(a());
            } catch (i.a e10) {
                th = e10.getCause();
            }
        }
        throw th;
    }

    protected OUT a() {
        return this.f13420d;
    }
}
