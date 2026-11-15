package M8;

import I8.E0;
import L8.InterfaceC0805f;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends kotlin.coroutines.jvm.internal.d implements InterfaceC0805f, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0805f f3611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f3612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CoroutineContext f3614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p169q8.b f3615e;

    public u(InterfaceC0805f interfaceC0805f, CoroutineContext coroutineContext) {
        super(q.f3605a, kotlin.coroutines.e.f45956a);
        this.f3611a = interfaceC0805f;
        this.f3612b = coroutineContext;
        this.f3613c = ((Number) coroutineContext.fold(0, new Function2() { // from class: M8.t
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(u.o(((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue();
    }

    private final void n(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Object obj) {
        if (coroutineContext2 instanceof l) {
            q((l) coroutineContext2, obj);
        }
        x.b(this, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i10, CoroutineContext.Element element) {
        return i10 + 1;
    }

    private final Object p(p169q8.b bVar, Object obj) {
        CoroutineContext context = bVar.getContext();
        E0.g(context);
        CoroutineContext coroutineContext = this.f3614d;
        if (coroutineContext != context) {
            n(context, coroutineContext, obj);
            this.f3614d = context;
        }
        this.f3615e = bVar;
        p259z8.n nVar = v.f3616a;
        InterfaceC0805f interfaceC0805f = this.f3611a;
        Intrinsics.d(interfaceC0805f, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = nVar.invoke(interfaceC0805f, obj, this);
        if (!Intrinsics.b(objInvoke, p179r8.b.e())) {
            this.f3615e = null;
        }
        return objInvoke;
    }

    private final void q(l lVar, Object obj) {
        throw new IllegalStateException(StringsKt.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + lVar.f3604b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // L8.InterfaceC0805f
    public Object emit(Object obj, p169q8.b bVar) {
        try {
            Object objP = p(bVar, obj);
            if (objP == p179r8.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(bVar);
            }
            return objP == p179r8.b.e() ? objP : Unit.f45918a;
        } catch (Throwable th) {
            this.f3614d = new l(th, bVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        p169q8.b bVar = this.f3615e;
        if (bVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) bVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, p169q8.b
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f3614d;
        return coroutineContext == null ? kotlin.coroutines.e.f45956a : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected Object invokeSuspend(Object obj) {
        Throwable thD = p129m8.m.d(obj);
        if (thD != null) {
            this.f3614d = new l(thD, getContext());
        }
        p169q8.b bVar = this.f3615e;
        if (bVar != null) {
            bVar.resumeWith(obj);
        }
        return p179r8.b.e();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
