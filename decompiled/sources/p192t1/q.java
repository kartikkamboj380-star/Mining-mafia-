package p192t1;

import I8.C0687p;
import I8.InterfaceC0683n;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.InterfaceC1158d;
import androidx.lifecycle.InterfaceC1171q;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import p129m8.m;
import p129m8.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f49501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f49502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f49503d;

        a(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f49502c = obj;
            this.f49503d |= LinearLayoutManager.INVALID_OFFSET;
            return q.a(null, this);
        }
    }

    public static final class b implements InterfaceC1158d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0683n f49504a;

        b(InterfaceC0683n interfaceC0683n) {
            this.f49504a = interfaceC0683n;
        }

        @Override // androidx.lifecycle.InterfaceC1158d
        public void x(r rVar) {
            InterfaceC0683n interfaceC0683n = this.f49504a;
            m.a aVar = m.f46450b;
            interfaceC0683n.resumeWith(m.b(Unit.f45918a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(AbstractC1164j abstractC1164j, p169q8.b bVar) throws Throwable {
        a aVar;
        AbstractC1164j abstractC1164j2;
        E e10;
        Throwable th;
        InterfaceC1171q interfaceC1171q;
        InterfaceC1171q interfaceC1171q2;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f49503d;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f49503d = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f49502c;
        Object objE = p179r8.b.e();
        int i11 = aVar.f49503d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e10 = (E) aVar.f49501b;
            abstractC1164j2 = (AbstractC1164j) aVar.f49500a;
            try {
                n.b(obj);
                interfaceC1171q2 = (InterfaceC1171q) e10.f45973a;
                if (interfaceC1171q2 != null) {
                    abstractC1164j2.d(interfaceC1171q2);
                }
                return Unit.f45918a;
            } catch (Throwable th2) {
                th = th2;
                interfaceC1171q = (InterfaceC1171q) e10.f45973a;
                if (interfaceC1171q != null) {
                    abstractC1164j2.d(interfaceC1171q);
                }
                throw th;
            }
        }
        n.b(obj);
        if (abstractC1164j.b().d(AbstractC1164j.b.STARTED)) {
            return Unit.f45918a;
        }
        E e11 = new E();
        try {
            aVar.f49500a = abstractC1164j;
            aVar.f49501b = e11;
            aVar.f49503d = 1;
            C0687p c0687p = new C0687p(p179r8.b.c(aVar), 1);
            c0687p.G();
            b bVar2 = new b(c0687p);
            e11.f45973a = bVar2;
            Intrinsics.c(bVar2);
            abstractC1164j.a(bVar2);
            Object objA = c0687p.A();
            if (objA == p179r8.b.e()) {
                h.c(aVar);
            }
            if (objA == objE) {
                return objE;
            }
            abstractC1164j2 = abstractC1164j;
            e10 = e11;
            interfaceC1171q2 = (InterfaceC1171q) e10.f45973a;
            if (interfaceC1171q2 != null) {
                abstractC1164j2.d(interfaceC1171q2);
            }
            return Unit.f45918a;
        } catch (Throwable th3) {
            abstractC1164j2 = abstractC1164j;
            e10 = e11;
            th = th3;
            interfaceC1171q = (InterfaceC1171q) e10.f45973a;
            if (interfaceC1171q != null) {
                abstractC1164j2.d(interfaceC1171q);
            }
            throw th;
        }
    }
}
