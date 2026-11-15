package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;

/* JADX INFO: loaded from: classes.dex */
class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f8404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f8405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f8406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f8407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f8408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f8409g;

    q0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f8406d = layoutParams;
        this.f8407e = new Rect();
        this.f8408f = new int[2];
        this.f8409g = new int[2];
        this.f8403a = context;
        View viewInflate = LayoutInflater.from(context).inflate(p060g.g.f44008s, (ViewGroup) null);
        this.f8404b = viewInflate;
        this.f8405c = (TextView) viewInflate.findViewById(p060g.f.f43982s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = BackupConstant.SCENE_BACKUP_RENDER_FAIL;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = p060g.i.f44024a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z9, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f8403a.getResources().getDimensionPixelOffset(p060g.d.f43900k);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f8403a.getResources().getDimensionPixelOffset(p060g.d.f43899j);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f8403a.getResources().getDimensionPixelOffset(z9 ? p060g.d.f43902m : p060g.d.f43901l);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f8407e);
        Rect rect = this.f8407e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f8403a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f8407e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f8409g);
        view.getLocationOnScreen(this.f8408f);
        int[] iArr = this.f8408f;
        int i13 = iArr[0];
        int[] iArr2 = this.f8409g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f8404b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f8404b.getMeasuredHeight();
        int i15 = this.f8408f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (z9) {
            if (i16 >= 0) {
                layoutParams.y = i16;
                return;
            } else {
                layoutParams.y = i17;
                return;
            }
        }
        if (measuredHeight + i17 <= this.f8407e.height()) {
            layoutParams.y = i17;
        } else {
            layoutParams.y = i16;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f8403a.getSystemService("window")).removeView(this.f8404b);
        }
    }

    boolean d() {
        return this.f8404b.getParent() != null;
    }

    void e(View view, int i10, int i11, boolean z9, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f8405c.setText(charSequence);
        a(view, i10, i11, z9, this.f8406d);
        ((WindowManager) this.f8403a.getSystemService("window")).addView(this.f8404b, this.f8406d);
    }
}
