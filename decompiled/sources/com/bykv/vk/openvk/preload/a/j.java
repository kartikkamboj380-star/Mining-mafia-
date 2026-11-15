package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f13419d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) {
        new m(bVar);
        this.f13419d = a(in);
        l.a aVar = a().get(this.f13419d);
        while (aVar != null) {
            List<h> list = aVar.f13422a;
            try {
                Object objA = c.a(list, bVar.f13415a, this).a(in);
                return !l.a(list) ? objA : bVar.a(objA);
            } catch (i.a e10) {
                Throwable cause = e10.getCause();
                new m(bVar);
                this.f13419d = a(in, cause, this.f13419d);
                aVar = a().get(this.f13419d);
            } catch (Throwable th) {
                new m(bVar);
                this.f13419d = a(in, th, this.f13419d);
                aVar = a().get(this.f13419d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f13419d);
    }

    protected abstract String a(IN in);

    protected abstract String a(IN in, Throwable th, String str);
}
