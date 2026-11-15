package p078h7;

import I8.AbstractC0675j;
import I8.AbstractC0677k;
import I8.O;
import I8.P;
import L8.AbstractC0806g;
import L8.InterfaceC0804e;
import L8.InterfaceC0805f;
import W.InterfaceC0984i;
import android.util.Log;
import androidx.lifecycle.AbstractC1169o;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7031a;
import kotlin.jvm.internal.InterfaceC7038h;
import kotlin.jvm.internal.Intrinsics;
import p048e7.Z;
import p129m8.n;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineContext f44852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z f44853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0984i f44854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f44855d;

    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f44856a;

        /* JADX INFO: renamed from: h7.m$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0437a implements InterfaceC0805f, InterfaceC7038h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AtomicReference f44858a;

            C0437a(AtomicReference atomicReference) {
                this.f44858a = atomicReference;
            }

            @Override // L8.InterfaceC0805f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h hVar, p169q8.b bVar) {
                Object objN = a.n(this.f44858a, hVar, bVar);
                return objN == p179r8.b.e() ? objN : Unit.f45918a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC0805f) && (obj instanceof InterfaceC7038h)) {
                    return Intrinsics.b(getFunctionDelegate(), ((InterfaceC7038h) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.InterfaceC7038h
            public final p129m8.c getFunctionDelegate() {
                return new C7031a(2, this.f44858a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        a(p169q8.b bVar) {
            super(2, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object n(AtomicReference atomicReference, h hVar, p169q8.b bVar) {
            atomicReference.set(hVar);
            return Unit.f45918a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            return m.this.new a(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, p169q8.b bVar) {
            return ((a) create(o10, bVar)).invokeSuspend(Unit.f45918a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p179r8.b.e();
            int i10 = this.f44856a;
            if (i10 == 0) {
                n.b(obj);
                InterfaceC0804e data = m.this.f44854c.getData();
                C0437a c0437a = new C0437a(m.this.f44855d);
                this.f44856a = 1;
                if (data.collect(c0437a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            return Unit.f45918a;
        }
    }

    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f44859a;

        b(p169q8.b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            return m.this.new b(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, p169q8.b bVar) {
            return ((b) create(o10, bVar)).invokeSuspend(Unit.f45918a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p179r8.b.e();
            int i10 = this.f44859a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                return obj;
            }
            n.b(obj);
            InterfaceC0804e data = m.this.f44854c.getData();
            this.f44859a = 1;
            Object objS = AbstractC0806g.s(data, this);
            return objS == objE ? objE : objS;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f44861a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f44863c;

        c(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f44861a = obj;
            this.f44863c |= LinearLayoutManager.INVALID_OFFSET;
            return m.this.e(null, this);
        }
    }

    static final class d extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f44864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f44865b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h hVar, p169q8.b bVar) {
            super(2, bVar);
            this.f44865b = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            return new d(this.f44865b, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p179r8.b.e();
            if (this.f44864a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            return this.f44865b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h hVar, p169q8.b bVar) {
            return ((d) create(hVar, bVar)).invokeSuspend(Unit.f45918a);
        }
    }

    public m(CoroutineContext backgroundDispatcher, Z timeProvider, InterfaceC0984i sessionConfigsDataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f44852a = backgroundDispatcher;
        this.f44853b = timeProvider;
        this.f44854c = sessionConfigsDataStore;
        this.f44855d = new AtomicReference();
        AbstractC0677k.d(P.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    private final h h() {
        if (this.f44855d.get() == null) {
            AbstractC1169o.a(this.f44855d, null, AbstractC0675j.b(null, new b(null), 1, null));
        }
        Object obj = this.f44855d.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (h) obj;
    }

    @Override // p078h7.l
    public Double a() {
        return h().c();
    }

    @Override // p078h7.l
    public boolean b() {
        Long lB = h().b();
        Integer numA = h().a();
        return lB == null || numA == null || this.f44853b.a().a() - lB.longValue() >= ((long) numA.intValue());
    }

    @Override // p078h7.l
    public Boolean c() {
        return h().e();
    }

    @Override // p078h7.l
    public Integer d() {
        return h().d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p078h7.l
    public Object e(h hVar, p169q8.b bVar) {
        c cVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f44863c;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar.f44863c = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object obj = cVar.f44861a;
        Object objE = p179r8.b.e();
        int i11 = cVar.f44863c;
        try {
            if (i11 == 0) {
                n.b(obj);
                InterfaceC0984i interfaceC0984i = this.f44854c;
                d dVar = new d(hVar, null);
                cVar.f44863c = 1;
                if (interfaceC0984i.a(dVar, cVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
        } catch (IOException e10) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e10);
        }
        return Unit.f45918a;
    }
}
