package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
final class XT0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4891qe f25282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC5931yu0 f25283b = AbstractC5931yu0.l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC1539Bu0 f25284c = AbstractC1539Bu0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C5637wZ0 f25285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C5637wZ0 f25286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C5637wZ0 f25287f;

    public XT0(C4891qe c4891qe) {
        this.f25282a = c4891qe;
    }

    private final void j(AbstractC5270tf abstractC5270tf) {
        C1487Au0 c1487Au0 = new C1487Au0();
        if (this.f25283b.isEmpty()) {
            k(c1487Au0, this.f25286e, abstractC5270tf);
            if (!Objects.equals(this.f25287f, this.f25286e)) {
                k(c1487Au0, this.f25287f, abstractC5270tf);
            }
            if (!Objects.equals(this.f25285d, this.f25286e) && !Objects.equals(this.f25285d, this.f25287f)) {
                k(c1487Au0, this.f25285d, abstractC5270tf);
            }
        } else {
            for (int i10 = 0; i10 < this.f25283b.size(); i10++) {
                k(c1487Au0, (C5637wZ0) this.f25283b.get(i10), abstractC5270tf);
            }
            if (!this.f25283b.contains(this.f25285d)) {
                k(c1487Au0, this.f25285d, abstractC5270tf);
            }
        }
        this.f25284c = c1487Au0.c();
    }

    private final void k(C1487Au0 c1487Au0, C5637wZ0 c5637wZ0, AbstractC5270tf abstractC5270tf) {
        if (c5637wZ0 == null) {
            return;
        }
        if (abstractC5270tf.e(c5637wZ0.f34594a) != -1) {
            c1487Au0.a(c5637wZ0, abstractC5270tf);
            return;
        }
        AbstractC5270tf abstractC5270tf2 = (AbstractC5270tf) this.f25284c.get(c5637wZ0);
        if (abstractC5270tf2 != null) {
            c1487Au0.a(c5637wZ0, abstractC5270tf2);
        }
    }

    private static C5637wZ0 l(InterfaceC4637od interfaceC4637od, AbstractC5931yu0 abstractC5931yu0, C5637wZ0 c5637wZ0, C4891qe c4891qe) {
        AbstractC5270tf abstractC5270tfA = interfaceC4637od.a();
        int iL = interfaceC4637od.l();
        Object objF = abstractC5270tfA.g() ? null : abstractC5270tfA.f(iL);
        int iF = -1;
        if (!interfaceC4637od.v() && !abstractC5270tfA.g()) {
            iF = abstractC5270tfA.d(iL, c4891qe, false).f(AbstractC4634ob0.M(interfaceC4637od.zzu()));
        }
        int i10 = iF;
        for (int i11 = 0; i11 < abstractC5931yu0.size(); i11++) {
            C5637wZ0 c5637wZ1 = (C5637wZ0) abstractC5931yu0.get(i11);
            if (m(c5637wZ1, objF, interfaceC4637od.v(), interfaceC4637od.u(), interfaceC4637od.m(), i10)) {
                return c5637wZ1;
            }
        }
        if (abstractC5931yu0.isEmpty() && c5637wZ0 != null && m(c5637wZ0, objF, interfaceC4637od.v(), interfaceC4637od.u(), interfaceC4637od.m(), i10)) {
            return c5637wZ0;
        }
        return null;
    }

    private static boolean m(C5637wZ0 c5637wZ0, Object obj, boolean z9, int i10, int i11, int i12) {
        if (!c5637wZ0.f34594a.equals(obj)) {
            return false;
        }
        if (z9) {
            return c5637wZ0.f34595b == i10 && c5637wZ0.f34596c == i11;
        }
        return c5637wZ0.f34595b == -1 && c5637wZ0.f34598e == i12;
    }

    public final C5637wZ0 a() {
        return this.f25285d;
    }

    public final C5637wZ0 b() {
        return this.f25286e;
    }

    public final C5637wZ0 c() {
        return this.f25287f;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final C5637wZ0 d() {
        Object next;
        Object objLast;
        if (this.f25283b.isEmpty()) {
            return null;
        }
        List list = this.f25283b;
        if (list != null) {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            objLast = list.get(list.size() - 1);
        } else if (list instanceof SortedSet) {
            objLast = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            objLast = next;
        }
        return (C5637wZ0) objLast;
    }

    public final AbstractC5270tf e(C5637wZ0 c5637wZ0) {
        return (AbstractC5270tf) this.f25284c.get(c5637wZ0);
    }

    public final void f(InterfaceC4637od interfaceC4637od) {
        this.f25285d = l(interfaceC4637od, this.f25283b, this.f25286e, this.f25282a);
    }

    public final void g(InterfaceC4637od interfaceC4637od) {
        this.f25285d = l(interfaceC4637od, this.f25283b, this.f25286e, this.f25282a);
        j(interfaceC4637od.a());
    }

    public final void h(List list, C5637wZ0 c5637wZ0, InterfaceC4637od interfaceC4637od) {
        this.f25283b = AbstractC5931yu0.u(list);
        if (!list.isEmpty()) {
            this.f25286e = (C5637wZ0) list.get(0);
            c5637wZ0.getClass();
            this.f25287f = c5637wZ0;
        }
        if (this.f25285d == null) {
            this.f25285d = l(interfaceC4637od, this.f25283b, this.f25286e, this.f25282a);
        }
        j(interfaceC4637od.a());
    }

    final /* synthetic */ AbstractC5931yu0 i() {
        return this.f25283b;
    }
}
