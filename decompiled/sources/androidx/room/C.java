package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f10755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f10756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f10757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f10758d;

    public C(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f10755a = executor;
        this.f10756b = new ArrayDeque();
        this.f10758d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable command, C this$0) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.c();
        }
    }

    public final void c() {
        synchronized (this.f10758d) {
            try {
                Object objPoll = this.f10756b.poll();
                Runnable runnable = (Runnable) objPoll;
                this.f10757c = runnable;
                if (objPoll != null) {
                    this.f10755a.execute(runnable);
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f10758d) {
            try {
                this.f10756b.offer(new Runnable() { // from class: androidx.room.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        C.b(command, this);
                    }
                });
                if (this.f10757c == null) {
                    c();
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
