package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.AbstractC1313n;
import com.facebook.react.AbstractC1315p;
import com.facebook.react.bridge.ReactContext;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class V extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14650d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f14651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.facebook.react.modules.debug.h f14652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f14653c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f14654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14656c;

        public b() {
        }

        public final void a() {
            this.f14654a = false;
            V.this.post(this);
        }

        public final void b() {
            this.f14654a = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f14654a) {
                return;
            }
            this.f14655b += V.this.f14652b.d() - V.this.f14652b.g();
            this.f14656c += V.this.f14652b.c();
            V v10 = V.this;
            v10.c(v10.f14652b.e(), V.this.f14652b.f(), this.f14655b, this.f14656c, V.this.f14652b.j());
            V.this.f14652b.k();
            V.this.postDelayed(this, 500L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.c(reactContext);
        View.inflate(reactContext, AbstractC1315p.f15070c, this);
        View viewFindViewById = findViewById(AbstractC1313n.f15056p);
        Intrinsics.d(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f14651a = (TextView) viewFindViewById;
        com.facebook.react.modules.debug.h hVar = new com.facebook.react.modules.debug.h(reactContext);
        this.f14652b = hVar;
        this.f14653c = new b();
        c(0.0d, 0.0d, 0, 0, hVar.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(double d10, double d11, int i10, int i11, boolean z9) {
        kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f45976a;
        Locale locale = Locale.US;
        String str = String.format(locale, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far", Arrays.copyOf(new Object[]{Double.valueOf(d10), Integer.valueOf(i10), Integer.valueOf(i11)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        if (!z9) {
            String str2 = String.format(locale, "\nJS: %.1f fps", Arrays.copyOf(new Object[]{Double.valueOf(d11)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            str = str + str2;
        }
        this.f14651a.setText(str);
        Z1.a.b("ReactNative", str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14652b.k();
        com.facebook.react.modules.debug.h.m(this.f14652b, 0.0d, 1, null);
        this.f14653c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14652b.o();
        this.f14653c.b();
    }
}
