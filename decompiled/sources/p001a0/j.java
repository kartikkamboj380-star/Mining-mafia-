package p001a0;

import W.InterfaceC0984i;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import p129m8.n;
import p169q8.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f7250c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, b bVar) {
            super(2, bVar);
            this.f7250c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final b create(Object obj, b bVar) {
            a aVar = new a(this.f7250c, bVar);
            aVar.f7249b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p179r8.b.e();
            int i10 = this.f7248a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f7249b;
                n.b(obj);
                return cVar;
            }
            n.b(obj);
            c cVarC = ((f) this.f7249b).c();
            Function2 function2 = this.f7250c;
            this.f7249b = cVarC;
            this.f7248a = 1;
            return function2.invoke(cVarC, this) == objE ? objE : cVarC;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, b bVar) {
            return ((a) create(fVar, bVar)).invokeSuspend(Unit.f45918a);
        }
    }

    public static final Object a(InterfaceC0984i interfaceC0984i, Function2 function2, b bVar) {
        return interfaceC0984i.a(new a(function2, null), bVar);
    }
}
