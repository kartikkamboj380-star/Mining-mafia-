package S8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5536a = new a();

    private a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
