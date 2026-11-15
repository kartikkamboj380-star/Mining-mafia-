package K8;

import I8.AbstractC0675j;
import I8.O;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class o {

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y f2977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f2978d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y yVar, Object obj, p169q8.b bVar) {
            super(2, bVar);
            this.f2977c = yVar;
            this.f2978d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            a aVar = new a(this.f2977c, this.f2978d, bVar);
            aVar.f2976b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, p169q8.b bVar) {
            return ((a) create(o10, bVar)).invokeSuspend(Unit.f45918a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = p179r8.b.e();
            int i10 = this.f2975a;
            try {
                if (i10 == 0) {
                    p129m8.n.b(obj);
                    y yVar = this.f2977c;
                    Object obj2 = this.f2978d;
                    m8.m.a aVar = p129m8.m.f46450b;
                    this.f2975a = 1;
                    if (yVar.k(obj2, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p129m8.n.b(obj);
                }
                objB = p129m8.m.b(Unit.f45918a);
            } catch (Throwable th) {
                m8.m.a aVar2 = p129m8.m.f46450b;
                objB = p129m8.m.b(p129m8.n.a(th));
            }
            return k.b(p129m8.m.g(objB) ? k.f2969b.c(Unit.f45918a) : k.f2969b.a(p129m8.m.d(objB)));
        }
    }

    public static final Object a(y yVar, Object obj) {
        Object objG = yVar.g(obj);
        if (objG instanceof k.c) {
            return ((k) AbstractC0675j.b(null, new a(yVar, obj, null), 1, null)).k();
        }
        return k.f2969b.c(Unit.f45918a);
    }
}
