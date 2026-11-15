package p001a0;

import L8.InterfaceC0804e;
import W.InterfaceC0984i;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p129m8.n;
import p169q8.b;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0984i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0984i f7239a;

    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f7242c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, b bVar) {
            super(2, bVar);
            this.f7242c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final b create(Object obj, b bVar) {
            a aVar = new a(this.f7242c, bVar);
            aVar.f7241b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p179r8.b.e();
            int i10 = this.f7240a;
            if (i10 == 0) {
                n.b(obj);
                f fVar = (f) this.f7241b;
                Function2 function2 = this.f7242c;
                this.f7240a = 1;
                obj = function2.invoke(fVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            f fVar2 = (f) obj;
            Intrinsics.d(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).f();
            return fVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, b bVar) {
            return ((a) create(fVar, bVar)).invokeSuspend(Unit.f45918a);
        }
    }

    public d(InterfaceC0984i delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f7239a = delegate;
    }

    @Override // W.InterfaceC0984i
    public Object a(Function2 function2, b bVar) {
        return this.f7239a.a(new a(function2, null), bVar);
    }

    @Override // W.InterfaceC0984i
    public InterfaceC0804e getData() {
        return this.f7239a.getData();
    }
}
