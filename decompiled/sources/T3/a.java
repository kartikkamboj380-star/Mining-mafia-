package T3;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.P;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p129m8.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0084a f5708e = new C0084a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f5709f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Interpolator f5710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f5712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5713d;

    /* JADX INFO: renamed from: T3.a$a, reason: collision with other inner class name */
    public static final class C0084a {
        public /* synthetic */ C0084a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Interpolator a(d type, ReadableMap params) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(params, "params");
            Interpolator oVar = type == d.SPRING ? new o(o.f5768b.a(params)) : (Interpolator) a.f5709f.get(type);
            if (oVar != null) {
                return oVar;
            }
            throw new IllegalArgumentException(("Missing interpolator for type : " + type).toString());
        }

        private C0084a() {
        }
    }

    static {
        p064g3.b.a("AbstractLayoutAnimation", p064g3.a.ERROR);
        f5709f = E.j(q.a(d.LINEAR, new LinearInterpolator()), q.a(d.EASE_IN, new AccelerateInterpolator()), q.a(d.EASE_OUT, new DecelerateInterpolator()), q.a(d.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator()));
    }

    public final Animation b(View view, int i10, int i11, int i12, int i13) {
        Animation animationC;
        Intrinsics.checkNotNullParameter(view, "view");
        if (!g() || (animationC = c(view, i10, i11, i12, i13)) == null) {
            return null;
        }
        animationC.setDuration(this.f5713d);
        animationC.setStartOffset(this.f5711b);
        animationC.setInterpolator(this.f5710a);
        return animationC;
    }

    public abstract Animation c(View view, int i10, int i11, int i12, int i13);

    public final b d() {
        return this.f5712c;
    }

    public final int e() {
        return this.f5713d;
    }

    public final void f(ReadableMap data, int i10) {
        b bVarA;
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.hasKey("property")) {
            b.a aVar = b.f5714a;
            String string = data.getString("property");
            if (string == null) {
                string = "";
            }
            bVarA = aVar.a(string);
        } else {
            bVarA = null;
        }
        this.f5712c = bVarA;
        if (data.hasKey("duration")) {
            i10 = data.getInt("duration");
        }
        this.f5713d = i10;
        this.f5711b = data.hasKey("delay") ? data.getInt("delay") : 0;
        if (!data.hasKey(HandleInvocationsFromAdViewer.KEY_AD_TYPE)) {
            throw new IllegalArgumentException("Missing interpolation type.");
        }
        C0084a c0084a = f5708e;
        d.a aVar2 = d.f5723a;
        String string2 = data.getString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        this.f5710a = c0084a.a(aVar2.a(string2 != null ? string2 : ""), data);
        if (g()) {
            return;
        }
        throw new P("Invalid layout animation : " + data);
    }

    public abstract boolean g();

    public final void h() {
        this.f5712c = null;
        this.f5713d = 0;
        this.f5711b = 0;
        this.f5710a = null;
    }
}
