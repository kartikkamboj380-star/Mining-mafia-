package B7;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends E4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f332c;

    public j(Drawable drawable, Uri uri) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f330a = drawable;
        this.f331b = uri;
        this.f332c = 1.0d;
    }

    @Override // E4.d
    public final Drawable a() {
        return this.f330a;
    }

    @Override // E4.d
    public final double b() {
        return this.f332c;
    }

    @Override // E4.d
    public final Uri c() {
        return this.f331b;
    }
}
