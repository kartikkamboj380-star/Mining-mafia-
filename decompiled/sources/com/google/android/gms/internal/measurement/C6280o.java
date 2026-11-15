package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6280o extends AbstractC6235j implements InterfaceC6253l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final List f36797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final List f36798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected C6157a2 f36799e;

    private C6280o(C6280o c6280o) {
        super(c6280o.f36718a);
        ArrayList arrayList = new ArrayList(c6280o.f36797c.size());
        this.f36797c = arrayList;
        arrayList.addAll(c6280o.f36797c);
        ArrayList arrayList2 = new ArrayList(c6280o.f36798d.size());
        this.f36798d = arrayList2;
        arrayList2.addAll(c6280o.f36798d);
        this.f36799e = c6280o.f36799e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6235j
    public final InterfaceC6289p c(C6157a2 c6157a2, List list) {
        C6157a2 c6157a2C = this.f36799e.c();
        int i10 = 0;
        while (true) {
            List list2 = this.f36797c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                c6157a2C.f((String) list2.get(i10), c6157a2.a((InterfaceC6289p) list.get(i10)));
            } else {
                c6157a2C.f((String) list2.get(i10), InterfaceC6289p.f36808x);
            }
            i10++;
        }
        for (InterfaceC6289p interfaceC6289p : this.f36798d) {
            InterfaceC6289p interfaceC6289pA = c6157a2C.a(interfaceC6289p);
            if (interfaceC6289pA instanceof C6298q) {
                interfaceC6289pA = c6157a2C.a(interfaceC6289p);
            }
            if (interfaceC6289pA instanceof C6217h) {
                return ((C6217h) interfaceC6289pA).a();
            }
        }
        return InterfaceC6289p.f36808x;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6235j, com.google.android.gms.internal.measurement.InterfaceC6289p
    public final InterfaceC6289p g() {
        return new C6280o(this);
    }

    public C6280o(String str, List list, List list2, C6157a2 c6157a2) {
        super(str);
        this.f36797c = new ArrayList();
        this.f36799e = c6157a2;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f36797c.add(((InterfaceC6289p) it.next()).zzc());
            }
        }
        this.f36798d = new ArrayList(list2);
    }
}
