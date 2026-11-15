package L8;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: L8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0814o {

    /* JADX INFO: renamed from: L8.o$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f3265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3266c;

        a(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3265b = obj;
            this.f3266c |= LinearLayoutManager.INVALID_OFFSET;
            return AbstractC0814o.c(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: L8.o$b */
    public static final class b implements InterfaceC0804e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0804e f3267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p259z8.n f3268b;

        /* JADX INFO: renamed from: L8.o$b$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f3269a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f3270b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f3272d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f3273e;

            public a(p169q8.b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3269a = obj;
                this.f3270b |= LinearLayoutManager.INVALID_OFFSET;
                return b.this.collect(null, this);
            }
        }

        public b(InterfaceC0804e interfaceC0804e, p259z8.n nVar) {
            this.f3267a = interfaceC0804e;
            this.f3268b = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0088  */
        /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // L8.InterfaceC0804e
        public Object collect(InterfaceC0805f interfaceC0805f, p169q8.b bVar) throws Throwable {
            a aVar;
            b bVar2;
            Q q10;
            p259z8.n nVar;
            M8.u uVar;
            Throwable th;
            M8.u uVar2;
            Object objInvoke;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f3270b;
                if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.f3270b = i10 - LinearLayoutManager.INVALID_OFFSET;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj = aVar.f3269a;
            Object objE = p179r8.b.e();
            int i11 = aVar.f3270b;
            if (i11 == 0) {
                p129m8.n.b(obj);
                try {
                    InterfaceC0804e interfaceC0804e = this.f3267a;
                    aVar.f3272d = this;
                    aVar.f3273e = interfaceC0805f;
                    aVar.f3270b = 1;
                    if (interfaceC0804e.collect(interfaceC0805f, aVar) != objE) {
                        bVar2 = this;
                        uVar = new M8.u(interfaceC0805f, aVar.getContext());
                        p259z8.n nVar2 = bVar2.f3268b;
                        aVar.f3272d = uVar;
                        aVar.f3273e = null;
                        aVar.f3270b = 3;
                        kotlin.jvm.internal.l.a(6);
                        objInvoke = nVar2.invoke(uVar, null, aVar);
                        kotlin.jvm.internal.l.a(7);
                        if (objInvoke != objE) {
                            uVar2 = uVar;
                            uVar2.releaseIntercepted();
                            return Unit.f45918a;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = this;
                    q10 = new Q(th);
                    nVar = bVar2.f3268b;
                    aVar.f3272d = th;
                    aVar.f3273e = null;
                    aVar.f3270b = 2;
                    if (AbstractC0814o.c(q10, nVar, th, aVar) == objE) {
                        throw th;
                    }
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    Throwable th3 = (Throwable) aVar.f3272d;
                    p129m8.n.b(obj);
                    throw th3;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uVar2 = (M8.u) aVar.f3272d;
                try {
                    p129m8.n.b(obj);
                    uVar2.releaseIntercepted();
                    return Unit.f45918a;
                } catch (Throwable th4) {
                    th = th4;
                    uVar2.releaseIntercepted();
                    throw th;
                }
            }
            interfaceC0805f = (InterfaceC0805f) aVar.f3273e;
            bVar2 = (b) aVar.f3272d;
            try {
                p129m8.n.b(obj);
                uVar = new M8.u(interfaceC0805f, aVar.getContext());
                try {
                    p259z8.n nVar3 = bVar2.f3268b;
                    aVar.f3272d = uVar;
                    aVar.f3273e = null;
                    aVar.f3270b = 3;
                    kotlin.jvm.internal.l.a(6);
                    objInvoke = nVar3.invoke(uVar, null, aVar);
                    kotlin.jvm.internal.l.a(7);
                    if (objInvoke != objE) {
                        uVar2 = uVar;
                        uVar2.releaseIntercepted();
                        return Unit.f45918a;
                    }
                    return objE;
                } catch (Throwable th5) {
                    th = th5;
                    uVar2 = uVar;
                    uVar2.releaseIntercepted();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                q10 = new Q(th);
                nVar = bVar2.f3268b;
                aVar.f3272d = th;
                aVar.f3273e = null;
                aVar.f3270b = 2;
                if (AbstractC0814o.c(q10, nVar, th, aVar) == objE) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L8.o$c */
    public static final class c implements InterfaceC0804e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f3274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0804e f3275b;

        /* JADX INFO: renamed from: L8.o$c$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f3276a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f3277b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f3279d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f3280e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f3281f;

            public a(p169q8.b bVar) {
                super(bVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3276a = obj;
                this.f3277b |= LinearLayoutManager.INVALID_OFFSET;
                return c.this.collect(null, this);
            }
        }

        public c(Function2 function2, InterfaceC0804e interfaceC0804e) {
            this.f3274a = function2;
            this.f3275b = interfaceC0804e;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r7.collect(r2, r0) == r1) goto L27;
         */
        @Override // L8.InterfaceC0804e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(L8.InterfaceC0805f r7, p169q8.b r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof L8.AbstractC0814o.c.a
                if (r0 == 0) goto L13
                r0 = r8
                L8.o$c$a r0 = (L8.AbstractC0814o.c.a) r0
                int r1 = r0.f3277b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f3277b = r1
                goto L18
            L13:
                L8.o$c$a r0 = new L8.o$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f3276a
                java.lang.Object r1 = p179r8.b.e()
                int r2 = r0.f3277b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p129m8.n.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f3281f
                M8.u r7 = (M8.u) r7
                java.lang.Object r2 = r0.f3280e
                L8.f r2 = (L8.InterfaceC0805f) r2
                java.lang.Object r4 = r0.f3279d
                L8.o$c r4 = (L8.AbstractC0814o.c) r4
                p129m8.n.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                p129m8.n.b(r8)
                M8.u r8 = new M8.u
                kotlin.coroutines.CoroutineContext r2 = r0.getContext()
                r8.<init>(r7, r2)
                kotlin.jvm.functions.Function2 r2 = r6.f3274a     // Catch: java.lang.Throwable -> L86
                r0.f3279d = r6     // Catch: java.lang.Throwable -> L86
                r0.f3280e = r7     // Catch: java.lang.Throwable -> L86
                r0.f3281f = r8     // Catch: java.lang.Throwable -> L86
                r0.f3277b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.l.a(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.l.a(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                goto L82
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                L8.e r7 = r4.f3275b
                r8 = 0
                r0.f3279d = r8
                r0.f3280e = r8
                r0.f3281f = r8
                r0.f3277b = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
            L82:
                return r1
            L83:
                kotlin.Unit r7 = kotlin.Unit.f45918a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: L8.AbstractC0814o.c.collect(L8.f, q8.b):java.lang.Object");
        }
    }

    public static final void b(InterfaceC0805f interfaceC0805f) {
        if (interfaceC0805f instanceof Q) {
            throw ((Q) interfaceC0805f).f3233a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(InterfaceC0805f interfaceC0805f, p259z8.n nVar, Throwable th, p169q8.b bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f3266c;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f3266c = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f3265b;
        Object objE = p179r8.b.e();
        int i11 = aVar.f3266c;
        try {
            if (i11 == 0) {
                p129m8.n.b(obj);
                aVar.f3264a = th;
                aVar.f3266c = 1;
                if (nVar.invoke(interfaceC0805f, th, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) aVar.f3264a;
                p129m8.n.b(obj);
            }
            return Unit.f45918a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                p129m8.a.a(th2, th);
            }
            throw th2;
        }
    }

    public static final InterfaceC0804e d(InterfaceC0804e interfaceC0804e, p259z8.n nVar) {
        return new b(interfaceC0804e, nVar);
    }

    public static final InterfaceC0804e e(InterfaceC0804e interfaceC0804e, Function2 function2) {
        return new c(function2, interfaceC0804e);
    }
}
