package p121m0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f46339a = new LinkedHashMap();

    /* JADX INFO: renamed from: m0.a$a, reason: collision with other inner class name */
    public static final class C0470a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0470a f46340b = new C0470a();

        private C0470a() {
        }

        @Override // p121m0.a
        public Object a(b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f46339a;
    }
}
