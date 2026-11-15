package L8;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class v {

    public static final class a implements InterfaceC0804e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0804e f3405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0804e f3406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p259z8.n f3407c;

        public a(InterfaceC0804e interfaceC0804e, InterfaceC0804e interfaceC0804e2, p259z8.n nVar) {
            this.f3405a = interfaceC0804e;
            this.f3406b = interfaceC0804e2;
            this.f3407c = nVar;
        }

        @Override // L8.InterfaceC0804e
        public Object collect(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
            Object objA = M8.k.a(interfaceC0805f, new InterfaceC0804e[]{this.f3405a, this.f3406b}, v.c(), new b(this.f3407c, null), bVar);
            return objA == p179r8.b.e() ? objA : Unit.f45918a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p259z8.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f3409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f3410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p259z8.n f3411d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p259z8.n nVar, p169q8.b bVar) {
            super(3, bVar);
            this.f3411d = nVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p179r8.b.e()
                int r1 = r6.f3408a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p129m8.n.b(r7)
                goto L4c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f3409b
                L8.f r1 = (L8.InterfaceC0805f) r1
                p129m8.n.b(r7)
                goto L40
            L22:
                p129m8.n.b(r7)
                java.lang.Object r7 = r6.f3409b
                r1 = r7
                L8.f r1 = (L8.InterfaceC0805f) r1
                java.lang.Object r7 = r6.f3410c
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                z8.n r4 = r6.f3411d
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.f3409b = r1
                r6.f3408a = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L40
                goto L4b
            L40:
                r3 = 0
                r6.f3409b = r3
                r6.f3408a = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L4c
            L4b:
                return r0
            L4c:
                kotlin.Unit r7 = kotlin.Unit.f45918a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: L8.v.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p259z8.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0805f interfaceC0805f, Object[] objArr, p169q8.b bVar) {
            b bVar2 = new b(this.f3411d, bVar);
            bVar2.f3409b = interfaceC0805f;
            bVar2.f3410c = objArr;
            return bVar2.invokeSuspend(Unit.f45918a);
        }
    }

    static final class c implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f3412a = new c();

        c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final InterfaceC0804e b(InterfaceC0804e interfaceC0804e, InterfaceC0804e interfaceC0804e2, p259z8.n nVar) {
        return new a(interfaceC0804e, interfaceC0804e2, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0 c() {
        return c.f3412a;
    }
}
