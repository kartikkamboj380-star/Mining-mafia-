package L8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: L8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0813n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function1 f3262a = new Function1() { // from class: L8.l
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AbstractC0813n.d(obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f3263b = new Function2() { // from class: L8.m
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC0813n.c(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.b(obj, obj2);
    }

    public static final InterfaceC0804e e(InterfaceC0804e interfaceC0804e) {
        return interfaceC0804e instanceof K ? interfaceC0804e : f(interfaceC0804e, f3262a, f3263b);
    }

    private static final InterfaceC0804e f(InterfaceC0804e interfaceC0804e, Function1 function1, Function2 function2) {
        if (interfaceC0804e instanceof C0803d) {
            C0803d c0803d = (C0803d) interfaceC0804e;
            if (c0803d.f3245b == function1 && c0803d.f3246c == function2) {
                return interfaceC0804e;
            }
        }
        return new C0803d(interfaceC0804e, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }
}
