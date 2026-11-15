package L8;

import M8.C0817a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class s {

    public static final class a implements InterfaceC0805f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f3352a;

        public a(kotlin.jvm.internal.E e10) {
            this.f3352a = e10;
        }

        @Override // L8.InterfaceC0805f
        public Object emit(Object obj, p169q8.b bVar) {
            this.f3352a.f45973a = obj;
            throw new C0817a(this);
        }
    }

    public static final class b implements InterfaceC0805f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f3353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f3354b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f3355a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f3356b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f3357c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f3359e;

            public a(p169q8.b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3356b = obj;
                this.f3357c |= LinearLayoutManager.INVALID_OFFSET;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, kotlin.jvm.internal.E e10) {
            this.f3353a = function2;
            this.f3354b = e10;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // L8.InterfaceC0805f
        public Object emit(Object obj, p169q8.b bVar) {
            a aVar;
            b bVar2;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f3357c;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.f3357c = i10 - LinearLayoutManager.INVALID_OFFSET;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object objInvoke = aVar.f3356b;
            Object objE = p179r8.b.e();
            int i11 = aVar.f3357c;
            if (i11 == 0) {
                p129m8.n.b(objInvoke);
                Function2 function2 = this.f3353a;
                aVar.f3355a = this;
                aVar.f3359e = obj;
                aVar.f3357c = 1;
                kotlin.jvm.internal.l.a(6);
                objInvoke = function2.invoke(obj, aVar);
                kotlin.jvm.internal.l.a(7);
                if (objInvoke == objE) {
                    return objE;
                }
                bVar2 = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f3359e;
                bVar2 = (b) aVar.f3355a;
                p129m8.n.b(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.f45918a;
            }
            bVar2.f3354b.f45973a = obj;
            throw new C0817a(bVar2);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f3361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f3362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3363d;

        c(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3362c = obj;
            this.f3363d |= LinearLayoutManager.INVALID_OFFSET;
            return AbstractC0806g.s(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f3365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f3366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f3367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3368e;

        d(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3367d = obj;
            this.f3368e |= LinearLayoutManager.INVALID_OFFSET;
            return AbstractC0806g.r(null, null, this);
        }
    }

    public static final class e implements InterfaceC0805f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f3369a;

        public e(kotlin.jvm.internal.E e10) {
            this.f3369a = e10;
        }

        @Override // L8.InterfaceC0805f
        public Object emit(Object obj, p169q8.b bVar) {
            this.f3369a.f45973a = obj;
            throw new C0817a(this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f3371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f3372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3373d;

        f(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3372c = obj;
            this.f3373d |= LinearLayoutManager.INVALID_OFFSET;
            return AbstractC0806g.t(null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f3375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3376c;

        g(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3375b = obj;
            this.f3376c |= LinearLayoutManager.INVALID_OFFSET;
            return AbstractC0806g.E(null, this);
        }
    }

    static final class h implements InterfaceC0805f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f3377a;

        h(kotlin.jvm.internal.E e10) {
            this.f3377a = e10;
        }

        @Override // L8.InterfaceC0805f
        public final Object emit(Object obj, p169q8.b bVar) {
            kotlin.jvm.internal.E e10 = this.f3377a;
            if (e10.f45973a != M8.s.f3608a) {
                throw new IllegalArgumentException("Flow has more than one element");
            }
            e10.f45973a = obj;
            return Unit.f45918a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(InterfaceC0804e interfaceC0804e, Function2 function2, p169q8.b bVar) {
        d dVar;
        Function2 function3;
        kotlin.jvm.internal.E e10;
        C0817a e11;
        InterfaceC0805f interfaceC0805f;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f3368e;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f3368e = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f3367d;
        Object objE = p179r8.b.e();
        int i11 = dVar.f3368e;
        if (i11 == 0) {
            p129m8.n.b(obj);
            kotlin.jvm.internal.E e12 = new kotlin.jvm.internal.E();
            e12.f45973a = M8.s.f3608a;
            InterfaceC0805f bVar2 = new b(function2, e12);
            try {
                dVar.f3364a = function2;
                dVar.f3365b = e12;
                dVar.f3366c = bVar2;
                dVar.f3368e = 1;
                if (interfaceC0804e.collect(bVar2, dVar) == objE) {
                    return objE;
                }
                function3 = function2;
                e10 = e12;
            } catch (C0817a e13) {
                function3 = function2;
                e10 = e12;
                e11 = e13;
                interfaceC0805f = bVar2;
                M8.o.a(e11, interfaceC0805f);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0805f = (b) dVar.f3366c;
            e10 = (kotlin.jvm.internal.E) dVar.f3365b;
            function3 = (Function2) dVar.f3364a;
            try {
                p129m8.n.b(obj);
            } catch (C0817a e14) {
                e11 = e14;
                M8.o.a(e11, interfaceC0805f);
            }
        }
        Object obj2 = e10.f45973a;
        if (obj2 != M8.s.f3608a) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + function3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(InterfaceC0804e interfaceC0804e, p169q8.b bVar) {
        c cVar;
        kotlin.jvm.internal.E e10;
        C0817a e11;
        InterfaceC0805f interfaceC0805f;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f3363d;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar.f3363d = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object obj = cVar.f3362c;
        Object objE = p179r8.b.e();
        int i11 = cVar.f3363d;
        if (i11 == 0) {
            p129m8.n.b(obj);
            kotlin.jvm.internal.E e12 = new kotlin.jvm.internal.E();
            e12.f45973a = M8.s.f3608a;
            InterfaceC0805f aVar = new a(e12);
            try {
                cVar.f3360a = e12;
                cVar.f3361b = aVar;
                cVar.f3363d = 1;
                if (interfaceC0804e.collect(aVar, cVar) == objE) {
                    return objE;
                }
                e10 = e12;
            } catch (C0817a e13) {
                e10 = e12;
                e11 = e13;
                interfaceC0805f = aVar;
                M8.o.a(e11, interfaceC0805f);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0805f = (a) cVar.f3361b;
            e10 = (kotlin.jvm.internal.E) cVar.f3360a;
            try {
                p129m8.n.b(obj);
            } catch (C0817a e14) {
                e11 = e14;
                M8.o.a(e11, interfaceC0805f);
            }
        }
        Object obj2 = e10.f45973a;
        if (obj2 != M8.s.f3608a) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(InterfaceC0804e interfaceC0804e, p169q8.b bVar) {
        f fVar;
        kotlin.jvm.internal.E e10;
        C0817a e11;
        InterfaceC0805f interfaceC0805f;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f3373d;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f3373d = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.f3372c;
        Object objE = p179r8.b.e();
        int i11 = fVar.f3373d;
        if (i11 == 0) {
            p129m8.n.b(obj);
            kotlin.jvm.internal.E e12 = new kotlin.jvm.internal.E();
            InterfaceC0805f eVar = new e(e12);
            try {
                fVar.f3370a = e12;
                fVar.f3371b = eVar;
                fVar.f3373d = 1;
                if (interfaceC0804e.collect(eVar, fVar) == objE) {
                    return objE;
                }
                e10 = e12;
            } catch (C0817a e13) {
                e10 = e12;
                e11 = e13;
                interfaceC0805f = eVar;
                M8.o.a(e11, interfaceC0805f);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0805f = (e) fVar.f3371b;
            e10 = (kotlin.jvm.internal.E) fVar.f3370a;
            try {
                p129m8.n.b(obj);
            } catch (C0817a e14) {
                e11 = e14;
                M8.o.a(e11, interfaceC0805f);
            }
        }
        return e10.f45973a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(InterfaceC0804e interfaceC0804e, p169q8.b bVar) {
        g gVar;
        kotlin.jvm.internal.E e10;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f3376c;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f3376c = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object obj = gVar.f3375b;
        Object objE = p179r8.b.e();
        int i11 = gVar.f3376c;
        if (i11 == 0) {
            p129m8.n.b(obj);
            kotlin.jvm.internal.E e11 = new kotlin.jvm.internal.E();
            e11.f45973a = M8.s.f3608a;
            InterfaceC0805f hVar = new h(e11);
            gVar.f3374a = e11;
            gVar.f3376c = 1;
            if (interfaceC0804e.collect(hVar, gVar) == objE) {
                return objE;
            }
            e10 = e11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e10 = (kotlin.jvm.internal.E) gVar.f3374a;
            p129m8.n.b(obj);
        }
        Object obj2 = e10.f45973a;
        if (obj2 != M8.s.f3608a) {
            return obj2;
        }
        throw new NoSuchElementException("Flow is empty");
    }
}
