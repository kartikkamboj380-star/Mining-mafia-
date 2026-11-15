package c9;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12215a = a.f12217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f12216b = new a.C0202a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f12217a = new a();

        /* JADX INFO: renamed from: c9.n$a$a, reason: collision with other inner class name */
        private static final class C0202a implements n {
            @Override // c9.n
            public void a(u url, List cookies) {
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cookies, "cookies");
            }

            @Override // c9.n
            public List b(u url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return CollectionsKt.i();
            }
        }

        private a() {
        }
    }

    void a(u uVar, List list);

    List b(u uVar);
}
