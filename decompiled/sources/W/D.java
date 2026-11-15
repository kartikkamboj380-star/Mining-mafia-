package W;

import I8.AbstractC0706z;
import I8.InterfaceC0702x;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R8.a f6169a = R8.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0702x f6170b = AbstractC0706z.b(null, 1, null);

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f6172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6173c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6175e;

        a(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6173c = obj;
            this.f6175e |= LinearLayoutManager.INVALID_OFFSET;
            return D.this.c(this);
        }
    }

    public final Object a(p169q8.b bVar) {
        Object objR0 = this.f6170b.R0(bVar);
        return objR0 == p179r8.b.e() ? objR0 : Unit.f45918a;
    }

    protected abstract Object b(p169q8.b bVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(p169q8.b bVar) throws Throwable {
        a aVar;
        R8.a aVar2;
        D d10;
        R8.a aVar3;
        Throwable th;
        D d11;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f6175e;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f6175e = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f6173c;
        Object objE = p179r8.b.e();
        int i11 = aVar.f6175e;
        try {
            if (i11 == 0) {
                p129m8.n.b(obj);
                if (this.f6170b.a()) {
                    return Unit.f45918a;
                }
                aVar2 = this.f6169a;
                aVar.f6171a = this;
                aVar.f6172b = aVar2;
                aVar.f6175e = 1;
                if (aVar2.d(null, aVar) != objE) {
                    d10 = this;
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (R8.a) aVar.f6172b;
                d11 = (D) aVar.f6171a;
                try {
                    p129m8.n.b(obj);
                    InterfaceC0702x interfaceC0702x = d11.f6170b;
                    Unit unit = Unit.f45918a;
                    interfaceC0702x.X(unit);
                    aVar3.e(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.e(null);
                    throw th;
                }
            }
            R8.a aVar4 = (R8.a) aVar.f6172b;
            d10 = (D) aVar.f6171a;
            p129m8.n.b(obj);
            aVar2 = aVar4;
            if (d10.f6170b.a()) {
                Unit unit2 = Unit.f45918a;
                aVar2.e(null);
                return unit2;
            }
            aVar.f6171a = d10;
            aVar.f6172b = aVar2;
            aVar.f6175e = 2;
            if (d10.b(aVar) != objE) {
                aVar3 = aVar2;
                d11 = d10;
                InterfaceC0702x interfaceC0702x2 = d11.f6170b;
                Unit unit3 = Unit.f45918a;
                interfaceC0702x2.X(unit3);
                aVar3.e(null);
                return unit3;
            }
            return objE;
        } catch (Throwable th3) {
            aVar3 = aVar2;
            th = th3;
            aVar3.e(null);
            throw th;
        }
    }
}
