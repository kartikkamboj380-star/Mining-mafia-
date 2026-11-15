package kotlin.coroutines;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface d extends CoroutineContext.Element {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public static final b f45954F = b.f45955a;

    public static final class a {
        public static CoroutineContext.Element a(d dVar, CoroutineContext.b key) {
            CoroutineContext.Element elementB;
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                if (d.f45954F != key) {
                    return null;
                }
                Intrinsics.d(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (!bVar.a(dVar.getKey()) || (elementB = bVar.b(dVar)) == null) {
                return null;
            }
            return elementB;
        }

        public static CoroutineContext b(d dVar, CoroutineContext.b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                return d.f45954F == key ? e.f45956a : dVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            return (!bVar.a(dVar.getKey()) || bVar.b(dVar) == null) ? dVar : e.f45956a;
        }
    }

    public static final class b implements CoroutineContext.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f45955a = new b();

        private b() {
        }
    }

    void N(p169q8.b bVar);

    p169q8.b V0(p169q8.b bVar);
}
