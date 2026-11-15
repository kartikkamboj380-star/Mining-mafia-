package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1098t extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f8422b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8423a;

    public C1098t(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        h0 h0VarV = h0.v(context, attributeSet, p060g.j.f44144Y1, i10, i11);
        if (h0VarV.s(p060g.j.f44153a2)) {
            b(h0VarV.a(p060g.j.f44153a2, false));
        }
        setBackgroundDrawable(h0VarV.g(p060g.j.f44148Z1));
        h0VarV.x();
    }

    private void b(boolean z9) {
        if (f8422b) {
            this.f8423a = z9;
        } else {
            androidx.core.widget.h.a(this, z9);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f8422b && this.f8423a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f8422b && this.f8423a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f8422b && this.f8423a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
