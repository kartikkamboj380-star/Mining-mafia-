package M8;

import I8.O;
import L8.InterfaceC0804e;
import L8.InterfaceC0805f;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f3584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f3588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC0804e[] f3589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f3590h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ p259z8.n f3591i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC0805f f3592j;

        /* JADX INFO: renamed from: M8.k$a$a, reason: collision with other inner class name */
        static final class C0060a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f3593a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC0804e[] f3594b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f3595c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f3596d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ K8.g f3597e;

            /* JADX INFO: renamed from: M8.k$a$a$a, reason: collision with other inner class name */
            static final class C0061a implements InterfaceC0805f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ K8.g f3598a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f3599b;

                /* JADX INFO: renamed from: M8.k$a$a$a$a, reason: collision with other inner class name */
                static final class C0062a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f3600a;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    int f3602c;

                    C0062a(p169q8.b bVar) {
                        super(bVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f3600a = obj;
                        this.f3602c |= LinearLayoutManager.INVALID_OFFSET;
                        return C0061a.this.emit(null, this);
                    }
                }

                C0061a(K8.g gVar, int i10) {
                    this.f3598a = gVar;
                    this.f3599b = i10;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (I8.i1.a(r0) == r1) goto L21;
                 */
                @Override // L8.InterfaceC0805f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, p169q8.b r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof M8.k.a.C0060a.C0061a.C0062a
                        if (r0 == 0) goto L13
                        r0 = r8
                        M8.k$a$a$a$a r0 = (M8.k.a.C0060a.C0061a.C0062a) r0
                        int r1 = r0.f3602c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f3602c = r1
                        goto L18
                    L13:
                        M8.k$a$a$a$a r0 = new M8.k$a$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f3600a
                        java.lang.Object r1 = p179r8.b.e()
                        int r2 = r0.f3602c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        p129m8.n.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        p129m8.n.b(r8)
                        goto L4d
                    L38:
                        p129m8.n.b(r8)
                        K8.g r8 = r6.f3598a
                        kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                        int r5 = r6.f3599b
                        r2.<init>(r5, r7)
                        r0.f3602c = r4
                        java.lang.Object r7 = r8.k(r2, r0)
                        if (r7 != r1) goto L4d
                        goto L55
                    L4d:
                        r0.f3602c = r3
                        java.lang.Object r7 = I8.i1.a(r0)
                        if (r7 != r1) goto L56
                    L55:
                        return r1
                    L56:
                        kotlin.Unit r7 = kotlin.Unit.f45918a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: M8.k.a.C0060a.C0061a.emit(java.lang.Object, q8.b):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0060a(InterfaceC0804e[] interfaceC0804eArr, int i10, AtomicInteger atomicInteger, K8.g gVar, p169q8.b bVar) {
                super(2, bVar);
                this.f3594b = interfaceC0804eArr;
                this.f3595c = i10;
                this.f3596d = atomicInteger;
                this.f3597e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p169q8.b create(Object obj, p169q8.b bVar) {
                return new C0060a(this.f3594b, this.f3595c, this.f3596d, this.f3597e, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, p169q8.b bVar) {
                return ((C0060a) create(o10, bVar)).invokeSuspend(Unit.f45918a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p179r8.b.e();
                int i10 = this.f3593a;
                try {
                    if (i10 == 0) {
                        p129m8.n.b(obj);
                        InterfaceC0804e[] interfaceC0804eArr = this.f3594b;
                        int i11 = this.f3595c;
                        InterfaceC0804e interfaceC0804e = interfaceC0804eArr[i11];
                        C0061a c0061a = new C0061a(this.f3597e, i11);
                        this.f3593a = 1;
                        if (interfaceC0804e.collect(c0061a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p129m8.n.b(obj);
                    }
                    if (this.f3596d.decrementAndGet() == 0) {
                        K8.y.a.a(this.f3597e, null, 1, null);
                    }
                    return Unit.f45918a;
                } catch (Throwable th) {
                    if (this.f3596d.decrementAndGet() == 0) {
                        K8.y.a.a(this.f3597e, null, 1, null);
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0804e[] interfaceC0804eArr, Function0 function0, p259z8.n nVar, InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
            super(2, bVar);
            this.f3589g = interfaceC0804eArr;
            this.f3590h = function0;
            this.f3591i = nVar;
            this.f3592j = interfaceC0805f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            a aVar = new a(this.f3589g, this.f3590h, this.f3591i, this.f3592j, bVar);
            aVar.f3588f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, p169q8.b bVar) {
            return ((a) create(o10, bVar)).invokeSuspend(Unit.f45918a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e6 A[EDGE_INSN: B:35:0x00e6->B:44:0x0129 BREAK  A[LOOP:0: B:28:0x00c1->B:47:?]] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:41:0x0109  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:28:0x00c1->B:47:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x0109
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: M8.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(InterfaceC0805f interfaceC0805f, InterfaceC0804e[] interfaceC0804eArr, Function0 function0, p259z8.n nVar, p169q8.b bVar) {
        Object objA = n.a(new a(interfaceC0804eArr, function0, nVar, interfaceC0805f, null), bVar);
        return objA == p179r8.b.e() ? objA : Unit.f45918a;
    }
}
