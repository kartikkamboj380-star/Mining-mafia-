package T3;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends Animation implements k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f5758j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f5759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f5760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f5761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f5762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f5763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5767i;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        p064g3.b.a("PositionAndSizeAnimation", p064g3.a.ERROR);
    }

    public n(View view, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f5759a = new WeakReference(view);
        c(i10, i11, i12, i13);
    }

    private final void c(int i10, int i11, int i12, int i13) {
        View view = (View) this.f5759a.get();
        if (view != null) {
            this.f5760b = view.getX() - view.getTranslationX();
            this.f5761c = view.getY() - view.getTranslationY();
            this.f5764f = view.getWidth();
            int height = view.getHeight();
            this.f5765g = height;
            this.f5762d = i10 - this.f5760b;
            this.f5763e = i11 - this.f5761c;
            this.f5766h = i12 - this.f5764f;
            this.f5767i = i13 - height;
        }
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        View view = (View) this.f5759a.get();
        if (view != null) {
            float f11 = this.f5760b + (this.f5762d * f10);
            float f12 = this.f5761c + (this.f5763e * f10);
            view.layout(Math.round(f11), Math.round(f12), Math.round(f11 + this.f5764f + (this.f5766h * f10)), Math.round(f12 + this.f5765g + (this.f5767i * f10)));
        }
    }

    @Override // T3.k
    public void b(int i10, int i11, int i12, int i13) {
        c(i10, i11, i12, i13);
    }

    @Override // T3.k
    public boolean isValid() {
        return this.f5759a.get() != null;
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
