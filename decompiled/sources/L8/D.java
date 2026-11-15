package L8;

import com.google.android.gms.common.api.Api;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N8.D f3184a = new N8.D("NO_VALUE");

    public static final w a(int i10, int i11, K8.a aVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 > 0 || i11 > 0 || aVar == K8.a.SUSPEND) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            return new C(i10, i12, aVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
    }

    public static /* synthetic */ w b(int i10, int i11, K8.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = K8.a.SUSPEND;
        }
        return a(i10, i11, aVar);
    }

    public static final InterfaceC0804e e(B b10, CoroutineContext coroutineContext, int i10, K8.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == K8.a.SUSPEND) ? b10 : new M8.h(b10, coroutineContext, i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
