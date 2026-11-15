package M8;

import L8.InterfaceC0805f;
import N8.K;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class B implements InterfaceC0805f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineContext f3538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f3539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function2 f3540c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f3542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0805f f3543c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
            super(2, bVar);
            this.f3543c = interfaceC0805f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            a aVar = new a(this.f3543c, bVar);
            aVar.f3542b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p179r8.b.e();
            int i10 = this.f3541a;
            if (i10 == 0) {
                p129m8.n.b(obj);
                Object obj2 = this.f3542b;
                InterfaceC0805f interfaceC0805f = this.f3543c;
                this.f3541a = 1;
                if (interfaceC0805f.emit(obj2, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p129m8.n.b(obj);
            }
            return Unit.f45918a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, p169q8.b bVar) {
            return ((a) create(obj, bVar)).invokeSuspend(Unit.f45918a);
        }
    }

    public B(InterfaceC0805f interfaceC0805f, CoroutineContext coroutineContext) {
        this.f3538a = coroutineContext;
        this.f3539b = K.g(coroutineContext);
        this.f3540c = new a(interfaceC0805f, null);
    }

    @Override // L8.InterfaceC0805f
    public Object emit(Object obj, p169q8.b bVar) {
        Object objB = f.b(this.f3538a, obj, this.f3539b, this.f3540c, bVar);
        return objB == p179r8.b.e() ? objB : Unit.f45918a;
    }
}
