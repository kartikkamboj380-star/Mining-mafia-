package p228w7;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue f50389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f50390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f50391c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f50392d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f50389a = linkedBlockingQueue;
        this.f50390b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void b() {
        b bVar = (b) this.f50391c.poll();
        this.f50392d = bVar;
        if (bVar != null) {
            bVar.b(this.f50390b);
        }
    }

    @Override // w7.b.a
    public void a(b bVar) {
        this.f50392d = null;
        b();
    }

    public void c(b bVar) {
        bVar.c(this);
        this.f50391c.add(bVar);
        if (this.f50392d == null) {
            b();
        }
    }
}
