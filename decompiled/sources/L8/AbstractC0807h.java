package L8;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: L8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC0807h {

    /* JADX INFO: renamed from: L8.h$a */
    public static final class a implements InterfaceC0804e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f3253a;

        public a(Object obj) {
            this.f3253a = obj;
        }

        @Override // L8.InterfaceC0804e
        public Object collect(InterfaceC0805f interfaceC0805f, p169q8.b bVar) {
            Object objEmit = interfaceC0805f.emit(this.f3253a, bVar);
            return objEmit == p179r8.b.e() ? objEmit : Unit.f45918a;
        }
    }

    public static final InterfaceC0804e a(Function2 function2) {
        return new C0801b(function2, null, 0, null, 14, null);
    }

    public static final InterfaceC0804e b(Function2 function2) {
        return new C0802c(function2, null, 0, null, 14, null);
    }

    public static final InterfaceC0804e c(Function2 function2) {
        return new A(function2);
    }

    public static final InterfaceC0804e d(Object obj) {
        return new a(obj);
    }
}
