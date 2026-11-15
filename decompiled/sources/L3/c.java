package L3;

import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f3062a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f3063b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Executor f3064c = new a();

    private static final class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            command.run();
        }
    }

    private static final class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            UiThreadUtil.runOnUiThread(command);
        }
    }

    private c() {
    }
}
