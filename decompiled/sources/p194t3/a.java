package p194t3;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49668a = new a();

    /* JADX INFO: renamed from: t3.a$a, reason: collision with other inner class name */
    private static final class C0538a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Choreographer f49669a;

        public C0538a() {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance(...)");
            this.f49669a = choreographer;
        }

        @Override // t3.b.a
        public void a(Choreographer.FrameCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f49669a.postFrameCallback(callback);
        }

        @Override // t3.b.a
        public void b(Choreographer.FrameCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f49669a.removeFrameCallback(callback);
        }
    }

    private a() {
    }

    public static final a b() {
        return f49668a;
    }

    @Override // p194t3.b
    public b.a a() {
        UiThreadUtil.assertOnUiThread();
        return new C0538a();
    }
}
