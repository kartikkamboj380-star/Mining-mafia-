package L8;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: L8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0803d implements InterfaceC0804e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0804e f3244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f3245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f3246c;

    /* JADX INFO: renamed from: L8.d$a */
    static final class a implements InterfaceC0805f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f3248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0805f f3249c;

        /* JADX INFO: renamed from: L8.d$a$a, reason: collision with other inner class name */
        static final class C0046a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f3250a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f3252c;

            C0046a(p169q8.b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3250a = obj;
                this.f3252c |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        a(kotlin.jvm.internal.E e10, InterfaceC0805f interfaceC0805f) {
            this.f3248b = e10;
            this.f3249c = interfaceC0805f;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // L8.InterfaceC0805f
        public final Object emit(Object obj, p169q8.b bVar) {
            C0046a c0046a;
            if (bVar instanceof C0046a) {
                c0046a = (C0046a) bVar;
                int i10 = c0046a.f3252c;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0046a.f3252c = i10 - LinearLayoutManager.INVALID_OFFSET;
                } else {
                    c0046a = new C0046a(bVar);
                }
            } else {
                c0046a = new C0046a(bVar);
            }
            Object obj2 = c0046a.f3250a;
            Object objE = p179r8.b.e();
            int i11 = c0046a.f3252c;
            if (i11 == 0) {
                p129m8.n.b(obj2);
                Object objInvoke = C0803d.this.f3245b.invoke(obj);
                Object obj3 = this.f3248b.f45973a;
                if (obj3 != M8.s.f3608a && ((Boolean) C0803d.this.f3246c.invoke(obj3, objInvoke)).booleanValue()) {
                    return Unit.f45918a;
                }
                this.f3248b.f45973a = objInvoke;
                InterfaceC0805f interfaceC0805f = this.f3249c;
                c0046a.f3252c = 1;
                if (interfaceC0805f.emit(obj, c0046a) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p129m8.n.b(obj2);
            }
            return Unit.f45918a;
        }
    }

    public C0803d(InterfaceC0804e interfaceC0804e, Function1 function1, Function2 function2) {
        this.f3244a = interfaceC0804e;
        this.f3245b = function1;
        this.f3246c = function2;
    }

    @Override // L8.InterfaceC0804e
    public Object collect(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
        kotlin.jvm.internal.E e10 = new kotlin.jvm.internal.E();
        e10.f45973a = M8.s.f3608a;
        Object objCollect = this.f3244a.collect(new a(e10, interfaceC0805f), bVar);
        return objCollect == p179r8.b.e() ? objCollect : Unit.f45918a;
    }
}
