package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import p070h.q;

/* JADX INFO: loaded from: classes.dex */
public class a extends q implements DialogInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AlertController f7542f;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0134a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.b f7543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7544b;

        public C0134a(Context context) {
            this(context, a.m(context, 0));
        }

        public a a() {
            a aVar = new a(this.f7543a.f7503a, this.f7544b);
            this.f7543a.a(aVar.f7542f);
            aVar.setCancelable(this.f7543a.f7520r);
            if (this.f7543a.f7520r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f7543a.f7521s);
            aVar.setOnDismissListener(this.f7543a.f7522t);
            DialogInterface.OnKeyListener onKeyListener = this.f7543a.f7523u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.f7543a.f7503a;
        }

        public C0134a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f7543a;
            bVar.f7525w = listAdapter;
            bVar.f7526x = onClickListener;
            return this;
        }

        public C0134a d(View view) {
            this.f7543a.f7509g = view;
            return this;
        }

        public C0134a e(Drawable drawable) {
            this.f7543a.f7506d = drawable;
            return this;
        }

        public C0134a f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f7543a;
            bVar.f7524v = charSequenceArr;
            bVar.f7526x = onClickListener;
            return this;
        }

        public C0134a g(CharSequence charSequence) {
            this.f7543a.f7510h = charSequence;
            return this;
        }

        public C0134a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f7543a;
            bVar.f7514l = charSequence;
            bVar.f7516n = onClickListener;
            return this;
        }

        public C0134a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f7543a;
            bVar.f7517o = charSequence;
            bVar.f7519q = onClickListener;
            return this;
        }

        public C0134a j(DialogInterface.OnKeyListener onKeyListener) {
            this.f7543a.f7523u = onKeyListener;
            return this;
        }

        public C0134a k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f7543a;
            bVar.f7511i = charSequence;
            bVar.f7513k = onClickListener;
            return this;
        }

        public C0134a l(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f7543a;
            bVar.f7525w = listAdapter;
            bVar.f7526x = onClickListener;
            bVar.f7496I = i10;
            bVar.f7495H = true;
            return this;
        }

        public C0134a m(CharSequence charSequence) {
            this.f7543a.f7508f = charSequence;
            return this;
        }

        public C0134a(Context context, int i10) {
            this.f7543a = new AlertController.b(new ContextThemeWrapper(context, a.m(context, i10)));
            this.f7544b = i10;
        }
    }

    protected a(Context context, int i10) {
        super(context, m(context, i10));
        this.f7542f = new AlertController(getContext(), this, getWindow());
    }

    static int m(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p060g.a.f43866l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView l() {
        return this.f7542f.d();
    }

    @Override // p070h.q, androidx.activity.r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7542f.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f7542f.f(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f7542f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // p070h.q, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f7542f.p(charSequence);
    }
}
