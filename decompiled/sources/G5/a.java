package G5;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C1100v;
import androidx.core.widget.c;
import com.google.android.material.internal.m;
import p186s5.j;
import p186s5.k;

/* JADX INFO: loaded from: classes2.dex */
public class a extends C1100v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f1021g = j.f48849s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[][] f1022h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f1023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1024f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p186s5.a.f48607T);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1023e == null) {
            int iD = p256z5.a.d(this, p186s5.a.f48626h);
            int iD2 = p256z5.a.d(this, p186s5.a.f48631m);
            int iD3 = p256z5.a.d(this, p186s5.a.f48637s);
            int[][] iArr = f1022h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = p256z5.a.j(iD3, iD, 1.0f);
            iArr2[1] = p256z5.a.j(iD3, iD2, 0.54f);
            iArr2[2] = p256z5.a.j(iD3, iD2, 0.38f);
            iArr2[3] = p256z5.a.j(iD3, iD2, 0.38f);
            this.f1023e = new ColorStateList(iArr, iArr2);
        }
        return this.f1023e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1024f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f1024f = z9;
        if (z9) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f1021g;
        super(N5.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = m.i(context2, attributeSet, k.f49084Z3, i10, i11, new int[0]);
        if (typedArrayI.hasValue(k.f49094a4)) {
            c.d(this, H5.c.a(context2, typedArrayI, k.f49094a4));
        }
        this.f1024f = typedArrayI.getBoolean(k.f49104b4, false);
        typedArrayI.recycle();
    }
}
