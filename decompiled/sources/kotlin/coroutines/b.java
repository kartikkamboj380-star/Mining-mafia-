package kotlin.coroutines;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements CoroutineContext.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f45950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext.b f45951b;

    public b(CoroutineContext.b baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f45950a = safeCast;
        this.f45951b = baseKey instanceof b ? ((b) baseKey).f45951b : baseKey;
    }

    public final boolean a(CoroutineContext.b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.f45951b == key;
    }

    public final CoroutineContext.Element b(CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (CoroutineContext.Element) this.f45950a.invoke(element);
    }
}
