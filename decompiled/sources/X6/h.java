package X6;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class h implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f6753a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f6754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f6755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f6756d;

    private h(View view, Runnable runnable, Runnable runnable2) {
        this.f6754b = new AtomicReference(view);
        this.f6755c = runnable;
        this.f6756d = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View view = (View) this.f6754b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f6753a.post(this.f6755c);
        this.f6753a.postAtFrontOfQueue(this.f6756d);
        return true;
    }
}
