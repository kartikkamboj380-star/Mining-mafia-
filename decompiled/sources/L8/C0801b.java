package L8;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: L8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0801b extends C0802c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function2 f3238e;

    /* JADX INFO: renamed from: L8.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f3240b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3242d;

        a(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3240b = obj;
            this.f3242d |= LinearLayoutManager.INVALID_OFFSET;
            return C0801b.this.e(null, this);
        }
    }

    public /* synthetic */ C0801b(Function2 function2, CoroutineContext coroutineContext, int i10, K8.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? kotlin.coroutines.e.f45956a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? K8.a.SUSPEND : aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // L8.C0802c, M8.e
    protected Object e(K8.v vVar, p169q8.b bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f3242d;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f3242d = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f3240b;
        Object objE = p179r8.b.e();
        int i11 = aVar.f3242d;
        if (i11 == 0) {
            p129m8.n.b(obj);
            aVar.f3239a = vVar;
            aVar.f3242d = 1;
            if (super.e(vVar, aVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (K8.v) aVar.f3239a;
            p129m8.n.b(obj);
        }
        if (vVar.q()) {
            return Unit.f45918a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // L8.C0802c, M8.e
    protected M8.e f(CoroutineContext coroutineContext, int i10, K8.a aVar) {
        return new C0801b(this.f3238e, coroutineContext, i10, aVar);
    }

    public C0801b(Function2 function2, CoroutineContext coroutineContext, int i10, K8.a aVar) {
        super(function2, coroutineContext, i10, aVar);
        this.f3238e = function2;
    }
}
