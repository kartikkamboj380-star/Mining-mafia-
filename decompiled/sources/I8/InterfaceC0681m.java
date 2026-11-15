package I8;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: I8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0681m extends P0 {

    /* JADX INFO: renamed from: I8.m$a */
    public static final class a implements InterfaceC0681m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function1 f1803a;

        public a(Function1 function1) {
            this.f1803a = function1;
        }

        @Override // I8.InterfaceC0681m
        public void a(Throwable th) {
            this.f1803a.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + T.a(this.f1803a) + '@' + T.b(this) + ']';
        }
    }

    void a(Throwable th);
}
