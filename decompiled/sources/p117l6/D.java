package p117l6;

import java.util.concurrent.atomic.AtomicBoolean;
import p087i6.g;
import p197t6.j;

/* JADX INFO: loaded from: classes3.dex */
class D implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f46085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f46086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f46087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p087i6.a f46088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f46089e = new AtomicBoolean(false);

    interface a {
        void a(j jVar, Thread thread, Throwable th);
    }

    public D(a aVar, j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, p087i6.a aVar2) {
        this.f46085a = aVar;
        this.f46086b = jVar;
        this.f46087c = uncaughtExceptionHandler;
        this.f46088d = aVar2;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f46088d.b()) {
            return true;
        }
        g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f46089e.get();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f46089e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f46085a.a(this.f46086b, thread, th);
                } else {
                    g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.f46087c != null) {
                    g.f().b("Completed exception processing. Invoking default exception handler.");
                    this.f46087c.uncaughtException(thread, th);
                } else {
                    g.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            } catch (Exception e10) {
                g.f().e("An error occurred in the uncaught exception handler", e10);
                if (this.f46087c == null) {
                    g.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
            }
            this.f46089e.set(false);
        } catch (Throwable th2) {
            if (this.f46087c != null) {
                g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f46087c.uncaughtException(thread, th);
            } else {
                g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f46089e.set(false);
            throw th2;
        }
    }
}
