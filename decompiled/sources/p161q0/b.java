package p161q0;

import I8.W;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.p;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    static final class a extends m implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f47977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ W f47978b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a aVar, W w10) {
            super(1);
            this.f47977a = aVar;
            this.f47978b = w10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f45918a;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                this.f47977a.c(this.f47978b.n());
            } else if (th instanceof CancellationException) {
                this.f47977a.d();
            } else {
                this.f47977a.f(th);
            }
        }
    }

    public static final p b(final W w10, final Object obj) {
        Intrinsics.checkNotNullParameter(w10, "<this>");
        p pVarA = c.a(new c.InterfaceC0140c() { // from class: q0.a
            @Override // androidx.concurrent.futures.c.InterfaceC0140c
            public final Object a(c.a aVar) {
                return b.d(w10, obj, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(pVarA, "getFuture { completer ->…      }\n        tag\n    }");
        return pVarA;
    }

    public static /* synthetic */ p c(W w10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(w10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(W this_asListenableFuture, Object obj, c.a completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.Q(new a(completer, this_asListenableFuture));
        return obj;
    }
}
