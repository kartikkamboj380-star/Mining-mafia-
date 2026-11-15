package p025c4;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.facebook.react.views.text.s;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends MetricAffectingSpan implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f11821f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f11825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f11826e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(Paint paint, int i10, int i11, String str, String str2, AssetManager assetManager) {
            Typeface typefaceA = s.a(paint.getTypeface(), i10, i11, str2, assetManager);
            paint.setFontFeatureSettings(str);
            paint.setTypeface(typefaceA);
            paint.setSubpixelText(true);
        }

        private a() {
        }
    }

    public c(int i10, int i11, String str, String str2, AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.f11822a = i10;
        this.f11823b = i11;
        this.f11824c = str;
        this.f11825d = str2;
        this.f11826e = assetManager;
    }

    public final String a() {
        return this.f11825d;
    }

    public final String b() {
        return this.f11824c;
    }

    public final int c() {
        int i10 = this.f11822a;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public final int d() {
        int i10 = this.f11823b;
        return i10 == -1 ? CommonGatewayClient.CODE_400 : i10;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        f11821f.b(ds, this.f11822a, this.f11823b, this.f11824c, this.f11825d, this.f11826e);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        f11821f.b(paint, this.f11822a, this.f11823b, this.f11824c, this.f11825d, this.f11826e);
    }
}
