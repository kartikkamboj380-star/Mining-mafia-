package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f13415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<h> f13417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f13418d;

    static final class a extends Exception {
        a(Throwable th) {
            super(th);
        }
    }

    i(List<h> list, int i10, e eVar, d dVar) {
        this.f13417c = list;
        this.f13416b = i10;
        this.f13415a = eVar;
        this.f13418d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f13418d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f13397a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws a {
        d dVar = this.f13418d;
        if (dVar != null) {
            dVar.f13399c = obj;
            dVar.e();
        }
        if (this.f13416b >= this.f13417c.size()) {
            return obj;
        }
        h hVar = this.f13417c.get(this.f13416b);
        Class<? extends d> cls = hVar.f13409a;
        d dVar2 = (d) this.f13415a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.a.b.a aVarA = hVar.a();
        i iVar = new i(this.f13417c, this.f13416b + 1, this.f13415a, dVar2);
        dVar2.a(iVar, this.f13418d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e10) {
            dVar2.c(e10.getCause());
            throw e10;
        } catch (Throwable th) {
            dVar2.b(th);
            throw new a(th);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f13399c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f13398b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
