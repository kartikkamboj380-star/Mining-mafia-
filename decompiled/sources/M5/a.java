package M5;

import H5.b;
import H5.c;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.D;
import p186s5.k;

/* JADX INFO: loaded from: classes2.dex */
public class a extends D {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private static int A(Context context, TypedArray typedArray, int... iArr) {
        int iD = -1;
        for (int i10 = 0; i10 < iArr.length && iD < 0; i10++) {
            iD = c.d(context, typedArray, iArr[i10], -1);
        }
        return iD;
    }

    private static boolean B(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f49189k4, i10, i11);
        int iA = A(context, typedArrayObtainStyledAttributes, k.f49207m4, k.f49216n4);
        typedArrayObtainStyledAttributes.recycle();
        return iA != -1;
    }

    private void w(Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, k.f49153g4);
        int iA = A(getContext(), typedArrayObtainStyledAttributes, k.f49171i4, k.f49180j4);
        typedArrayObtainStyledAttributes.recycle();
        if (iA >= 0) {
            setLineHeight(iA);
        }
    }

    private static boolean x(Context context) {
        return b.b(context, p186s5.a.f48617b0, true);
    }

    private static int y(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f49189k4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(k.f49198l4, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void z(AttributeSet attributeSet, int i10, int i11) {
        int iY;
        Context context = getContext();
        if (x(context)) {
            Resources.Theme theme = context.getTheme();
            if (B(context, theme, attributeSet, i10, i11) || (iY = y(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            w(theme, iY);
        }
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (x(context)) {
            w(context.getTheme(), i10);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(N5.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        z(attributeSet, i10, 0);
    }
}
