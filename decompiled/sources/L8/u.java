package L8;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class u {

    public static final class a implements InterfaceC0804e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0804e f3391a;

        /* JADX INFO: renamed from: L8.u$a$a, reason: collision with other inner class name */
        public static final class C0051a implements InterfaceC0805f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0805f f3392a;

            /* JADX INFO: renamed from: L8.u$a$a$a, reason: collision with other inner class name */
            public static final class C0052a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f3393a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f3394b;

                public C0052a(p169q8.b bVar) {
                    super(bVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3393a = obj;
                    this.f3394b |= LinearLayoutManager.INVALID_OFFSET;
                    return C0051a.this.emit(null, this);
                }
            }

            public C0051a(InterfaceC0805f interfaceC0805f) {
                this.f3392a = interfaceC0805f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // L8.InterfaceC0805f
            public final Object emit(Object obj, p169q8.b bVar) {
                C0052a c0052a;
                if (bVar instanceof C0052a) {
                    c0052a = (C0052a) bVar;
                    int i10 = c0052a.f3394b;
                    if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0052a.f3394b = i10 - LinearLayoutManager.INVALID_OFFSET;
                    } else {
                        c0052a = new C0052a(bVar);
                    }
                } else {
                    c0052a = new C0052a(bVar);
                }
                Object obj2 = c0052a.f3393a;
                Object objE = p179r8.b.e();
                int i11 = c0052a.f3394b;
                if (i11 == 0) {
                    p129m8.n.b(obj2);
                    InterfaceC0805f interfaceC0805f = this.f3392a;
                    if (obj != null) {
                        c0052a.f3394b = 1;
                        if (interfaceC0805f.emit(obj, c0052a) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p129m8.n.b(obj2);
                }
                return Unit.f45918a;
            }
        }

        public a(InterfaceC0804e interfaceC0804e) {
            this.f3391a = interfaceC0804e;
        }

        @Override // L8.InterfaceC0804e
        public Object collect(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
            Object objCollect = this.f3391a.collect(new C0051a(interfaceC0805f), bVar);
            return objCollect == p179r8.b.e() ? objCollect : Unit.f45918a;
        }
    }

    public static final class b implements InterfaceC0804e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0804e f3396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f3397b;

        public static final class a implements InterfaceC0805f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC0805f f3398a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f3399b;

            /* JADX INFO: renamed from: L8.u$b$a$a, reason: collision with other inner class name */
            public static final class C0053a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f3400a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f3401b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f3403d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f3404e;

                public C0053a(p169q8.b bVar) {
                    super(bVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3400a = obj;
                    this.f3401b |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC0805f interfaceC0805f, Function2 function2) {
                this.f3398a = interfaceC0805f;
                this.f3399b = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            
                if (r6.emit(r2, r0) == r1) goto L22;
             */
            @Override // L8.InterfaceC0805f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, p169q8.b r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof L8.u.b.a.C0053a
                    if (r0 == 0) goto L13
                    r0 = r7
                    L8.u$b$a$a r0 = (L8.u.b.a.C0053a) r0
                    int r1 = r0.f3401b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f3401b = r1
                    goto L18
                L13:
                    L8.u$b$a$a r0 = new L8.u$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f3400a
                    java.lang.Object r1 = p179r8.b.e()
                    int r2 = r0.f3401b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p129m8.n.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f3404e
                    L8.f r6 = (L8.InterfaceC0805f) r6
                    java.lang.Object r2 = r0.f3403d
                    p129m8.n.b(r7)
                    goto L5c
                L3e:
                    p129m8.n.b(r7)
                    L8.f r7 = r5.f3398a
                    kotlin.jvm.functions.Function2 r2 = r5.f3399b
                    r0.f3403d = r6
                    r0.f3404e = r7
                    r0.f3401b = r4
                    r4 = 6
                    kotlin.jvm.internal.l.a(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.l.a(r4)
                    if (r2 != r1) goto L5a
                    goto L69
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f3403d = r7
                    r0.f3404e = r7
                    r0.f3401b = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                L69:
                    return r1
                L6a:
                    kotlin.Unit r6 = kotlin.Unit.f45918a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: L8.u.b.a.emit(java.lang.Object, q8.b):java.lang.Object");
            }
        }

        public b(InterfaceC0804e interfaceC0804e, Function2 function2) {
            this.f3396a = interfaceC0804e;
            this.f3397b = function2;
        }

        @Override // L8.InterfaceC0804e
        public Object collect(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
            Object objCollect = this.f3396a.collect(new a(interfaceC0805f, this.f3397b), bVar);
            return objCollect == p179r8.b.e() ? objCollect : Unit.f45918a;
        }
    }

    public static final InterfaceC0804e a(InterfaceC0804e interfaceC0804e) {
        return new a(interfaceC0804e);
    }

    public static final InterfaceC0804e b(InterfaceC0804e interfaceC0804e, Function2 function2) {
        return new b(interfaceC0804e, function2);
    }
}
