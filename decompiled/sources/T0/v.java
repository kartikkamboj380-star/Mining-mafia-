package T0;

/* JADX INFO: loaded from: classes.dex */
public class v implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f5604d = androidx.work.q.i("StopWorkRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K0.C f5605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K0.v f5606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5607c;

    public v(K0.C c10, K0.v vVar, boolean z9) {
        this.f5605a = c10;
        this.f5606b = vVar;
        this.f5607c = z9;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zR = this.f5607c ? this.f5605a.s().r(this.f5606b) : this.f5605a.s().s(this.f5606b);
        androidx.work.q.e().a(f5604d, "StopWorkRunnable for " + this.f5606b.a().b() + "; Processor.stopWork = " + zR);
    }
}
