package W;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    static final class a extends kotlin.coroutines.jvm.internal.l implements p259z8.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f6206b;

        a(p169q8.b bVar) {
            super(3, bVar);
        }

        @Override // p259z8.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m((C) obj, ((Boolean) obj2).booleanValue(), (p169q8.b) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p179r8.b.e();
            int i10 = this.f6205a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p129m8.n.b(obj);
                return obj;
            }
            p129m8.n.b(obj);
            C c10 = (C) this.f6206b;
            this.f6205a = 1;
            Object objE2 = c10.e(this);
            return objE2 == objE ? objE : objE2;
        }

        public final Object m(C c10, boolean z9, p169q8.b bVar) {
            a aVar = new a(bVar);
            aVar.f6206b = c10;
            return aVar.invokeSuspend(Unit.f45918a);
        }
    }

    public static final Object a(K k10, p169q8.b bVar) {
        return k10.b(new a(null), bVar);
    }
}
