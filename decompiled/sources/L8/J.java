package L8;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class J implements H {

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f3201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f3202c;

        /* JADX INFO: renamed from: L8.J$a$a, reason: collision with other inner class name */
        static final class C0043a implements InterfaceC0805f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.A f3203a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC0805f f3204b;

            /* JADX INFO: renamed from: L8.J$a$a$a, reason: collision with other inner class name */
            static final class C0044a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f3205a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f3207c;

                C0044a(p169q8.b bVar) {
                    super(bVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3205a = obj;
                    this.f3207c |= LinearLayoutManager.INVALID_OFFSET;
                    return C0043a.this.a(0, this);
                }
            }

            C0043a(kotlin.jvm.internal.A a10, InterfaceC0805f interfaceC0805f) {
                this.f3203a = a10;
                this.f3204b = interfaceC0805f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object a(int i10, p169q8.b bVar) {
                C0044a c0044a;
                if (bVar instanceof C0044a) {
                    c0044a = (C0044a) bVar;
                    int i11 = c0044a.f3207c;
                    if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0044a.f3207c = i11 - LinearLayoutManager.INVALID_OFFSET;
                    } else {
                        c0044a = new C0044a(bVar);
                    }
                } else {
                    c0044a = new C0044a(bVar);
                }
                Object obj = c0044a.f3205a;
                Object objE = p179r8.b.e();
                int i12 = c0044a.f3207c;
                if (i12 == 0) {
                    p129m8.n.b(obj);
                    if (i10 > 0) {
                        kotlin.jvm.internal.A a10 = this.f3203a;
                        if (!a10.f45969a) {
                            a10.f45969a = true;
                            InterfaceC0805f interfaceC0805f = this.f3204b;
                            F f10 = F.START;
                            c0044a.f3207c = 1;
                            if (interfaceC0805f.emit(f10, c0044a) == objE) {
                                return objE;
                            }
                        }
                    }
                    return Unit.f45918a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p129m8.n.b(obj);
                return Unit.f45918a;
            }

            @Override // L8.InterfaceC0805f
            public /* bridge */ /* synthetic */ Object emit(Object obj, p169q8.b bVar) {
                return a(((Number) obj).intValue(), bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(K k10, p169q8.b bVar) {
            super(2, bVar);
            this.f3202c = k10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            a aVar = new a(this.f3202c, bVar);
            aVar.f3201b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
            return ((a) create(interfaceC0805f, bVar)).invokeSuspend(Unit.f45918a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p179r8.b.e();
            int i10 = this.f3200a;
            if (i10 == 0) {
                p129m8.n.b(obj);
                InterfaceC0805f interfaceC0805f = (InterfaceC0805f) this.f3201b;
                kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
                K k10 = this.f3202c;
                C0043a c0043a = new C0043a(a10, interfaceC0805f);
                this.f3200a = 1;
                if (k10.collect(c0043a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p129m8.n.b(obj);
            }
            throw new p129m8.d();
        }
    }

    @Override // L8.H
    public InterfaceC0804e a(K k10) {
        return AbstractC0806g.u(new a(k10, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
