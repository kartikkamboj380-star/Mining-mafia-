package M8;

import L8.InterfaceC0804e;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public interface p extends InterfaceC0804e {

    public static final class a {
        public static /* synthetic */ InterfaceC0804e a(p pVar, CoroutineContext coroutineContext, int i10, K8.a aVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                coroutineContext = kotlin.coroutines.e.f45956a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                aVar = K8.a.SUSPEND;
            }
            return pVar.a(coroutineContext, i10, aVar);
        }
    }

    InterfaceC0804e a(CoroutineContext coroutineContext, int i10, K8.a aVar);
}
