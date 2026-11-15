package M8;

import L8.InterfaceC0805f;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p259z8.n f3616a;

    /* synthetic */ class a extends kotlin.jvm.internal.k implements p259z8.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3617a = new a();

        a() {
            super(3, InterfaceC0805f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p259z8.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0805f interfaceC0805f, Object obj, p169q8.b bVar) {
            return interfaceC0805f.emit(obj, bVar);
        }
    }

    static {
        a aVar = a.f3617a;
        Intrinsics.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f3616a = (p259z8.n) I.c(aVar, 3);
    }
}
