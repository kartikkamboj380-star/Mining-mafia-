package p050f;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: f.a$a, reason: collision with other inner class name */
    public static final class C0421a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f43525a;

        public C0421a(Object obj) {
            this.f43525a = obj;
        }

        public final Object a() {
            return this.f43525a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0421a b(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
