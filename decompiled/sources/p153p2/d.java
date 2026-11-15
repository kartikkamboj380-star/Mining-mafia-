package p153p2;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47791c;

    public d() {
        a();
    }

    public void a() {
        this.f47789a = false;
        this.f47790b = 4;
        c();
    }

    public void b() {
        this.f47791c++;
    }

    public void c() {
        this.f47791c = 0;
    }

    public void d(boolean z9) {
        this.f47789a = z9;
    }

    public boolean e() {
        return this.f47789a && this.f47791c < this.f47790b;
    }
}
