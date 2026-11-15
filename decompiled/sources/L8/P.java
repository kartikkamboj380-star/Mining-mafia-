package L8;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class P implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f3228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f3229b;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f3230a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3232c;

        a(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3230a = obj;
            this.f3232c |= LinearLayoutManager.INVALID_OFFSET;
            return P.this.collect(null, this);
        }
    }

    public P(B b10, Function2 function2) {
        this.f3228a = b10;
        this.f3229b = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // L8.B, L8.InterfaceC0804e
    public Object collect(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f3232c;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f3232c = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f3230a;
        Object objE = p179r8.b.e();
        int i11 = aVar.f3232c;
        if (i11 == 0) {
            p129m8.n.b(obj);
            B b10 = this.f3228a;
            O o10 = new O(interfaceC0805f, this.f3229b);
            aVar.f3232c = 1;
            if (b10.collect(o10, aVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p129m8.n.b(obj);
        }
        throw new p129m8.d();
    }
}
