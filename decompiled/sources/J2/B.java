package J2;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class B implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f1936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f1937d;

    public B(int i10, String prefix, boolean z9) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.f1934a = i10;
        this.f1935b = prefix;
        this.f1936c = z9;
        this.f1937d = new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        try {
            Process.setThreadPriority(this$0.f1934a);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        String str;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Runnable runnable2 = new Runnable() { // from class: J2.A
            @Override // java.lang.Runnable
            public final void run() {
                B.b(this.f1932a, runnable);
            }
        };
        if (this.f1936c) {
            str = this.f1935b + "-" + this.f1937d.getAndIncrement();
        } else {
            str = this.f1935b;
        }
        return new Thread(runnable2, str);
    }
}
