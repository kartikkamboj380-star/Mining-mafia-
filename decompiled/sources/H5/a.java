package H5;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f1478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0027a f1479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1480c;

    /* JADX INFO: renamed from: H5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0027a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0027a interfaceC0027a, Typeface typeface) {
        this.f1478a = typeface;
        this.f1479b = interfaceC0027a;
    }

    private void d(Typeface typeface) {
        if (this.f1480c) {
            return;
        }
        this.f1479b.a(typeface);
    }

    @Override // H5.f
    public void a(int i10) {
        d(this.f1478a);
    }

    @Override // H5.f
    public void b(Typeface typeface, boolean z9) {
        d(typeface);
    }

    public void c() {
        this.f1480c = true;
    }
}
