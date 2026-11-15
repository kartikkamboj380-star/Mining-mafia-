package com.facebook.react.views.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends p193t2.g implements p163q2.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15903e = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public g() {
        super(new b());
    }

    @Override // p163q2.d
    public void a(String id, Object obj) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // p163q2.d
    public void g(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // p193t2.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        x(i10, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        return super.onLevelChange(i10);
    }

    @Override // p163q2.d
    public void r(String id, Throwable throwable) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    public abstract void x(int i10, int i11);
}
