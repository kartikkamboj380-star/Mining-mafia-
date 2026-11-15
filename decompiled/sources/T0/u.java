package T0;

import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes.dex */
public class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K0.C f5601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private K0.v f5602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkerParameters.a f5603c;

    public u(K0.C c10, K0.v vVar, WorkerParameters.a aVar) {
        this.f5601a = c10;
        this.f5602b = vVar;
        this.f5603c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        this.f5601a.s().o(this.f5602b, this.f5603c);
    }
}
