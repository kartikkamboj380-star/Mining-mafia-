package p102k1;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p092j1.n;
import p092j1.q;
import p092j1.r;
import p131n0.c;
import p169q8.b;
import r9.C7105h;
import r9.InterfaceC7106i;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f45594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f45595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f45596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f45597d;

        a(b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f45596c = obj;
            this.f45597d |= LinearLayoutManager.INVALID_OFFSET;
            return e.e(null, this);
        }
    }

    public static final void a(d1.a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    public static final n.a b(n.a aVar, String str) {
        int iY = StringsKt.Y(str, ':', 0, false, 6, null);
        if (iY == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iY);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string = StringsKt.U0(strSubstring).toString();
        String strSubstring2 = str.substring(iY + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        aVar.a(string, strSubstring2);
        return aVar;
    }

    public static final void c(AutoCloseable autoCloseable) {
        try {
            c.a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final n d(n nVar, n nVar2) {
        n.a aVarD = nVar.d();
        for (Map.Entry entry : nVar2.b().entrySet()) {
            aVarD.d((String) entry.getKey(), (List) entry.getValue());
        }
        return aVarD.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(r rVar, b bVar) throws Exception {
        a aVar;
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        InterfaceC7106i interfaceC7106i;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f45597d;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f45597d = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f45596c;
        Object objE = p179r8.b.e();
        int i11 = aVar.f45597d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC7106i = (C7105h) aVar.f45595b;
            autoCloseable = (AutoCloseable) aVar.f45594a;
            try {
                p129m8.n.b(obj);
                autoCloseable2 = autoCloseable;
                p239x8.a.a(autoCloseable2, null);
                return interfaceC7106i;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    p239x8.a.a(autoCloseable, th);
                    throw th3;
                }
            }
        }
        p129m8.n.b(obj);
        try {
            InterfaceC7106i c7105h = new C7105h();
            aVar.f45594a = rVar;
            aVar.f45595b = c7105h;
            aVar.f45597d = 1;
            if (rVar.T0(c7105h, aVar) == objE) {
                return objE;
            }
            autoCloseable2 = rVar;
            interfaceC7106i = c7105h;
            p239x8.a.a(autoCloseable2, null);
            return interfaceC7106i;
        } catch (Throwable th4) {
            autoCloseable = rVar;
            th = th4;
            throw th;
        }
    }

    public static final r f(q qVar) {
        r rVarC = qVar.c();
        if (rVarC != null) {
            return rVarC;
        }
        throw new IllegalStateException("body == null");
    }
}
