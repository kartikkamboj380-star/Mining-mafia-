package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<IN, OUT> extends l<IN, OUT> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) {
        new m(bVar);
        String strA = a(in);
        l.a aVar = a().get(strA);
        if (aVar == null) {
            throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(strA)));
        }
        List<h> list = aVar.f13422a;
        Object objA = c.a(list, ((i) bVar).f13415a, this).a(in);
        return !l.a(list) ? objA : bVar.a(objA);
    }

    protected abstract String a(IN in);
}
