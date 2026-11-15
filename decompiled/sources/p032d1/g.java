package p032d1;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import r9.AbstractC7112o;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f42926a = p129m8.g.a(new Function0() { // from class: d1.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.c();
        }
    });

    private static final a b() {
        return (a) f42926a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a c() {
        return new a.C0408a().b(AbstractC7112o.f48492c.k("coil3_disk_cache")).a();
    }

    public static final a d() {
        return b();
    }
}
