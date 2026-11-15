package M8;

import I8.O;
import I8.P;
import I8.Q;
import I8.T;
import L8.AbstractC0806g;
import L8.InterfaceC0804e;
import L8.InterfaceC0805f;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f3550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.a f3552c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f3554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0805f f3555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f3556d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0805f interfaceC0805f, e eVar, p169q8.b bVar) {
            super(2, bVar);
            this.f3555c = interfaceC0805f;
            this.f3556d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            a aVar = new a(this.f3555c, this.f3556d, bVar);
            aVar.f3554b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, p169q8.b bVar) {
            return ((a) create(o10, bVar)).invokeSuspend(Unit.f45918a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p179r8.b.e();
            int i10 = this.f3553a;
            if (i10 == 0) {
                p129m8.n.b(obj);
                O o10 = (O) this.f3554b;
                InterfaceC0805f interfaceC0805f = this.f3555c;
                K8.x xVarM = this.f3556d.m(o10);
                this.f3553a = 1;
                if (AbstractC0806g.n(interfaceC0805f, xVarM, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p129m8.n.b(obj);
            }
            return Unit.f45918a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f3558b;

        b(p169q8.b bVar) {
            super(2, bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p169q8.b create(Object obj, p169q8.b bVar) {
            b bVar2 = e.this.new b(bVar);
            bVar2.f3558b = obj;
            return bVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K8.v vVar, p169q8.b bVar) {
            return ((b) create(vVar, bVar)).invokeSuspend(Unit.f45918a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p179r8.b.e();
            int i10 = this.f3557a;
            if (i10 == 0) {
                p129m8.n.b(obj);
                K8.v vVar = (K8.v) this.f3558b;
                e eVar = e.this;
                this.f3557a = 1;
                if (eVar.e(vVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p129m8.n.b(obj);
            }
            return Unit.f45918a;
        }
    }

    public e(CoroutineContext coroutineContext, int i10, K8.a aVar) {
        this.f3550a = coroutineContext;
        this.f3551b = i10;
        this.f3552c = aVar;
    }

    static /* synthetic */ Object d(e eVar, InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
        Object objE = P.e(new a(interfaceC0805f, eVar, null), bVar);
        return objE == p179r8.b.e() ? objE : Unit.f45918a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // M8.p
    public InterfaceC0804e a(CoroutineContext coroutineContext, int i10, K8.a aVar) {
        CoroutineContext coroutineContextPlus = coroutineContext.plus(this.f3550a);
        if (aVar == K8.a.SUSPEND) {
            int i11 = this.f3551b;
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 == -2) {
                        i10 = i11;
                    } else {
                        i10 += i11;
                        if (i10 < 0) {
                            i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        }
                    }
                }
            }
            aVar = this.f3552c;
        }
        return (Intrinsics.b(coroutineContextPlus, this.f3550a) && i10 == this.f3551b && aVar == this.f3552c) ? this : f(coroutineContextPlus, i10, aVar);
    }

    protected String b() {
        return null;
    }

    @Override // L8.InterfaceC0804e
    public Object collect(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
        return d(this, interfaceC0805f, bVar);
    }

    protected abstract Object e(K8.v vVar, p169q8.b bVar);

    protected abstract e f(CoroutineContext coroutineContext, int i10, K8.a aVar);

    public InterfaceC0804e i() {
        return null;
    }

    public final Function2 j() {
        return new b(null);
    }

    public final int l() {
        int i10 = this.f3551b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public K8.x m(O o10) {
        return K8.t.c(o10, this.f3550a, l(), this.f3552c, Q.ATOMIC, null, j(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        if (this.f3550a != kotlin.coroutines.e.f45956a) {
            arrayList.add("context=" + this.f3550a);
        }
        if (this.f3551b != -3) {
            arrayList.add("capacity=" + this.f3551b);
        }
        if (this.f3552c != K8.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f3552c);
        }
        return T.a(this) + '[' + CollectionsKt.e0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
