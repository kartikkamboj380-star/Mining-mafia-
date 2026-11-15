package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.k;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zae extends zag {
    private final WeakReference zac;

    public zae(ImageView imageView, int i10) {
        super(Uri.EMPTY, i10);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zae)) {
            return false;
        }
        ImageView imageView = (ImageView) this.zac.get();
        ImageView imageView2 = (ImageView) ((zae) obj).zac.get();
        return (imageView2 == null || imageView == null || !Objects.equal(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.gms.common.images.zag
    protected final void zaa(Drawable drawable, boolean z9, boolean z10, boolean z11) {
        ImageView imageView = (ImageView) this.zac.get();
        if (imageView != null) {
            boolean z12 = false;
            if (!z10 && !z9) {
                z12 = true;
            }
            if (z12) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof k) {
                    drawable2 = ((k) drawable2).a();
                }
                drawable = new k(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (drawable == null || !z12) {
                return;
            }
            ((k) drawable).b(250);
        }
    }

    public zae(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }
}
